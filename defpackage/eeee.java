package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeee implements Runnable {
    final /* synthetic */ SwipeDismissBehavior a;
    private final View b;
    private final boolean c;

    public eeee(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = swipeDismissBehavior;
        this.b = view;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eeuf eeufVar;
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        ljn ljnVar = swipeDismissBehavior.a;
        if (ljnVar != null && ljnVar.l()) {
            this.b.postOnAnimation(this);
        } else {
            if (!this.c || (eeufVar = swipeDismissBehavior.f) == null) {
                return;
            }
            eeufVar.a(this.b);
        }
    }
}
