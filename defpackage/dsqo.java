package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsqo implements dsop {
    private final dsqs a;
    private final dsah b;
    private final dsom c;

    public dsqo(dsqs dsqsVar, dsom dsomVar, dsah dsahVar) {
        this.a = dsqsVar;
        this.c = dsomVar;
        this.b = dsahVar;
    }

    @Override // defpackage.dsop
    public final View a(eg egVar, etnj etnjVar) {
        return this.a.a(etnjVar.c == 3 ? (etnx) etnjVar.d : etnx.a).a(egVar, null);
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
        etnx etnxVar = etnjVar.c == 3 ? (etnx) etnjVar.d : etnx.a;
        try {
            if (dspi.d(etnsVar, etnxVar.l)) {
                etnsVar = etns.UNSPECIFIED;
            } else {
                dspi.c(etnsVar, etnxVar.l);
                dspi.c(etnsVar, etnxVar.m);
                if ((etnxVar.b & 1024) != 0) {
                    etlk etlkVar = etnxVar.p;
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
            dsqn dsqnVar = new dsqn();
            Bundle bundle = new Bundle();
            bundle.putParcelable("promo_context", dsbiVar);
            bundle.putInt("theme", etnsVar.d);
            dsqnVar.at(bundle);
            cg cgVar = new cg(egVar.a());
            cgVar.u(dsqnVar, "FeatureHighlightFragment");
            cgVar.k();
        } catch (dsph unused) {
            this.c.b(dsbiVar, dsoo.FAILED_THEME_NOT_FOUND);
        }
    }

    @Override // defpackage.dsop
    public final boolean c(etni etniVar) {
        return etniVar == etni.UITYPE_GM_TAP_TARGET;
    }
}
