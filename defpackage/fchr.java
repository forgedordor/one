package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fchr extends OutputStream {
    public final List a = new ArrayList();
    final /* synthetic */ fchu b;
    private fcmv c;

    public fchr(fchu fchuVar) {
        this.b = fchuVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte b = (byte) i;
        fcmv fcmvVar = this.c;
        if (fcmvVar == null || fcmvVar.b() <= 0) {
            write(new byte[]{b}, 0, 1);
        } else {
            this.c.c(b);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.c == null) {
            fchu fchuVar = this.b;
            fcmv fcmvVarA = fchuVar.g.a(Math.max(4096, i2));
            this.c = fcmvVarA;
            this.a.add(fcmvVarA);
        }
        while (i2 > 0) {
            int iMin = Math.min(i2, this.c.b());
            if (iMin == 0) {
                int iA = this.c.a();
                fcmv fcmvVarA2 = this.b.g.a(Math.max(i2, iA + iA));
                this.c = fcmvVarA2;
                this.a.add(fcmvVarA2);
            } else {
                this.c.d(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
            }
        }
    }
}
