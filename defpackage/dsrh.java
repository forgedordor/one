package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsrh implements dsop {
    private final dsrp a;
    private final dsah b;
    private final dsom c;

    public dsrh(dsrp dsrpVar, dsom dsomVar, dsah dsahVar) {
        this.a = dsrpVar;
        this.c = dsomVar;
        this.b = dsahVar;
    }

    @Override // defpackage.dsop
    public final View a(eg egVar, etnj etnjVar) {
        return this.a.a(egVar, etnjVar.c == 5 ? (etoh) etnjVar.d : etoh.a);
    }

    @Override // defpackage.dsop
    public final void b(eg egVar, View view, dsbi dsbiVar, etns etnsVar) {
        if (view == null) {
            this.c.b(dsbiVar, dsoo.FAILED_VIEW_NOT_FOUND);
            return;
        }
        etnj etnjVar = dsbiVar.c().f;
        if (etnjVar == null) {
            etnjVar = etnj.a;
        }
        etoh etohVar = etnjVar.c == 5 ? (etoh) etnjVar.d : etoh.a;
        try {
            if (dspi.d(etnsVar, etohVar.i)) {
                etnsVar = etns.UNSPECIFIED;
            } else {
                dspi.c(etnsVar, etohVar.i);
                if ((etohVar.b & 16) != 0) {
                    etlk etlkVar = etohVar.j;
                    if (etlkVar == null) {
                        etlkVar = etlk.a;
                    }
                    dspi.c(etnsVar, etlkVar.i);
                }
            }
            etnj etnjVar2 = dsbiVar.c().f;
            if (etnjVar2 == null) {
                etnjVar2 = etnj.a;
            }
            if (etnjVar2.f) {
                this.c.b(dsbiVar, dsoo.SUCCESS);
                return;
            }
            this.b.i(dsbiVar);
            dsrg dsrgVar = new dsrg();
            Bundle bundle = new Bundle();
            bundle.putParcelable("promo_context", dsbiVar);
            bundle.putInt("theme", etnsVar.d);
            dsrgVar.at(bundle);
            cg cgVar = new cg(egVar.a());
            cgVar.u(dsrgVar, "TooltipFragment");
            cgVar.k();
        } catch (dsph unused) {
            this.c.b(dsbiVar, dsoo.FAILED_THEME_NOT_FOUND);
        }
    }

    @Override // defpackage.dsop
    public final boolean c(etni etniVar) {
        return etniVar == etni.UITYPE_GM_TOOLTIP;
    }
}
