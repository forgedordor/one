package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwpo {
    public static dwpn r() {
        dwmz dwmzVar = new dwmz();
        dwmzVar.k(false);
        dwmzVar.d(ekgb.r(Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED)));
        dwmzVar.n(-1L);
        dwmzVar.l(0L);
        dwmzVar.b(new HashMap());
        dwmzVar.o(0L);
        dwmzVar.e(evqs.b);
        dwmzVar.g(0L);
        dwmzVar.m(0L);
        return dwmzVar;
    }

    public abstract long a();

    public abstract long b();

    public abstract long c();

    public abstract long d();

    public abstract long e();

    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r7 != r6) goto L8
            return r1
        L8:
            boolean r2 = r7 instanceof defpackage.dwpo
            if (r2 == 0) goto L118
            dwpo r7 = (defpackage.dwpo) r7
            dwpx r2 = r6.h()
            dwpx r3 = r7.h()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L118
            ejwi r2 = r6.l()
            ejwi r3 = r7.l()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L118
            ejwi r2 = r6.j()
            ejwi r3 = r7.j()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L118
            ejwi r2 = r6.i()
            boolean r2 = r2.g()
            ejwi r3 = r7.i()
            boolean r3 = r3.g()
            if (r2 != r3) goto L118
            ejwi r2 = r6.i()
            boolean r2 = r2.g()
            if (r2 == 0) goto L78
            ejwi r2 = r7.i()
            boolean r2 = r2.g()
            if (r2 == 0) goto L78
            ejwi r2 = r6.i()
            java.lang.Object r2 = r2.c()
            ejwi r3 = r7.i()
            java.lang.Object r3 = r3.c()
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            boolean r2 = r2.sameAs(r3)
            if (r2 == 0) goto L118
        L78:
            boolean r2 = r6.q()
            boolean r3 = r7.q()
            if (r2 != r3) goto L118
            long r2 = r6.b()
            long r4 = r7.b()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L118
            boolean r2 = r6.p()
            boolean r3 = r7.p()
            if (r2 != r3) goto L118
            java.util.Map r2 = r6.o()
            java.util.Set r2 = r2.keySet()
            java.util.Map r3 = r7.o()
            java.util.Set r3 = r3.keySet()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L118
            ejwi r2 = r6.k()
            ejwi r3 = r7.k()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L118
            java.util.Map r2 = r6.o()
            java.util.Set r2 = r2.keySet()
            ekeh r2 = defpackage.ekeh.d(r2)
            dwpm r3 = new dwpm
            r3.<init>()
            java.lang.Iterable r2 = r2.h()
            boolean r2 = defpackage.ekis.p(r2, r3)
            if (r2 == 0) goto L118
            ekgb r2 = r6.m()
            ekgb r3 = r7.m()
            boolean r2 = defpackage.ekjz.h(r2, r3)
            if (r2 == 0) goto L118
            long r2 = r6.e()
            long r4 = r7.e()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L118
            long r2 = r6.f()
            long r4 = r7.f()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L118
            evqs r2 = r6.n()
            evqs r3 = r7.n()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L118
            long r2 = r6.a()
            long r4 = r7.a()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L118
            return r1
        L118:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwpo.equals(java.lang.Object):boolean");
    }

    public abstract long f();

    public abstract dwpn g();

    public abstract dwpx h();

    public final int hashCode() {
        int iHashCode = ((((h().hashCode() + 527) * 31) + l().hashCode()) * 31) + j().hashCode();
        int i = true != i().g() ? 1237 : 1231;
        int i2 = true != q() ? 1237 : 1231;
        int iA = (((((((((((iHashCode * 31) + i) * 31) + i2) * 31) + dwpl.a(b())) * 31) + (true == p() ? 1231 : 1237)) * 31) + o().keySet().hashCode()) * 31) + k().hashCode();
        Iterator it = o().values().iterator();
        while (true) {
            int i3 = iA * 31;
            if (!it.hasNext()) {
                return ((((((((((i3 + m().hashCode()) * 31) + dwpl.a(e())) * 31) + dwpl.a(f())) * 31) + n().hashCode()) * 31) + dwpl.a(a())) * 31) + dwpl.a(d());
            }
            iA = i3 + Arrays.hashCode((byte[]) it.next());
        }
    }

    public abstract ejwi i();

    public abstract ejwi j();

    public abstract ejwi k();

    public abstract ejwi l();

    public abstract ekgb m();

    public abstract evqs n();

    public abstract Map o();

    public abstract boolean p();

    public abstract boolean q();
}
