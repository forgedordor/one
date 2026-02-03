package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pix {
    public final pji a;
    private piq b;

    public pix(pji pjiVar) {
        this.a = pjiVar;
    }

    public final Bundle a(String str) {
        pji pjiVar = this.a;
        if (!pjiVar.f) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = pjiVar.e;
        if (bundle == null) {
            return null;
        }
        Bundle bundleB = pis.g(bundle, str) ? pis.b(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            pjiVar.e = null;
        }
        return bundleB;
    }

    public final void b(String str, piw piwVar) {
        piwVar.getClass();
        pji pjiVar = this.a;
        synchronized (pjiVar.b) {
            Map map = pjiVar.c;
            if (map.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            map.put(str, piwVar);
        }
    }

    public final void c(Class cls) throws NoSuchMethodException, SecurityException {
        if (!this.a.g) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        piq piqVar = this.b;
        if (piqVar == null) {
            piqVar = new piq(this);
        }
        this.b = piqVar;
        try {
            cls.getDeclaredConstructor(null);
            piq piqVar2 = this.b;
            if (piqVar2 != null) {
                String name = cls.getName();
                name.getClass();
                piqVar2.a.add(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public final boolean d() {
        return this.a.f;
    }

    public final piw e() {
        piw piwVar;
        pji pjiVar = this.a;
        synchronized (pjiVar.b) {
            Iterator it = pjiVar.c.entrySet().iterator();
            do {
                piwVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                piw piwVar2 = (piw) entry.getValue();
                if (true == fdbq.f(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    piwVar = piwVar2;
                }
            } while (piwVar == null);
        }
        return piwVar;
    }
}
