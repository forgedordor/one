package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebyy {
    static final ecaq a = new ecaq("debug.binder.verification");
    private static final Object e;
    private static final ebzc f;
    public final CopyOnWriteArrayList b;
    public volatile boolean c;
    public volatile ebza d;
    private Context g;
    private ebyy h;
    private final Map i;
    private final Map j;
    private final Map k;
    private final Set l;
    private final ThreadLocal m;

    static {
        ecat.a(new ecaq("debug.binder.strict_mode"));
        e = new Object();
        f = new ebzc(new ebzh());
    }

    public ebyy() {
        this.i = DesugarCollections.synchronizedMap(new HashMap());
        this.j = DesugarCollections.synchronizedMap(new HashMap());
        this.k = DesugarCollections.synchronizedMap(new HashMap());
        this.l = DesugarCollections.synchronizedSet(new HashSet());
        this.b = new CopyOnWriteArrayList();
        this.m = new ThreadLocal();
        this.d = new ebzk();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List a(Context context, Class cls) {
        ebyy ebyyVarA;
        List arrayList;
        Object obj;
        Context applicationContext = context.getApplicationContext();
        boolean z = false;
        while (true) {
            if (context instanceof ebyz) {
                ebyyVarA = ((ebyz) context).a();
                if (ebyyVarA == null) {
                    throw new IllegalStateException("BinderContext must not return null Binder: ".concat(String.valueOf(String.valueOf(context))));
                }
            } else {
                ebyyVarA = null;
            }
            if (ebyyVarA != null) {
                break;
            }
            z |= context == applicationContext;
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
                if (context == null) {
                    throw new IllegalStateException("Invalid ContextWrapper -- If this is a Robolectric test, have you called ActivityController.create()?");
                }
            } else {
                context = !z ? applicationContext : null;
            }
            if (context == null) {
                Context applicationContext2 = applicationContext.getApplicationContext();
                if (applicationContext2 instanceof ebzg) {
                    ebyyVarA = ((ebzg) applicationContext2).a();
                } else {
                    ebzc ebzcVar = f;
                    if (ebzcVar.a == null) {
                        synchronized (ebzcVar.b) {
                            if (ebzcVar.a == null) {
                                ebyy ebyyVar = new ebyy(applicationContext2);
                                ebzcVar.c.a(applicationContext2, ebyyVar);
                                ebzcVar.a = ebyyVar;
                            }
                        }
                    }
                    ebyyVarA = ebzcVar.a;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (ebyyVarA.g == null) {
            throw new IllegalStateException("Binder not initialized yet.");
        }
        synchronized (ebyyVarA.c(cls)) {
            Map map = ebyyVarA.j;
            arrayList = (List) map.get(cls);
            if (arrayList == null) {
                if (ecat.a(a) && (obj = ebyyVarA.i.get(cls)) != null && obj != e) {
                    throw new IllegalStateException(a.J(cls, "getAll() called for single-bound object: "));
                }
                arrayList = new ArrayList();
                map.put(cls, arrayList);
            }
            if (ebyyVarA.l.add(cls)) {
                ThreadLocal threadLocal = ebyyVarA.m;
                Boolean bool = (Boolean) threadLocal.get();
                boolean z2 = bool != null && bool.booleanValue();
                if (!z2) {
                    threadLocal.set(true);
                }
                try {
                    CopyOnWriteArrayList copyOnWriteArrayList = ebyyVarA.b;
                    int size = copyOnWriteArrayList.size();
                    for (int i = 0; i < size; i++) {
                        ebze ebzeVar = (ebze) copyOnWriteArrayList.get(i);
                        Context context2 = ebyyVarA.g;
                        ebzeVar.a();
                    }
                    if (!z2) {
                        threadLocal.set(false);
                    }
                } catch (Throwable th) {
                    if (!z2) {
                        ebyyVarA.m.set(false);
                    }
                    throw th;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = new ArrayList();
                Map map2 = (Map) ebyyVarA.k.get(cls);
                if (map2 != null) {
                    for (Object obj2 : map2.values()) {
                        if (obj2 != null && obj2 != e) {
                            arrayList.add(obj2);
                        }
                    }
                }
            }
        }
        arrayList2.addAll(arrayList);
        ebyy ebyyVar2 = ebyyVarA.h;
        return !arrayList2.isEmpty() ? new ArrayList(ekhx.o(arrayList2)) : arrayList2;
    }

    private final Object c(Object obj) {
        return this.d.a(obj);
    }

    public final void b(Object obj, Object obj2) {
        synchronized (c(obj)) {
            if (ecat.a(a)) {
                List list = (List) this.j.get(obj);
                if (list != null && !list.isEmpty()) {
                    throw new IllegalStateException(a.J(obj, "Attempt to single-bind multibound object: "));
                }
                Map map = (Map) this.k.get(obj);
                if (map != null) {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        if (it.next() != e) {
                            throw new IllegalStateException(a.J(obj, "Attempt to single-bind an object that is already multibound with keys: "));
                        }
                    }
                }
            }
            Map map2 = this.i;
            Object obj3 = map2.get(obj);
            if (obj3 != null) {
                if (obj3 != e) {
                    throw new ebyw(a.c(obj3, obj, "Duplicate binding: ", ", "));
                }
                throw new ebyx(a.J(obj, "Bind call too late - someone already tried to get: "));
            }
            map2.put(obj, obj2);
        }
    }

    public ebyy(Context context) {
        this.i = DesugarCollections.synchronizedMap(new HashMap());
        this.j = DesugarCollections.synchronizedMap(new HashMap());
        this.k = DesugarCollections.synchronizedMap(new HashMap());
        this.l = DesugarCollections.synchronizedSet(new HashSet());
        this.b = new CopyOnWriteArrayList();
        this.m = new ThreadLocal();
        this.d = new ebzk();
        this.g = context;
        this.h = null;
        context.getClass().getName();
        b(Context.class, context);
    }
}
