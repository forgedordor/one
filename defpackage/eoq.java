package defpackage;

import android.view.View;
import androidx.compose.foundation.lazy.layout.TraversablePrefetchStateModifierElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eoq implements fdau {
    final /* synthetic */ epj a;
    final /* synthetic */ ics b;
    final /* synthetic */ fdat c;
    final /* synthetic */ hsf d;

    public eoq(epj epjVar, ics icsVar, fdat fdatVar, hsf hsfVar) {
        this.a = epjVar;
        this.b = icsVar;
        this.c = fdatVar;
        this.d = hsfVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ics icsVarA;
        hyb hybVar = (hyb) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        Object objF = hmlVar.f();
        Object obj4 = hmk.a;
        if (objF == obj4) {
            final hsf hsfVar = this.d;
            eoe eoeVar = new eoe(hybVar, new fdae() { // from class: eom
                @Override // defpackage.fdae
                public final Object invoke() {
                    return (eoi) ((fdae) hsfVar.a()).invoke();
                }
            });
            hmlVar.y(eoeVar);
            objF = eoeVar;
        }
        final eoe eoeVar2 = (eoe) objF;
        Object objF2 = hmlVar.f();
        if (objF2 == obj4) {
            objF2 = new izl(new eok(eoeVar2));
            hmlVar.y(objF2);
        }
        final epj epjVar = this.a;
        final izl izlVar = (izl) objF2;
        if (epjVar != null) {
            hmlVar.v(-297369245);
            hmlVar.v(-702327745);
            final eqz eqzVar = erb.a;
            if (eqzVar != null) {
                hmlVar.v(1345608944);
                hmlVar.o();
            } else {
                hmlVar.v(1345658017);
                View view = (View) hmlVar.e(AndroidCompositionLocals_androidKt.f);
                boolean zD = hmlVar.D(view);
                Object objF3 = hmlVar.f();
                if (zD || objF3 == obj4) {
                    Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                    objF3 = tag instanceof eqz ? (eqz) tag : null;
                    if (objF3 == null) {
                        objF3 = new emq(view);
                        view.setTag(R.id.compose_prefetch_scheduler, objF3);
                    }
                    hmlVar.y(objF3);
                }
                eqzVar = (eqz) objF3;
                hmlVar.o();
            }
            hmlVar.o();
            Object[] objArr = {epjVar, eoeVar2, izlVar, eqzVar};
            boolean zD2 = hmlVar.D(epjVar) | hmlVar.F(eoeVar2) | hmlVar.F(izlVar) | hmlVar.F(eqzVar);
            Object objF4 = hmlVar.f();
            if (zD2 || objF4 == obj4) {
                objF4 = new fdap() { // from class: eon
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj5) {
                        eqw eqwVar = new eqw(eoeVar2, izlVar, eqzVar);
                        epj epjVar2 = epjVar;
                        epjVar2.c = eqwVar;
                        return new eop(epjVar2);
                    }
                };
                hmlVar.y(objF4);
            }
            hob.d(objArr, (fdap) objF4, hmlVar);
            hmlVar.o();
        } else {
            hmlVar.v(-296783035);
            hmlVar.o();
        }
        ics icsVar = this.b;
        int i = epk.a;
        if (epjVar != null && (icsVarA = icsVar.a(new TraversablePrefetchStateModifierElement(epjVar))) != null) {
            icsVar = icsVarA;
        }
        boolean zD3 = hmlVar.D(eoeVar2);
        final fdat fdatVar = this.c;
        boolean zD4 = zD3 | hmlVar.D(fdatVar);
        Object objF5 = hmlVar.f();
        if (zD4 || objF5 == obj4) {
            objF5 = new fdat() { // from class: eoo
                @Override // defpackage.fdat
                public final Object a(Object obj5, Object obj6) {
                    eot eotVar = new eot(eoeVar2, (izm) obj5);
                    return (ixn) fdatVar.a(eotVar, (kil) obj6);
                }
            };
            hmlVar.y(objF5);
        }
        izg.b(izlVar, icsVar, (fdat) objF5, hmlVar, 8);
        return fctx.a;
    }
}
