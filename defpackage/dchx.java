package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dchx {
    public Bundle b;
    private final Map c = DesugarCollections.synchronizedMap(new csq());
    public int a = 0;

    final void a(int i, int i2, Intent intent) {
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((dcht) it.next()).c(i, i2, intent);
        }
    }

    final void b(Bundle bundle) {
        this.a = 1;
        this.b = bundle;
        for (Map.Entry entry : this.c.entrySet()) {
            ((dcht) entry.getValue()).d(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    final void c() {
        this.a = 5;
        for (dcht dchtVar : this.c.values()) {
        }
    }

    final void d() {
        this.a = 3;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((dcht) it.next()).h();
        }
    }

    final void e(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.c.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((dcht) entry.getValue()).g(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    final void f() {
        this.a = 2;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((dcht) it.next()).i();
        }
    }

    final void g() {
        this.a = 4;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((dcht) it.next()).j();
        }
    }

    final void h() {
        for (dcht dchtVar : this.c.values()) {
        }
    }

    final void i(dcht dchtVar) {
        Map map = this.c;
        if (map.containsKey("ConnectionlessLifecycleHelper")) {
            throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
        }
        map.put("ConnectionlessLifecycleHelper", dchtVar);
        if (this.a > 0) {
            new ddmy(Looper.getMainLooper()).post(new dchw(this, dchtVar));
        }
    }

    final dcht j(Class cls) {
        return (dcht) cls.cast(this.c.get("ConnectionlessLifecycleHelper"));
    }
}
