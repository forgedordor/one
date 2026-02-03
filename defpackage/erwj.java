package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erwj {
    public static String a(ervp ervpVar) throws GeneralSecurityException {
        int iOrdinal = ervpVar.ordinal();
        if (iOrdinal == 0) {
            return "SHA-1";
        }
        if (iOrdinal == 1) {
            return "SHA-224";
        }
        if (iOrdinal == 2) {
            return "SHA-256";
        }
        if (iOrdinal == 3) {
            return "SHA-384";
        }
        if (iOrdinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(ervpVar.toString()));
    }

    public static String b(ervp ervpVar) throws GeneralSecurityException {
        erwk.d(ervpVar);
        return ervpVar.toString().concat("withECDSA");
    }

    public static void c(ByteBuffer byteBuffer, long j) throws GeneralSecurityException {
        if (j < 0 || j >= 4294967296L) {
            throw new GeneralSecurityException("Index out of range");
        }
        byteBuffer.putInt((int) j);
    }

    public static boolean d() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }
}
