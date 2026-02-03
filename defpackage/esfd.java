package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esfd {
    public static final eses a = new eses() { // from class: esfc
        @Override // defpackage.eseo
        public final void a(Object obj, Object obj2) {
            throw new esep("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    public static final void a(Class cls, eses esesVar, Map map, Map map2) {
        map.put(cls, esesVar);
        map2.remove(cls);
    }
}
