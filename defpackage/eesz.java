package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eesz extends eesv {
    public eesz(View view) {
        e(view);
    }

    private void e(View view) {
        view.setOutlineProvider(new eesy(this));
    }

    @Override // defpackage.eesv
    public final void a(View view) {
        view.setClipToOutline(!this.a);
        if (this.a) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // defpackage.eesv
    public final boolean d() {
        return this.a;
    }
}
