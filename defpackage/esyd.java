package defpackage;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter$1;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters$29;
import com.google.gson.internal.bind.TypeAdapters$30;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esyd {
    static final esxx a = esxx.a;
    static final int d = 1;
    static final int e = 1;
    static final int f = 2;
    public static final /* synthetic */ int g = 0;
    final List b;
    final esxx c;
    private final ThreadLocal h;
    private final ConcurrentMap i;
    private final eszu j;
    private final JsonAdapterAnnotationTypeAdapterFactory k;

    static {
        try {
            Class.forName("evuh");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public esyd() {
        Excluder excluder = Excluder.a;
        int i = d;
        Map map = Collections.EMPTY_MAP;
        esxx esxxVar = a;
        List list = Collections.EMPTY_LIST;
        List list2 = Collections.EMPTY_LIST;
        this(excluder, i, map, esxxVar, Collections.EMPTY_LIST, e, f, Collections.EMPTY_LIST);
    }

    static void l(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static final etdb n(Reader reader) {
        etdb etdbVar = new etdb(reader);
        etdbVar.u(2);
        return etdbVar;
    }

    public static final void o(esyj esyjVar, etdd etddVar) {
        int i = etddVar.d;
        boolean z = etddVar.b;
        boolean z2 = etddVar.c;
        etddVar.b = true;
        etddVar.c = false;
        if (i == 2) {
            etddVar.d(1);
        }
        try {
            try {
                etas.b(esyjVar, etddVar);
            } catch (IOException e2) {
                throw new esyk(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.12.1): " + e3.getMessage(), e3);
            }
        } finally {
            etddVar.d(i);
            etddVar.b = z;
            etddVar.c = z2;
        }
    }

    public final esyv a(etcz etczVar) {
        boolean z;
        esyv esyvVar = (esyv) this.i.get(etczVar);
        if (esyvVar != null) {
            return esyvVar;
        }
        ThreadLocal threadLocal = this.h;
        Map map = (Map) threadLocal.get();
        boolean z2 = false;
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            esyv esyvVar2 = (esyv) map.get(etczVar);
            if (esyvVar2 != null) {
                return esyvVar2;
            }
            z = false;
        }
        try {
            esyc esycVar = new esyc();
            map.put(etczVar, esycVar);
            Iterator it = this.b.iterator();
            esyv esyvVarA = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                esyvVarA = ((esyw) it.next()).a(this, etczVar);
                if (esyvVarA != null) {
                    if (esycVar.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    esycVar.a = esyvVarA;
                    map.put(etczVar, esyvVarA);
                }
            }
            if (z) {
                this.h.remove();
                z2 = true;
            }
            if (esyvVarA == null) {
                throw new IllegalArgumentException("GSON (2.12.1) cannot handle ".concat(etczVar.toString()));
            }
            if (z2) {
                this.i.putAll(map);
            }
            return esyvVarA;
        } catch (Throwable th) {
            if (z) {
                this.h.remove();
            }
            throw th;
        }
    }

    public final esyv b(Class cls) {
        return a(new etcz(cls));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.esyv c(defpackage.esyw r5, defpackage.etcz r6) {
        /*
            r4 = this;
            esyw r0 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.a
            if (r5 != r0) goto L5
            goto L36
        L5:
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r0 = r4.k
            java.lang.Class r1 = r6.a
            java.util.concurrent.ConcurrentMap r2 = r0.c
            java.lang.Object r2 = r2.get(r1)
            esyw r2 = (defpackage.esyw) r2
            if (r2 == 0) goto L16
            if (r2 != r5) goto L38
            goto L36
        L16:
            esyy r2 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.d(r1)
            if (r2 == 0) goto L38
            java.lang.Class r2 = r2.a()
            java.lang.Class<esyw> r3 = defpackage.esyw.class
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L38
            eszu r3 = r0.b
            java.lang.Object r2 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.e(r3, r2)
            esyw r2 = (defpackage.esyw) r2
            esyw r0 = r0.c(r1, r2)
            if (r0 != r5) goto L38
        L36:
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r5 = r4.k
        L38:
            java.util.List r0 = r4.b
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L3f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L58
            java.lang.Object r2 = r0.next()
            esyw r2 = (defpackage.esyw) r2
            if (r1 != 0) goto L51
            if (r2 != r5) goto L3f
            r1 = 1
            goto L3f
        L51:
            esyv r2 = r2.a(r4, r6)
            if (r2 == 0) goto L3f
            return r2
        L58:
            if (r1 != 0) goto L5f
            esyv r5 = r4.a(r6)
            return r5
        L5f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "GSON cannot serialize or deserialize "
            java.lang.String r6 = r0.concat(r6)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esyd.c(esyw, etcz):esyv");
    }

    public final etdd d(Writer writer) {
        etdd etddVar = new etdd(writer);
        etddVar.b(this.c);
        etddVar.b = true;
        etddVar.d(2);
        etddVar.c = false;
        return etddVar;
    }

    public final Object e(etdb etdbVar, etcz etczVar) {
        int i = etdbVar.i;
        boolean z = true;
        if (i == 2) {
            etdbVar.u(1);
        }
        try {
            try {
                try {
                    try {
                        etdbVar.t();
                        try {
                            esyv esyvVarA = a(etczVar);
                            Object objA = esyvVarA.a(etdbVar);
                            Class cls = etczVar.a;
                            Class cls2 = cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
                            if (objA != null && !cls2.isInstance(objA)) {
                                throw new ClassCastException("Type adapter '" + esyvVarA.toString() + "' returned wrong type; requested " + String.valueOf(cls) + " but got instance of " + String.valueOf(objA.getClass()) + "\nVerify that the adapter was registered for the correct type.");
                            }
                            return objA;
                        } catch (EOFException e2) {
                            e = e2;
                            z = false;
                            if (!z) {
                                throw new esyr(e);
                            }
                            etdbVar.u(i);
                            return null;
                        }
                    } finally {
                        etdbVar.u(i);
                    }
                } catch (AssertionError e3) {
                    throw new AssertionError("AssertionError (GSON 2.12.1): " + e3.getMessage(), e3);
                }
            } catch (EOFException e4) {
                e = e4;
            }
        } catch (IOException e5) {
            throw new esyr(e5);
        } catch (IllegalStateException e6) {
            throw new esyr(e6);
        }
    }

    public final Object f(Reader reader, etcz etczVar) {
        etdb etdbVarN = n(reader);
        Object objE = e(etdbVarN, etczVar);
        if (objE != null) {
            try {
                if (etdbVarN.t() != 10) {
                    throw new esyr("JSON document was not fully consumed.");
                }
            } catch (etde e2) {
                throw new esyr(e2);
            } catch (IOException e3) {
                throw new esyk(e3);
            }
        }
        return objE;
    }

    public final Object g(Reader reader, Class cls) {
        return f(reader, new etcz(cls));
    }

    public final Object h(String str, etcz etczVar) {
        if (str == null) {
            return null;
        }
        return f(new StringReader(str), etczVar);
    }

    public final Object i(String str, Class cls) {
        return h(str, new etcz(cls));
    }

    public final Object j(String str, Type type) {
        return h(str, new etcz(type));
    }

    public final String k(Object obj) {
        if (obj == null) {
            esyl esylVar = esyl.a;
            StringWriter stringWriter = new StringWriter();
            try {
                o(esylVar, d(stringWriter));
                return stringWriter.toString();
            } catch (IOException e2) {
                throw new esyk(e2);
            }
        }
        StringWriter stringWriter2 = new StringWriter();
        try {
            m(obj, obj.getClass(), d(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e3) {
            throw new esyk(e3);
        }
    }

    public final void m(Object obj, Type type, etdd etddVar) {
        esyv esyvVarA = a(new etcz(type));
        int i = etddVar.d;
        if (i == 2) {
            etddVar.d(1);
        }
        boolean z = etddVar.b;
        boolean z2 = etddVar.c;
        etddVar.b = true;
        etddVar.c = false;
        try {
            try {
                esyvVarA.b(etddVar, obj);
            } catch (IOException e2) {
                throw new esyk(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.12.1): " + e3.getMessage(), e3);
            }
        } finally {
            etddVar.d(i);
            etddVar.b = z;
            etddVar.c = z2;
        }
    }

    public final String toString() {
        eszu eszuVar = this.j;
        return "{serializeNulls:false,factories:" + String.valueOf(this.b) + ",instanceCreators:" + eszuVar.toString() + "}";
    }

    public esyd(Excluder excluder, int i, Map map, esxx esxxVar, List list, int i2, int i3, List list2) {
        this.h = new ThreadLocal();
        this.i = new ConcurrentHashMap();
        eszu eszuVar = new eszu(map, list2);
        this.j = eszuVar;
        this.c = esxxVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(etcq.U);
        arrayList.add(i2 == 1 ? etbf.a : new ObjectTypeAdapter$1(0));
        arrayList.add(excluder);
        arrayList.addAll(list);
        arrayList.add(etcq.A);
        arrayList.add(etcq.m);
        arrayList.add(etcq.g);
        arrayList.add(etcq.i);
        arrayList.add(etcq.k);
        esyv esyvVar = etcq.t;
        arrayList.add(new TypeAdapters$30(Long.TYPE, Long.class, esyvVar));
        arrayList.add(new TypeAdapters$30(Double.TYPE, Double.class, new esxy()));
        arrayList.add(new TypeAdapters$30(Float.TYPE, Float.class, new esxz()));
        arrayList.add(i3 == 2 ? etbe.a : etbe.c(i3));
        arrayList.add(etcq.o);
        arrayList.add(etcq.q);
        arrayList.add(new TypeAdapters$29(AtomicLong.class, new esya(esyvVar).d()));
        arrayList.add(new TypeAdapters$29(AtomicLongArray.class, new esyb(esyvVar).d()));
        arrayList.add(etcq.s);
        arrayList.add(etcq.v);
        arrayList.add(etcq.C);
        arrayList.add(etcq.E);
        arrayList.add(new TypeAdapters$29(BigDecimal.class, etcq.x));
        arrayList.add(new TypeAdapters$29(BigInteger.class, etcq.y));
        arrayList.add(new TypeAdapters$29(etad.class, etcq.z));
        arrayList.add(etcq.G);
        arrayList.add(etcq.I);
        arrayList.add(etcq.M);
        arrayList.add(etcq.O);
        arrayList.add(etcq.S);
        arrayList.add(etcq.K);
        arrayList.add(etcq.d);
        arrayList.add(DefaultDateTypeAdapter.a);
        arrayList.add(etcq.Q);
        if (etcy.a) {
            arrayList.add(etcy.c);
            arrayList.add(etcy.b);
            arrayList.add(etcy.d);
        }
        arrayList.add(ArrayTypeAdapter.a);
        arrayList.add(etcq.b);
        arrayList.add(new CollectionTypeAdapterFactory(eszuVar));
        arrayList.add(new MapTypeAdapterFactory(eszuVar));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(eszuVar);
        this.k = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(etcq.V);
        arrayList.add(new ReflectiveTypeAdapterFactory(eszuVar, i, excluder, jsonAdapterAnnotationTypeAdapterFactory, list2));
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }
}
