package defpackage;

import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ts implements Runnable {
    final /* synthetic */ tu a;

    public ts(tu tuVar) {
        this.a = tuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewParent parent = this.a.c.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
