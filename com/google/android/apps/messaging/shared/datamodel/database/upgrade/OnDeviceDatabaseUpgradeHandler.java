package com.google.android.apps.messaging.shared.datamodel.database.upgrade;

import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.OnDeviceDatabaseUpgradeHandler;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import defpackage.a;
import defpackage.agpz;
import defpackage.agqk;
import defpackage.aurw;
import defpackage.axie;
import defpackage.axif;
import defpackage.bakt;
import defpackage.bble;
import defpackage.bblf;
import defpackage.bblg;
import defpackage.bbma;
import defpackage.bbmg;
import defpackage.bbmh;
import defpackage.bobu;
import defpackage.bocg;
import defpackage.boil;
import defpackage.boiv;
import defpackage.bopp;
import defpackage.bopq;
import defpackage.bopr;
import defpackage.bost;
import defpackage.botb;
import defpackage.botl;
import defpackage.botm;
import defpackage.brdk;
import defpackage.brgt;
import defpackage.briz;
import defpackage.bsix;
import defpackage.bvdk;
import defpackage.bzaf;
import defpackage.cczi;
import defpackage.cmqf;
import defpackage.cnqk;
import defpackage.cnvx;
import defpackage.cnvy;
import defpackage.cpyl;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.ctz;
import defpackage.dqoj;
import defpackage.dqom;
import defpackage.dqpn;
import defpackage.dqrs;
import defpackage.dqru;
import defpackage.dqso;
import defpackage.dqsp;
import defpackage.dqsq;
import defpackage.dqsy;
import defpackage.dqty;
import defpackage.dqxa;
import defpackage.dqxt;
import defpackage.ejwl;
import defpackage.ejxr;
import defpackage.ejyb;
import defpackage.ekgb;
import defpackage.ekhv;
import defpackage.eknz;
import defpackage.ekoe;
import defpackage.ekqg;
import defpackage.enqq;
import defpackage.evtj;
import defpackage.fcsu;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class OnDeviceDatabaseUpgradeHandler implements bblg {
    static final int ODD_EVEN_SEMANTICS_START_POINT = 42000;
    private static final cqce log = cqce.g("BugleDataModel", "OnDeviceDatabaseUpgradeHandler");
    private final cnvy conversationCustomizer;
    private final fcsu<bakt> conversationDatabaseOperations;
    private final CustomUpgradeSteps customUpgradeSteps;
    private final dqsy database;
    private final axie databaseHelperUtils;
    private final int newVersion;
    private final int oldVersion;
    private final fcsu<cmqf> syncManager;
    private final Map<dqso, dqxt> triggerProvider;
    PriorityQueue<dqsq> upgradeSteps = makeQueue();
    private final ekgb<Method> allManualUpgradesSteps = getAllCustomUpgradeSteps();

    public OnDeviceDatabaseUpgradeHandler(CustomUpgradeSteps customUpgradeSteps, fcsu<cmqf> fcsuVar, Map<String, dqsq> map, fcsu<bakt> fcsuVar2, axif axifVar, cnvy cnvyVar, Map<dqso, dqxt> map2, dqsy dqsyVar, dqrs dqrsVar, int i, int i2) {
        this.customUpgradeSteps = customUpgradeSteps;
        this.syncManager = fcsuVar;
        this.conversationDatabaseOperations = fcsuVar2;
        this.triggerProvider = map2;
        this.databaseHelperUtils = axifVar.a(dqrsVar);
        this.conversationCustomizer = cnvyVar;
        this.database = dqsyVar;
        this.oldVersion = i;
        this.newVersion = i2;
        filterUpgradesForDatabase(map, dqrsVar.f()).filter(new Predicate() { // from class: bblx
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
                return ((dqsq) obj).e();
            }
        }).forEach(new Consumer() { // from class: bbly
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                this.a.lambda$new$1((dqsq) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    private static int checkAndUpdateVersion(int i, int i2) {
        if (i >= i2) {
            return i2;
        }
        throw new bblf(-1L, i2, i, "missing upgrade handler", null);
    }

    public static Stream<dqsq> filterUpgradesForDatabase(Map<String, dqsq> map, final String str) {
        return Collection.EL.stream(map.entrySet()).filter(new Predicate() { // from class: bblh
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
                return ((String) ((Map.Entry) obj).getKey()).startsWith(String.valueOf(str).concat("+"));
            }
        }).map(new Function() { // from class: bbls
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return OnDeviceDatabaseUpgradeHandler.lambda$filterUpgradesForDatabase$1((Map.Entry) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    private static List<Method> getAfterGeneratedUpgradeMethods(ekgb<Method> ekgbVar) {
        return (List) Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: bblz
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
                return ((bble) OnDeviceDatabaseUpgradeHandler.getAnnotationOrThrow((Method) obj, bble.class)).a();
            }
        }).collect(Collectors.toCollection(new bbma()));
    }

    private static ekgb<Method> getAllCustomUpgradeSteps() throws SecurityException {
        ArrayList arrayList = new ArrayList();
        for (Method method : CustomUpgradeSteps.class.getDeclaredMethods()) {
            if (method.getName().startsWith("upgradeToVersion")) {
                if (method.getReturnType() != Void.TYPE) {
                    throw new IllegalStateException("method " + method.getName() + " should return void");
                }
                if (method.getParameterTypes().length != 1) {
                    throw new IllegalStateException("method " + method.getName() + " should take a single DatabaseWrapper parameter");
                }
                if (method.getParameterTypes()[0] != dqsy.class) {
                    throw new IllegalStateException("method " + method.getName() + " should take a single DatabaseInterface parameter");
                }
                if (Modifier.isStatic(method.getModifiers())) {
                    throw new IllegalStateException("method " + method.getName() + " should not be static");
                }
                ejyb.e((bble) getAnnotationOrThrow(method, bble.class));
                arrayList.add(method);
            }
        }
        ejwl.m(arrayList.size() > 0, "didn't find any upgrade methods; check proguard config");
        return ekgb.E(new Comparator() { // from class: bbmb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return OnDeviceDatabaseUpgradeHandler.lambda$getAllCustomUpgradeSteps$0((Method) obj, (Method) obj2);
            }
        }, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends Annotation> T getAnnotationOrThrow(Method method, Class<T> cls) {
        T t = (T) method.getAnnotation(cls);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("expected annotation of type ".concat(String.valueOf(String.valueOf(cls))));
    }

    private static List<Method> getUpgradeMethods(ekgb<Method> ekgbVar) {
        return (List) Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: bbmc
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
                return OnDeviceDatabaseUpgradeHandler.lambda$getUpgradeMethods$0((Method) obj);
            }
        }).collect(Collectors.toCollection(new bbma()));
    }

    private Runnable getUpgradeRunnable(final int i, final List<dqsp> list, final boolean z) {
        return new Runnable() { // from class: bblw
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$getUpgradeRunnable$0(z, i, list);
            }
        };
    }

    private boolean isCurrentThreadInTransaction() {
        return this.database.F();
    }

    public static /* synthetic */ dqsq lambda$filterUpgradesForDatabase$1(Map.Entry entry) {
        return (dqsq) entry.getValue();
    }

    public static /* synthetic */ int lambda$getAllCustomUpgradeSteps$0(Method method, Method method2) {
        return versionForMethod(method) - versionForMethod(method2);
    }

    public static /* synthetic */ boolean lambda$getUpgradeMethods$0(Method method) {
        return !((bble) getAnnotationOrThrow(method, bble.class)).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getUpgradeRunnable$0(boolean z, int i, List list) {
        if (z) {
            ejwl.l(!axie.i(this.database));
        }
        try {
            this.database.D(i);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dqsp) it.next()).a().run();
            }
        } catch (Exception e) {
            throw new bblf(a.g(i, "failed upgrade step "), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getUpgradeSteps$0(List list, int i) {
        boolean zAnyMatch = Collection.EL.stream(list).anyMatch(new Predicate() { // from class: bbll
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
                return ((dqsp) obj).b();
            }
        });
        ejwl.m(!isCurrentThreadInTransaction(), "cannot modify foreign keys enabled while in a transaction");
        if (zAnyMatch) {
            this.database.v("PRAGMA FOREIGN_KEYS = 0");
            ejwl.l(!axie.i(this.database));
        }
        final Runnable upgradeRunnable = getUpgradeRunnable(i, list, zAnyMatch);
        try {
            final int version = this.database.h().getVersion();
            this.database.w("OnDeviceDatabaseUpgradeHandler#getUpgradeSteps", new Runnable() { // from class: bblm
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$getUpgradeSteps$1(version, upgradeRunnable);
                }
            });
            ejwl.m(!isCurrentThreadInTransaction(), "cannot modify foreign keys enabled while in a transaction");
            if (zAnyMatch) {
                this.database.v("PRAGMA FOREIGN_KEYS = 1");
            }
        } catch (Throwable th) {
            ejwl.m(!isCurrentThreadInTransaction(), "cannot modify foreign keys enabled while in a transaction");
            if (zAnyMatch) {
                this.database.v("PRAGMA FOREIGN_KEYS = 1");
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getUpgradeSteps$1(int i, Runnable runnable) {
        if (i != this.database.h().getVersion()) {
            throw new bbmh("current version changed after entering transaction -- check for a second process running upgrade steps");
        }
        runnable.run();
    }

    public static /* synthetic */ bopq[] lambda$loadConversationCustomization$0(bopp boppVar) {
        return new bopq[]{boppVar.b, boppVar.q, boppVar.E, boppVar.G, boppVar.F, boppVar.N, boppVar.M};
    }

    public static /* synthetic */ botl lambda$loadConversationCustomization$1(botl botlVar) {
        botlVar.b(new Function() { // from class: bblp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar2 = (botl) obj;
                OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$2(botlVar2);
                return botlVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bblq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar2 = (botl) obj;
                OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$3(botlVar2);
                return botlVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bblr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar2 = (botl) obj;
                OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$4(botlVar2);
                return botlVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bblt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar2 = (botl) obj;
                OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$5(botlVar2);
                return botlVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bblu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar2 = (botl) obj;
                OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$6(botlVar2);
                return botlVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return botlVar;
    }

    public static /* synthetic */ botl lambda$loadConversationCustomization$2(botl botlVar) {
        botlVar.d(bvdk.UNARCHIVED);
        return botlVar;
    }

    public static /* synthetic */ botl lambda$loadConversationCustomization$3(botl botlVar) {
        botlVar.ap(new dqty("conversations.notification_enabled", 1, 0));
        return botlVar;
    }

    public static /* synthetic */ botl lambda$loadConversationCustomization$4(botl botlVar) {
        botlVar.ap(new dqty("conversations.notification_vibration", 1, 0));
        return botlVar;
    }

    public static /* synthetic */ botl lambda$loadConversationCustomization$5(botl botlVar) {
        botlVar.ap(new dqpn("conversations.notification_sound_uri", 6));
        return botlVar;
    }

    public static /* synthetic */ botl lambda$loadConversationCustomization$6(botl botlVar) {
        botlVar.j(2);
        return botlVar;
    }

    public static /* synthetic */ int lambda$makeQueue$0(dqsq dqsqVar, dqsq dqsqVar2) {
        int iA = dqsqVar.a();
        int iA2 = dqsqVar2.a();
        return iA != iA2 ? iA - iA2 : dqsqVar.b() != dqsqVar2.b() ? dqsqVar.b() - dqsqVar2.b() : TextUtils.equals(dqsqVar.d(), dqsqVar2.d()) ? dqsqVar.d().compareTo(dqsqVar2.d()) : dqsqVar.hashCode() - dqsqVar2.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(dqsq dqsqVar) {
        this.upgradeSteps.offer(dqsqVar);
    }

    public static /* synthetic */ void lambda$rebuildTriggers$1(dqsy dqsyVar, Map.Entry entry) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$rebuildViewsUpgradeStep$0(int i, int i2) {
        if (i == axie.b(this.database.j())) {
            ejwl.l(this.database.h().getVersion() == i2);
            if (((dqom) this.database.j()).b.equals("$primary")) {
                rebuildViews(this.database);
                rebuildTriggers(this.database);
            }
            this.database.D(i);
        } else {
            this.database.D(i2);
        }
        return Integer.valueOf(i);
    }

    private static ctz<cnvx> loadConversationCustomization() {
        ctz<cnvx> ctzVar = new ctz<>();
        botb botbVarE = botm.e();
        botbVarE.A("loadConversationCustomization");
        botbVarE.f(new Function() { // from class: bbln
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$0((bopp) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.i(new Function() { // from class: bblo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$1(botlVar);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bopr boprVar = (bopr) botbVarE.b().p();
        while (boprVar.moveToNext()) {
            try {
                ctzVar.f(cnqk.a(boprVar.k()), new cnvx(boprVar.j(), !boprVar.w(), !boprVar.x(), boprVar.r(), boprVar.e(), boprVar.f()));
            } finally {
            }
        }
        boprVar.close();
        return ctzVar;
    }

    static PriorityQueue<dqsq> makeQueue() {
        return new PriorityQueue<>(50, new Comparator() { // from class: bbmd
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return OnDeviceDatabaseUpgradeHandler.lambda$makeQueue$0((dqsq) obj, (dqsq) obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void precheck(int i, int i2, dqsy dqsyVar) {
        ekgb ekgbVar = ((dqom) dqsyVar.j()).f;
        int i3 = ((ekoe) ekgbVar).c;
        int i4 = 0;
        while (i4 < i3) {
            eknz eknzVar = (eknz) ekgbVar.get(i4);
            i4++;
            if (eknzVar.a(Integer.valueOf(i))) {
                long j = i;
                throw new bblf(j, i2, j, "oldVersion is in invalid range:" + eknzVar.f().toString() + ":" + eknzVar.g().toString(), null);
            }
        }
    }

    private void rebuildAvatars() {
        cqce cqceVar = log;
        cqceVar.p("begin rebuildAvatars.");
        ((bakt) this.conversationDatabaseOperations.b()).O();
        cqceVar.p("completed rebuildAvatars.");
    }

    private void rebuildTriggers(final dqsy dqsyVar) {
        axie.d(dqsyVar.h());
        if (((dqom) dqsyVar.j()).b.equals("$primary")) {
            String[] strArr = axie.e;
            int length = strArr.length;
            for (int i = 0; i < 13; i++) {
                dqsyVar.v(strArr[i]);
            }
        }
        axie.g(dqsyVar);
        axie axieVar = this.databaseHelperUtils;
        try {
            if (cpyl.a() ? aurw.g(axieVar.q.c()) : axieVar.q.ai()) {
                ekhv ekhvVar = new ekhv();
                Iterator it = ((Set) axieVar.p.b()).iterator();
                while (it.hasNext()) {
                    ekhvVar.j(((bzaf) it.next()).a());
                }
                ekqg ekqgVarListIterator = ekhvVar.g().listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    dqsyVar.v((String) ekqgVarListIterator.next());
                }
            }
        } catch (evtj e) {
            axie.k.s("Can't process(rebuild/skip) CMS triggers: unable to decide CMS status", e);
        }
        if (((Boolean) agpz.a.e()).booleanValue()) {
            String[] strArr2 = brgt.a;
            dqsyVar.v(agqk.a("smarts_personalization_decayed_feature_values", brgt.c.b.toString()));
            String[] strArr3 = briz.a;
            dqsyVar.v(agqk.a("smarts_personalization_normalized_feature_values", briz.b.a.toString()));
        }
        Collection.EL.stream(this.triggerProvider.entrySet()).filter(new Predicate() { // from class: bblj
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
                return ((dqso) ((Map.Entry) obj).getKey()).b().equals(((dqom) dqsyVar.j()).b);
            }
        }).forEach(new Consumer() { // from class: bblk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                OnDeviceDatabaseUpgradeHandler.lambda$rebuildTriggers$1(dqsyVar, (Map.Entry) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    static void rebuildViews(dqsy dqsyVar) {
        axie.e(dqsyVar.h());
        axie.f(dqsyVar);
    }

    private ejxr<Integer> rebuildViewsUpgradeStep(final int i, final int i2) {
        return new ejxr() { // from class: bbli
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.lambda$rebuildViewsUpgradeStep$0(i, i2);
            }
        };
    }

    private void startSafeResync() {
        cqce cqceVar = log;
        cqceVar.p("begin startSafeResync.");
        ctz<cnvx> ctzVarLoadConversationCustomization = loadConversationCustomization();
        String[] strArr = PartsTable.a;
        new bsix().d();
        String[] strArr2 = MessagesTable.a;
        new brdk().d();
        String[] strArr3 = bocg.a;
        new bobu().d();
        String[] strArr4 = boiv.a;
        new boil().d();
        String[] strArr5 = botm.a;
        new bost().d();
        ejxr ejxrVar = cmqf.a;
        if (((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue()) {
            this.conversationCustomizer.a = ctzVarLoadConversationCustomization;
        } else {
            ((cmqf) this.syncManager.b()).o(ctzVarLoadConversationCustomization);
        }
        if (((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue()) {
            ((cmqf) this.syncManager.b()).k(enqq.DATABASE_UPGRADE_RESYNC);
        } else {
            ((cmqf) this.syncManager.b()).n();
        }
        cqceVar.p("completed startSafeResync.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int versionForMethod(Method method) {
        try {
            return Integer.parseInt(method.getName().substring(16));
        } catch (NumberFormatException e) {
            cqbd cqbdVarB = log.b();
            cqbdVarB.I("invalid upgrade method: ");
            cqbdVarB.I(method.getName());
            cqbdVarB.r();
            throw new bblf("invalid upgrade method: ".concat(String.valueOf(String.valueOf(method))), e);
        }
    }

    int applyUpdatesCurrentVersion(int i, PriorityQueue<dqsq> priorityQueue) {
        return applyUpdatesCurrentVersion(i, priorityQueue, Alert.DURATION_SHOW_INDEFINITELY);
    }

    public int applyUpgrades(int i, int i2) {
        bbmg bbmgVar = new bbmg(this, false, getUpgradeMethods(this.allManualUpgradesSteps));
        bbmg bbmgVar2 = new bbmg(this, true, getAfterGeneratedUpgradeMethods(this.allManualUpgradesSteps));
        this.upgradeSteps.offer(bbmgVar);
        this.upgradeSteps.offer(bbmgVar2);
        try {
            int iApplyUpdatesCurrentVersion = applyUpdatesCurrentVersion(i, this.upgradeSteps, i2);
            this.upgradeSteps.remove(bbmgVar);
            this.upgradeSteps.remove(bbmgVar2);
            checkAndUpdateVersion(iApplyUpdatesCurrentVersion, i2);
            return i2;
        } catch (Throwable th) {
            this.upgradeSteps.remove(bbmgVar);
            this.upgradeSteps.remove(bbmgVar2);
            throw th;
        }
    }

    public void doFinalDataUpgradeWithExceptions(int i, int i2) {
        if (i != 20055) {
            if (eknz.d(20000, 21000).a(Integer.valueOf(i)) || (i >= 21000 && i <= 21010)) {
                startSafeResync();
                log.p("Applying startSafeResync to fix foreign keys.");
            }
            if (i == 22000) {
                rebuildAvatars();
            }
        }
    }

    public void doSchemaUpgradeWithExceptions() throws IOException {
        int i = this.oldVersion;
        int i2 = this.newVersion;
        dqsy dqsyVar = this.database;
        final dqxa dqxaVarM = dqsyVar.M();
        precheck(i, i2, dqsyVar);
        if (this.oldVersion == this.newVersion) {
            return;
        }
        try {
            Thread threadCurrentThread = Thread.currentThread();
            AtomicReference atomicReference = dqxaVarM.a;
            Thread thread = (Thread) atomicReference.get();
            ejwl.l(thread == null || thread == threadCurrentThread);
            atomicReference.set(threadCurrentThread);
            dqxaVarM.b.incrementAndGet();
            Closeable closeable = new Closeable() { // from class: dqwz
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    dqxa dqxaVar = dqxaVarM;
                    if (dqxaVar.b.decrementAndGet() == 0) {
                        dqxaVar.a.set(null);
                    }
                }
            };
            try {
                int i3 = this.newVersion;
                int i4 = i3 - 1;
                ejwl.l(i3 < ODD_EVEN_SEMANTICS_START_POINT || i4 % 2 == 0);
                applyUpgrades(i, i4);
                checkAndUpdateVersion(((Integer) this.database.p("OnDeviceDatabaseUpgradeHandler#doSchemaUpgradeWithExceptions", rebuildViewsUpgradeStep(this.newVersion, i4))).intValue(), this.newVersion);
                closeable.close();
            } finally {
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public void doUpgradeWithExceptions() throws IOException {
        cqce cqceVar = log;
        cqbd cqbdVarC = cqceVar.c();
        cqbdVarC.I("Beginning schema upgrade.");
        cqbdVarC.y("oldVersion", this.oldVersion);
        cqbdVarC.y("newVersion", this.newVersion);
        cqbdVarC.r();
        doSchemaUpgradeWithExceptions();
        cqbd cqbdVarC2 = cqceVar.c();
        cqbdVarC2.I("Beginning data upgrade.");
        cqbdVarC2.y("oldVersion", this.oldVersion);
        cqbdVarC2.y("newVersion", this.newVersion);
        cqbdVarC2.r();
        doFinalDataUpgradeWithExceptions(this.oldVersion, this.newVersion);
    }

    public PriorityQueue<dqsq> getUpgradeSteps() {
        return this.upgradeSteps;
    }

    @Override // defpackage.bblg
    public void onDowngrade() {
        try {
            if (((dqom) this.database.j()).e) {
                cqbd cqbdVarE = log.e();
                cqbdVarE.I("Ignoring database downgrade");
                cqbdVarE.A("db handle", ((dqom) this.database.j()).b);
                cqbdVarE.y("oldVersion", this.oldVersion);
                cqbdVarE.y("newVersion", this.newVersion);
                cqbdVarE.r();
                return;
            }
        } catch (Throwable th) {
            log.s("Failed to ignore DB downgrade", th);
        }
        cqbd cqbdVarB = log.b();
        cqbdVarB.I("Database downgrade requested forcing db rebuild!");
        cqbdVarB.y("oldVersion", this.oldVersion);
        cqbdVarB.y("newVersion", this.newVersion);
        cqbdVarB.r();
        throw new bblf(this.oldVersion, this.newVersion, -1L, "onDowngrade not supported", null);
    }

    @Override // defpackage.bblg
    public void onUpgrade() throws Exception {
        cqce cqceVar = log;
        cqbd cqbdVarC = cqceVar.c();
        cqbdVarC.I("Database upgrade started.");
        cqbdVarC.y("oldVersion", this.oldVersion);
        cqbdVarC.y("newVersion", this.newVersion);
        cqbdVarC.r();
        if (this.oldVersion != this.newVersion) {
            try {
                if (!((dqoj) dqru.c).j) {
                    throw new bbmh("not primary process");
                }
                doUpgradeWithExceptions();
                cqceVar.p("Finished database upgrade");
            } catch (Exception e) {
                if (e instanceof bbmh) {
                    throw e;
                }
                cqbd cqbdVarB = log.b();
                cqbdVarB.I("Failed to perform db upgrade.");
                cqbdVarB.y("oldVersion", this.oldVersion);
                cqbdVarB.y("newVersion", this.newVersion);
                cqbdVarB.s(e);
                throw new bblf(this.oldVersion, this.newVersion, this.database.h().getVersion(), "failed in doUpgradeWithExceptions", e);
            }
        }
    }

    private Runnable getUpgradeSteps(final int i, PriorityQueue<dqsq> priorityQueue) {
        dqsq dqsqVarPeek;
        final ArrayList arrayList = new ArrayList();
        do {
            dqsqVarPeek = priorityQueue.peek();
            if (dqsqVarPeek == null || dqsqVarPeek.a() != i) {
                break;
            }
            arrayList.add(dqsqVarPeek.c(this.database));
            priorityQueue.poll();
            if (dqsqVarPeek.e()) {
                priorityQueue.offer(dqsqVarPeek);
            }
        } while (!dqsqVarPeek.f());
        return new Runnable() { // from class: bblv
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$getUpgradeSteps$0(arrayList, i);
            }
        };
    }

    public int applyUpdatesCurrentVersion(int i, PriorityQueue<dqsq> priorityQueue, int i2) {
        int iA;
        while (true) {
            dqsq dqsqVarPeek = priorityQueue.peek();
            if (dqsqVarPeek == null || (iA = dqsqVarPeek.a()) > i2) {
                break;
            }
            Runnable upgradeSteps = getUpgradeSteps(iA, priorityQueue);
            if (iA <= i) {
                log.p(a.g(i, "Ignoring upgrade database to version (already past that) "));
            } else {
                cqce cqceVar = log;
                cqceVar.p(a.g(iA, "Upgrading database to version "));
                upgradeSteps.run();
                cqceVar.p(a.g(iA, "Upgraded database to version "));
                i = iA;
            }
        }
        return i;
    }
}
