package defpackage;

import android.os.Trace;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class escn implements escc, esen {
    private static final esgu c = new esgu() { // from class: esch
        @Override // defpackage.esgu
        public final Object a() {
            return Collections.EMPTY_SET;
        }
    };
    private final List f;
    private final escv h;
    private final escg i;
    public final Map a = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private Set g = new HashSet();
    public final AtomicReference b = new AtomicReference();

    public escn(Executor executor, Iterable iterable, Collection collection, escg escgVar) {
        escv escvVar = new escv(executor);
        this.h = escvVar;
        this.i = escgVar;
        ArrayList<esca> arrayList = new ArrayList();
        arrayList.add(esca.e(escvVar, escv.class, esfi.class, esfh.class));
        arrayList.add(esca.e(this, esen.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            esca escaVar = (esca) it.next();
            if (escaVar != null) {
                arrayList.add(escaVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        this.f = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((esgu) it3.next()).a();
                    if (componentRegistrar != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (final esca<?> escaVar2 : componentRegistrar.getComponents()) {
                            final String str = escaVar2.a;
                            if (str != null) {
                                escaVar2 = new esca<>(str, escaVar2.b, escaVar2.c, escaVar2.d, escaVar2.e, new escf() { // from class: eslk
                                    @Override // defpackage.escf
                                    public final Object a(escc esccVar) {
                                        String str2 = str;
                                        esca escaVar3 = escaVar2;
                                        try {
                                            Trace.beginSection(str2);
                                            return escaVar3.f.a(esccVar);
                                        } finally {
                                            Trace.endSection();
                                        }
                                    }
                                }, escaVar2.g);
                            }
                            arrayList4.add(escaVar2);
                        }
                        arrayList.addAll(arrayList4);
                        it3.remove();
                    }
                } catch (escw e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object[] array = ((esca) it4.next()).b.toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj = array[i];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.g.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.g.add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (this.a.isEmpty()) {
                escq.a(arrayList);
            } else {
                ArrayList arrayList5 = new ArrayList(this.a.keySet());
                arrayList5.addAll(arrayList);
                escq.a(arrayList5);
            }
            for (final esca escaVar3 : arrayList) {
                this.a.put(escaVar3, new escx(new esgu() { // from class: esci
                    @Override // defpackage.esgu
                    public final Object a() {
                        esca escaVar4 = escaVar3;
                        return escaVar4.f.a(new esdg(escaVar4, this.a));
                    }
                }));
            }
            ArrayList arrayList6 = new ArrayList();
            for (esca escaVar4 : arrayList) {
                if (escaVar4.f()) {
                    final esgu esguVar = (esgu) this.a.get(escaVar4);
                    for (esde esdeVar : escaVar4.b) {
                        if (this.d.containsKey(esdeVar)) {
                            final esdb esdbVar = (esdb) ((esgu) this.d.get(esdeVar));
                            arrayList6.add(new Runnable() { // from class: escj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    esdb esdbVar2 = esdbVar;
                                    esgu esguVar2 = esguVar;
                                    if (esdbVar2.b != esdb.a) {
                                        throw new IllegalStateException("provide() can be called only once.");
                                    }
                                    synchronized (esdbVar2) {
                                        esdbVar2.b = esguVar2;
                                    }
                                }
                            });
                        } else {
                            this.d.put(esdeVar, esguVar);
                        }
                    }
                }
            }
            arrayList3.addAll(arrayList6);
            ArrayList arrayList7 = new ArrayList();
            HashMap map = new HashMap();
            for (Map.Entry entry : this.a.entrySet()) {
                esca escaVar5 = (esca) entry.getKey();
                if (!escaVar5.f()) {
                    esgu esguVar2 = (esgu) entry.getValue();
                    for (esde esdeVar2 : escaVar5.b) {
                        if (!map.containsKey(esdeVar2)) {
                            map.put(esdeVar2, new HashSet());
                        }
                        ((Set) map.get(esdeVar2)).add(esguVar2);
                    }
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                if (this.e.containsKey(entry2.getKey())) {
                    final escy escyVar = (escy) this.e.get(entry2.getKey());
                    for (final esgu esguVar3 : (Set) entry2.getValue()) {
                        arrayList7.add(new Runnable() { // from class: esck
                            @Override // java.lang.Runnable
                            public final void run() {
                                escyVar.c(esguVar3);
                            }
                        });
                    }
                } else {
                    this.e.put((esde) entry2.getKey(), escy.b((Collection) entry2.getValue()));
                }
            }
            arrayList3.addAll(arrayList7);
            for (esca escaVar6 : this.a.keySet()) {
                for (escr escrVar : escaVar6.c) {
                    if (escrVar.b() && !this.e.containsKey(escrVar.a)) {
                        this.e.put(escrVar.a, escy.b(Collections.EMPTY_SET));
                    } else if (this.d.containsKey(escrVar.a)) {
                        continue;
                    } else {
                        if (escrVar.b == 1) {
                            throw new escz(String.format("Unsatisfied dependency for component %s: %s", escaVar6, escrVar.a));
                        }
                        if (!escrVar.b()) {
                            this.d.put(escrVar.a, new esdb(esdb.a));
                        }
                    }
                }
            }
        }
        int size = arrayList3.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Runnable) arrayList3.get(i2)).run();
        }
        Boolean bool = (Boolean) this.b.get();
        if (bool != null) {
            Map map2 = this.a;
            bool.booleanValue();
            f(map2);
        }
    }

    @Override // defpackage.escc
    public final synchronized esgu a(esde esdeVar) {
        return (esgu) this.d.get(esdeVar);
    }

    @Override // defpackage.escc
    public final /* synthetic */ esgu b(Class cls) {
        return escb.a(this, cls);
    }

    @Override // defpackage.escc
    public final synchronized esgu c(esde esdeVar) {
        escy escyVar = (escy) this.e.get(esdeVar);
        if (escyVar != null) {
            return escyVar;
        }
        return c;
    }

    @Override // defpackage.escc
    public final /* synthetic */ Object d(esde esdeVar) {
        throw null;
    }

    @Override // defpackage.escc
    public final /* synthetic */ Object e(Class cls) {
        return escb.c(this, cls);
    }

    public final void f(Map map) {
        Queue<esfg> queue;
        for (Map.Entry entry : map.entrySet()) {
            esca escaVar = (esca) entry.getKey();
            esgu esguVar = (esgu) entry.getValue();
            if (escaVar.d == 1) {
                esguVar.a();
            }
        }
        escv escvVar = this.h;
        synchronized (escvVar) {
            queue = escvVar.a;
            if (queue != null) {
                escvVar.a = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (esfg esfgVar : queue) {
                esdc.b(esfgVar);
                synchronized (escvVar) {
                    Queue queue2 = escvVar.a;
                    if (queue2 != null) {
                        queue2.add(esfgVar);
                    } else {
                        for (final Map.Entry entry2 : escvVar.c()) {
                            ((Executor) entry2.getValue()).execute(new Runnable() { // from class: escu
                                @Override // java.lang.Runnable
                                public final void run() {
                                    esjg esjgVar = ((esjf) entry2.getKey()).a;
                                    if (esjgVar.b()) {
                                        esjgVar.a.g();
                                    }
                                }
                            });
                        }
                    }
                }
            }
        }
    }
}
