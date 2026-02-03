package defpackage;

import android.app.Application;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kup implements Runnable {
    final /* synthetic */ Application a;
    final /* synthetic */ kur b;

    public kup(Application application, kur kurVar) {
        this.a = application;
        this.b = kurVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.unregisterActivityLifecycleCallbacks(this.b);
    }
}
