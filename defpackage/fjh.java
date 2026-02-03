package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fjh implements fdat {
    final /* synthetic */ fdat a;
    final /* synthetic */ flg b;

    public fjh(fdat fdatVar, flg flgVar) {
        this.a = fdatVar;
        this.b = flgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        fik fikVar;
        fii fiiVarE;
        fik fikVar2;
        fii fiiVarE2;
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (hmlVar.J((iIntValue & 3) != 2, iIntValue & 1)) {
            this.a.a(hmlVar, 0);
            final flg flgVar = this.b;
            if (flgVar.C() && flgVar.z() && !flgVar.E()) {
                hmlVar.v(-1736225307);
                fil filVarF = flgVar.f();
                if (filVarF == null) {
                    hmlVar.v(2011629175);
                } else {
                    hmlVar.v(2011629176);
                    hmlVar.v(-1736222526);
                    List listG = fcva.g(true, false);
                    int size = listG.size();
                    for (int i = 0; i < size; i++) {
                        boolean zBooleanValue = ((Boolean) listG.get(i)).booleanValue();
                        boolean zE = hmlVar.E(zBooleanValue);
                        Object objF = hmlVar.f();
                        if (zE || objF == hmk.a) {
                            objF = new fla(zBooleanValue, flgVar);
                            hmlVar.y(objF);
                        }
                        fbh fbhVar = (fbh) objF;
                        boolean zE2 = hmlVar.E(zBooleanValue);
                        Object objF2 = hmlVar.f();
                        if (zE2 || objF2 == hmk.a) {
                            objF2 = zBooleanValue ? new fdae() { // from class: fje
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    ihs ihsVarH = flgVar.h();
                                    return new ihs(ihsVarH != null ? ihsVarH.a : 9205357640488583168L);
                                }
                            } : new fdae() { // from class: fjf
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    ihs ihsVarG = flgVar.g();
                                    return new ihs(ihsVarG != null ? ihsVarG.a : 9205357640488583168L);
                                }
                            };
                            hmlVar.y(objF2);
                        }
                        fdae fdaeVar = (fdae) objF2;
                        int i2 = zBooleanValue ? filVarF.a.c : filVarF.b.c;
                        float fB = 0.0f;
                        if (zBooleanValue) {
                            fil filVarF2 = flgVar.f();
                            if (filVarF2 != null && (fiiVarE2 = flgVar.e((fikVar2 = filVarF2.a))) != null) {
                                fB = fiiVarE2.b(fikVar2.a);
                            }
                        } else {
                            fil filVarF3 = flgVar.f();
                            if (filVarF3 != null && (fiiVarE = flgVar.e((fikVar = filVarF3.b))) != null) {
                                fB = fiiVarE.b(fikVar.a);
                            }
                        }
                        float f = fB;
                        int i3 = i2;
                        fjl fjlVar = new fjl(fdaeVar);
                        boolean z = filVarF.c;
                        ico icoVar = ics.e;
                        boolean zF = hmlVar.F(fbhVar);
                        Object objF3 = hmlVar.f();
                        if (zF || objF3 == hmk.a) {
                            objF3 = new fjg(fbhVar);
                            hmlVar.y(objF3);
                        }
                        fhv.d(fjlVar, zBooleanValue, i3, z, 0L, f, itf.a(icoVar, fbhVar, (PointerInputEventHandler) objF3), hmlVar, 0);
                    }
                    hmlVar.o();
                }
                hmlVar.o();
                hmlVar.o();
            } else {
                hmlVar.v(2013602667);
                hmlVar.o();
            }
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
