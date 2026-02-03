package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eygj {
    private final Map a;

    public eygj(Map map, Map map2) {
        if (!map.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(eyic.a(((ekoj) map).d + ((ekoj) map2).d));
            linkedHashMap.putAll(map2);
            for (Map.Entry entry : ((ekgp) map).entrySet()) {
                linkedHashMap.put(((Class) entry.getKey()).getName(), entry.getValue());
            }
            map2 = DesugarCollections.unmodifiableMap(linkedHashMap);
        }
        this.a = map2;
    }

    public final void a(Object obj) {
        if (b(obj)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (this.a.containsKey(superclass.getCanonicalName())) {
                arrayList.add(superclass.getCanonicalName());
            }
        }
        throw new IllegalArgumentException(arrayList.isEmpty() ? String.format("No injector factory bound for Class<%s>", obj.getClass().getCanonicalName()) : String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", obj.getClass().getCanonicalName(), arrayList));
    }

    public final boolean b(Object obj) {
        fcsu fcsuVar = (fcsu) this.a.get(obj.getClass().getName());
        if (fcsuVar == null) {
            return false;
        }
        eygh eyghVar = (eygh) fcsuVar.b();
        try {
            eygj eygjVarA = eyghVar.a();
            eyghVar.getClass();
            eygjVarA.getClass();
            eygjVarA.a(obj);
            return true;
        } catch (ClassCastException e) {
            throw new eygi(String.format("%s does not implement AndroidInjector.Factory<%s>", eyghVar.getClass().getCanonicalName(), obj.getClass().getCanonicalName()), e);
        }
    }
}
