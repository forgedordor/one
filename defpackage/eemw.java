package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eemw implements OnBackAnimationCallback {
    final /* synthetic */ eemt a;
    final /* synthetic */ eemx b;

    public eemw(eemx eemxVar, eemt eemtVar) {
        this.a = eemtVar;
        this.b = eemxVar;
    }

    public final void onBackCancelled() {
        if (this.b.d()) {
            this.a.x();
        }
    }

    public final void onBackInvoked() {
        this.a.z();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.d()) {
            this.a.I(new aao(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.d()) {
            this.a.G(new aao(backEvent));
        }
    }
}
