package defpackage;

import android.content.ContentValues;
import android.util.Log;
import android.util.Pair;
import j$.util.Collection;
import j$.util.Map;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dquq implements dqur {
    public final ejxr a;
    private final Set b = new HashSet();

    public dquq(final Map map) {
        this.a = ejxx.a(new ejxr() { // from class: dqub
            @Override // defpackage.ejxr
            public final Object get() {
                final HashMap map2 = new HashMap();
                Map map3 = map;
                Collection.EL.stream(map3.entrySet()).forEach(new Consumer() { // from class: dqug
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        Map.Entry entry = (Map.Entry) obj;
                        String str = (String) ekis.h(ejxk.b('+').g((CharSequence) entry.getKey()), 0);
                        Map.EL.computeIfAbsent((java.util.Map) Map.EL.computeIfAbsent(map2, str, new Function() { // from class: dquc
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return new HashMap();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }), (String) ekis.h(ejxk.b('+').g((CharSequence) entry.getKey()), 1), new Function() { // from class: dqud
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return new HashSet();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                Collection.EL.stream(map3.entrySet()).forEach(new Consumer() { // from class: dquh
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        Map.Entry entry = (Map.Entry) obj;
                        List listI = ejxk.b('+').i((CharSequence) entry.getKey());
                        String str = (String) listI.get(0);
                        String str2 = (String) listI.get(1);
                        java.util.Map map4 = (java.util.Map) map2.get(str);
                        for (dqpo dqpoVar : (dqpo[]) entry.getValue()) {
                            if (dqpoVar.c() != null && !dqpoVar.c().e().equals(str2)) {
                                ((Set) map4.get(dqpoVar.c().e())).add(dqpoVar);
                            }
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return map2;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final dqtz j(dqsy dqsyVar, Predicate predicate, final dqsd dqsdVar) {
        ekgb ekgbVarN;
        ArrayList arrayList = new ArrayList();
        synchronized (dqru.a) {
            for (dqwl dqwlVar : this.b) {
                if (predicate.test(dqwlVar)) {
                    arrayList.add(dqwlVar);
                }
            }
        }
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            final dqwl dqwlVar2 = (dqwl) arrayList.get(i2);
            java.util.Map map = (java.util.Map) dqwl.a.get();
            synchronized (dqru.a) {
                ekgbVarN = ekgb.n((java.util.Collection) Collection.EL.stream(dqwlVar2.q).map(new Function() { // from class: dqux
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        ThreadLocal threadLocal = dqwl.a;
                        return (dqpi) ((Pair) obj).first;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: dqve
                    public final /* synthetic */ Predicate and(Predicate predicate2) {
                        return Predicate$CC.$default$and(this, predicate2);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate2) {
                        return Predicate$CC.$default$or(this, predicate2);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        ThreadLocal threadLocal = dqwl.a;
                        return true;
                    }
                }).collect(Collectors.toCollection(new dqvo())));
            }
            ekfw ekfwVar2 = new ekfw();
            int size2 = ekgbVarN.size();
            int i3 = 0;
            while (i3 < size2) {
                final dqpi dqpiVar = (dqpi) ekgbVarN.get(i3);
                Object objF = dqwl.F(new Supplier() { // from class: dqvy
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        dqpi dqpiVar2 = dqpiVar;
                        try {
                            return dqpiVar2.d(dqwlVar2, dqsdVar);
                        } catch (Throwable th) {
                            ((ekrd) ((ekrd) dqwl.c.a(Level.SEVERE).g(th)).h("com/google/android/libraries/databaseannotations/support/QueryBase", "notifyPreChangeListeners", 1010, "QueryBase.java")).t("got exception invoking preChangeInTransaction on %s", dqpiVar2);
                            throw th;
                        }
                    }
                });
                ArrayList arrayList2 = arrayList;
                ((ekrd) dqwl.c.a(dqwl.d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "notifyPreChangeListeners", 1015, "QueryBase.java")).B("preChangeInTransactionWithObject; table: %s; cl: %s", dqwl.aa(((dqoy) dqwlVar2.e).a), dqpiVar.h);
                List list = (List) Map.EL.computeIfAbsent(map, dqpiVar, new Function() { // from class: dqvz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        ThreadLocal threadLocal = dqwl.a;
                        return new ArrayList();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                list.add(objF);
                ekfwVar2.h(new dqow(dqwlVar2, dqpiVar, list.size() - 1, list));
                i3++;
                arrayList = arrayList2;
                size = size;
            }
            ekfwVar.h(ekfwVar2.g());
            i2++;
            arrayList = arrayList;
        }
        return new dqum(dqsyVar, ekfwVar.g(), dqsdVar);
    }

    private static final void k(int i) {
        if (i == 2) {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                Log.i("D26R", ">>> ".concat(String.valueOf(String.valueOf(stackTraceElement))));
            }
        }
    }

    @Override // defpackage.dqur
    public final dqtz a(final dqsy dqsyVar, final String str, final dqyj dqyjVar) {
        Integer numA = dqrt.a(str);
        if (numA != null) {
            Log.i("D26R", "DELETE FROM " + str + " WHERE " + dqyjVar.a(dqxp.b()));
            k(numA.intValue());
        }
        return j(dqsyVar, new Predicate() { // from class: dquj
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                dqwl dqwlVar = (dqwl) obj;
                String str2 = str;
                return (dqwlVar.R(str2) && !dqwlVar.T(Arrays.asList(dqyjVar))) || this.a.e(dqsyVar, str2, dqwlVar, null);
            }
        }, new dqun(dqyjVar));
    }

    @Override // defpackage.dqur
    public final dqtz b(final dqsy dqsyVar, final String str, final dqyd dqydVar) {
        Integer numA = dqrt.a(str);
        if (numA != null) {
            ArrayList arrayList = new ArrayList();
            String strJ = dqydVar.j(dqxp.b(), arrayList);
            StringBuilder sb = new StringBuilder();
            dqyh dqyhVar = dqydVar.d;
            sb.append("UPDATE ");
            sb.append(dqydVar.c);
            dqyg dqygVar = ((dqpb) dqyhVar).h;
            if (dqygVar != null) {
                dqyd.q(sb, dqyhVar);
                dqyd.r(sb, dqygVar);
            } else {
                sb.append(" SET ");
                sb.append(dqydVar.l(null));
                sb.append(" WHERE ");
                sb.append(strJ);
                sb.append("\nARGS:\n");
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    sb.append(";");
                }
            }
            Log.i("D26R", a.n(sb.toString(), str, "UPDATE ", " "));
            k(numA.intValue());
        }
        return j(dqsyVar, new Predicate() { // from class: dquf
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                dqwl dqwlVar = (dqwl) obj;
                dqyd dqydVar2 = dqydVar;
                ContentValues contentValues = dqydVar2.a;
                Set<String> setKeySet = contentValues.keySet();
                String[] strArr = (String[]) setKeySet.toArray(new String[0]);
                dqpu dqpuVar = dqwlVar.p;
                String str2 = str;
                if (dqpuVar.c(str2, strArr) && !dqwlVar.T(dqydVar2.e)) {
                    return true;
                }
                if (dqwlVar.o().c(str2, (String[]) contentValues.keySet().toArray(new String[0]))) {
                    return true;
                }
                return this.a.e(dqsyVar, str2, dqwlVar, (List) Collection.EL.stream(setKeySet).collect(Collectors.toList()));
            }
        }, new dquo(dqydVar));
    }

    @Override // defpackage.dqur
    public final void c(dqwl dqwlVar) {
        synchronized (dqru.a) {
            this.b.remove(dqwlVar);
        }
    }

    public final boolean d(final String str, final String str2, final List list, final List list2) {
        Set set;
        java.util.Map map = (java.util.Map) ((java.util.Map) this.a.get()).get(str);
        if (map == null || (set = (Set) map.get(str2)) == null) {
            return false;
        }
        return Collection.EL.stream(set).anyMatch(new Predicate() { // from class: dqui
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                dqpo dqpoVarC;
                dqpo dqpoVar = (dqpo) obj;
                String strE = dqpoVar.e();
                List list3 = list;
                boolean zContains = list3.contains(strE);
                dquq dquqVar = this.a;
                String str3 = str;
                if (zContains) {
                    List list4 = list2;
                    String str4 = str2;
                    Set<dqpo> set2 = (Set) ((java.util.Map) ((java.util.Map) dquqVar.a.get()).get(str3)).get(str4);
                    if (list4 == null) {
                        return true;
                    }
                    for (dqpo dqpoVar2 : set2) {
                        if (dqpoVar2.g() && (dqpoVarC = dqpoVar2.c()) != null && dqpoVarC.e().equals(str4) && list4.contains(dqpoVarC.d())) {
                            return true;
                        }
                    }
                }
                return dquqVar.d(str3, dqpoVar.e(), list3, null);
            }
        });
    }

    public final boolean e(dqsy dqsyVar, String str, dqwl dqwlVar, List list) {
        List list2 = (List) Collection.EL.stream(dqwlVar.m.a).collect(Collectors.toList());
        list2.add(dqwlVar.o);
        return ((dqoy) dqwlVar.e).A && d(((dqom) dqsyVar.j()).b, str, list2, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqur
    public final boolean f(String str, ContentValues contentValues, dqwl dqwlVar) {
        ekgb ekgbVar = ((dqoy) dqwlVar.e).h;
        if (ekgbVar != null) {
            int i = 0;
            while (i < ((ekoe) ekgbVar).c) {
                boolean zE = ((dqyj) ekgbVar.get(i)).e(str, contentValues);
                i++;
                if (zE) {
                    return true;
                }
            }
        }
        ekgb ekgbVarC = dqwlVar.m.c();
        int i2 = ((ekoe) ekgbVarC).c;
        int i3 = 0;
        while (i3 < i2) {
            boolean zF = f(str, contentValues, ((dqth) ekgbVarC.get(i3)).a);
            i3++;
            if (zF) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dqur
    public final dqtz g(dqsy dqsyVar, final String str, dqsd dqsdVar) {
        Integer numA = dqrt.a(str);
        if (numA != null) {
            dqpd[] dqpdVarArr = ((dqrm) dqsdVar).a;
            Log.i("D26R", "BULK INSERT " + str + " " + dqpdVarArr.length);
            for (int i = 0; i < dqpdVarArr.length; i++) {
                Log.i("D26R", "  @" + i + " BINDDATA: " + dqpdVarArr[i].a());
            }
            k(numA.intValue());
        }
        return j(dqsyVar, new Predicate() { // from class: dquk
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((dqwl) obj).R(str);
            }
        }, dqsdVar);
    }

    @Override // defpackage.dqur
    public final dqtz h(dqsy dqsyVar, final String str, dqpd dqpdVar) {
        Integer numA = dqrt.a(str);
        if (numA != null) {
            Log.i("D26R", "INSERT " + str + " " + dqpdVar.a());
            k(numA.intValue());
        }
        final ContentValues contentValues = new ContentValues();
        dqpdVar.b(contentValues);
        return j(dqsyVar, new Predicate() { // from class: dque
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                dqwl dqwlVar = (dqwl) obj;
                String str2 = str;
                if (dqwlVar.R(str2)) {
                    return !this.a.f(str2, contentValues, dqwlVar);
                }
                return false;
            }
        }, new dqup(dqpdVar));
    }

    @Override // defpackage.dqur
    public final void i(dqwl dqwlVar) {
        boolean zContains;
        Object obj = dqru.a;
        synchronized (obj) {
            dqwlVar.n();
            dqwlVar.o();
            synchronized (obj) {
                zContains = this.b.contains(dqwlVar);
            }
        }
        if (zContains) {
            return;
        }
        this.b.add(dqwlVar);
    }
}
