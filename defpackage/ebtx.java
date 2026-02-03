package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebtx implements ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        Set set = ebtw.a;
        ecem.c();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        Set set = ebtw.a;
        ecem.c();
        ebtw.b = i;
        Iterator it = ebtw.a.iterator();
        while (it.hasNext()) {
            ((ebtu) it.next()).b(i);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
