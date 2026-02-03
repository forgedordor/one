package com.sun.jna;

import com.sun.jna.Library;
import com.sun.jna.Structure;
import defpackage.a;
import defpackage.eyfe;
import defpackage.eyfh;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CallbackReference extends WeakReference<Callback> implements Closeable {
    private static final Class<?> DLL_CALLBACK_CLASS;
    private static final Method PROXY_CALLBACK_METHOD;
    private static final Map<Callback, CallbackThreadInitializer> initializers;
    int callingConvention;
    Pointer cbstruct;
    eyfe cleanable;
    Method method;
    CallbackProxy proxy;
    Pointer trampoline;
    static final Map<Callback, CallbackReference> callbackMap = new WeakHashMap();
    static final Map<Callback, CallbackReference> directCallbackMap = new WeakHashMap();
    static final Map<Pointer, Reference<Callback>[]> pointerCallbackMap = new WeakHashMap();
    static final Map<Object, Object> allocations = DesugarCollections.synchronizedMap(new WeakHashMap());
    private static final Map<Long, Reference<CallbackReference>> allocatedMemory = new ConcurrentHashMap();

    /* compiled from: PG */
    static class AttachOptions extends Structure {
        public static final List<String> FIELDS = createFieldsOrder("daemon", "detach", "name");
        public boolean daemon;
        public boolean detach;
        public String name;

        AttachOptions() {
            setStringEncoding("utf8");
        }

        @Override // com.sun.jna.Structure
        protected List<String> getFieldOrder() {
            return FIELDS;
        }
    }

    /* compiled from: PG */
    private static final class CallbackReferenceDisposer implements Runnable {
        private Pointer cbstruct;

        public CallbackReferenceDisposer(Pointer pointer) {
            this.cbstruct = pointer;
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            Pointer pointer = this.cbstruct;
            if (pointer != null) {
                try {
                    Native.freeNativeCallback(pointer.peer);
                } finally {
                    CallbackReference.allocatedMemory.remove(Long.valueOf(this.cbstruct.peer));
                    this.cbstruct.peer = 0L;
                    this.cbstruct = null;
                }
            }
        }
    }

    /* compiled from: PG */
    private class DefaultCallbackProxy implements CallbackProxy {
        private final Method callbackMethod;
        private final String encoding;
        private final FromNativeConverter[] fromNative;
        private ToNativeConverter toNative;

        public DefaultCallbackProxy(Method method, TypeMapper typeMapper, String str) {
            this.callbackMethod = method;
            this.encoding = str;
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> returnType = method.getReturnType();
            this.fromNative = new FromNativeConverter[parameterTypes.length];
            if (NativeMapped.class.isAssignableFrom(returnType)) {
                this.toNative = NativeMappedConverter.getInstance(returnType);
            } else if (typeMapper != null) {
                this.toNative = typeMapper.getToNativeConverter(returnType);
            }
            for (int i = 0; i < this.fromNative.length; i++) {
                if (NativeMapped.class.isAssignableFrom(parameterTypes[i])) {
                    this.fromNative[i] = new NativeMappedConverter(parameterTypes[i]);
                } else if (typeMapper != null) {
                    this.fromNative[i] = typeMapper.getFromNativeConverter(parameterTypes[i]);
                }
            }
            if (method.isAccessible()) {
                return;
            }
            try {
                method.setAccessible(true);
            } catch (SecurityException unused) {
                throw new IllegalArgumentException("Callback method is inaccessible, make sure the interface is public: ".concat(String.valueOf(String.valueOf(method))));
            }
        }

        private Object convertArgument(Object obj, Class<?> cls) {
            if (!(obj instanceof Pointer)) {
                if ((Boolean.TYPE == cls || cls == Boolean.class) && (obj instanceof Number)) {
                    return Function.valueOf(((Number) obj).intValue() != 0);
                }
                return obj;
            }
            if (cls == String.class) {
                return ((Pointer) obj).getString(0L, this.encoding);
            }
            if (cls == WString.class) {
                return new WString(((Pointer) obj).getWideString(0L));
            }
            if (cls == String[].class) {
                return ((Pointer) obj).getStringArray(0L, this.encoding);
            }
            if (cls == WString[].class) {
                return ((Pointer) obj).getWideStringArray(0L);
            }
            if (Callback.class.isAssignableFrom(cls)) {
                return CallbackReference.getCallback(cls, (Pointer) obj);
            }
            if (!Structure.class.isAssignableFrom(cls)) {
                return obj;
            }
            if (!Structure.ByValue.class.isAssignableFrom(cls)) {
                Structure structureNewInstance = Structure.newInstance((Class<Structure>) cls, (Pointer) obj);
                structureNewInstance.conditionalAutoRead();
                return structureNewInstance;
            }
            Structure structureNewInstance2 = Structure.newInstance(cls);
            int size = structureNewInstance2.size();
            byte[] bArr = new byte[size];
            ((Pointer) obj).read(0L, bArr, 0, size);
            structureNewInstance2.getPointer().write(0L, bArr, 0, size);
            structureNewInstance2.read();
            return structureNewInstance2;
        }

        private Object convertResult(Object obj) {
            ToNativeConverter toNativeConverter = this.toNative;
            if (toNativeConverter != null) {
                obj = toNativeConverter.toNative(obj, new CallbackResultContext(this.callbackMethod));
            }
            if (obj == null) {
                return null;
            }
            Class<?> cls = obj.getClass();
            if (Structure.class.isAssignableFrom(cls)) {
                return Structure.ByValue.class.isAssignableFrom(cls) ? obj : ((Structure) obj).getPointer();
            }
            if (cls == Boolean.TYPE || cls == Boolean.class) {
                return Boolean.TRUE.equals(obj) ? Function.INTEGER_TRUE : Function.INTEGER_FALSE;
            }
            if (cls == String.class || cls == WString.class) {
                return CallbackReference.getNativeString(obj, cls == WString.class);
            }
            if (cls != String[].class && cls != WString[].class) {
                return Callback.class.isAssignableFrom(cls) ? CallbackReference.getFunctionPointer((Callback) obj) : obj;
            }
            StringArray stringArray = cls == String[].class ? new StringArray((String[]) obj, this.encoding) : new StringArray((WString[]) obj);
            CallbackReference.allocations.put(obj, stringArray);
            return stringArray;
        }

        private Object invokeCallback(Object[] objArr) {
            Class<?>[] parameterTypes = this.callbackMethod.getParameterTypes();
            int length = objArr.length;
            Object[] objArr2 = new Object[length];
            for (int i = 0; i < objArr.length; i++) {
                Class<?> cls = parameterTypes[i];
                Object obj = objArr[i];
                FromNativeConverter fromNativeConverter = this.fromNative[i];
                if (fromNativeConverter != null) {
                    objArr2[i] = fromNativeConverter.fromNative(obj, new CallbackParameterContext(cls, this.callbackMethod, objArr, i));
                } else {
                    objArr2[i] = convertArgument(obj, cls);
                }
            }
            Callback callback = getCallback();
            Object objConvertResult = null;
            if (callback != null) {
                try {
                    objConvertResult = convertResult(this.callbackMethod.invoke(callback, objArr2));
                } catch (IllegalAccessException e) {
                    e = e;
                    Native.getCallbackExceptionHandler().uncaughtException(callback, e);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    Native.getCallbackExceptionHandler().uncaughtException(callback, e);
                } catch (InvocationTargetException e3) {
                    Native.getCallbackExceptionHandler().uncaughtException(callback, e3.getTargetException());
                }
            }
            for (int i2 = 0; i2 < length; i2++) {
                Object obj2 = objArr2[i2];
                if ((obj2 instanceof Structure) && !(obj2 instanceof Structure.ByValue)) {
                    ((Structure) obj2).autoWrite();
                }
            }
            return objConvertResult;
        }

        @Override // com.sun.jna.CallbackProxy
        public Object callback(Object[] objArr) {
            try {
                return invokeCallback(objArr);
            } catch (Throwable th) {
                Native.getCallbackExceptionHandler().uncaughtException(getCallback(), th);
                return null;
            }
        }

        public Callback getCallback() {
            return CallbackReference.this.getCallback();
        }

        @Override // com.sun.jna.CallbackProxy
        public Class<?>[] getParameterTypes() {
            return this.callbackMethod.getParameterTypes();
        }

        @Override // com.sun.jna.CallbackProxy
        public Class<?> getReturnType() {
            return this.callbackMethod.getReturnType();
        }
    }

    /* compiled from: PG */
    private static class NativeFunctionHandler implements InvocationHandler {
        private final Function function;
        private final Map<String, ?> options;

        public NativeFunctionHandler(Pointer pointer, int i, Map<String, ?> map) {
            this.options = map;
            this.function = new Function(pointer, i, (String) map.get(Library.OPTION_STRING_ENCODING));
        }

        public Pointer getPointer() {
            return this.function;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (Library.Handler.OBJECT_TOSTRING.equals(method)) {
                String strValueOf = String.valueOf(String.valueOf(this.function));
                return "Proxy interface to ".concat(strValueOf) + " (" + CallbackReference.findCallbackClass(((Method) this.options.get("invoking-method")).getDeclaringClass()).getName() + ")";
            }
            if (Library.Handler.OBJECT_HASHCODE.equals(method)) {
                return Integer.valueOf(hashCode());
            }
            if (!Library.Handler.OBJECT_EQUALS.equals(method)) {
                if (Function.isVarArgs(method)) {
                    objArr = Function.concatenateVarArgs(objArr);
                }
                return this.function.invoke(method.getReturnType(), objArr, this.options);
            }
            Object obj2 = objArr[0];
            if (obj2 == null || !Proxy.isProxyClass(obj2.getClass())) {
                return Boolean.FALSE;
            }
            return Function.valueOf(Proxy.getInvocationHandler(obj2) == this);
        }
    }

    static {
        try {
            PROXY_CALLBACK_METHOD = CallbackProxy.class.getMethod(Callback.METHOD_NAME, Object[].class);
            if (Platform.isWindows()) {
                try {
                    DLL_CALLBACK_CLASS = Class.forName("eyfj");
                } catch (ClassNotFoundException e) {
                    throw new Error("Error loading DLLCallback class", e);
                }
            } else {
                DLL_CALLBACK_CLASS = null;
            }
            initializers = new WeakHashMap();
        } catch (Exception unused) {
            throw new Error("Error looking up CallbackProxy.callback() method");
        }
    }

    private CallbackReference(Callback callback, int i, boolean z) throws NoSuchMethodException, SecurityException {
        long jCreateNativeCallback;
        super(callback);
        TypeMapper typeMapper = Native.getTypeMapper(callback.getClass());
        this.callingConvention = i;
        boolean zIsPPC = Platform.isPPC();
        int i2 = 0;
        if (z) {
            Method callbackMethod = getCallbackMethod(callback);
            Class<?>[] parameterTypes = callbackMethod.getParameterTypes();
            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                if ((zIsPPC && (parameterTypes[i3] == Float.TYPE || parameterTypes[i3] == Double.TYPE)) || (typeMapper != null && typeMapper.getFromNativeConverter(parameterTypes[i3]) != null)) {
                    z = false;
                    break;
                }
            }
            if (typeMapper != null && typeMapper.getToNativeConverter(callbackMethod.getReturnType()) != null) {
                z = false;
            }
        }
        String stringEncoding = Native.getStringEncoding(callback.getClass());
        if (z) {
            Method callbackMethod2 = getCallbackMethod(callback);
            this.method = callbackMethod2;
            Class<?>[] parameterTypes2 = callbackMethod2.getParameterTypes();
            Class<?> returnType = this.method.getReturnType();
            Class<?> cls = DLL_CALLBACK_CLASS;
            int i4 = 1;
            if (cls != null && cls.isInstance(callback)) {
                i4 = 3;
            }
            jCreateNativeCallback = Native.createNativeCallback(callback, this.method, parameterTypes2, returnType, i, i4, stringEncoding);
        } else {
            if (callback instanceof CallbackProxy) {
                this.proxy = (CallbackProxy) callback;
            } else {
                this.proxy = new DefaultCallbackProxy(getCallbackMethod(callback), typeMapper, stringEncoding);
            }
            Class<?>[] parameterTypes3 = this.proxy.getParameterTypes();
            Class<?> returnType2 = this.proxy.getReturnType();
            if (typeMapper != null) {
                for (int i5 = 0; i5 < parameterTypes3.length; i5++) {
                    FromNativeConverter fromNativeConverter = typeMapper.getFromNativeConverter(parameterTypes3[i5]);
                    if (fromNativeConverter != null) {
                        parameterTypes3[i5] = fromNativeConverter.nativeType();
                    }
                }
                ToNativeConverter toNativeConverter = typeMapper.getToNativeConverter(returnType2);
                if (toNativeConverter != null) {
                    returnType2 = toNativeConverter.nativeType();
                }
            }
            for (int i6 = 0; i6 < parameterTypes3.length; i6++) {
                Class<?> nativeType = getNativeType(parameterTypes3[i6]);
                parameterTypes3[i6] = nativeType;
                if (!isAllowableNativeType(nativeType)) {
                    throw new IllegalArgumentException("Callback argument " + String.valueOf(parameterTypes3[i6]) + " requires custom type conversion");
                }
            }
            Class<?> nativeType2 = getNativeType(returnType2);
            if (!isAllowableNativeType(nativeType2)) {
                throw new IllegalArgumentException(a.I(nativeType2, "Callback return type ", " requires custom type conversion"));
            }
            Class<?> cls2 = DLL_CALLBACK_CLASS;
            if (cls2 != null && cls2.isInstance(callback)) {
                i2 = 2;
            }
            jCreateNativeCallback = Native.createNativeCallback(this.proxy, PROXY_CALLBACK_METHOD, parameterTypes3, nativeType2, i, i2, stringEncoding);
        }
        this.cbstruct = jCreateNativeCallback != 0 ? new Pointer(jCreateNativeCallback) : null;
        if (jCreateNativeCallback != 0) {
            allocatedMemory.put(Long.valueOf(jCreateNativeCallback), new WeakReference(this));
            this.cleanable = eyfh.a.a(this, new CallbackReferenceDisposer(this.cbstruct));
        }
    }

    private static Reference<Callback>[] addCallbackToArray(Callback callback, Reference<Callback>[] referenceArr) {
        int i = 0;
        int i2 = 1;
        if (referenceArr != null) {
            for (int i3 = 0; i3 < referenceArr.length; i3++) {
                if (referenceArr[i3].get() == null) {
                    referenceArr[i3] = null;
                } else {
                    i2++;
                }
            }
        }
        Reference<Callback>[] referenceArr2 = new Reference[i2];
        if (referenceArr != null) {
            int i4 = 0;
            while (i < referenceArr.length) {
                Reference<Callback> reference = referenceArr[i];
                if (reference != null) {
                    referenceArr2[i4] = reference;
                    i4++;
                }
                i++;
            }
            i = i4;
        }
        referenceArr2[i] = new WeakReference(callback);
        return referenceArr2;
    }

    private static Method checkMethod(Method method) {
        if (method.getParameterTypes().length <= 256) {
            return method;
        }
        throw new UnsupportedOperationException("Method signature exceeds the maximum parameter count: ".concat(String.valueOf(String.valueOf(method))));
    }

    private static Callback createCallback(Class<?> cls, Pointer pointer) {
        int i = true != AltCallingConvention.class.isAssignableFrom(cls) ? 0 : 63;
        HashMap map = new HashMap(Native.getLibraryOptions(cls));
        map.put("invoking-method", getCallbackMethod(cls));
        return (Callback) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new NativeFunctionHandler(pointer, i, map));
    }

    static void disposeAll() {
        Iterator it = new LinkedList(allocatedMemory.values()).iterator();
        while (it.hasNext()) {
            CallbackReference callbackReference = (CallbackReference) ((Reference) it.next()).get();
            if (callbackReference != null) {
                callbackReference.close();
            }
        }
    }

    static Class<?> findCallbackClass(Class<?> cls) {
        if (!Callback.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(String.valueOf(cls.getName()).concat(" is not derived from com.sun.jna.Callback"));
        }
        if (!cls.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int i = 0;
            while (true) {
                if (i >= interfaces.length) {
                    break;
                }
                if (Callback.class.isAssignableFrom(interfaces[i])) {
                    try {
                        getCallbackMethod(interfaces[i]);
                        return interfaces[i];
                    } catch (IllegalArgumentException unused) {
                        return Callback.class.isAssignableFrom(cls.getSuperclass()) ? findCallbackClass(cls.getSuperclass()) : cls;
                    }
                }
                i++;
            }
        } else {
            return cls;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Callback getCallback() {
        return (Callback) get();
    }

    private static Method getCallbackMethod(Callback callback) {
        return getCallbackMethod(findCallbackClass(callback.getClass()));
    }

    public static Pointer getFunctionPointer(Callback callback) {
        return getFunctionPointer(callback, false);
    }

    private static Pointer getNativeFunctionPointer(Callback callback) throws IllegalArgumentException {
        if (!Proxy.isProxyClass(callback.getClass())) {
            return null;
        }
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(callback);
        if (invocationHandler instanceof NativeFunctionHandler) {
            return ((NativeFunctionHandler) invocationHandler).getPointer();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Pointer getNativeString(Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        NativeString nativeString = new NativeString(obj.toString(), z);
        allocations.put(obj, nativeString);
        return nativeString.getPointer();
    }

    private Class<?> getNativeType(Class<?> cls) throws NoSuchMethodException, SecurityException {
        if (Structure.class.isAssignableFrom(cls)) {
            Structure.validate(cls);
            if (!Structure.ByValue.class.isAssignableFrom(cls)) {
                return Pointer.class;
            }
        } else {
            if (NativeMapped.class.isAssignableFrom(cls)) {
                return NativeMappedConverter.getInstance(cls).nativeType();
            }
            if (cls == String.class || cls == WString.class || cls == String[].class || cls == WString[].class || Callback.class.isAssignableFrom(cls)) {
                return Pointer.class;
            }
        }
        return cls;
    }

    private static Callback getTypeAssignableCallback(Class<?> cls, Reference<Callback>[] referenceArr) {
        if (referenceArr == null) {
            return null;
        }
        for (Reference<Callback> reference : referenceArr) {
            Callback callback = reference.get();
            if (callback != null && cls.isAssignableFrom(callback.getClass())) {
                return callback;
            }
        }
        return null;
    }

    private static ThreadGroup initializeThread(Callback callback, AttachOptions attachOptions) {
        CallbackThreadInitializer callbackThreadInitializer;
        if (callback instanceof DefaultCallbackProxy) {
            callback = ((DefaultCallbackProxy) callback).getCallback();
        }
        Map<Callback, CallbackThreadInitializer> map = initializers;
        synchronized (map) {
            callbackThreadInitializer = map.get(callback);
        }
        if (callbackThreadInitializer == null) {
            return null;
        }
        ThreadGroup threadGroup = callbackThreadInitializer.getThreadGroup(callback);
        attachOptions.name = callbackThreadInitializer.getName(callback);
        attachOptions.daemon = callbackThreadInitializer.isDaemon(callback);
        attachOptions.detach = callbackThreadInitializer.detach(callback);
        attachOptions.write();
        return threadGroup;
    }

    private static boolean isAllowableNativeType(Class<?> cls) {
        if (cls == Void.TYPE || cls == Void.class || cls == Boolean.TYPE || cls == Boolean.class || cls == Byte.TYPE || cls == Byte.class || cls == Short.TYPE || cls == Short.class || cls == Character.TYPE || cls == Character.class || cls == Integer.TYPE || cls == Integer.class || cls == Long.TYPE || cls == Long.class || cls == Float.TYPE || cls == Float.class || cls == Double.TYPE || cls == Double.class) {
            return true;
        }
        return (Structure.ByValue.class.isAssignableFrom(cls) && Structure.class.isAssignableFrom(cls)) || Pointer.class.isAssignableFrom(cls);
    }

    private void setCallbackOptions(int i) {
        this.cbstruct.setInt(Native.POINTER_SIZE, i);
    }

    static CallbackThreadInitializer setCallbackThreadInitializer(Callback callback, CallbackThreadInitializer callbackThreadInitializer) {
        Map<Callback, CallbackThreadInitializer> map = initializers;
        synchronized (map) {
            if (callbackThreadInitializer != null) {
                return map.put(callback, callbackThreadInitializer);
            }
            return map.remove(callback);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        eyfe eyfeVar = this.cleanable;
        if (eyfeVar != null) {
            eyfeVar.a();
        }
        this.cbstruct = null;
    }

    @Deprecated
    protected void dispose() {
        close();
    }

    public Pointer getTrampoline() {
        if (this.trampoline == null) {
            this.trampoline = this.cbstruct.getPointer(0L);
        }
        return this.trampoline;
    }

    public static Callback getCallback(Class<?> cls, Pointer pointer) {
        return getCallback(cls, pointer, false);
    }

    private static Method getCallbackMethod(Class<?> cls) throws SecurityException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        Method[] methods = cls.getMethods();
        HashSet hashSet = new HashSet(Arrays.asList(declaredMethods));
        hashSet.retainAll(Arrays.asList(methods));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (Callback.FORBIDDEN_NAMES.contains(((Method) it.next()).getName())) {
                it.remove();
            }
        }
        Method[] methodArr = (Method[]) hashSet.toArray(new Method[0]);
        if (methodArr.length == 1) {
            Method method = methodArr[0];
            checkMethod(method);
            return method;
        }
        for (Method method2 : methodArr) {
            if (Callback.METHOD_NAME.equals(method2.getName())) {
                checkMethod(method2);
                return method2;
            }
        }
        throw new IllegalArgumentException("Callback must implement a single public method, or one public method named 'callback'");
    }

    private static Pointer getFunctionPointer(Callback callback, boolean z) throws NoSuchFieldException, SecurityException, IllegalArgumentException {
        Pointer trampoline;
        if (callback == null) {
            return null;
        }
        Pointer nativeFunctionPointer = getNativeFunctionPointer(callback);
        if (nativeFunctionPointer != null) {
            return nativeFunctionPointer;
        }
        Map<String, Object> libraryOptions = Native.getLibraryOptions(callback.getClass());
        int iIntValue = callback instanceof AltCallingConvention ? 63 : libraryOptions.containsKey(Library.OPTION_CALLING_CONVENTION) ? ((Integer) libraryOptions.get(Library.OPTION_CALLING_CONVENTION)).intValue() : 0;
        Map<Callback, CallbackReference> map = z ? directCallbackMap : callbackMap;
        Map<Pointer, Reference<Callback>[]> map2 = pointerCallbackMap;
        synchronized (map2) {
            CallbackReference callbackReference = map.get(callback);
            if (callbackReference == null || callbackReference.cbstruct == null) {
                callbackReference = new CallbackReference(callback, iIntValue, z);
                map.put(callback, callbackReference);
                map2.put(callbackReference.getTrampoline(), addCallbackToArray(callback, null));
                if (initializers.containsKey(callback)) {
                    callbackReference.setCallbackOptions(1);
                }
            }
            trampoline = callbackReference.getTrampoline();
        }
        return trampoline;
    }

    private static Callback getCallback(Class<?> cls, Pointer pointer, boolean z) {
        Map<Callback, CallbackReference> map;
        if (pointer == null) {
            return null;
        }
        if (cls.isInterface()) {
            if (z) {
                map = directCallbackMap;
            } else {
                map = callbackMap;
            }
            Map<Pointer, Reference<Callback>[]> map2 = pointerCallbackMap;
            synchronized (map2) {
                Reference<Callback>[] referenceArr = map2.get(pointer);
                Callback typeAssignableCallback = getTypeAssignableCallback(cls, referenceArr);
                if (typeAssignableCallback != null) {
                    return typeAssignableCallback;
                }
                Callback callbackCreateCallback = createCallback(cls, pointer);
                map2.put(pointer, addCallbackToArray(callbackCreateCallback, referenceArr));
                map.remove(callbackCreateCallback);
                return callbackCreateCallback;
            }
        }
        throw new IllegalArgumentException("Callback type must be an interface");
    }
}
