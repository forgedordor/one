package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehqw implements ComponentCallbacks2 {
    final /* synthetic */ ehrb a;

    public ehqw(ehrb ehrbVar) {
        this.a = ehrbVar;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        ecem.c();
        ehrb ehrbVar = this.a;
        if (ehrbVar.a == null) {
            return;
        }
        if (i == 60 || i == 80) {
            ehrbVar.a.p();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
