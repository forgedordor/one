package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfr {
    public final kzc a;
    public final kzc b;

    public lfr(kzc kzcVar, kzc kzcVar2) {
        this.a = kzcVar;
        this.b = kzcVar2;
    }

    public final String toString() {
        return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
    }

    public lfr(WindowInsetsAnimation.Bounds bounds) {
        this.a = kzc.e(bounds.getLowerBound());
        this.b = kzc.e(bounds.getUpperBound());
    }
}
