package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjr implements ComponentCallbacks2 {
    final /* synthetic */ Configuration a;
    final /* synthetic */ jqp b;

    public jjr(Configuration configuration, jqp jqpVar) {
        this.a = configuration;
        this.b = jqpVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        jqp jqpVar = this.b;
        Configuration configuration2 = this.a;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = jqpVar.a.entrySet().iterator();
        while (it.hasNext()) {
            jqn jqnVar = (jqn) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (jqnVar == null || Configuration.needNewResources(iUpdateFrom, jqnVar.b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    @fcsv
    public final void onLowMemory() {
        this.b.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.b.a();
    }
}
