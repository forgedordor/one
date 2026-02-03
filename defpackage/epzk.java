package defpackage;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epzk {
    public static final Memory a(long j) {
        if (j > 0) {
            return new Memory(j);
        }
        return null;
    }

    public static final byte[] b(eqau eqauVar) {
        eqauVar.getClass();
        byte[] byteArray = eqauVar.data.getByteArray(0L, eqauVar.len.intValue());
        byteArray.getClass();
        return byteArray;
    }

    public static final fcti c(byte[] bArr) {
        Pointer pointer;
        int length = bArr.length;
        long j = length;
        Memory memoryA = a(j);
        eqau eqauVar = new eqau();
        if (memoryA != null) {
            pointer = memoryA.share(0L);
            pointer.write(0L, bArr, 0, length);
            pointer.getClass();
        } else {
            pointer = new Pointer(0L);
        }
        eqauVar.data = pointer;
        eqauVar.len = new epza(j, null);
        return new fcti(memoryA, eqauVar);
    }

    public static final fcti d(String str) {
        Pointer pointer;
        byte[] bytes = str.getBytes(fdfy.a);
        bytes.getClass();
        int length = bytes.length;
        long j = length;
        Memory memoryA = a(j);
        eqau eqauVar = new eqau();
        if (memoryA != null) {
            pointer = memoryA.share(0L);
            pointer.write(0L, bytes, 0, length);
            pointer.getClass();
        } else {
            pointer = new Pointer(0L);
        }
        eqauVar.data = pointer;
        eqauVar.len = new epza(j, null);
        return new fcti(memoryA, eqauVar);
    }
}
