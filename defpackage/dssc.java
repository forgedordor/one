package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dssc implements dsop {
    private static final eksp b = eksp.c("GnpSdk");
    public final dsoj a;
    private final Context c;
    private final fdjx d;
    private final dsah e;

    public dssc(Context context, dsoj dsojVar, fdjx fdjxVar, dsah dsahVar) {
        context.getClass();
        dsojVar.getClass();
        fdjxVar.getClass();
        dsahVar.getClass();
        this.c = context;
        this.a = dsojVar;
        this.d = fdjxVar;
        this.e = dsahVar;
    }

    private final void d(dsbi dsbiVar, dsoo dsooVar) {
        fdil.d(this.d, null, null, new dssb(this, dsbiVar, dsooVar, null), 3);
    }

    @Override // defpackage.dsop
    public final View a(eg egVar, etnj etnjVar) {
        etnjVar.getClass();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dsop
    public final void b(eg egVar, View view, dsbi dsbiVar, etns etnsVar) {
        eksp ekspVar = b;
        ekspVar.o().q("rendering a permission prompt.");
        etnj etnjVar = dsbiVar.c().f;
        if (etnjVar == null) {
            etnjVar = etnj.a;
        }
        etnjVar.getClass();
        etna etnaVar = etnjVar.c == 6 ? (etna) etnjVar.d : etna.a;
        etnaVar.getClass();
        etmy etmyVar = etnaVar.e;
        if (etmyVar == null) {
            etmyVar = etmy.b;
        }
        evsz evszVar = new evsz(etmyVar.c, etmy.a);
        if (evszVar.isEmpty()) {
            ekspVar.o().q("must set a permission type.");
            d(dsbiVar, dsoo.FAILED_INVALID_PROMOTION);
            return;
        }
        if (evszVar.size() > 1) {
            ekspVar.o().q("GrowthKit only supports a single permission type, ignoring the rest.");
        }
        T t = evszVar.get(0);
        t.getClass();
        String strA = dsbf.a((etgd) t);
        if (dxuh.a(this.c, strA)) {
            ((eksl) ekspVar.j()).t("Permissions for %s are already granted.", strA);
            d(dsbiVar, dsoo.NOT_NEEDED_PERMISSION_GRANTED);
            return;
        }
        boolean zShouldShowRequestPermissionRationale = egVar.shouldShowRequestPermissionRationale(strA);
        ekspVar.o().G("shouldShowRequestPermissionRationale returned %s for %s.", zShouldShowRequestPermissionRationale, strA);
        if (!zShouldShowRequestPermissionRationale || etnaVar.c) {
            if (etnjVar.f) {
                d(dsbiVar, dsoo.SUCCESS);
                return;
            }
            this.e.i(dsbiVar);
            eksp ekspVar2 = dssg.a;
            dssg dssgVarA = dssf.a(dsbiVar);
            cg cgVar = new cg(egVar.a());
            cgVar.u(dssgVarA, "PermissionRequestFrag");
            cgVar.k();
            fdil.d(this.d, null, null, new dssa(this, dsbiVar, null), 3);
            return;
        }
        try {
            etly etlyVar = etnaVar.d;
            if (etlyVar == null) {
                etlyVar = etly.a;
            }
            etns etnsVarB = dspi.b(etnsVar, etlyVar);
            if (etnjVar.f) {
                d(dsbiVar, dsoo.SUCCESS);
            } else {
                this.e.i(dsbiVar);
                dsqh.aV(dsbiVar, etnsVarB).s(egVar.a(), "PromoUiDialogFragment");
            }
        } catch (dsph unused) {
            d(dsbiVar, dsoo.FAILED_THEME_NOT_FOUND);
        }
    }

    @Override // defpackage.dsop
    public final boolean c(etni etniVar) {
        etniVar.getClass();
        return etniVar == etni.UITYPE_PERMISSION;
    }
}
