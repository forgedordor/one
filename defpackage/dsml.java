package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsml implements dskl {
    private final dskl a;
    private final eosc b;
    private final dxgk c;
    private Map d;

    public dsml(dskl dsklVar, eosc eoscVar, dxgk dxgkVar) {
        this.a = dsklVar;
        this.b = eoscVar;
        this.c = dxgkVar;
    }

    private final ListenableFuture i() {
        Map map = this.d;
        if (map != null) {
            return eork.i(map);
        }
        this.c.b();
        return eooq.f(eoqt.t(this.a.b()), eiid.a(new ejvr() { // from class: dsmk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return this.a.f((Collection) obj);
            }
        }), this.b);
    }

    private final synchronized void j(dsmz dsmzVar) {
        if (!this.d.containsKey(dsmzVar.a())) {
            this.d.put(dsmzVar.a(), new HashSet());
        }
        Set set = (Set) this.d.get(dsmzVar.a());
        set.remove(dsmzVar);
        set.add(dsmzVar);
    }

    @Override // defpackage.dskl
    public final synchronized ListenableFuture a(long j) {
        Map map = this.d;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Collection<dsmz> collection = (Collection) entry.getValue();
                HashSet hashSet = new HashSet();
                for (dsmz dsmzVar : collection) {
                    if (dsmzVar.c >= j) {
                        hashSet.add(dsmzVar);
                    }
                }
                entry.setValue(hashSet);
            }
        }
        return this.a.a(j);
    }

    @Override // defpackage.dskl
    public final synchronized ListenableFuture b() {
        return eooq.f(eoqt.t(i()), new ejvr() { // from class: dsmh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return this.a.h();
            }
        }, eoqg.a);
    }

    @Override // defpackage.dskl
    public final synchronized ListenableFuture c(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            dsmz dsmzVar = (dsmz) it.next();
            if (dsmzVar.b > dsmzVar.c) {
                return eork.h(new dskg());
            }
        }
        this.c.b();
        if (this.d != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                j((dsmz) it2.next());
            }
        }
        return this.a.c(collection);
    }

    public final synchronized ListenableFuture d(final String str, final long j) {
        this.c.b();
        return eooq.f(eoqt.t(i()), eiid.a(new ejvr() { // from class: dsmi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Set<dsmz> setG = this.a.g(str);
                HashSet hashSet = new HashSet();
                for (dsmz dsmzVar : setG) {
                    long j2 = j;
                    if (dsmzVar.b <= j2 && j2 <= dsmzVar.c) {
                        hashSet.add(dsmzVar);
                    }
                }
                return hashSet;
            }
        }), eoqg.a);
    }

    public final synchronized ListenableFuture e() {
        return eooq.f(eoqt.t(i()), new ejvr() { // from class: dsmj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    public final synchronized Map f(Collection collection) {
        this.d = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            j((dsmz) it.next());
        }
        return this.d;
    }

    public final synchronized Set g(String str) {
        if (this.d.containsKey(str)) {
            return (Set) this.d.get(str);
        }
        return ekon.a;
    }

    public final synchronized Set h() {
        Collection collectionValues;
        collectionValues = this.d.values();
        collectionValues.getClass();
        return ekpg.e(new ekee(collectionValues));
    }
}
