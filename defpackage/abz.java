package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abz implements OnBackAnimationCallback {
    final /* synthetic */ fdap a;
    final /* synthetic */ fdap b;
    final /* synthetic */ fdae c;
    final /* synthetic */ fdae d;

    public abz(fdap fdapVar, fdap fdapVar2, fdae fdaeVar, fdae fdaeVar2) {
        this.a = fdapVar;
        this.b = fdapVar2;
        this.c = fdaeVar;
        this.d = fdaeVar2;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.invoke(new aao(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.invoke(new aao(backEvent));
    }
}
