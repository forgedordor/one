package com.sun.jna;

import com.sun.jna.Structure;
import defpackage.a;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Function extends Pointer {
    public static final int ALT_CONVENTION = 63;
    public static final int C_CONVENTION = 0;
    private static final int MASK_CC = 63;
    public static final int MAX_NARGS = 256;
    static final String OPTION_INVOKING_METHOD = "invoking-method";
    public static final int THROW_LAST_ERROR = 64;
    public static final int USE_VARARGS = 255;
    private static final int USE_VARARGS_SHIFT = 7;
    final int callFlags;
    final String encoding;
    private final String functionName;
    private NativeLibrary library;
    final Map<String, ?> options;
    static final Integer INTEGER_TRUE = -1;
    static final Integer INTEGER_FALSE = 0;
    private static final VarArgsChecker IS_VARARGS = VarArgsChecker.create();

    /* compiled from: PG */
    private static class NativeMappedArray extends Memory implements PostCallRead {
        private final NativeMapped[] original;

        public NativeMappedArray(NativeMapped[] nativeMappedArr) {
            super(Native.getNativeSize(nativeMappedArr.getClass(), nativeMappedArr));
            this.original = nativeMappedArr;
            setValue(0L, nativeMappedArr, nativeMappedArr.getClass());
        }

        @Override // com.sun.jna.Function.PostCallRead
        public void read() {
            NativeMapped[] nativeMappedArr = this.original;
            getValue(0L, nativeMappedArr.getClass(), nativeMappedArr);
        }
    }

    /* compiled from: PG */
    private static class PointerArray extends Memory implements PostCallRead {
        private final Pointer[] original;

        public PointerArray(Pointer[] pointerArr) {
            super(Native.POINTER_SIZE * (pointerArr.length + 1));
            this.original = pointerArr;
            int i = 0;
            while (true) {
                if (i >= pointerArr.length) {
                    setPointer(Native.POINTER_SIZE * r1, null);
                    return;
                }
                setPointer(Native.POINTER_SIZE * i, pointerArr[i]);
                i++;
            }
        }

        @Override // com.sun.jna.Function.PostCallRead
        public void read() {
            Pointer[] pointerArr = this.original;
            read(0L, pointerArr, 0, pointerArr.length);
        }
    }

    /* compiled from: PG */
    public interface PostCallRead {
        void read();
    }

    public Function(NativeLibrary nativeLibrary, String str, int i, String str2) {
        checkCallingConvention(i & 63);
        if (str == null) {
            throw new NullPointerException("Function name must not be null");
        }
        this.library = nativeLibrary;
        this.functionName = str;
        this.callFlags = i;
        this.options = nativeLibrary.getOptions();
        this.encoding = str2 == null ? Native.getDefaultStringEncoding() : str2;
        try {
            this.peer = nativeLibrary.getSymbolAddress(str);
        } catch (UnsatisfiedLinkError e) {
            throw new UnsatisfiedLinkError("Error looking up function '" + str + "': " + e.getMessage());
        }
    }

    private void checkCallingConvention(int i) {
        if ((i & 63) != i) {
            throw new IllegalArgumentException(a.g(i, "Unrecognized calling convention: "));
        }
    }

    static Object[] concatenateVarArgs(Object[] objArr) {
        int length;
        if (objArr != null && (length = objArr.length) > 0) {
            Object obj = objArr[length - 1];
            Class<?> cls = obj != null ? obj.getClass() : null;
            if (cls != null && cls.isArray()) {
                Object[] objArr2 = (Object[]) obj;
                int i = 0;
                while (true) {
                    int length2 = objArr2.length;
                    if (i >= length2) {
                        int length3 = objArr.length;
                        int i2 = length3 - 1;
                        int i3 = length3 + length2;
                        Object[] objArr3 = new Object[i3];
                        System.arraycopy(objArr, 0, objArr3, 0, i2);
                        System.arraycopy(objArr2, 0, objArr3, i2, length2);
                        objArr3[i3 - 1] = null;
                        return objArr3;
                    }
                    if (objArr2[i] instanceof Float) {
                        objArr2[i] = Double.valueOf(((Float) r4).floatValue());
                    }
                    i++;
                }
            }
        }
        return objArr;
    }

    private Object convertArgument(Object[] objArr, int i, Method method, TypeMapper typeMapper, boolean z, Class<?> cls) {
        int length;
        Object obj = objArr[i];
        if (obj != null) {
            Class<?> cls2 = obj.getClass();
            ToNativeConverter nativeMappedConverter = NativeMapped.class.isAssignableFrom(cls2) ? NativeMappedConverter.getInstance(cls2) : typeMapper != null ? typeMapper.getToNativeConverter(cls2) : null;
            if (nativeMappedConverter != null) {
                obj = nativeMappedConverter.toNative(obj, method != null ? new MethodParameterContext(this, objArr, i, method) : new FunctionParameterContext(this, objArr, i));
            }
        }
        if (obj != null && !isPrimitiveArray(obj.getClass())) {
            Class<?> cls3 = obj.getClass();
            if (obj instanceof Structure) {
                Structure structure = (Structure) obj;
                structure.autoWrite();
                if (structure instanceof Structure.ByValue) {
                    Class<?> cls4 = structure.getClass();
                    if (method != null) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (!IS_VARARGS.isVarArgs(method) || i < parameterTypes.length - 1) {
                            cls4 = parameterTypes[i];
                        } else {
                            Class<?> componentType = parameterTypes[length].getComponentType();
                            if (componentType != Object.class) {
                                cls4 = componentType;
                            }
                        }
                    }
                    if (Structure.ByValue.class.isAssignableFrom(cls4)) {
                        return structure;
                    }
                }
                return structure.getPointer();
            }
            if (obj instanceof Callback) {
                return CallbackReference.getFunctionPointer((Callback) obj);
            }
            if (obj instanceof String) {
                return new NativeString((String) obj, this.encoding).getPointer();
            }
            if (obj instanceof WString) {
                return new NativeString(obj.toString(), true).getPointer();
            }
            if (obj instanceof Boolean) {
                return Boolean.TRUE.equals(obj) ? INTEGER_TRUE : INTEGER_FALSE;
            }
            if (cls3 == String[].class) {
                return new StringArray((String[]) obj, this.encoding);
            }
            if (cls3 == WString[].class) {
                return new StringArray((WString[]) obj);
            }
            if (cls3 == Pointer[].class) {
                return new PointerArray((Pointer[]) obj);
            }
            if (NativeMapped[].class.isAssignableFrom(cls3)) {
                return new NativeMappedArray((NativeMapped[]) obj);
            }
            if (Structure[].class.isAssignableFrom(cls3)) {
                Structure[] structureArr = (Structure[]) obj;
                Class<?> componentType2 = cls3.getComponentType();
                boolean zIsAssignableFrom = Structure.ByReference.class.isAssignableFrom(componentType2);
                if (cls != null && !Structure.ByReference[].class.isAssignableFrom(cls)) {
                    if (zIsAssignableFrom) {
                        throw new IllegalArgumentException("Function " + getName() + " declared Structure[] at parameter " + i + " but array of " + String.valueOf(componentType2) + " was passed");
                    }
                    for (int i2 = 0; i2 < structureArr.length; i2++) {
                        if (structureArr[i2] instanceof Structure.ByReference) {
                            throw new IllegalArgumentException("Function " + getName() + " declared Structure[] at parameter " + i + " but element " + i2 + " is of Structure.ByReference type");
                        }
                    }
                } else if (zIsAssignableFrom) {
                    Structure.autoWrite(structureArr);
                    Pointer[] pointerArr = new Pointer[structureArr.length + 1];
                    for (int i3 = 0; i3 < structureArr.length; i3++) {
                        Structure structure2 = structureArr[i3];
                        pointerArr[i3] = structure2 != null ? structure2.getPointer() : null;
                    }
                    return new PointerArray(pointerArr);
                }
                if (structureArr.length == 0) {
                    throw new IllegalArgumentException("Structure array must have non-zero length");
                }
                if (structureArr[0] == null) {
                    Structure.newInstance(componentType2).toArray(structureArr);
                    return structureArr[0].getPointer();
                }
                Structure.autoWrite(structureArr);
                return structureArr[0].getPointer();
            }
            if (cls3.isArray()) {
                throw new IllegalArgumentException("Unsupported array argument type: ".concat(String.valueOf(String.valueOf(cls3.getComponentType()))));
            }
            if (!z && !Native.isSupportedNativeType(obj.getClass())) {
                throw new IllegalArgumentException("Unsupported argument type " + obj.getClass().getName() + " at parameter " + i + " of function " + getName());
            }
        }
        return obj;
    }

    static int fixedArgs(Method method) {
        return IS_VARARGS.fixedArgs(method);
    }

    public static Function getFunction(Pointer pointer) {
        return getFunction(pointer, 0, (String) null);
    }

    private Pointer invokePointer(int i, Object[] objArr) {
        long jInvokePointer = Native.invokePointer(this, this.peer, i, objArr);
        if (jInvokePointer == 0) {
            return null;
        }
        return new Pointer(jInvokePointer);
    }

    private String invokeString(int i, Object[] objArr, boolean z) {
        Pointer pointerInvokePointer = invokePointer(i, objArr);
        if (pointerInvokePointer != null) {
            return z ? pointerInvokePointer.getWideString(0L) : pointerInvokePointer.getString(0L, this.encoding);
        }
        return null;
    }

    private boolean isPrimitiveArray(Class<?> cls) {
        return cls.isArray() && cls.getComponentType().isPrimitive();
    }

    static boolean isVarArgs(Method method) {
        return IS_VARARGS.isVarArgs(method);
    }

    static Boolean valueOf(boolean z) {
        return z ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // com.sun.jna.Pointer
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() == getClass()) {
            Function function = (Function) obj;
            if (function.callFlags == this.callFlags && function.options.equals(this.options) && function.peer == this.peer) {
                return true;
            }
        }
        return false;
    }

    public int getCallingConvention() {
        return this.callFlags & 63;
    }

    public String getName() {
        return this.functionName;
    }

    @Override // com.sun.jna.Pointer
    public int hashCode() {
        return this.callFlags + this.options.hashCode() + super.hashCode();
    }

    public Object invoke(Class<?> cls, Object[] objArr) {
        return invoke(cls, objArr, this.options);
    }

    public double invokeDouble(Object[] objArr) {
        return ((Double) invoke(Double.class, objArr)).doubleValue();
    }

    public float invokeFloat(Object[] objArr) {
        return ((Float) invoke(Float.class, objArr)).floatValue();
    }

    public int invokeInt(Object[] objArr) {
        return ((Integer) invoke(Integer.class, objArr)).intValue();
    }

    public long invokeLong(Object[] objArr) {
        return ((Long) invoke(Long.class, objArr)).longValue();
    }

    public Object invokeObject(Object[] objArr) {
        return invoke(Object.class, objArr);
    }

    public void invokeVoid(Object[] objArr) {
        invoke(Void.class, objArr);
    }

    @Override // com.sun.jna.Pointer
    public String toString() {
        NativeLibrary nativeLibrary = this.library;
        if (nativeLibrary == null) {
            return "native function@0x".concat(String.valueOf(Long.toHexString(this.peer)));
        }
        return "native function " + this.functionName + "(" + nativeLibrary.getName() + ")@0x" + Long.toHexString(this.peer);
    }

    public static Function getFunction(Pointer pointer, int i) {
        return getFunction(pointer, i, (String) null);
    }

    public Object invoke(Class<?> cls, Object[] objArr, Map<String, ?> map) {
        Method method = (Method) map.get(OPTION_INVOKING_METHOD);
        return invoke(method, method != null ? method.getParameterTypes() : null, cls, objArr, map);
    }

    public Pointer invokePointer(Object[] objArr) {
        return (Pointer) invoke(Pointer.class, objArr);
    }

    public static Function getFunction(Pointer pointer, int i, String str) {
        return new Function(pointer, i, str);
    }

    public static Function getFunction(String str, String str2) {
        return NativeLibrary.getInstance(str).getFunction(str2);
    }

    public String invokeString(Object[] objArr, boolean z) {
        Class<?> cls;
        if (true != z) {
            cls = String.class;
        } else {
            cls = WString.class;
        }
        Object objInvoke = invoke(cls, objArr);
        if (objInvoke != null) {
            return objInvoke.toString();
        }
        return null;
    }

    public static Function getFunction(String str, String str2, int i) {
        return NativeLibrary.getInstance(str).getFunction(str2, i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0090 A[PHI: r4
      0x0090: PHI (r4v1 com.sun.jna.FromNativeConverter) = (r4v0 com.sun.jna.FromNativeConverter), (r4v18 com.sun.jna.FromNativeConverter) binds: [B:32:0x0083, B:34:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.reflect.Method r11, java.lang.Class<?>[] r12, java.lang.Class<?> r13, java.lang.Object[] r14, java.util.Map<java.lang.String, ?> r15) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Function.invoke(java.lang.reflect.Method, java.lang.Class[], java.lang.Class, java.lang.Object[], java.util.Map):java.lang.Object");
    }

    public static Function getFunction(String str, String str2, int i, String str3) {
        return NativeLibrary.getInstance(str).getFunction(str2, i, str3);
    }

    public Function(Pointer pointer, int i, String str) {
        checkCallingConvention(i & 63);
        if (pointer != null && pointer.peer != 0) {
            this.functionName = pointer.toString();
            this.callFlags = i;
            this.peer = pointer.peer;
            this.options = Collections.EMPTY_MAP;
            this.encoding = str == null ? Native.getDefaultStringEncoding() : str;
            return;
        }
        throw new NullPointerException("Function address may not be null");
    }

    public void invoke(Object[] objArr) {
        invoke(Void.class, objArr);
    }

    Object invoke(Object[] objArr, Class<?> cls, boolean z) {
        return invoke(objArr, cls, z, 0);
    }

    public Object invoke(Object[] objArr, Class<?> cls, boolean z, int i) {
        int i2 = this.callFlags | ((i & 255) << 7);
        if (cls == null || cls == Void.TYPE || cls == Void.class) {
            Native.invokeVoid(this, this.peer, i2, objArr);
            return null;
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return valueOf(Native.invokeInt(this, this.peer, i2, objArr) != 0);
        }
        if (cls != Byte.TYPE && cls != Byte.class) {
            if (cls != Short.TYPE && cls != Short.class) {
                if (cls != Character.TYPE && cls != Character.class) {
                    if (cls != Integer.TYPE && cls != Integer.class) {
                        if (cls != Long.TYPE && cls != Long.class) {
                            if (cls != Float.TYPE && cls != Float.class) {
                                if (cls != Double.TYPE && cls != Double.class) {
                                    if (cls == String.class) {
                                        return invokeString(i2, objArr, false);
                                    }
                                    if (cls == WString.class) {
                                        String strInvokeString = invokeString(i2, objArr, true);
                                        if (strInvokeString != null) {
                                            return new WString(strInvokeString);
                                        }
                                        return null;
                                    }
                                    if (Pointer.class.isAssignableFrom(cls)) {
                                        return invokePointer(i2, objArr);
                                    }
                                    if (Structure.class.isAssignableFrom(cls)) {
                                        if (Structure.ByValue.class.isAssignableFrom(cls)) {
                                            long j = this.peer;
                                            Structure structureNewInstance = Structure.newInstance(cls);
                                            Native.invokeStructure(this, j, i2, objArr, structureNewInstance);
                                            structureNewInstance.autoRead();
                                            return structureNewInstance;
                                        }
                                        Pointer pointerInvokePointer = invokePointer(i2, objArr);
                                        if (pointerInvokePointer == null) {
                                            return pointerInvokePointer;
                                        }
                                        Structure structureNewInstance2 = Structure.newInstance((Class<Structure>) cls, pointerInvokePointer);
                                        structureNewInstance2.conditionalAutoRead();
                                        return structureNewInstance2;
                                    }
                                    if (Callback.class.isAssignableFrom(cls)) {
                                        Pointer pointerInvokePointer2 = invokePointer(i2, objArr);
                                        return pointerInvokePointer2 != null ? CallbackReference.getCallback(cls, pointerInvokePointer2) : pointerInvokePointer2;
                                    }
                                    if (cls == String[].class) {
                                        Pointer pointerInvokePointer3 = invokePointer(i2, objArr);
                                        if (pointerInvokePointer3 != null) {
                                            return pointerInvokePointer3.getStringArray(0L, this.encoding);
                                        }
                                        return null;
                                    }
                                    if (cls == WString[].class) {
                                        Pointer pointerInvokePointer4 = invokePointer(i2, objArr);
                                        if (pointerInvokePointer4 == null) {
                                            return null;
                                        }
                                        String[] wideStringArray = pointerInvokePointer4.getWideStringArray(0L);
                                        WString[] wStringArr = new WString[wideStringArray.length];
                                        for (int i3 = 0; i3 < wideStringArray.length; i3++) {
                                            wStringArr[i3] = new WString(wideStringArray[i3]);
                                        }
                                        return wStringArr;
                                    }
                                    if (cls == Pointer[].class) {
                                        Pointer pointerInvokePointer5 = invokePointer(i2, objArr);
                                        if (pointerInvokePointer5 != null) {
                                            return pointerInvokePointer5.getPointerArray(0L);
                                        }
                                        return null;
                                    }
                                    if (z) {
                                        Object objInvokeObject = Native.invokeObject(this, this.peer, i2, objArr);
                                        if (objInvokeObject == null || cls.isAssignableFrom(objInvokeObject.getClass())) {
                                            return objInvokeObject;
                                        }
                                        throw new ClassCastException("Return type " + cls.toString() + " does not match result " + String.valueOf(objInvokeObject.getClass()));
                                    }
                                    throw new IllegalArgumentException("Unsupported return type " + cls.toString() + " in function " + getName());
                                }
                                return Double.valueOf(Native.invokeDouble(this, this.peer, i2, objArr));
                            }
                            return Float.valueOf(Native.invokeFloat(this, this.peer, i2, objArr));
                        }
                        return Long.valueOf(Native.invokeLong(this, this.peer, i2, objArr));
                    }
                    return Integer.valueOf(Native.invokeInt(this, this.peer, i2, objArr));
                }
                return Character.valueOf((char) Native.invokeInt(this, this.peer, i2, objArr));
            }
            return Short.valueOf((short) Native.invokeInt(this, this.peer, i2, objArr));
        }
        return Byte.valueOf((byte) Native.invokeInt(this, this.peer, i2, objArr));
    }
}
