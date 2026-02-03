package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gvg implements fdat {
    final /* synthetic */ ics a;
    final /* synthetic */ ikp b;
    final /* synthetic */ long c;
    final /* synthetic */ float d;
    final /* synthetic */ dky e;
    final /* synthetic */ float f;
    final /* synthetic */ fdat g;

    public gvg(ics icsVar, ikp ikpVar, long j, float f, dky dkyVar, float f2, fdat fdatVar) {
        this.a = icsVar;
        this.b = ikpVar;
        this.c = j;
        this.d = f;
        this.e = dkyVar;
        this.f = f2;
        this.g = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ics icsVarA = gvk.a(this.a, this.b, gvk.b(this.c, this.d, hmlVar), this.e, ((kio) hmlVar.e(jmh.e)).en(this.f));
            Object objF = hmlVar.f();
            Object obj3 = hmk.a;
            if (objF == obj3) {
                objF = new fdap() { // from class: gve
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        jtk.H((jto) obj4);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            ics icsVarC = jsh.c(icsVarA, false, (fdap) objF);
            fctx fctxVar = fctx.a;
            Object objF2 = hmlVar.f();
            if (objF2 == obj3) {
                objF2 = gvf.a;
                hmlVar.y(objF2);
            }
            ics icsVarA2 = itf.a(icsVarC, fctxVar, (PointerInputEventHandler) objF2);
            fdat fdatVar = this.g;
            ixm ixmVarA = ecz.a(ibw.a, true);
            int iA = hmg.a(hmlVar);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarA2);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar2 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar2);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            fdatVar.a(hmlVar, 0);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
