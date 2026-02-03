package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eefk {
    public final MaterialButton a;
    public eesj b;
    public eetb c;
    public loa d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public PorterDuff.Mode k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public Drawable o;
    public boolean r;
    public LayerDrawable t;
    public int u;
    public eefe v;
    public boolean p = false;
    public boolean q = false;
    public boolean s = true;

    public eefk(MaterialButton materialButton, eesj eesjVar) {
        this.a = materialButton;
        this.b = eesjVar;
    }

    private final eesc g(boolean z) {
        LayerDrawable layerDrawable = this.t;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (eesc) ((LayerDrawable) ((InsetDrawable) this.t.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final eesc a() {
        return g(false);
    }

    public final eesc b() {
        return g(true);
    }

    public final void c() {
        this.p = true;
        MaterialButton materialButton = this.a;
        materialButton.i(this.l);
        materialButton.j(this.k);
    }

    public final void d(eesj eesjVar) {
        this.b = eesjVar;
        this.c = null;
        e();
    }

    public final void e() {
        eesc eescVarA = a();
        if (eescVarA != null) {
            eetb eetbVar = this.c;
            if (eetbVar != null) {
                eescVarA.T(eetbVar);
            } else {
                eescVarA.fx(this.b);
            }
            loa loaVar = this.d;
            if (loaVar != null) {
                eescVarA.N(loaVar);
            }
        }
        eesc eescVarB = b();
        if (eescVarB != null) {
            eetb eetbVar2 = this.c;
            if (eetbVar2 != null) {
                eescVarB.T(eetbVar2);
            } else {
                eescVarB.fx(this.b);
            }
            loa loaVar2 = this.d;
            if (loaVar2 != null) {
                eescVarB.N(loaVar2);
            }
        }
        LayerDrawable layerDrawable = this.t;
        eesu eesuVar = null;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            eesuVar = this.t.getNumberOfLayers() > 2 ? (eesu) this.t.getDrawable(2) : (eesu) this.t.getDrawable(1);
        }
        if (eesuVar != null) {
            eesuVar.fx(this.b);
            if (eesuVar instanceof eesc) {
                eesc eescVar = (eesc) eesuVar;
                eetb eetbVar3 = this.c;
                if (eetbVar3 != null) {
                    eescVar.T(eetbVar3);
                }
                loa loaVar3 = this.d;
                if (loaVar3 != null) {
                    eescVar.N(loaVar3);
                }
            }
        }
    }

    public final void f(eefe eefeVar) {
        this.v = eefeVar;
        eesc eescVarA = a();
        if (eescVarA != null) {
            eescVarA.A = eefeVar;
        }
    }
}
