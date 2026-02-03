package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwu {
    public static final lyo a = new lwr();
    public static final lyo b = new lws();
    public static final lyo c = new lwt();

    public static final lwn a(lyp lypVar) {
        pjb pjbVar = (pjb) lypVar.a(a);
        if (pjbVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        lxq lxqVar = (lxq) lypVar.a(b);
        if (lxqVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) lypVar.a(c);
        String str = (String) lypVar.a(lxo.a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        piw piwVarE = pjbVar.U().e();
        Bundle bundle2 = null;
        lww lwwVar = piwVarE instanceof lww ? (lww) piwVarE : null;
        if (lwwVar == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        Map map = b(lxqVar).a;
        lwn lwnVar = (lwn) map.get(str);
        if (lwnVar != null) {
            return lwnVar;
        }
        lwwVar.b();
        Bundle bundle3 = lwwVar.a;
        if (bundle3 != null && pis.g(bundle3, str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = lab.a((fcti[]) Arrays.copyOf(new fcti[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                lwwVar.a = null;
            }
            bundle2 = bundle4;
        }
        lwn lwnVarA = lwl.a(bundle2, bundle);
        map.put(str, lwnVarA);
        return lwnVarA;
    }

    public static final lwx b(lxq lxqVar) {
        lyu lyuVar = lxi.b(lxqVar, new lwq(), 4).b;
        int i = fdcj.a;
        return (lwx) lyuVar.a(new fdbi(lwx.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void c(pjb pjbVar) {
        lvb lvbVarA = pjbVar.P().a();
        if (lvbVarA != lvb.b && lvbVarA != lvb.c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (pjbVar.U().e() == null) {
            lww lwwVar = new lww(pjbVar.U(), (lxq) pjbVar);
            pjbVar.U().b("androidx.lifecycle.internal.SavedStateHandlesProvider", lwwVar);
            pjbVar.P().c(new lwo(lwwVar));
        }
    }
}
