package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fboo {
    static final ejwc a = ejwc.d(',');
    public static final fboo b = new fboo(fbnp.a, false, new fboo(new fbno(), true, new fboo()));
    public final byte[] c;
    private final Map d;

    public fboo() {
        this.d = new LinkedHashMap(0);
        this.c = new byte[0];
    }

    public final fbom a(String str) {
        fbon fbonVar = (fbon) this.d.get(str);
        if (fbonVar != null) {
            return fbonVar.a;
        }
        return null;
    }

    private fboo(fbom fbomVar, boolean z, fboo fbooVar) {
        String strC = fbomVar.c();
        ejwl.b(!strC.contains(","), "Comma is currently not allowed in message encoding");
        int size = fbooVar.d.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fbooVar.d.containsKey(fbomVar.c()) ? size : size + 1);
        for (fbon fbonVar : fbooVar.d.values()) {
            String strC2 = fbonVar.a.c();
            if (!strC2.equals(strC)) {
                linkedHashMap.put(strC2, new fbon(fbonVar.a, fbonVar.b));
            }
        }
        linkedHashMap.put(strC, new fbon(fbomVar, z));
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        this.d = mapUnmodifiableMap;
        ejwc ejwcVar = a;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((fbon) entry.getValue()).b) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.c = ejwcVar.b(DesugarCollections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }
}
