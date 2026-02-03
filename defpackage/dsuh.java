package defpackage;

import android.os.StrictMode;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsuh {
    public final eosc a;
    public final dsud b;
    private final fcsu c;
    private final Set d;
    private final Executor e;
    private volatile ekgp f;

    public dsuh(eosc eoscVar, fcsu fcsuVar, Set set, dsud dsudVar) {
        this.a = eoscVar;
        this.c = fcsuVar;
        this.d = set;
        this.b = dsudVar;
        this.e = new eoss(eoscVar);
        ejwl.m(!set.isEmpty(), "No logging result handlers provided.");
    }

    public static ListenableFuture a(dsuk dsukVar, dsui dsuiVar) {
        try {
            return dsuiVar.a(dsukVar);
        } catch (Throwable th) {
            return eork.h(th);
        }
    }

    private final void d(ListenableFuture listenableFuture) {
        ekqg ekqgVarListIterator = ((ekph) this.d).listIterator();
        while (ekqgVarListIterator.hasNext()) {
            eork.r(listenableFuture, new dsul(), eoqg.a);
        }
    }

    public final List b(Class cls) {
        ekgp ekgpVarJ = this.f;
        if (ekgpVarJ == null) {
            synchronized (this) {
                ekgpVarJ = this.f;
                if (ekgpVarJ == null) {
                    HashMap map = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (dsui dsuiVar : (Set) this.c.b()) {
                        if (dsuiVar.b().isEmpty()) {
                            arrayList.add(dsuiVar);
                        } else {
                            ekqg ekqgVarListIterator = ((ekph) dsuiVar.b()).listIterator();
                            while (ekqgVarListIterator.hasNext()) {
                                Class cls2 = (Class) ekqgVarListIterator.next();
                                List arrayList2 = (List) map.get(cls2);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                    map.put(cls2, arrayList2);
                                }
                                arrayList2.add(dsuiVar);
                            }
                        }
                    }
                    map.put(dsuj.class, arrayList);
                    ekgpVarJ = ekgp.j(map);
                    this.f = ekgpVarJ;
                }
            }
        }
        int i = ekgb.d;
        return (List) ekgpVarJ.getOrDefault(cls, ekoe.a);
    }

    public final void c(dsug dsugVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).detectAll().build());
        try {
            try {
                final List listA = dsugVar.a();
                if (listA != null) {
                    if (!listA.isEmpty()) {
                        Callable callableL = eiid.l(new Callable() { // from class: dsue
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                List<dsuj> list = listA;
                                ArrayList arrayList = new ArrayList(list.size());
                                for (dsuj dsujVar : list) {
                                    dsuh dsuhVar = this.a;
                                    arrayList.add(new dsuk(dsujVar, dsuhVar.b.a(dsujVar)));
                                }
                                return arrayList;
                            }
                        });
                        Executor executor = this.e;
                        d(eooq.g(eork.m(callableL, executor), eiid.d(new eooz() { // from class: dsuf
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                List list = (List) obj;
                                int size = list.size();
                                ArrayList arrayList = new ArrayList(size + size);
                                Iterator it = list.iterator();
                                while (true) {
                                    dsuh dsuhVar = this.a;
                                    if (!it.hasNext()) {
                                        return eork.c(arrayList).a(new eopa(null), dsuhVar.a);
                                    }
                                    dsuk dsukVar = (dsuk) it.next();
                                    try {
                                        List listB = dsuhVar.b(dsukVar.a.getClass());
                                        List listB2 = dsuhVar.b(dsuj.class);
                                        ArrayList arrayList2 = new ArrayList(listB.size() + listB2.size());
                                        Iterator it2 = listB.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add(dsuh.a(dsukVar, (dsui) it2.next()));
                                        }
                                        Iterator it3 = listB2.iterator();
                                        while (it3.hasNext()) {
                                            arrayList2.add(dsuh.a(dsukVar, (dsui) it3.next()));
                                        }
                                        arrayList.add(eooq.f(eork.e(arrayList2), new ejvt(null), eoqg.a));
                                        arrayList.add(dsukVar.b);
                                    } catch (Throwable th) {
                                        arrayList.add(eork.h(th));
                                    }
                                }
                            }
                        }), executor));
                    }
                }
            } catch (Throwable th) {
                ListenableFuture listenableFutureH = eork.h(th);
                eork.h(th);
                d(listenableFutureH);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
