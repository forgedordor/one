package defpackage;

import defpackage.evpy;
import defpackage.evpz;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class evpz<MessageType extends evpz<MessageType, BuilderType>, BuilderType extends evpy<MessageType, BuilderType>> implements evuh {
    protected int memoizedHashCode = 0;

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        evpy.addAll((Iterable) iterable, (List) list);
    }

    protected static void checkByteStringIsUtf8(evqs evqsVar) {
        if (!evqsVar.r()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(evuz evuzVar) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int iA = evuzVar.a(this);
        setMemoizedSerializedSize(iA);
        return iA;
    }

    public evum mutableCopy() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public evvr newUninitializedMessageException() {
        return new evvr();
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.evuh
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            evrf evrfVarAb = evrf.ab(bArr);
            writeTo(evrfVarAb);
            evrfVarAb.ac();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    @Override // defpackage.evuh
    public evqs toByteString() {
        try {
            int serializedSize = getSerializedSize();
            evqs evqsVar = evqs.b;
            byte[] bArr = new byte[serializedSize];
            evrf evrfVarAb = evrf.ab(bArr);
            writeTo(evrfVarAb);
            return evqo.a(evrfVarAb, bArr);
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        evre evreVar = new evre(outputStream, evrf.N(evrf.W(serializedSize) + serializedSize));
        evreVar.w(serializedSize);
        writeTo(evreVar);
        evreVar.aw();
    }

    @Override // defpackage.evuh
    public void writeTo(OutputStream outputStream) {
        evre evreVar = new evre(outputStream, evrf.N(getSerializedSize()));
        writeTo(evreVar);
        evreVar.aw();
    }
}
