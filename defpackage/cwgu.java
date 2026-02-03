package defpackage;

import android.content.Context;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwgu implements fdat {
    final /* synthetic */ cwfq a;
    final /* synthetic */ dbs b;
    final /* synthetic */ cyg c;

    public cwgu(cwfq cwfqVar, dbs dbsVar, cyg cygVar) {
        this.a = cwfqVar;
        this.b = dbsVar;
        this.c = cygVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cwfq cwfqVar = this.a;
            if (cwfqVar != null) {
                final Window window = dpgx.b((Context) hmlVar.e(AndroidCompositionLocals_androidKt.b)).getWindow();
                hmlVar.v(1849434622);
                Object objF = hmlVar.f();
                Object obj3 = hmk.a;
                if (objF == obj3) {
                    hpl hplVar = new hpl(false, hsi.a);
                    hmlVar.y(hplVar);
                    objF = hplVar;
                }
                final hox hoxVar = (hox) objF;
                hmlVar.o();
                fctx fctxVar = fctx.a;
                hmlVar.v(-1633490746);
                boolean zF = hmlVar.F(window);
                Object objF2 = hmlVar.f();
                if (zF || objF2 == obj3) {
                    objF2 = new fdap() { // from class: cwgo
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj4) {
                            ((hny) obj4).getClass();
                            Window window2 = window;
                            Boolean boolValueOf = Boolean.valueOf(new lhb(window2, window2.getDecorView()).d());
                            hox hoxVar2 = hoxVar;
                            hoxVar2.b(boolValueOf);
                            new lhb(window2, window2.getDecorView()).b(false);
                            return new cwgt(window2, hoxVar2);
                        }
                    };
                    hmlVar.y(objF2);
                }
                hmlVar.o();
                hob.c(fctxVar, (fdap) objF2, hmlVar);
                hmlVar.v(5004770);
                final fdae fdaeVar = cwfqVar.d;
                boolean zD = hmlVar.D(fdaeVar);
                Object objF3 = hmlVar.f();
                if (zD || objF3 == obj3) {
                    objF3 = new fdae() { // from class: cwgp
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fdaeVar.invoke();
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF3);
                }
                hmlVar.o();
                acx.a(false, (fdae) objF3, hmlVar, 0, 1);
                ics icsVarA = dkl.a(egq.c(ics.e, 1.0f), ije.a, ikj.a);
                hmlVar.v(1849434622);
                Object objF4 = hmlVar.f();
                if (objF4 == obj3) {
                    objF4 = new fdap() { // from class: cwgq
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj4) {
                            jto jtoVar = (jto) obj4;
                            jtoVar.getClass();
                            jtl.a(jtoVar);
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF4);
                }
                List list = cwfqVar.b;
                hmlVar.o();
                dtgq.a(jsh.c(icsVarA, false, (fdap) objF4), hxe.d(616444959, new cwgr(cwfqVar, fdaeVar), hmlVar), null, null, null, 0, 0L, 0L, null, hxe.d(-45099148, new cwgs(this.b, list, cwfqVar, this.c), hmlVar), hmlVar, 805306416, 508);
            }
        }
        return fctx.a;
    }
}
