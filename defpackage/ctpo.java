package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctpo implements fdat {
    final /* synthetic */ hsf a;

    public ctpo(hsf hsfVar) {
        this.a = hsfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarC = efy.c(egq.u(egq.w(icoVar, ctpq.c, 0.0f, ctpq.d, 0.0f, 10), 0.0f, jqr.a(R.dimen.max_dialog_height, hmlVar), 1), ctpq.a);
            final hsf hsfVar = this.a;
            ecq ecqVar = ecr.c;
            ibx ibxVar = ibw.j;
            ixm ixmVarA = edl.a(ecqVar, ibxVar, hmlVar, 0);
            int iA = ctpk.a(hmg.b(hmlVar));
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarC);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVar, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVar, hxiVarN, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Object objValueOf = Integer.valueOf(iA);
                hmlVar.y(objValueOf);
                hmlVar.h(objValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVar, icsVarB, fdatVar4);
            ics icsVarA = edp.a(efy.c(icoVar, ctpq.b), ibxVar);
            ixm ixmVarA2 = ecz.a(ibw.a, false);
            int iA2 = ctpk.a(hmg.b(hmlVar));
            hxi hxiVarN2 = hmlVar.N();
            ics icsVarB2 = icj.b(hmlVar, icsVarA);
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA2, fdatVar);
            hsk.b(hmlVar, hxiVarN2, fdatVar2);
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA2))) {
                Object objValueOf2 = Integer.valueOf(iA2);
                hmlVar.y(objValueOf2);
                hmlVar.h(objValueOf2, fdatVar3);
            }
            hsk.b(hmlVar, icsVarB2, fdatVar4);
            dthx.b(jqu.b(R.string.picker_disambiguation_title, hmlVar), null, dtcj.e(hmlVar), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar).f, hmlVar, 0, 0, 65530);
            hmlVar.n();
            ejy ejyVarA = ekb.a(0, hmlVar, 3);
            hmlVar.v(5004770);
            boolean zD = hmlVar.D(hsfVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdap() { // from class: ctpl
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        eio eioVar = (eio) obj3;
                        eioVar.getClass();
                        List listA = ctpq.a(hsfVar);
                        eioVar.a(listA.size(), null, new ctpm(listA), new hxd(802480018, true, new ctpn(listA)));
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            eig.a(null, ejyVarA, null, false, null, null, null, false, null, (fdap) objF, hmlVar, 0, 509);
            hmlVar.n();
        }
        return fctx.a;
    }
}
