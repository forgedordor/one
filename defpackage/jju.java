package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jju implements ComponentCallbacks2 {
    final /* synthetic */ jqs a;

    public jju(jqs jqsVar) {
        this.a = jqsVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.a.a();
    }

    @Override // android.content.ComponentCallbacks
    @fcsv
    public final void onLowMemory() {
        this.a.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.a.a();
    }
}
