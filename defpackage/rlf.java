package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rlf {
    private static final String b;
    private static final Map c;
    private boolean d = true;
    private Map e = c;
    public boolean a = true;

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    static {
        /*
            java.lang.String r0 = "http.agent"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Ld
            goto L3e
        Ld:
            int r1 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r0.length()
            r2.<init>(r3)
            r3 = 0
        L1b:
            if (r3 >= r1) goto L3a
            char r4 = r0.charAt(r3)
            r5 = 31
            if (r4 > r5) goto L2a
            r5 = 9
            if (r4 != r5) goto L32
            r4 = r5
        L2a:
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 >= r5) goto L32
            r2.append(r4)
            goto L37
        L32:
            r4 = 63
            r2.append(r4)
        L37:
            int r3 = r3 + 1
            goto L1b
        L3a:
            java.lang.String r0 = r2.toString()
        L3e:
            defpackage.rlf.b = r0
            java.util.HashMap r1 = new java.util.HashMap
            r2 = 2
            r1.<init>(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L5a
            rlg r2 = new rlg
            r2.<init>(r0)
            java.util.List r0 = java.util.Collections.singletonList(r2)
            java.lang.String r2 = "User-Agent"
            r1.put(r2, r0)
        L5a:
            java.util.Map r0 = j$.util.DesugarCollections.unmodifiableMap(r1)
            defpackage.rlf.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlf.<clinit>():void");
    }

    public final rlh a() {
        this.d = true;
        return new rlh(this.e);
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            HashMap map = new HashMap(this.e.size());
            for (Map.Entry entry : this.e.entrySet()) {
                map.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            this.e = map;
        }
    }

    public final List c() {
        List list = (List) this.e.get("Authorization");
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.e.put("Authorization", arrayList);
        return arrayList;
    }
}
