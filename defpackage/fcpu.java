package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcpu {
    public int b;
    public int c;
    final /* synthetic */ fcpx e;
    private final int f;
    private final fcpt g;
    public final ffez a = new ffez();
    public boolean d = false;

    public fcpu(fcpx fcpxVar, int i, int i2, fcpt fcptVar) {
        this.e = fcpxVar;
        this.f = i;
        this.b = i2;
        this.g = fcptVar;
    }

    final int a() {
        return Math.max(0, Math.min(this.b, (int) this.a.b)) - this.c;
    }

    final int b() {
        return Math.min(this.b, this.e.d.b);
    }

    final void c(ffez ffezVar, int i, boolean z) {
        while (true) {
            fcpx fcpxVar = this.e;
            fcqq fcqqVar = fcpxVar.b;
            fcqq fcqqVar2 = ((fcop) ((fcoo) fcqqVar).b).b;
            int iMin = Math.min(i, ((fcqy) fcqqVar2).a);
            int i2 = -iMin;
            fcpxVar.d.f(i2);
            f(i2);
            try {
                boolean z2 = false;
                if (ffezVar.b == iMin && z) {
                    z2 = true;
                }
                boolean z3 = z2;
                int i3 = this.f;
                ffez ffezVar2 = ffezVar;
                ((fcoo) fcqqVar).c.b(2, i3, ffezVar2, iMin, z3);
                try {
                    fcqqVar2.c(z3, i3, ffezVar2, iMin);
                } catch (IOException e) {
                    ((fcoo) fcqqVar).a.a(e);
                }
                this.g.m(iMin);
                i -= iMin;
                if (i <= 0) {
                    return;
                } else {
                    ffezVar = ffezVar2;
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    final boolean d() {
        return this.a.b > 0;
    }

    final void e(int i, fcpw fcpwVar) {
        int iMin = Math.min(i, b());
        int i2 = 0;
        while (d() && iMin > 0) {
            ffez ffezVar = this.a;
            long j = iMin;
            long j2 = ffezVar.b;
            if (j >= j2) {
                int i3 = (int) j2;
                i2 += i3;
                c(ffezVar, i3, this.d);
            } else {
                i2 += iMin;
                c(ffezVar, iMin, false);
            }
            fcpwVar.a++;
            iMin = Math.min(i - i2, b());
        }
    }

    final void f(int i) {
        if (i <= 0 || Alert.DURATION_SHOW_INDEFINITELY - i >= this.b) {
            this.b += i;
            return;
        }
        throw new IllegalArgumentException("Window size overflow for stream: " + this.f);
    }
}
