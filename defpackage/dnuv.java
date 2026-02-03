package defpackage;

import androidx.compose.ui.platform.ComposeView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnuv implements fdat {
    final /* synthetic */ ComposeView a;
    final /* synthetic */ boolean b;
    final /* synthetic */ fdae c;
    final /* synthetic */ dnux d;

    public dnuv(ComposeView composeView, boolean z, fdae fdaeVar, dnux dnuxVar) {
        this.a = composeView;
        this.b = z;
        this.c = fdaeVar;
        this.d = dnuxVar;
    }

    private static final boolean b(hox hoxVar) {
        return ((Boolean) hoxVar.a()).booleanValue();
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(1849434622);
            Object objF = hmlVar.f();
            Object obj3 = hmk.a;
            if (objF == obj3) {
                hpl hplVar = new hpl(false, hsi.a);
                hmlVar.y(hplVar);
                objF = hplVar;
            }
            hox hoxVar = (hox) objF;
            hmlVar.o();
            Boolean boolValueOf = Boolean.valueOf(b(hoxVar));
            hmlVar.v(5004770);
            Object objF2 = hmlVar.f();
            if (objF2 == obj3) {
                objF2 = new dnus(hoxVar, null);
                hmlVar.y(objF2);
            }
            hmlVar.o();
            hob.g(boolValueOf, (fdat) objF2, hmlVar);
            cye.b(b(hoxVar), null, dae.l(null, 3), dae.m(null, 3), null, hxe.d(1604575383, new dnuu(this.a, this.b, this.c, this.d), hmlVar), hmlVar, 200064, 18);
        }
        return fctx.a;
    }
}
