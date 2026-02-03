package defpackage;

import android.content.Context;
import com.bumptech.glide.manager.LifecycleLifecycle;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rsa {
    final Map a = new HashMap();
    private final rsd b;

    public rsa(rsd rsdVar) {
        this.b = rsdVar;
    }

    final rbv a(Context context, raw rawVar, lvc lvcVar, boolean z) {
        rvk.j();
        rvk.j();
        Map map = this.a;
        rbv rbvVar = (rbv) map.get(lvcVar);
        if (rbvVar != null) {
            return rbvVar;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lvcVar);
        rbv rbvVarA = this.b.a(rawVar, lifecycleLifecycle, new rrz(), context);
        map.put(lvcVar, rbvVarA);
        lifecycleLifecycle.a(new rry(this, lvcVar));
        if (!z) {
            return rbvVarA;
        }
        rbvVarA.n();
        return rbvVarA;
    }
}
