package defpackage;

import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lil implements lcy {
    final /* synthetic */ NestedScrollView a;

    public lil(NestedScrollView nestedScrollView) {
        this.a = nestedScrollView;
    }

    @Override // defpackage.lcy
    public final float a() {
        return -this.a.a();
    }

    @Override // defpackage.lcy
    public final void b() {
        this.a.a.abortAnimation();
    }

    @Override // defpackage.lcy
    public final boolean c(float f) {
        if (f == 0.0f) {
            return false;
        }
        b();
        this.a.j((int) f);
        return true;
    }
}
