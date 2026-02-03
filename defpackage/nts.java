package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nts {
    public static ntr a(byte[] bArr) {
        UUID[] uuidArr;
        mfr mfrVar = new mfr(bArr);
        if (mfrVar.c < 32) {
            return null;
        }
        mfrVar.K(0);
        int iA = mfrVar.a();
        int iE = mfrVar.e();
        if (iE != iA) {
            mff.f("PsshAtomUtil", a.s(iA, iE, "Advertised atom size (", ") does not match buffer size: "));
            return null;
        }
        int iE2 = mfrVar.e();
        if (iE2 != 1886614376) {
            mff.f("PsshAtomUtil", a.g(iE2, "Atom type is not pssh: "));
            return null;
        }
        int iB = ntd.b(mfrVar.e());
        if (iB > 1) {
            mff.f("PsshAtomUtil", a.g(iB, "Unsupported pssh version: "));
            return null;
        }
        UUID uuid = new UUID(mfrVar.q(), mfrVar.q());
        if (iB == 1) {
            int iM = mfrVar.m();
            uuidArr = new UUID[iM];
            for (int i = 0; i < iM; i++) {
                uuidArr[i] = new UUID(mfrVar.q(), mfrVar.q());
            }
        } else {
            uuidArr = null;
        }
        int iM2 = mfrVar.m();
        int iA2 = mfrVar.a();
        if (iM2 != iA2) {
            mff.f("PsshAtomUtil", a.s(iA2, iM2, "Atom data size (", ") does not match the bytes left: "));
            return null;
        }
        byte[] bArr2 = new byte[iM2];
        mfrVar.F(bArr2, 0, iM2);
        return new ntr(uuid, iB, bArr2, uuidArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length;
        int length2 = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length2 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
        byteBufferAllocate.putInt(length2);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || (length = bArr.length) == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static byte[] c(byte[] bArr, UUID uuid) {
        ntr ntrVarA = a(bArr);
        if (ntrVarA == null) {
            return null;
        }
        UUID uuid2 = ntrVarA.a;
        if (uuid.equals(uuid2)) {
            return ntrVarA.c;
        }
        mff.f("PsshAtomUtil", "UUID mismatch. Expected: " + uuid.toString() + ", got: " + uuid2.toString() + ".");
        return null;
    }
}
