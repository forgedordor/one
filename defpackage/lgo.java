package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lgo extends lgn {
    static final lgt e = lgt.o(WindowInsets.CONSUMED);

    public lgo(lgt lgtVar, WindowInsets windowInsets) {
        super(lgtVar, windowInsets);
    }

    @Override // defpackage.lgm, defpackage.lgi, defpackage.lgp
    public kzc a(int i) {
        return kzc.e(this.a.getInsets(lgs.a(i)));
    }

    @Override // defpackage.lgm, defpackage.lgi, defpackage.lgp
    public kzc c(int i) {
        return kzc.e(this.a.getInsetsIgnoringVisibility(lgs.a(i)));
    }

    @Override // defpackage.lgm, defpackage.lgi, defpackage.lgp
    public boolean n(int i) {
        return this.a.isVisible(lgs.a(i));
    }

    public lgo(lgt lgtVar, lgo lgoVar) {
        super(lgtVar, lgoVar);
    }
}
