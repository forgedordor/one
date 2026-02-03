package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rjp {
    private final rvf a = new rvf(1000);
    private final lcd b = rvs.a(10, new rjn());

    public final String a(res resVar) {
        String str;
        rvf rvfVar = this.a;
        synchronized (rvfVar) {
            str = (String) rvfVar.h(resVar);
        }
        if (str == null) {
            rjo rjoVar = (rjo) this.b.a();
            rvi.f(rjoVar);
            try {
                MessageDigest messageDigest = rjoVar.a;
                resVar.a(messageDigest);
                byte[] bArrDigest = messageDigest.digest();
                char[] cArr = rvk.b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i + i;
                        char[] cArr2 = rvk.a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                this.b.b(rjoVar);
            }
        }
        rvf rvfVar2 = this.a;
        synchronized (rvfVar2) {
            rvfVar2.i(resVar, str);
        }
        return str;
    }
}
