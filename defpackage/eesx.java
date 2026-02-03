package defpackage;

import android.graphics.RectF;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eesx extends eesv {
    private boolean f = false;
    public float e = 0.0f;

    public eesx(View view) {
        e(view);
    }

    private void e(View view) {
        view.setOutlineProvider(new eesw(this));
    }

    @Override // defpackage.eesv
    public final void a(View view) {
        boolean z;
        eesj eesjVar;
        RectF rectF;
        eesj eesjVar2 = this.b;
        float fA = 0.0f;
        if (eesjVar2 != null && (rectF = this.c) != null) {
            fA = eesjVar2.g.a(rectF);
        }
        this.e = fA;
        if (this.c.isEmpty() || (eesjVar = this.b) == null || !eesjVar.g(this.c)) {
            this.c.isEmpty();
            z = false;
        } else {
            z = true;
        }
        this.f = z;
        view.setClipToOutline(!d());
        if (d()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // defpackage.eesv
    public final boolean d() {
        return !this.f || this.a;
    }
}
