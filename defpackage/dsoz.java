package defpackage;

import android.view.View;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsoz implements dsoi {
    private static final eksp a = eksp.c("GnpSdk");
    private final Set b;
    private final dsom c;

    public dsoz(Set set, dsom dsomVar) {
        this.b = set;
        this.c = dsomVar;
    }

    private final dsop c(etni etniVar) {
        for (dsop dsopVar : this.b) {
            if (dsopVar.c(etniVar)) {
                return dsopVar;
            }
        }
        return null;
    }

    @Override // defpackage.dsoi
    public final View a(eg egVar, etnj etnjVar) {
        etni etniVarB = etni.b(etnjVar.e);
        if (etniVarB == null) {
            etniVarB = etni.UITYPE_NONE;
        }
        dsop dsopVarC = c(etniVarB);
        if (dsopVarC != null) {
            return dsopVarC.a(egVar, etnjVar);
        }
        ((eksl) a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/PromoUiRendererImpl", "findView", 46, "PromoUiRendererImpl.java")).t("Could not find View for unsupported PromoUi: %s", etnjVar);
        return null;
    }

    @Override // defpackage.dsoi
    public final void b(eg egVar, View view, dsbi dsbiVar, etns etnsVar) {
        etnj etnjVar = dsbiVar.c().f;
        if (etnjVar == null) {
            etnjVar = etnj.a;
        }
        etni etniVarB = etni.b(etnjVar.e);
        if (etniVarB == null) {
            etniVarB = etni.UITYPE_NONE;
        }
        dsop dsopVarC = c(etniVarB);
        if (dsopVarC != null) {
            try {
                dsopVarC.b(egVar, view, dsbiVar, etnsVar);
                return;
            } catch (RuntimeException e) {
                ((eksl) ((eksl) ((eksl) a.i()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/PromoUiRendererImpl", "render", '>', "PromoUiRendererImpl.java")).q("Failed rendering promotion.");
                this.c.b(dsbiVar, dsoo.FAILED_UNKNOWN);
                return;
            }
        }
        eksl ekslVar = (eksl) a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/PromoUiRendererImpl", "render", 70, "PromoUiRendererImpl.java");
        etnj etnjVar2 = dsbiVar.c().f;
        if (etnjVar2 == null) {
            etnjVar2 = etnj.a;
        }
        ekslVar.t("Could not render unsupported PromoUi: %s", etnjVar2);
        this.c.b(dsbiVar, dsoo.FAILED_UNSUPPORTED_UI);
    }
}
