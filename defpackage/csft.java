package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csft {
    public static final byte[] a = {-101, 14, 65, 13, 51, -117, 50, -50, -5, 9, -70, -113, -39, -64, -85, 117};

    public final byte[] a(byte[] bArr) throws IOException {
        eieu eieuVarH = eiiy.h("TemplatesProtoCipher#decryptCore");
        try {
            if (bArr.length <= 28) {
                throw new IllegalStateException("Check failed.");
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.getClass();
            byte[] bArr2 = new byte[16];
            byteBufferWrap.get(bArr2);
            byte[] bArr3 = new byte[12];
            byteBufferWrap.get(bArr3);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4);
            int i = elcz.a;
            elcu elcuVar = elcx.a;
            byte[] bArrCopyOf = Arrays.copyOf(a, 32);
            System.arraycopy(bArr2, 0, bArrCopyOf, 16, 16);
            bArrCopyOf.getClass();
            SecretKeySpec secretKeySpec = new SecretKeySpec(elcuVar.b(bArrCopyOf).e(), "AES");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bArr3));
            byte[] bArrDoFinal = cipher.doFinal(bArr4);
            bArrDoFinal.getClass();
            fczl.a(eieuVarH, null);
            return bArrDoFinal;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }
}
