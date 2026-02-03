package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyce {
    private final Map a = new HashMap();

    public final String a(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        Map map = this.a;
        if (!map.containsKey(lowerCase)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str2 : (List) map.get(str.toLowerCase(Locale.US))) {
            if (str2 != null) {
                if (!z) {
                    sb.append(",");
                }
                sb.append(str2);
                z = false;
            }
        }
        return sb.toString();
    }

    public final List b(String str) {
        List list = (List) this.a.get(str.toLowerCase(Locale.US));
        if (list != null) {
            return list;
        }
        int i = ekgb.d;
        return ekoe.a;
    }

    public final Set c() {
        return DesugarCollections.unmodifiableSet(this.a.keySet());
    }

    public final void d(String str, String str2) {
        boolean z = false;
        if (str != null && !str.isEmpty()) {
            z = true;
        }
        ejwl.a(z);
        str2.getClass();
        String lowerCase = str.toLowerCase(Locale.US);
        Map map = this.a;
        if (!map.containsKey(lowerCase)) {
            map.put(lowerCase, new ArrayList());
        }
        ((List) map.get(lowerCase)).add(str2);
    }

    public final void e(String str, String str2) {
        boolean z = false;
        if (str != null && !str.isEmpty()) {
            z = true;
        }
        ejwl.a(z);
        str2.getClass();
        String lowerCase = str.toLowerCase(Locale.US);
        Map map = this.a;
        map.put(lowerCase, new ArrayList());
        ((List) map.get(lowerCase)).add(str2);
    }

    public final boolean f(String str) {
        return this.a.containsKey(str.toLowerCase(Locale.US));
    }

    public final String toString() throws IOException {
        ArrayList arrayList = new ArrayList(this.a.entrySet());
        Collections.sort(arrayList, new Comparator() { // from class: eycd
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            }
        });
        StringBuilder sb = new StringBuilder("{");
        new ejwb(new ejwc(", "), "=").b(sb, arrayList);
        sb.append('}');
        return sb.toString();
    }
}
