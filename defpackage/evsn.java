package defpackage;

import androidx.car.app.model.Alert;
import defpackage.evsf;
import defpackage.evsn;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class evsn<MessageType extends evsn<MessageType, BuilderType>, BuilderType extends evsf<MessageType, BuilderType>> extends evpz<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, evsn<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected evvt unknownFields = evvt.a;

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends evsi<MessageType, BuilderType>, BuilderType extends evsh<MessageType, BuilderType>, T> evsl<MessageType, T> checkIsLite(evrp<MessageType, T> evrpVar) {
        return (evsl) evrpVar;
    }

    private static <T extends evsn<T, ?>> T checkMessageInitialized(T t) throws evtj {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.newUninitializedMessageException().a();
    }

    private int computeSerializedSize(evuz<?> evuzVar) {
        return evuzVar == null ? evuq.a.b(this).a(this) : evuzVar.a(this);
    }

    protected static evsr emptyBooleanList() {
        return evqi.b;
    }

    protected static evss emptyDoubleList() {
        return evrh.b;
    }

    protected static evsw emptyFloatList() {
        return evsa.b;
    }

    public static evsx emptyIntList() {
        return evsq.a;
    }

    public static evta emptyLongList() {
        return evtv.a;
    }

    public static <E> evtg<E> emptyProtobufList() {
        return evur.b;
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == evvt.a) {
            this.unknownFields = new evvt();
        }
    }

    static <T extends evsn> T getDefaultInstance(Class<T> cls) throws ClassNotFoundException {
        evsn<?, ?> evsnVar = defaultInstanceMap.get(cls);
        if (evsnVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                evsnVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (evsnVar != null) {
            return evsnVar;
        }
        evsn<?, ?> defaultInstanceForType = ((evsn) evvz.g(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, defaultInstanceForType);
        return defaultInstanceForType;
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object newMessageInfo(evuh evuhVar, String str, Object[] objArr) {
        return new evus(evuhVar, str, objArr);
    }

    public static <ContainingType extends evuh, Type> evsl<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, evuh evuhVar, evsu evsuVar, int i, evwh evwhVar, boolean z, Class cls) {
        return new evsl<>(containingtype, evur.b, evuhVar, new evsk(evsuVar, i, evwhVar, true, z));
    }

    public static <ContainingType extends evuh, Type> evsl<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, evuh evuhVar, evsu evsuVar, int i, evwh evwhVar, Class cls) {
        return new evsl<>(containingtype, type, evuhVar, new evsk(evsuVar, i, evwhVar, false, false));
    }

    public static <T extends evsn<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) throws evtj {
        evrr evrrVar = evrr.a;
        evuq evuqVar = evuq.a;
        T t2 = (T) parsePartialDelimitedFrom(t, inputStream, evrr.a);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends evsn<T, ?>> T parseFrom(T t, evqs evqsVar) throws evtj {
        evrr evrrVar = evrr.a;
        evuq evuqVar = evuq.a;
        T t2 = (T) parseFrom(t, evqsVar, evrr.a);
        checkMessageInitialized(t2);
        return t2;
    }

    private static <T extends evsn<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, evrr evrrVar) throws IOException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            evqz evqzVarK = evqz.K(new evpx(inputStream, evqz.I(i, inputStream)));
            T t2 = (T) parsePartialFrom(t, evqzVarK, evrrVar);
            evqzVarK.z(0);
            return t2;
        } catch (evtj e) {
            if (e.a) {
                throw new evtj(e);
            }
            throw e;
        } catch (IOException e2) {
            throw new evtj(e2);
        }
    }

    private static <T extends evsn<T, ?>> T parsePartialFrom(T t, evqs evqsVar, evrr evrrVar) {
        evqz evqzVarL = evqsVar.l();
        T t2 = (T) parsePartialFrom(t, evqzVarL, evrrVar);
        evqzVarL.z(0);
        return t2;
    }

    protected static <T extends evsn> void registerDefaultInstance(Class<T> cls, T t) {
        t.markImmutable();
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(evsm.BUILD_MESSAGE_INFO, null, null);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Alert.DURATION_SHOW_INDEFINITELY);
    }

    public int computeHashCode() {
        return evuq.a.b(this).b(this);
    }

    public final <MessageType2 extends evsn<MessageType2, BuilderType2>, BuilderType2 extends evsf<MessageType2, BuilderType2>> BuilderType2 createBuilder() {
        return (BuilderType2) dynamicMethod(evsm.NEW_BUILDER, null, null);
    }

    protected abstract Object dynamicMethod(evsm evsmVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return evuq.a.b(this).k(this, (evsn) obj);
        }
        return false;
    }

    @Override // defpackage.evui
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(evsm.GET_DEFAULT_INSTANCE, null, null);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // defpackage.evpz
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.evuh
    public final evuo<MessageType> getParserForType() {
        return (evuo) dynamicMethod(evsm.GET_PARSER, null, null);
    }

    @Override // defpackage.evuh
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // defpackage.evui
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    protected void makeImmutable() {
        evuq.a.b(this).g(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    protected void mergeLengthDelimitedField(int i, evqs evqsVar) {
        ensureUnknownFieldsInitialized();
        evvt evvtVar = this.unknownFields;
        evvtVar.c();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        evvtVar.f(evwj.c(i, 2), evqsVar);
    }

    protected final void mergeUnknownFields(evvt evvtVar) {
        this.unknownFields = evvt.b(this.unknownFields, evvtVar);
    }

    protected void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        evvt evvtVar = this.unknownFields;
        evvtVar.c();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        evvtVar.f(evwj.c(i, 0), Long.valueOf(i2));
    }

    @Override // defpackage.evpz
    public evum mutableCopy() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    @Override // defpackage.evuh
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(evsm.NEW_BUILDER, null, null);
    }

    public MessageType newMutableInstance() {
        return (MessageType) dynamicMethod(evsm.NEW_MUTABLE_INSTANCE, null, null);
    }

    protected boolean parseUnknownField(int i, evqz evqzVar) {
        if (evwj.b(i) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.g(i, evqzVar);
    }

    public void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    @Override // defpackage.evpz
    public void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            throw new IllegalStateException(a.g(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = i | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    @Override // defpackage.evuh
    public final BuilderType toBuilder() {
        return (BuilderType) ((evsf) dynamicMethod(evsm.NEW_BUILDER, null, null)).mergeFrom((evsf) this);
    }

    public String toString() {
        String string = super.toString();
        int i = evuj.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        evuj.b(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.evuh
    public void writeTo(evrf evrfVar) {
        evuz evuzVarB = evuq.a.b(this);
        evrg evrgVar = evrfVar.f;
        if (evrgVar == null) {
            evrgVar = new evrg(evrfVar);
        }
        evuzVarB.m(this, evrgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends evsn<T, ?>> boolean isInitialized(T t, boolean z) {
        byte bByteValue = ((Byte) t.dynamicMethod(evsm.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zL = evuq.a.b(t).l(t);
        if (z) {
            t.dynamicMethod(evsm.SET_MEMOIZED_IS_INITIALIZED, true != zL ? null : t, null);
        }
        return zL;
    }

    public static evsr mutableCopy(evsr evsrVar) {
        int size = evsrVar.size();
        return evsrVar.e(size + size);
    }

    public final <MessageType2 extends evsn<MessageType2, BuilderType2>, BuilderType2 extends evsf<MessageType2, BuilderType2>> BuilderType2 createBuilder(MessageType2 messagetype2) {
        return (BuilderType2) createBuilder().mergeFrom((evsf) messagetype2);
    }

    @Override // defpackage.evpz
    public int getSerializedSize(evuz evuzVar) {
        if (isMutable()) {
            int iComputeSerializedSize = computeSerializedSize(evuzVar);
            if (iComputeSerializedSize >= 0) {
                return iComputeSerializedSize;
            }
            throw new IllegalStateException(a.g(iComputeSerializedSize, "serialized size must be non-negative, was "));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int iComputeSerializedSize2 = computeSerializedSize(evuzVar);
        setMemoizedSerializedSize(iComputeSerializedSize2);
        return iComputeSerializedSize2;
    }

    protected static evss mutableCopy(evss evssVar) {
        int size = evssVar.size();
        return evssVar.e(size + size);
    }

    protected static <T extends evsn<T, ?>> T parsePartialFrom(T t, evqz evqzVar) {
        evrr evrrVar = evrr.a;
        evuq evuqVar = evuq.a;
        return (T) parsePartialFrom(t, evqzVar, evrr.a);
    }

    protected static <T extends evsn<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, evrr evrrVar) throws evtj {
        T t2 = (T) parsePartialDelimitedFrom(t, inputStream, evrrVar);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends evsn<T, ?>> T parseFrom(T t, evqs evqsVar, evrr evrrVar) throws evtj {
        T t2 = (T) parsePartialFrom(t, evqsVar, evrrVar);
        checkMessageInitialized(t2);
        return t2;
    }

    public static evsw mutableCopy(evsw evswVar) {
        int size = evswVar.size();
        return evswVar.e(size + size);
    }

    protected static <T extends evsn<T, ?>> T parseFrom(T t, evqz evqzVar) {
        evrr evrrVar = evrr.a;
        evuq evuqVar = evuq.a;
        return (T) parseFrom(t, evqzVar, evrr.a);
    }

    static <T extends evsn<T, ?>> T parsePartialFrom(T t, evqz evqzVar, evrr evrrVar) throws evtj {
        T t2 = (T) t.newMutableInstance();
        try {
            evuz evuzVarB = evuq.a.b(t2);
            evuzVarB.i(t2, evra.p(evqzVar), evrrVar);
            evuzVarB.g(t2);
            return t2;
        } catch (evtj e) {
            if (e.a) {
                throw new evtj(e);
            }
            throw e;
        } catch (evvr e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof evtj) {
                throw ((evtj) e3.getCause());
            }
            throw new evtj(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof evtj) {
                throw ((evtj) e4.getCause());
            }
            throw e4;
        }
    }

    public static evsx mutableCopy(evsx evsxVar) {
        int size = evsxVar.size();
        return evsxVar.e(size + size);
    }

    public static <T extends evsn<T, ?>> T parseFrom(T t, evqz evqzVar, evrr evrrVar) throws evtj {
        T t2 = (T) parsePartialFrom(t, evqzVar, evrrVar);
        checkMessageInitialized(t2);
        return t2;
    }

    public static evta mutableCopy(evta evtaVar) {
        int size = evtaVar.size();
        return evtaVar.e(size + size);
    }

    public static <T extends evsn<T, ?>> T parseFrom(T t, InputStream inputStream) throws evtj {
        evqz evqzVarK = evqz.K(inputStream);
        evrr evrrVar = evrr.a;
        evuq evuqVar = evuq.a;
        T t2 = (T) parsePartialFrom(t, evqzVarK, evrr.a);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <E> evtg<E> mutableCopy(evtg<E> evtgVar) {
        int size = evtgVar.size();
        return evtgVar.e(size + size);
    }

    public static <T extends evsn<T, ?>> T parseFrom(T t, InputStream inputStream, evrr evrrVar) throws evtj {
        T t2 = (T) parsePartialFrom(t, evqz.K(inputStream), evrrVar);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends evsn<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer) {
        evrr evrrVar = evrr.a;
        evuq evuqVar = evuq.a;
        return (T) parseFrom(t, byteBuffer, evrr.a);
    }

    public static <T extends evsn<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer, evrr evrrVar) throws evtj {
        T t2 = (T) parseFrom(t, evqz.L(byteBuffer), evrrVar);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends evsn<T, ?>> T parseFrom(T t, byte[] bArr) throws evtj {
        int length = bArr.length;
        evrr evrrVar = evrr.a;
        evuq evuqVar = evuq.a;
        T t2 = (T) parsePartialFrom(t, bArr, 0, length, evrr.a);
        checkMessageInitialized(t2);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends evsn<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, evrr evrrVar) throws evtj {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.newMutableInstance();
        try {
            evuz evuzVarB = evuq.a.b(t2);
            evuzVarB.j(t2, bArr, i, i + i2, new evqf(evrrVar));
            evuzVarB.g(t2);
            return t2;
        } catch (evtj e) {
            if (e.a) {
                throw new evtj(e);
            }
            throw e;
        } catch (evvr e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof evtj) {
                throw ((evtj) e3.getCause());
            }
            throw new evtj(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static <T extends evsn<T, ?>> T parseFrom(T t, byte[] bArr, evrr evrrVar) throws evtj {
        T t2 = (T) parsePartialFrom(t, bArr, 0, bArr.length, evrrVar);
        checkMessageInitialized(t2);
        return t2;
    }
}
