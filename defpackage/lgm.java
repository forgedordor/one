package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class lgm extends lgl {
    static final lgt d = lgt.o(WindowInsets.CONSUMED);

    public lgm(lgt lgtVar, WindowInsets windowInsets) {
        super(lgtVar, windowInsets);
    }

    @Override // defpackage.lgi, defpackage.lgp
    public kzc a(int i) {
        return kzc.e(this.a.getInsets(lgr.a(i)));
    }

    @Override // defpackage.lgi, defpackage.lgp
    public kzc c(int i) {
        return kzc.e(this.a.getInsetsIgnoringVisibility(lgr.a(i)));
    }

    @Override // defpackage.lgi, defpackage.lgp
    public boolean n(int i) {
        return this.a.isVisible(lgr.a(i));
    }

    public lgm(lgt lgtVar, lgm lgmVar) {
        super(lgtVar, lgmVar);
    }

    @Override // defpackage.lgi, defpackage.lgp
    public final void f(View view) {
    }
}
