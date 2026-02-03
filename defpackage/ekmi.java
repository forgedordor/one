package defpackage;

import androidx.car.app.model.Alert;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekmi {
    static int a(int i) {
        if (i >= 3) {
            return i < 1073741824 ? (int) Math.ceil(i / 0.75d) : Alert.DURATION_SHOW_INDEFINITELY;
        }
        ekcw.c(i, "expectedSize");
        return i + 1;
    }

    static ejvr b(final ekma ekmaVar) {
        ekmaVar.getClass();
        return new ejvr() { // from class: ekln
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return new eklv(entry, ekmaVar);
            }
        };
    }

    public static ekgp c(Map map) {
        if (map instanceof ekfq) {
            return (ekfq) map;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return ekoj.a;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Enum r1 = (Enum) entry.getKey();
        Object value = entry.getValue();
        ekcw.a(r1, value);
        EnumMap enumMap = new EnumMap(Collections.singletonMap(r1, value));
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Enum r12 = (Enum) entry2.getKey();
            Object value2 = entry2.getValue();
            ekcw.a(r12, value2);
            enumMap.put((EnumMap) r12, (Enum) value2);
        }
        int size = enumMap.size();
        if (size == 0) {
            return ekoj.a;
        }
        if (size != 1) {
            return new ekfq(enumMap);
        }
        Map.Entry entry3 = (Map.Entry) ekis.l(enumMap.entrySet());
        return ekgp.l((Enum) entry3.getKey(), entry3.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ekgp d(Iterable iterable, ejvr ejvrVar) {
        return iterable instanceof Collection ? n(iterable.iterator(), ejvrVar, ekgp.h(iterable.size())) : n(iterable.iterator(), ejvrVar, new ekgi());
    }

    static Object e(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    static Object f(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String g(Map map) {
        int size = map.size();
        ekcw.c(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static HashMap h(int i) {
        return new HashMap(a(i));
    }

    static Iterator i(Set set, ejvr ejvrVar) {
        return new eklr(set.iterator(), ejvrVar);
    }

    public static LinkedHashMap j(int i) {
        return new LinkedHashMap(a(i));
    }

    static Map.Entry k(Map.Entry entry) {
        entry.getClass();
        return new eklt(entry);
    }

    public static Map l(Map map, final ejvr ejvrVar) {
        return new ekme(map, new ekma() { // from class: eklo
            @Override // defpackage.ekma
            public final Object a(Object obj, Object obj2) {
                return ejvrVar.apply(obj2);
            }
        });
    }

    public static boolean m(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    private static ekgp n(Iterator it, ejvr ejvrVar, ekgi ekgiVar) {
        while (it.hasNext()) {
            Object next = it.next();
            ekgiVar.i(ejvrVar.apply(next), next);
        }
        try {
            return ekgiVar.c();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.valueOf(e.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }
}
