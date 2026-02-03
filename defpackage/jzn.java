package defpackage;

import android.text.SegmentFinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jzn extends SegmentFinder {
    final /* synthetic */ jzr a;

    public jzn(jzr jzrVar) {
        this.a = jzrVar;
    }

    public final int nextEndBoundary(int i) {
        return this.a.b(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.c(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.e(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.f(i);
    }
}
