package defpackage;

import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpob {
    public static final byte[] a(byte[] bArr, byte[] bArr2) {
        eieu eieuVarK = eiiy.k("CmsCipher#decryptCms");
        try {
            int length = bArr2.length;
            ejwl.b(length == 32, a.g(length, "Wrong encryption key length, expected 32 bytes but is "));
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byte[] bArr3 = new byte[12];
            byteBufferWrap.get(bArr3);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, new SecretKeySpec(bArr2, "AES"), new GCMParameterSpec(128, bArr3));
            byte[] bArrDoFinal = cipher.doFinal(bArr4);
            eieuVarK.close();
            return bArrDoFinal;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final byte[] b(byte[] bArr, byte[] bArr2) {
        eieu eieuVarK = eiiy.k("CmsCipher#encryptCms");
        try {
            int length = bArr2.length;
            ejwl.b(length == 32, a.g(length, "Wrong encryption key length, expected 32 bytes but is "));
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            byte[] bArr3 = new byte[12];
            ejwx.a.nextBytes(bArr3);
            cipher.init(1, new SecretKeySpec(bArr2, "AES"), new GCMParameterSpec(128, bArr3));
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrDoFinal.length + 12);
            byteBufferAllocate.put(bArr3);
            byteBufferAllocate.put(bArrDoFinal);
            byte[] bArrArray = byteBufferAllocate.array();
            eieuVarK.close();
            return bArrArray;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
