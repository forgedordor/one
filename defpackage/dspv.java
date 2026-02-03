package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dspv implements dsop {
    private final dsah a;
    private final dsom b;

    public dspv(dsom dsomVar, dsah dsahVar) {
        this.b = dsomVar;
        this.a = dsahVar;
    }

    @Override // defpackage.dsop
    public final View a(eg egVar, etnj etnjVar) {
        return null;
    }

    @Override // defpackage.dsop
    public final void b(eg egVar, View view, dsbi dsbiVar, etns etnsVar) {
        etnj etnjVar = dsbiVar.c().f;
        if (etnjVar == null) {
            etnjVar = etnj.a;
        }
        try {
            etns etnsVarB = dspi.b(etnsVar, etnjVar.c == 2 ? (etly) etnjVar.d : etly.a);
            etnj etnjVar2 = dsbiVar.c().f;
            if (etnjVar2 == null) {
                etnjVar2 = etnj.a;
            }
            if (etnjVar2.f) {
                this.b.b(dsbiVar, dsoo.SUCCESS);
            } else {
                this.a.i(dsbiVar);
                dsqh.aV(dsbiVar, etnsVarB).s(egVar.a(), "PromoUiDialogFragment");
            }
        } catch (dsph unused) {
            this.b.b(dsbiVar, dsoo.FAILED_THEME_NOT_FOUND);
        }
    }

    @Override // defpackage.dsop
    public final boolean c(etni etniVar) {
        return etniVar == etni.UITYPE_GM_DIALOG;
    }
}
