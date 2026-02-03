package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.dqpd;
import defpackage.dqpo;
import defpackage.dqqj;
import defpackage.dqru;
import defpackage.dqwl;
import defpackage.dqws;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqwl<C extends dqqj<C, Q, B, D, RT>, Q extends dqwl<C, Q, B, D, RT>, B extends dqws<C, Q, B, D, RT>, D extends dqpd<C, Q, B, D, RT>, RT extends dqpo<RT>> implements dqxe {
    public static final ThreadLocal a = new dqwd();
    protected static final Pattern b = Pattern.compile("%([a-zA-Z_][a-zA-Z_0-9]+)%");
    public static final ekrg c = ekrg.c("com/google/android/libraries/databaseannotations/support/QueryBase");
    public static final Level d = Level.FINEST;
    public final dqwv e;
    protected final Map f;
    protected final Supplier g;
    protected final Supplier h;
    public final List i;
    public final String[] j;
    public final String k;
    public final String[] l;
    public final dqtm m;
    public final String n;
    public final String o;
    public dqpu p;
    public final List q = new CopyOnWriteArrayList();
    public CancellationSignal r;
    private final String s;
    private final String t;
    private final String u;
    private dqpu v;

    /* JADX WARN: Multi-variable type inference failed */
    protected dqwl(dqwv dqwvVar) {
        this.e = dqwvVar;
        dqtm dqtmVar = new dqtm(dqxp.b(), dqwvVar, S());
        this.m = dqtmVar;
        this.f = ((dqru.a) ehli.a(dqru.b, dqru.a.class)).fJ();
        dqoj dqojVar = (dqoj) dqru.c;
        this.g = dqojVar.i;
        this.h = dqojVar.g;
        ae(dqtmVar, new HashSet());
        this.l = X(dqxp.b());
        dqoy dqoyVar = (dqoy) dqwvVar;
        String strG = g(dqoyVar.n);
        this.s = strG;
        String strG2 = g(dqoyVar.m);
        this.t = strG2;
        this.u = g(dqoyVar.k);
        this.o = g(dqoyVar.a);
        if (!TextUtils.isEmpty(strG) && !TextUtils.isEmpty(strG2)) {
            this.n = strG + ", " + strG2;
        } else if (!TextUtils.isEmpty(strG2)) {
            this.n = strG2;
        } else {
            if (!TextUtils.isEmpty(strG)) {
                throw new IllegalStateException("offset requires limit");
            }
            this.n = null;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        if (dqoyVar.p.isEmpty()) {
            sb.append(K(arrayList));
        } else {
            Y(sb, K(arrayList));
        }
        if (!TextUtils.isEmpty(dqoyVar.j)) {
            sb.append(" ORDER BY ");
            sb.append(dqru.o(g(dqoyVar.j)));
        }
        dqsb dqsbVar = dqoyVar.t;
        if (dqsbVar != null && !dqsbVar.c()) {
            String string = dqsbVar.toString();
            string = string.startsWith("+") ? string.substring(1) : string;
            sb.append("/* ");
            sb.append(string);
            sb.append(" */");
        }
        this.k = sb.toString();
        this.j = (String[]) arrayList.toArray(new String[0]);
        ArrayList arrayList2 = new ArrayList();
        this.i = arrayList2;
        ekgb ekgbVar = dqoyVar.f;
        ekgb ekgbVar2 = dqoyVar.r;
        if (ekgbVar != null) {
            arrayList2.addAll(ekgbVar);
        }
        int i = ((ekoe) ekgbVar2).c;
        for (int i2 = 0; i2 < i; i2++) {
            ekgb ekgbVar3 = ((dqoy) ((dqth) ekgbVar2.get(i2)).a.e).f;
            if (ekgbVar3 != null) {
                arrayList2.addAll(ekgbVar3);
            }
        }
    }

    public static Object F(Supplier supplier) {
        dqwk dqwkVar = new dqwk();
        try {
            Object obj = supplier.get();
            dqwkVar.close();
            return obj;
        } catch (Throwable th) {
            try {
                dqwkVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected static final void Y(StringBuilder sb, String str) {
        sb.append("SELECT * FROM (");
        sb.append(str);
        sb.append(")");
    }

    static String aa(String str) {
        return str.length() <= 25 ? str : str.substring(0, 25);
    }

    public static final Cursor ab(dqsy dqsyVar, String str, String[] strArr, dqwv dqwvVar) {
        return dqsyVar.f(str, strArr, dqwvVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List ac(dqxp dqxpVar, List list, boolean z, List list2) {
        ekgb ekgbVar = ((dqoy) this.e).f;
        if (ekgbVar != null) {
            Context context = dqru.b;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            ekqh it = ekgbVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((dqxe) it.next()).ai(dqxpVar));
            }
            list = arrayList;
        }
        ekgb ekgbVarC = this.m.c();
        int i = ((ekoe) ekgbVarC).c;
        for (int i2 = 0; i2 < i; i2++) {
            list = ((dqth) ekgbVarC.get(i2)).a.ac(dqxpVar, list, z, list2);
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ad(final dqtm dqtmVar, dqxp dqxpVar, List list) {
        ekgb ekgbVarC = this.m.c();
        int i = ((ekoe) ekgbVarC).c;
        for (int i2 = 0; i2 < i; i2++) {
            dqth dqthVar = (dqth) ekgbVarC.get(i2);
            dqxpVar.c();
            if (!dqxpVar.e) {
                if (dqtmVar.b) {
                    dqwj dqwjVarA = dqxpVar.a();
                    String str = dqthVar.a.o;
                    Object objApply = dqwjVarA.apply(str);
                    String str2 = dqthVar.e;
                    list.add("COUNT(" + ((String) objApply) + ".rowid) AS " + str2 + "_count");
                    list.add("group_concat(quote(" + ((String) dqxpVar.a().apply(str)) + ".rowid), '|') AS " + str2 + "_rowid");
                } else {
                    String str3 = dqthVar.e;
                    list.add(a.a(str3, "1 AS ", "_count"));
                    list.add(((String) dqxpVar.a().apply(dqthVar.a.o)) + ".rowid AS " + str3 + "_rowid");
                }
            }
            dqthVar.h = list.size() - 2;
            dqwl dqwlVar = dqthVar.a;
            list.addAll((Collection) Collection.EL.stream(dqwlVar.L(dqxpVar)).map(new Function() { // from class: dqvh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str4 = (String) obj;
                    ThreadLocal threadLocal = dqwl.a;
                    return dqtmVar.b ? a.a(str4, "group_concat(quote(", "), '|')") : str4;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: dqvi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str4 = (String) obj;
                    return this.a.V() ? dqru.n(str4) : str4;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new dqvo())));
            dqwlVar.ad(dqtmVar, dqxpVar, list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void ae(dqtm dqtmVar, Set set) {
        ekgb ekgbVarC = dqtmVar.c();
        int i = ((ekoe) ekgbVarC).c;
        for (int i2 = 0; i2 < i; i2++) {
            dqth dqthVar = (dqth) ekgbVarC.get(i2);
            String str = dqthVar.e;
            if (set.contains(str)) {
                throw new IllegalArgumentException("duplicate tag: ".concat(String.valueOf(str)));
            }
            set.add(str);
            ae(dqthVar.a.m, set);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void af(final dqxp dqxpVar, boolean z, final List list, StringBuilder sb) {
        String strB;
        if (z) {
            strB = G(dqxpVar);
        } else {
            ejwc ejwcVar = new ejwc(" AND ");
            dqwv dqwvVar = this.e;
            strB = ejwcVar.b(ekjz.g(((dqoy) dqwvVar).h, new ejvr() { // from class: dqvf
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ThreadLocal threadLocal = dqwl.a;
                    return ((dqyj) obj).b(dqxpVar, list);
                }
            }));
        }
        dqxpVar.c();
        if (!strB.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(" AND ");
            }
            sb.append(strB);
        }
        ekgb ekgbVarC = this.m.c();
        int i = ((ekoe) ekgbVarC).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((dqth) ekgbVarC.get(i2)).a.af(dqxpVar, z, list, sb);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ag(dqxp dqxpVar, AtomicReference atomicReference) {
        String str = this.u;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str) && atomicReference.getAndSet(dqtm.a(dqxpVar.b).apply(str)) != null) {
            throw new IllegalArgumentException("multiple group bys");
        }
        ekgb ekgbVarC = this.m.c();
        int i = ((ekoe) ekgbVarC).c;
        for (int i2 = 0; i2 < i; i2++) {
            dqth dqthVar = (dqth) ekgbVarC.get(i2);
            dqxpVar.b++;
            dqthVar.a.ag(dqxpVar, atomicReference);
        }
    }

    private final boolean ah(dqpi dqpiVar) {
        for (Pair pair : this.q) {
            if (pair.first == dqpiVar) {
                ((ekrd) c.a(d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "incrementExistingListener", 873, "QueryBase.java")).B("addChangeListener: %s %s (INCREMENT <<<<<<)", aa(((dqoy) this.e).a), dqpiVar.h);
                ((AtomicInteger) pair.second).incrementAndGet();
                return true;
            }
        }
        return false;
    }

    private final String g(String str) {
        ekgp ekgpVar;
        if (str == null || (ekgpVar = ((dqoy) this.e).q) == null || ekgpVar.isEmpty()) {
            return str;
        }
        Matcher matcher = b.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        do {
            String strGroup = matcher.group(1);
            String str2 = (String) ekgpVar.get(strGroup);
            if (str2 == null && !ekgpVar.containsKey(strGroup)) {
                throw new IllegalStateException("no substitution for ".concat(String.valueOf(strGroup)));
            }
            if (str2 == null) {
                str2 = "0";
            }
            matcher.appendReplacement(stringBuffer, str2);
        } while (matcher.find());
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public final ekgb A(dqqd dqqdVar) {
        return r().cY(dqqdVar);
    }

    public final ekgb B(final Supplier supplier) {
        ejxr ejxrVar = new ejxr() { // from class: dqvn
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.r().cZ(supplier);
            }
        };
        if (!((Boolean) ((dqoj) dqru.c).k.get()).booleanValue() || ((dqoy) this.e).z) {
            return (ekgb) ejxrVar.get();
        }
        dqru.L();
        J();
        return (ekgb) dqyt.a(ejxrVar);
    }

    public final ListenableFuture C(final Supplier supplier) {
        return s().m().h(new ejvr() { // from class: dquz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ThreadLocal threadLocal = dqwl.a;
                return supplier.get();
            }
        }, (Executor) this.h.get());
    }

    public final ListenableFuture D() {
        return C(new Supplier() { // from class: dqva
            @Override // java.util.function.Supplier
            public final Object get() {
                return Integer.valueOf(this.a.h());
            }
        });
    }

    public final Stream E() {
        return r().da();
    }

    protected final String G(final dqxp dqxpVar) {
        return new ejwc(" AND ").b(ekjz.g(((dqoy) this.e).h, new ejvr() { // from class: dqvw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ThreadLocal threadLocal = dqwl.a;
                return ((dqyj) obj).a(dqxpVar);
            }
        }));
    }

    public final String H(dqxp dqxpVar, boolean z, List list) {
        return I(dqxpVar, z, list, ekgb.n(ac(dqxpVar, Arrays.asList(X(dqxpVar)), z, list)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final String I(dqxp dqxpVar, boolean z, List list, ekgb ekgbVar) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        dqxpVar.b = 0;
        af(dqxpVar, z, list, sb);
        int length = sb.length();
        dqoy dqoyVar = (dqoy) this.e;
        String str = dqoyVar.g;
        if (!TextUtils.isEmpty(str)) {
            if (length != 0) {
                sb.append(" AND ");
            }
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(e()));
        String str2 = this.o;
        arrayList.add(str2);
        int size = arrayList.size();
        dqxpVar.b = 0;
        dqtm dqtmVar = this.m;
        arrayList.addAll(dqtmVar.a);
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            int i3 = i;
            String str3 = (String) arrayList.get(i2);
            size--;
            if (size < 0) {
                dqxpVar.c();
            }
            ArrayList arrayList2 = arrayList;
            if (!dqoyVar.o.booleanValue()) {
                Map map = this.f;
                if (map.containsKey(str3)) {
                    if (sb.length() != 0) {
                        sb.append(" AND ");
                    }
                    sb.append("(");
                    sb.append(cdpj.a().a(dqxpVar));
                    sb.append(")");
                }
            }
            i2++;
            arrayList = arrayList2;
            i = i3;
        }
        int i4 = i;
        if (sb.length() == 0) {
            sb.append("1");
        }
        String strG = g(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT ");
        if (dqoyVar.b) {
            sb2.append("DISTINCT ");
        }
        new ejwc(",").i(sb2, ekgbVar);
        sb2.append(" FROM ");
        sb2.append(str2);
        String str4 = dqoyVar.e;
        if (str4 != null) {
            sb2.append(" INDEXED BY ");
            sb2.append(str4);
        }
        String str5 = dqoyVar.v;
        if (str5 != null) {
            sb2.append(" AS ");
            sb2.append(str5);
        }
        sb2.append(" ");
        dqxpVar.b = 1;
        O(dqxpVar, sb2, dqtm.a(i4), dqtmVar, dqtmVar.c());
        if (!TextUtils.isEmpty(strG)) {
            sb2.append("WHERE ");
            sb2.append(g(strG));
            sb2.append(" ");
        }
        dqxpVar.b = i4;
        AtomicReference atomicReference = new AtomicReference(null);
        ag(dqxpVar, atomicReference);
        String str6 = (String) atomicReference.get();
        sb2.append(str6 == null ? "" : a.a(str6, "GROUP BY ", " "));
        dqxe dqxeVar = dqoyVar.l;
        if (dqxeVar != null) {
            sb2.append("HAVING ");
            sb2.append(((dqxl) dqxeVar).ai(dqxpVar));
            sb2.append(" ");
        }
        dqxe dqxeVar2 = dqoyVar.i;
        String strG2 = dqxeVar2 != null ? g(dqxeVar2.ai(dqxpVar)) : null;
        if (!TextUtils.isEmpty(strG2)) {
            sb2.append("ORDER BY ");
            sb2.append(strG2);
            sb2.append(" ");
        }
        String str7 = this.t;
        if (!TextUtils.isEmpty(str7)) {
            sb2.append("LIMIT ");
            sb2.append(str7);
            sb2.append(" ");
        }
        String str8 = dqoyVar.n;
        if (!TextUtils.isEmpty(str8)) {
            sb2.append("OFFSET ");
            sb2.append(str8);
            sb2.append(" ");
        }
        ekgb ekgbVar2 = dqoyVar.p;
        if (!ekgbVar2.isEmpty()) {
            int length2 = this.l.length;
            String string = sb2.toString();
            sb2.setLength(0);
            Y(sb2, string);
            int i5 = ((ekoe) ekgbVar2).c;
            for (int i6 = 0; i6 < i5; i6++) {
                dqwl dqwlVar = (dqwl) ekgbVar2.get(i6);
                if (dqwlVar.X(dqxpVar).length != length2) {
                    throw new IllegalStateException("all queries in union must have the same size projection");
                }
                sb2.append(" UNION ");
                Y(sb2, dqwlVar.H(dqxpVar, z, list));
            }
        }
        return sb2.toString().trim();
    }

    public final String J() {
        return H(new dqxp(this.m, this.e, false), true, null);
    }

    public final String K(List list) {
        return H(new dqxp(this.m, this.e, false), false, list);
    }

    final List L(dqxp dqxpVar) {
        dqwv dqwvVar = this.e;
        final boolean zV = V();
        dqoy dqoyVar = (dqoy) dqwvVar;
        if (dqoyVar.u) {
            return new ArrayList();
        }
        ekgb ekgbVar = dqoyVar.d;
        if (ekgbVar == null || ekgbVar.isEmpty()) {
            ekgbVar = dqoyVar.c;
        }
        Stream stream = Collection.EL.stream(ekgbVar);
        final int i = dqxpVar.b;
        return (List) stream.map(i == 0 ? new Function() { // from class: dqti
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) obj;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        } : new Function() { // from class: dqtj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return "JT_" + i + "_" + ((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: dqwc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str = (String) obj;
                ThreadLocal threadLocal = dqwl.a;
                return zV ? dqru.n(str) : str;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new dqvo()));
    }

    public final void M(final dqpi dqpiVar) {
        synchronized (dqru.a) {
            if (ah(dqpiVar)) {
                return;
            }
            ((ekrd) c.a(d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "addChangeListener", 832, "QueryBase.java")).B("addChangeListener: %s %s", aa(((dqoy) this.e).a), dqpiVar.h);
            this.q.add(Pair.create(dqpiVar, new AtomicInteger(1)));
            dqua.b(this);
            if (dqpiVar.i != null) {
                Runnable runnable = new Runnable() { // from class: dqvp
                    @Override // java.lang.Runnable
                    public final void run() {
                        dqsy dqsyVarS = this.a.s();
                        dqsb dqsbVar = new dqsb("add-change-listener");
                        ejxr ejxrVar = new ejxr() { // from class: dqvv
                            @Override // defpackage.ejxr
                            public final Object get() {
                                ThreadLocal threadLocal = dqwl.a;
                                return null;
                            }
                        };
                        dqsw dqswVarC = dqsx.c();
                        dqswVarC.c(true);
                    }
                };
                Supplier supplier = this.g;
                eiju.g(eork.l(runnable, (Executor) supplier.get())).h(new ejvr() { // from class: dqvq
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        dqpi dqpiVar2 = dqpiVar;
                        Consumer consumer = dqpiVar2.i;
                        if (consumer == null) {
                            return null;
                        }
                        consumer.z(Pair.create(this.a, dqpiVar2));
                        return null;
                    }
                }, (Executor) supplier.get());
            }
        }
    }

    public final void N(lvc lvcVar, dqpi dqpiVar) {
        synchronized (dqru.a) {
            if (ah(dqpiVar)) {
                return;
            }
            ((ekrd) c.a(d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "addChangeListener", 903, "QueryBase.java")).B("addChangeListener: %s %s (LIFECYCLE)", aa(((dqoy) this.e).a), dqpiVar.h);
            this.q.add(Pair.create(dqpiVar, new AtomicInteger(0)));
            dqua.a().i(this);
            if (lvcVar != null) {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new IllegalStateException("cannot add observable query with lifecycle from other than main thread");
                }
                lvcVar.c(new dqwe(this, dqpiVar));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void O(dqxp dqxpVar, StringBuilder sb, dqwj dqwjVar, dqtm dqtmVar, ekgb ekgbVar) {
        dqxp dqxpVar2 = dqxpVar;
        StringBuilder sb2 = sb;
        int i = 0;
        while (i < ((ekoe) ekgbVar).c) {
            dqth dqthVar = (dqth) ekgbVar.get(i);
            dqwl dqwlVar = dqthVar.a;
            String str = dqwlVar.o;
            dqwj dqwjVarA = dqtm.a(dqxpVar2.b);
            dqtmVar.e(dqthVar.e);
            int i2 = dqthVar.i;
            Context context = dqru.b;
            int i3 = i2 - 1;
            sb2.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? "JOIN" : "INNER JOIN" : "LEFT OUTER JOIN" : "LEFT JOIN");
            sb2.append(" ");
            sb2.append(str);
            sb2.append(" AS ");
            sb2.append((String) dqwjVarA.apply(str));
            sb2.append(" ");
            dqpo dqpoVar = dqthVar.b;
            Object objApply = null;
            Object objApply2 = dqpoVar == null ? null : dqwjVarA.apply(dqpoVar.toString());
            dqpo dqpoVar2 = dqthVar.c;
            if (dqpoVar2 != null) {
                objApply = dqwjVar.apply(dqpoVar2.toString());
            }
            boolean z = (objApply2 == null || objApply == null) ? false : true;
            dqyj dqyjVar = dqthVar.g;
            boolean z2 = dqyjVar != null;
            if (z || z2) {
                sb2.append("ON (");
            }
            if (z) {
                sb2.append("(");
                sb2.append((String) objApply2);
                sb2.append(" ");
                sb2.append(dqthVar.d);
                sb2.append(" ");
                sb2.append((String) objApply);
                sb2.append(")");
            }
            if (z2) {
                if (z) {
                    sb2.append(" AND ");
                }
                sb2.append("(");
                sb2.append(dqyjVar.a(dqxpVar2));
                sb2.append(") ");
            }
            if (z || z2) {
                sb2.append(") ");
            }
            dqxpVar2.c();
            O(dqxpVar2, sb2, dqwjVarA, dqtmVar, dqwlVar.m.c());
            i++;
            dqxpVar2 = dqxpVar;
            sb2 = sb;
        }
    }

    public final void P() {
        if (this.l.length == 0 && this.i.isEmpty()) {
            throw new IllegalStateException("need at least one column in projection");
        }
    }

    public final void Q(dqpi dqpiVar) {
        List list;
        synchronized (dqru.a) {
            boolean z = false;
            int i = 0;
            while (true) {
                list = this.q;
                if (i >= list.size()) {
                    break;
                }
                Pair pair = (Pair) list.get(i);
                if (pair.first == dqpiVar && ((AtomicInteger) pair.second).decrementAndGet() == 0) {
                    list.remove(i);
                    z = true;
                    break;
                }
                i++;
            }
            ((ekrd) c.a(d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "removeChangeListener", 937, "QueryBase.java")).B("removeChangeListener: %s %s", aa(((dqoy) this.e).a), dqpiVar.h);
            if (z && list.isEmpty()) {
                dqua.a().c(this);
            }
        }
    }

    protected final boolean R(String str) {
        return n().c(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean S() {
        dqoy dqoyVar = (dqoy) this.e;
        if (dqoyVar.k != null) {
            return true;
        }
        ekgb ekgbVar = dqoyVar.r;
        if (ekgbVar != null) {
            int i = 0;
            while (i < ((ekoe) ekgbVar).c) {
                boolean zS = ((dqth) ekgbVar.get(i)).a.S();
                i++;
                if (zS) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean T(List list) {
        int i;
        dqwg dqwgVarU = u();
        int i2 = 0;
        while (true) {
            ekgb ekgbVar = ((dqoy) this.e).h;
            if (i2 >= ((ekoe) ekgbVar).c) {
                return false;
            }
            dqyj dqyjVar = (dqyj) ekgbVar.get(i2);
            Iterator it = list.iterator();
            while (true) {
                i = i2 + 1;
                if (it.hasNext()) {
                    Iterator it2 = ((dqyj) it.next()).a.iterator();
                    while (it2.hasNext()) {
                        if (dqyjVar.d(dqwgVarU, (dqyq) it2.next())) {
                            return true;
                        }
                    }
                }
            }
            i2 = i;
        }
    }

    public final boolean U() {
        ArrayList arrayList = new ArrayList();
        dqsy dqsyVarS = s();
        String str = "SELECT EXISTS (" + K(arrayList) + ")";
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        dqox dqoxVar = new dqox(this.e);
        dqoxVar.v = new dqwa(this);
        Cursor cursorAb = ab(dqsyVarS, str, strArr, dqoxVar.a());
        try {
            if (!cursorAb.moveToFirst()) {
                throw new dqwy("got cursor with no rows");
            }
            boolean z = cursorAb.getInt(0) == 1;
            if (cursorAb != null) {
                cursorAb.close();
            }
            return z;
        } catch (Throwable th) {
            if (cursorAb != null) {
                try {
                    cursorAb.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final boolean V() {
        return ((dqoy) this.e).y;
    }

    public final boolean W() {
        ArrayList arrayList = new ArrayList();
        dqsy dqsyVarS = s();
        String str = "SELECT EXISTS (" + K(arrayList) + ")";
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        dqox dqoxVar = new dqox(this.e);
        dqoxVar.v = new dqwa(this);
        Cursor cursorAb = ab(dqsyVarS, str, strArr, dqoxVar.a());
        try {
            if (!cursorAb.moveToFirst()) {
                throw new dqwy("got cursor with no rows which should be impossible");
            }
            boolean z = cursorAb.getInt(0) == 0;
            if (cursorAb != null) {
                cursorAb.close();
            }
            return z;
        } catch (Throwable th) {
            if (cursorAb != null) {
                try {
                    cursorAb.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final String[] X(dqxp dqxpVar) {
        dqxpVar.b = 0;
        List listL = L(dqxpVar);
        dqxpVar.b = 0;
        ad(this.m, dqxpVar, listL);
        String[] strArr = (String[]) listL.toArray(new String[0]);
        if (!((dqoy) dqxpVar.c).y) {
            return strArr;
        }
        Context context = dqru.b;
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = dqru.n(strArr[i]);
        }
        return strArr2;
    }

    public final ekgb Z() {
        ekgb ekgbVar;
        dqoy dqoyVar = (dqoy) this.e;
        boolean z = dqoyVar.u;
        if (z) {
            int i = ekgb.d;
            ekgbVar = ekoe.a;
        } else {
            ekgbVar = dqoyVar.d;
        }
        return ((ekgbVar == null || ekgbVar.isEmpty()) && !z) ? dqoyVar.c : ekgbVar;
    }

    public abstract dqqj a(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar);

    @Override // defpackage.dqxe
    public final String ai(dqxp dqxpVar) {
        return "(" + J() + ")";
    }

    @Override // defpackage.dqxe
    public final String aj(dqxp dqxpVar, List list) {
        return "(" + K(list) + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqxe
    public final void ak(dqpu dqpuVar) {
        dqwv dqwvVar = this.e;
        dqwg dqwgVarU = u();
        dqoy dqoyVar = (dqoy) dqwvVar;
        ekgb ekgbVar = dqoyVar.d;
        if (ekgbVar == null) {
            ekgbVar = dqoyVar.u ? ekoe.a : dqoyVar.c;
        }
        int size = ekgbVar.size();
        for (int i = 0; i < size; i++) {
            dqpuVar.b(dqwgVarU.a((String) ekgbVar.get(i)), this.o);
        }
        ekgb ekgbVar2 = dqoyVar.p;
        if (ekgbVar2 != null) {
            for (int i2 = 0; i2 < ((ekoe) ekgbVar2).c; i2++) {
                ((dqwl) ekgbVar2.get(i2)).ak(dqpuVar);
            }
        }
        List list = this.i;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dqxe) it.next()).ak(dqpuVar);
            }
        }
        for (String str : d()) {
            String strA = dqwgVarU.a(str);
            if (strA != null) {
                str = strA;
            }
            dqpuVar.b(str, this.o);
        }
        ekgb ekgbVar3 = dqoyVar.h;
        for (int i3 = 0; i3 < ((ekoe) ekgbVar3).c; i3++) {
            ((dqyj) ekgbVar3.get(i3)).c(dqpuVar);
        }
        ekgb ekgbVarC = this.m.c();
        int i4 = ((ekoe) ekgbVarC).c;
        for (int i5 = 0; i5 < i4; i5++) {
            ((dqth) ekgbVarC.get(i5)).a.ak(dqpuVar);
        }
    }

    protected abstract Map b();

    protected abstract boolean c();

    protected abstract String[] d();

    protected abstract String[] e();

    public final int h() {
        ejxr ejxrVar = new ejxr() { // from class: dquy
            @Override // defpackage.ejxr
            public final Object get() {
                ArrayList arrayList = new ArrayList();
                dqwl dqwlVar = this.a;
                dqsy dqsyVarS = dqwlVar.s();
                String str = "SELECT COUNT(*) FROM (" + dqwlVar.K(arrayList) + ")";
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                dqox dqoxVar = new dqox(dqwlVar.e);
                dqoxVar.v = new dqwa(dqwlVar);
                Cursor cursorAb = dqwl.ab(dqsyVarS, str, strArr, dqoxVar.a());
                try {
                    if (!cursorAb.moveToFirst()) {
                        throw new dqwy("got cursor with no rows");
                    }
                    Integer numValueOf = Integer.valueOf(cursorAb.getInt(0));
                    if (cursorAb != null) {
                        cursorAb.close();
                    }
                    return numValueOf;
                } catch (Throwable th) {
                    if (cursorAb != null) {
                        try {
                            cursorAb.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        };
        if (!((Boolean) ((dqoj) dqru.c).k.get()).booleanValue() || ((dqoy) this.e).z) {
            return ((Integer) ejxrVar.get()).intValue();
        }
        dqru.L();
        J();
        return ((Integer) dqyt.a(ejxrVar)).intValue();
    }

    public final long i(final dqpo dqpoVar, final String str) {
        ejxr ejxrVar = new ejxr() { // from class: dqvs
            @Override // defpackage.ejxr
            public final Object get() {
                ArrayList arrayList = new ArrayList();
                String str2 = String.format(Locale.US, "%s(%s)", str, dqru.o(dqpoVar.toString()));
                dqxp dqxpVarB = dqxp.b();
                ekgb ekgbVarR = ekgb.r(str2);
                dqwl dqwlVar = this.a;
                String strI = dqwlVar.I(dqxpVarB, false, arrayList, ekgbVarR);
                dqsy dqsyVarS = dqwlVar.s();
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                dqox dqoxVar = new dqox(dqwlVar.e);
                dqoxVar.v = new dqwa(dqwlVar);
                Cursor cursorAb = dqwl.ab(dqsyVarS, strI, strArr, dqoxVar.a());
                try {
                    if (!cursorAb.moveToFirst()) {
                        throw new dqwy("got cursor with no rows");
                    }
                    Long lValueOf = Long.valueOf(cursorAb.getLong(0));
                    if (cursorAb != null) {
                        cursorAb.close();
                    }
                    return lValueOf;
                } catch (Throwable th) {
                    if (cursorAb != null) {
                        try {
                            cursorAb.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        };
        if (!((Boolean) ((dqoj) dqru.c).k.get()).booleanValue() || ((dqoy) this.e).z) {
            return ((Long) ejxrVar.get()).longValue();
        }
        dqru.L();
        String.format(Locale.US, "SELECT %s(%s) FROM (%s)", str, dqpoVar.d(), J());
        return ((Long) dqyt.a(ejxrVar)).longValue();
    }

    public final long j(dqpo dqpoVar) {
        return i(dqpoVar, "MAX");
    }

    public final long k(dqpo dqpoVar) {
        return i(dqpoVar, "MIN");
    }

    public final dqpd l() {
        return r().cT();
    }

    public final dqpd m() {
        return r().cU();
    }

    protected final dqpu n() {
        if (this.p == null) {
            dqpu dqpuVar = new dqpu();
            ak(dqpuVar);
            this.p = dqpuVar;
        }
        return this.p;
    }

    protected final dqpu o() {
        if (this.v == null) {
            final dqpu dqpuVar = new dqpu();
            Collection.EL.stream(((dqoy) this.e).h).forEach(new Consumer() { // from class: dqvd
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ThreadLocal threadLocal = dqwl.a;
                    ((dqyj) obj).c(dqpuVar);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            this.v = dqpuVar;
        }
        return this.v;
    }

    public final dqqj p() {
        dqqj dqqjVarR = r();
        this.r = null;
        return dqqjVarR;
    }

    public final dqqj q(dqpo dqpoVar) {
        P();
        String strO = dqru.o(dqpoVar.toString());
        if (!Arrays.asList(this.l).contains(dqpoVar.toString())) {
            throw new IllegalArgumentException("cannot slice on column which is not part of the projection");
        }
        dqsy dqsyVarS = s();
        String str = String.format(Locale.US, "SELECT %s FROM (%s)", strO, this.k);
        String[] strArr = this.j;
        dqox dqoxVar = new dqox(this.e);
        dqoxVar.t = new dqsb("queryForSingleColumn-", dqpoVar.toString());
        dqoxVar.v = new dqwa(this);
        return a(dqsyVarS, ab(dqsyVarS, str, strArr, dqoxVar.a()), new String[]{dqpoVar.toString()}, (dqxe[]) this.i.toArray(new dqxe[0]), new dqwj() { // from class: dqvj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                ThreadLocal threadLocal = dqwl.a;
                return str2;
            }
        }, this.m);
    }

    public final dqqj r() {
        dqsy dqsyVarS = s();
        P();
        dqox dqoxVar = new dqox(this.e);
        dqoxVar.v = new dqwa(this);
        Cursor cursorAb = ab(dqsyVarS, this.k, this.j, dqoxVar.a());
        dqxe[] dqxeVarArr = (dqxe[]) this.i.toArray(new dqxe[0]);
        dqwj dqwjVar = new dqwj() { // from class: dqvt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String str = (String) obj;
                ThreadLocal threadLocal = dqwl.a;
                return str;
            }
        };
        String[] strArr = this.l;
        dqtm dqtmVar = this.m;
        dqqj dqqjVarA = a(dqsyVarS, cursorAb, strArr, dqxeVarArr, dqwjVar, dqtmVar);
        dqqjVarA.dh(dqtmVar, dqtmVar.c(), S());
        return dqqjVarA;
    }

    public final dqsy s() {
        return dqru.e(((dqoy) this.e).x);
    }

    public final dqtr t(dqpo dqpoVar, dqpo dqpoVar2, dqyj dqyjVar) {
        dqtr dqtrVarI = dqts.i(this, dqpoVar, dqpoVar2);
        ((dqos) dqtrVarI).d = dqyjVar;
        return dqtrVarI;
    }

    protected final dqwg u() {
        return new dqwg(b());
    }

    public final dqxe v() {
        return new dqxl("SELECT COUNT(*) FROM ($R)", new Object[]{J()});
    }

    public final eijs w() {
        return eijs.d(new eopn() { // from class: dqwb
            @Override // defpackage.eopn
            public final Object a(eopt eoptVar) {
                dqqj dqqjVarR = this.a.r();
                eoptVar.a(dqqjVarR, eoqg.a);
                return dqqjVarR;
            }
        }, (Executor) this.h.get());
    }

    public final eiju x() {
        return eiju.g(C(new Supplier() { // from class: dqvb
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.z();
            }
        }));
    }

    public final ekgb y(ejvr ejvrVar) {
        dqqj dqqjVarP = p();
        try {
            ekfw ekfwVarD = ekgb.d(dqqjVarP.getCount());
            while (dqqjVarP.moveToNext()) {
                ekfwVarD.h(ejvrVar.apply(dqqjVarP));
            }
            ekgb ekgbVarG = ekfwVarD.g();
            dqqjVarP.close();
            return ekgbVarG;
        } catch (Throwable th) {
            try {
                dqqjVarP.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ekgb z() {
        ejxr ejxrVar = new ejxr() { // from class: dqvu
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.r().cX();
            }
        };
        if (!((Boolean) ((dqoj) dqru.c).k.get()).booleanValue() || ((dqoy) this.e).z) {
            return (ekgb) ejxrVar.get();
        }
        dqru.L();
        J();
        return (ekgb) dqyt.a(ejxrVar);
    }
}
