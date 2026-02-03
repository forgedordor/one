package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsrg extends ea {
    private static final eksp am = eksp.c("GnpSdk");
    public dsoq a;
    public dsbi ai;
    public etns aj;
    public dsom al;
    private boolean an;
    public dsrp b;
    public dxgk c;
    public dsrm e;
    public boolean d = false;
    public boolean ag = true;
    public boolean ah = false;
    public Boolean ak = false;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.M(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.gm_tooltip_fragment, viewGroup);
    }

    public final void a() {
        if (G() == null || G().isFinishing() || !aF() || this.s) {
            return;
        }
        dsbi dsbiVar = this.ai;
        if (dsbiVar != null) {
            dsrp dsrpVar = this.b;
            eg egVarG = G();
            etnj etnjVar = dsbiVar.c().f;
            if (etnjVar == null) {
                etnjVar = etnj.a;
            }
            View viewA = dsrpVar.a(egVarG, etnjVar.c == 5 ? (etoh) etnjVar.d : etoh.a);
            if (viewA != null) {
                ley.p(viewA, null);
            }
        }
        fr frVar = this.B;
        if (frVar != null) {
            cg cgVar = new cg(frVar);
            cgVar.o(this);
            cgVar.k();
        }
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        if (bundle != null && !this.d) {
            a();
            return;
        }
        View viewFindViewById = G().findViewById(android.R.id.content);
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(new dsre(this, viewFindViewById));
        viewFindViewById.requestLayout();
    }

    @Override // defpackage.ea
    public final void ai() {
        dsrm dsrmVar = this.e;
        if (dsrmVar != null) {
            dsrmVar.a();
            if (!this.ah && !this.an) {
                this.al.a(this.ai, etjv.DISMISSED);
            }
        }
        super.ai();
    }

    @Override // defpackage.ea
    public final void g(Context context) {
        super.g(context);
        try {
            ((drzh) ((fcsu) dxkg.a(context).fL().get(dsrg.class)).b()).a(this);
        } catch (Exception e) {
            ((eksl) ((eksl) ((eksl) am.j()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/tooltip/TooltipFragment", "onAttach", ']', "TooltipFragment.java")).q("Failed to inject members.");
        }
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        this.d = bundle != null && bundle.getBoolean("showing");
        this.ak = Boolean.valueOf(bundle != null && bundle.getBoolean("IS_IMPRESSION_REPORTED"));
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        bundle.putBoolean("showing", this.d);
        bundle.putBoolean("IS_IMPRESSION_REPORTED", this.ak.booleanValue());
        this.an = true;
    }
}
