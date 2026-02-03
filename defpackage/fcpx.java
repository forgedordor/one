package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcpx {
    public final fcpv a;
    public final fcqq b;
    public int c;
    public final fcpu d;

    public fcpx(fcpv fcpvVar, fcqq fcqqVar) {
        this.a = fcpvVar;
        fcqqVar.getClass();
        this.b = fcqqVar;
        this.c = 65535;
        this.d = new fcpu(this, 0, 65535, null);
    }

    public final void a(boolean z, fcpu fcpuVar, ffez ffezVar, boolean z2) {
        ffezVar.getClass();
        int iB = fcpuVar.b();
        boolean zD = fcpuVar.d();
        int i = (int) ffezVar.b;
        if (zD || iB < i) {
            if (!zD && iB > 0) {
                fcpuVar.c(ffezVar, iB, false);
            }
            fcpuVar.a.hO(ffezVar, (int) ffezVar.b);
            fcpuVar.d = z | fcpuVar.d;
        } else {
            fcpuVar.c(ffezVar, i, z);
        }
        if (z2) {
            b();
        }
    }

    public final void b() {
        try {
            this.b.d();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final void c() {
        fcpv fcpvVar = this.a;
        fcpu[] fcpuVarArrS = fcpvVar.s();
        Collections.shuffle(Arrays.asList(fcpuVarArrS));
        int length = fcpuVarArrS.length;
        int i = this.d.b;
        while (true) {
            int i2 = 0;
            if (length <= 0 || i <= 0) {
                break;
            }
            int iCeil = (int) Math.ceil(i / length);
            for (int i3 = 0; i3 < length && i > 0; i3++) {
                fcpu fcpuVar = fcpuVarArrS[i3];
                int iMin = Math.min(i, Math.min(fcpuVar.a(), iCeil));
                if (iMin > 0) {
                    fcpuVar.c += iMin;
                    i -= iMin;
                }
                if (fcpuVar.a() > 0) {
                    fcpuVarArrS[i2] = fcpuVar;
                    i2++;
                }
            }
            length = i2;
        }
        fcpw fcpwVar = new fcpw();
        for (fcpu fcpuVar2 : fcpvVar.s()) {
            fcpuVar2.e(fcpuVar2.c, fcpwVar);
            fcpuVar2.c = 0;
        }
        if (fcpwVar.a()) {
            b();
        }
    }

    public final void d(fcpu fcpuVar, int i) {
        if (fcpuVar == null) {
            this.d.f(i);
            c();
            return;
        }
        fcpuVar.f(i);
        fcpw fcpwVar = new fcpw();
        fcpuVar.e(fcpuVar.b(), fcpwVar);
        if (fcpwVar.a()) {
            b();
        }
    }
}
