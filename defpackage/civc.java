package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class civc {
    private static final Pattern a = Pattern.compile("^[a-zA-Z0-9\\x21\\x23-\\x27\\x2a-\\x2b\\x2d\\x5e-\\x60\\x7c\\x7e]+$");
    private static final Pattern b = Pattern.compile("^[^\\p{Cntrl}]*$");
    private final Map c;

    private civc(Map map) {
        this.c = map;
    }

    public static civc a() {
        return new civc(new TreeMap(String.CASE_INSENSITIVE_ORDER));
    }

    public static civc b(eyga eygaVar) {
        civc civcVarA = a();
        if (eygaVar != null) {
            for (Map.Entry entry : DesugarCollections.unmodifiableMap(eygaVar.b).entrySet()) {
                String str = (String) entry.getKey();
                for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((eyge) entry.getValue()).b).entrySet()) {
                    civcVarA.d(str, (String) entry2.getKey(), (String) entry2.getValue());
                }
            }
        }
        return civcVarA;
    }

    public final eyga c() {
        eyfy eyfyVar = (eyfy) eyga.a.createBuilder();
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            eygc eygcVar = (eygc) eyge.a.createBuilder();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                eygcVar.b((String) entry2.getKey(), (String) entry2.getValue());
            }
            eyfyVar.a(str, (eyge) eygcVar.build());
        }
        return (eyga) eyfyVar.build();
    }

    public final void d(String str, String str2, String str3) {
        ejwl.b(a.matcher(str2).matches(), "The headerName has not allowed characters.");
        ejwl.b(b.matcher(str3).matches(), "The headerValue has not allowed characters.");
        Map map = this.c;
        if (!map.containsKey(str)) {
            map.put(str, new TreeMap(String.CASE_INSENSITIVE_ORDER));
        }
        Map map2 = (Map) map.get(str);
        if (map2 == null) {
            throw new IllegalStateException("Could not add a new custom header due to null map.");
        }
        map2.put(str2, str3);
    }

    public final void e(civa civaVar, String str, String str2) {
        d(civaVar.q, str, str2);
    }
}
