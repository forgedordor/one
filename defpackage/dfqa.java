package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfqa {
    public static final boolean a(InputStream inputStream, byte[] bArr) throws IOException {
        inputStream.mark(bArr.length + 4);
        try {
            int i = inputStream.read();
            if (i == 13) {
                i = inputStream.read();
            }
            if (i == 10) {
                i = inputStream.read();
            }
            if (i == 45 && inputStream.read() == 45) {
                for (byte b : bArr) {
                    int i2 = inputStream.read();
                    int i3 = (i2 != -1 && b == i2) ? i3 + 1 : 0;
                }
                inputStream.reset();
                return true;
            }
            return false;
        } finally {
            inputStream.reset();
        }
    }

    public static final void b(InputStream inputStream) throws IOException {
        inputStream.mark(1);
        int i = inputStream.read();
        if (i == 13) {
            inputStream.mark(1);
            i = inputStream.read();
        }
        if (i != 10) {
            inputStream.reset();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r3.read();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String c(java.io.InputStream r3) throws java.io.IOException {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 1024(0x400, float:1.435E-42)
            r0.<init>(r1)
            int r1 = r3.read()     // Catch: java.lang.Throwable -> L30
        Lb:
            r2 = -1
            if (r1 == r2) goto L21
            r2 = 13
            if (r1 == r2) goto L1e
            r2 = 10
            if (r1 == r2) goto L21
            r0.write(r1)     // Catch: java.lang.Throwable -> L30
            int r1 = r3.read()     // Catch: java.lang.Throwable -> L30
            goto Lb
        L1e:
            r3.read()     // Catch: java.lang.Throwable -> L30
        L21:
            r0.close()
            byte[] r3 = r0.toByteArray()
            java.lang.String r0 = new java.lang.String
            java.lang.String r1 = "utf-8"
            r0.<init>(r3, r1)
            return r0
        L30:
            r3 = move-exception
            r0.close()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfqa.c(java.io.InputStream):java.lang.String");
    }
}
