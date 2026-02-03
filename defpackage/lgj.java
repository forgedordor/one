package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class lgj extends lgi {
    private kzc d;

    public lgj(lgt lgtVar, WindowInsets windowInsets) {
        super(lgtVar, windowInsets);
        this.d = null;
    }

    @Override // defpackage.lgp
    public final kzc p() {
        if (this.d == null) {
            WindowInsets windowInsets = this.a;
            this.d = kzc.d(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.d;
    }

    @Override // defpackage.lgp
    public lgt q() {
        return lgt.o(this.a.consumeStableInsets());
    }

    @Override // defpackage.lgp
    public lgt r() {
        return lgt.o(this.a.consumeSystemWindowInsets());
    }

    @Override // defpackage.lgp
    public void s(kzc kzcVar) {
        this.d = kzcVar;
    }

    @Override // defpackage.lgp
    public boolean t() {
        return this.a.isConsumed();
    }

    public lgj(lgt lgtVar, lgj lgjVar) {
        super(lgtVar, lgjVar);
        this.d = null;
        this.d = lgjVar.d;
    }
}
