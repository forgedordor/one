package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehww implements ebzv {
    public final fcsu a;
    private final ebzt b;
    private final ebzt c;
    private final ebzt d;
    private final List e;

    public ehww(fcsu fcsuVar) {
        ehwt ehwtVar = new ehwt(this);
        this.b = ehwtVar;
        ehwu ehwuVar = new ehwu(this);
        this.c = ehwuVar;
        ehwv ehwvVar = new ehwv(this);
        this.d = ehwvVar;
        this.e = Arrays.asList(ehwtVar, ehwuVar, ehwvVar);
        this.a = fcsuVar;
    }

    public final Map a(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
        }
        try {
            Map map = (Map) eote.a(((ehym) this.a.b()).c());
            csq csqVar = new csq();
            for (Map.Entry entry : map.entrySet()) {
                ehyr ehyrVar = (ehyr) entry.getKey();
                if (hashSet.isEmpty() || hashSet.contains(ehyrVar.b.b())) {
                    csqVar.put((ehyr) entry.getKey(), (Long) entry.getValue());
                }
            }
            return csqVar;
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public final String[] b(String[] strArr) {
        TreeSet treeSet = new TreeSet();
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
        }
        try {
            Iterator it = ((Map) eote.a(((ehym) this.a.b()).c())).keySet().iterator();
            while (it.hasNext()) {
                ehwf ehwfVar = ((ehyr) it.next()).b;
                if (!hashSet.contains(ehwfVar.b())) {
                    treeSet.add(ehwfVar.b());
                }
            }
            return (String[]) treeSet.toArray(new String[treeSet.size()]);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.ebzv
    public final String c() {
        return "sync";
    }

    @Override // defpackage.ebzv
    public final List d() {
        return this.e;
    }

    @Override // defpackage.ebzv
    public final List e() {
        return Collections.EMPTY_LIST;
    }
}
