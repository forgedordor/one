package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CategoryCustomizationActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cyxe extends cyvb {
    private boolean K = false;

    public cyxe() {
        x(new cyxd(this));
    }

    @Override // defpackage.cyve, defpackage.cukr, defpackage.cukp
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        CategoryCustomizationActivity categoryCustomizationActivity = (CategoryCustomizationActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        eyik eyikVar = ahknVar.cD;
        categoryCustomizationActivity.s = (cogw) eyikVar.b();
        categoryCustomizationActivity.t = (cukm) ahhkVar.f.b();
        categoryCustomizationActivity.u = ahhkVar.h;
        categoryCustomizationActivity.v = (baci) ahknVar.dg.b();
        ahnh ahnhVar = ahknVar.a;
        categoryCustomizationActivity.w = (cpch) ahnhVar.qj.b();
        categoryCustomizationActivity.x = ahhkVar.i;
        categoryCustomizationActivity.A = ahnhVar.Wy;
        categoryCustomizationActivity.B = ahnhVar.wF;
        categoryCustomizationActivity.C = ahknVar.da;
        categoryCustomizationActivity.D = ahhkVar.k;
        categoryCustomizationActivity.E = (eigp) ahknVar.aI.b();
        categoryCustomizationActivity.F = ahhkVar.f;
        categoryCustomizationActivity.G = ahknVar.b.mW;
        categoryCustomizationActivity.J = (cogw) eyikVar.b();
    }
}
