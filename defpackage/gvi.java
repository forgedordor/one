package defpackage;

import androidx.compose.material3.internal.ChildSemanticsNodeElement;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gvi implements fdat {
    final /* synthetic */ ics a;
    final /* synthetic */ ikp b;
    final /* synthetic */ long c;
    final /* synthetic */ float d;
    final /* synthetic */ dky e;
    final /* synthetic */ boolean f;
    final /* synthetic */ boolean g;
    final /* synthetic */ fdae h;
    final /* synthetic */ float i;
    final /* synthetic */ fdat j;
    final /* synthetic */ ebk k;

    public gvi(ics icsVar, ikp ikpVar, long j, float f, dky dkyVar, boolean z, ebk ebkVar, boolean z2, fdae fdaeVar, float f2, fdat fdatVar) {
        this.a = icsVar;
        this.b = ikpVar;
        this.c = j;
        this.d = f;
        this.e = dkyVar;
        this.f = z;
        this.k = ebkVar;
        this.g = z2;
        this.h = fdaeVar;
        this.i = f2;
        this.j = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ics icsVar = this.a;
            ics icsVarA = eut.a(gvk.a(gks.a(icsVar), this.b, gvk.b(this.c, this.d, hmlVar), this.e, ((kio) hmlVar.e(jmh.e)).en(this.i)), this.f, this.k, grb.a(false, 0.0f, 0L, 7), this.g, null, this.h).a(new ChildSemanticsNodeElement(new fdap() { // from class: hhw
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) {
                    return fctx.a;
                }
            }));
            fdat fdatVar = this.j;
            ixm ixmVarA = ecz.a(ibw.a, true);
            int iA = hmg.a(hmlVar);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarA);
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
