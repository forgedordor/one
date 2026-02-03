package defpackage;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fuf implements fdat {
    final /* synthetic */ ics a;
    final /* synthetic */ ikp b;
    final /* synthetic */ long c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ fdat f;

    public fuf(ics icsVar, ikp ikpVar, long j, float f, float f2, fdat fdatVar) {
        this.a = icsVar;
        this.b = ikpVar;
        this.c = j;
        this.d = f;
        this.e = f2;
        this.f = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ics icsVar = this.a;
            ikp ikpVar = this.b;
            ics icsVarA = iex.a(dkl.a(ifl.a(icsVar, this.e, ikpVar, 0L, 0L, 24).a(ics.e), fuh.c(this.c, (fos) hmlVar.e(fpt.a), this.d, hmlVar), ikpVar), ikpVar);
            Object objF = hmlVar.f();
            Object obj3 = hmk.a;
            if (objF == obj3) {
                objF = new fdap() { // from class: fud
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
                objF2 = new fue(null);
                hmlVar.y(objF2);
            }
            irs irsVar = itf.a;
            ics icsVarA2 = icsVarC.a(new SuspendPointerInputElement(fctxVar, null, null, new ite((fdat) objF2), 6));
            fdat fdatVar = this.f;
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
        }
        return fctx.a;
    }
}
