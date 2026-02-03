package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcl implements fdau {
    final /* synthetic */ fdap a;
    final /* synthetic */ ebk b;

    public fcl(fdap fdapVar, ebk ebkVar) {
        this.a = fdapVar;
        this.b = ebkVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(-102778667);
        Object objF = hmlVar.f();
        Object obj4 = hmk.a;
        if (objF == obj4) {
            objF = hob.a(fcyi.a, hmlVar);
            hmlVar.y(objF);
        }
        fdjx fdjxVar = (fdjx) objF;
        Object objF2 = hmlVar.f();
        if (objF2 == obj4) {
            hpl hplVar = new hpl(null, hsi.a);
            hmlVar.y(hplVar);
            objF2 = hplVar;
        }
        final hox hoxVar = (hox) objF2;
        hsf hsfVarA = hsc.a(this.a, hmlVar);
        final ebk ebkVar = this.b;
        boolean zD = hmlVar.D(ebkVar);
        Object objF3 = hmlVar.f();
        if (zD || objF3 == obj4) {
            objF3 = new fdap() { // from class: fce
                @Override // defpackage.fdap
                public final Object invoke(Object obj5) {
                    return new fck(hoxVar, ebkVar);
                }
            };
            hmlVar.y(objF3);
        }
        hob.c(ebkVar, (fdap) objF3, hmlVar);
        ico icoVar = ics.e;
        boolean zF = hmlVar.F(fdjxVar) | hmlVar.D(ebkVar) | hmlVar.D(hsfVarA);
        Object objF4 = hmlVar.f();
        if (zF || objF4 == obj4) {
            objF4 = new fcj(fdjxVar, hoxVar, ebkVar, hsfVarA);
            hmlVar.y(objF4);
        }
        ics icsVarA = itf.a(icoVar, ebkVar, (PointerInputEventHandler) objF4);
        hmlVar.o();
        return icsVarA;
    }
}
