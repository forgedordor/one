package defpackage;

import androidx.car.app.model.Alert;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class duo implements PointerInputEventHandler {
    final /* synthetic */ duu a;

    public duo(duu duuVar) {
        this.a = duuVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(final isn isnVar, fcxy<? super fctx> fcxyVar) {
        final its itsVar = new its();
        final fdch fdchVar = new fdch();
        final duu duuVar = this.a;
        ivy ivyVar = duuVar.k;
        fdchVar.a = ivyVar != null ? ivz.c(ivyVar) : 0L;
        Object objA = fdjy.a(new dun(duuVar, isnVar, new fdau() { // from class: dui
            @Override // defpackage.fdau
            public final Object a(Object obj, Object obj2, Object obj3) {
                duu duuVar2 = duuVar;
                ise iseVar = (ise) obj;
                ise iseVar2 = (ise) obj2;
                ihs ihsVar = (ihs) obj3;
                duuVar2.j = 0L;
                if (((Boolean) duuVar2.f.invoke(iseVar)).booleanValue()) {
                    if (!duuVar2.i) {
                        if (duuVar2.h == null) {
                            duuVar2.h = fdod.a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
                        }
                        duuVar2.i = true;
                        fdil.d(duuVar2.E(), null, null, new dut(duuVar2, null), 3);
                    }
                    itt.b(itsVar, iseVar);
                    long jD = ihs.d(iseVar2.c, ihsVar.a);
                    fdoa fdoaVar = duuVar2.h;
                    if (fdoaVar != null) {
                        fdoaVar.b(new dtg(jD));
                    }
                }
                return fctx.a;
            }
        }, new fdap() { // from class: duj
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                its itsVar2 = itsVar;
                itt.b(itsVar2, (ise) obj);
                float fC = isnVar.b().c();
                long jA = kjp.a(fC, fC);
                if (kjo.a(jA) <= 0.0f || kjo.b(jA) <= 0.0f) {
                    String strF = kjo.f(jA);
                    Objects.toString(strF);
                    itw.d("maximumVelocity should be a positive value. You specified=".concat(strF));
                }
                duu duuVar2 = duuVar;
                long jA2 = kjp.a(itsVar2.a.a(kjo.a(jA)), itsVar2.b.a(kjo.b(jA)));
                itsVar2.b();
                fdoa fdoaVar = duuVar2.h;
                if (fdoaVar != null) {
                    fdau fdauVar = dvc.a;
                    fdoaVar.b(new dth(kjp.a(Float.isNaN(kjo.a(jA2)) ? 0.0f : kjo.a(jA2), Float.isNaN(kjo.b(jA2)) ? 0.0f : kjo.b(jA2))));
                }
                return fctx.a;
            }
        }, new fdae() { // from class: duk
            @Override // defpackage.fdae
            public final Object invoke() {
                fdoa fdoaVar = duuVar.h;
                if (fdoaVar != null) {
                    fdoaVar.b(dte.a);
                }
                return fctx.a;
            }
        }, new fdae() { // from class: dul
            @Override // defpackage.fdae
            public final Object invoke() {
                return Boolean.valueOf(!duuVar.n());
            }
        }, new fdat() { // from class: dum
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                duu duuVar2 = duuVar;
                ise iseVar = (ise) obj;
                ihs ihsVar = (ihs) obj2;
                ivy ivyVar2 = duuVar2.k;
                if (ivyVar2 != null) {
                    fdch fdchVar2 = fdchVar;
                    long jC = ivz.c(ivyVar2);
                    long j = fdchVar2.a;
                    if (!ihs.h(jC, j)) {
                        duuVar2.j = ihs.e(duuVar2.j, ihs.d(jC, j));
                    }
                    fdchVar2.a = jC;
                }
                itt.c(itsVar, iseVar, duuVar2.j);
                fdoa fdoaVar = duuVar2.h;
                if (fdoaVar != null) {
                    fdoaVar.b(new dtf(ihsVar.a));
                }
                return fctx.a;
            }
        }, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
