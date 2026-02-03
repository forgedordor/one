package defpackage;

import android.content.Context;
import android.database.MatrixCursor;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byos {
    public static final cqce a = cqce.g("BugleCms", "CmsConversationConsumerDelegate");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumerDelegate");
    public static final bopq[] c;
    public final cpmc d;
    public final cppe e;
    public final byxd f;
    public final ains g;
    public final eosc h;
    public final eosc i;
    public final byox j;
    public final fcsu k;
    public final cajh l;
    public final caim m;
    public final dqsn n;
    public final aukz o;
    public final bzap p;
    public final appa q;
    public final aqfk r;
    public final fcsu s;
    private final bzwj t;
    private final bywk u;
    private final apow v;
    private final aurx w;
    private final cogw x;
    private final appc y;

    static {
        bopp boppVar = botm.c;
        c = new bopq[]{boppVar.a, boppVar.c, boppVar.Z, boppVar.q, boppVar.g, boppVar.d, boppVar.N, boppVar.aa, boppVar.al, boppVar.r, boppVar.as, boppVar.aw};
    }

    public byos(appa appaVar, cpmc cpmcVar, bzwj bzwjVar, cppe cppeVar, byxd byxdVar, bywk bywkVar, aurx aurxVar, apow apowVar, ains ainsVar, byox byoxVar, cajh cajhVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, bzap bzapVar, dqsn dqsnVar, cogw cogwVar, caim caimVar, aukz aukzVar, appc appcVar, aqfk aqfkVar, fcsu fcsuVar2) {
        this.q = appaVar;
        this.d = cpmcVar;
        this.t = bzwjVar;
        this.e = cppeVar;
        this.f = byxdVar;
        this.u = bywkVar;
        this.v = apowVar;
        this.w = aurxVar;
        this.g = ainsVar;
        this.j = byoxVar;
        this.l = cajhVar;
        this.h = eoscVar;
        this.i = eoscVar2;
        this.k = fcsuVar;
        this.p = bzapVar;
        this.n = dqsnVar;
        this.x = cogwVar;
        this.m = caimVar;
        this.o = aukzVar;
        this.y = appcVar;
        this.r = aqfkVar;
        this.s = fcsuVar2;
    }

    public static ekgp e(Collection collection, Map map, cpyi cpyiVar, final Map map2) {
        if (!collection.isEmpty()) {
            bopp boppVar = botm.c;
            bopq bopqVar = boppVar.a;
            bopq[] bopqVarArr = {bopqVar, boppVar.al};
            try {
                MatrixCursor matrixCursor = new MatrixCursor((String[]) DesugarArrays.stream(bopqVarArr).map(new Function() { // from class: byno
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cqce cqceVar = byos.a;
                        String strD = ((bopq) obj).d();
                        strD.getClass();
                        return strD;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).toArray(new IntFunction() { // from class: bynp
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i) {
                        cqce cqceVar = byos.a;
                        return new String[i];
                    }
                }));
                try {
                    final ArrayList arrayList = new ArrayList();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        bojh bojhVar = (bojh) map.get((String) it.next());
                        if (bojhVar != null) {
                            ConversationIdType conversationIdTypeC = bojhVar.C();
                            matrixCursor.addRow(new Object[]{Long.valueOf(conversationIdTypeC.a), Integer.valueOf(cpyiVar.ordinal())});
                            arrayList.add(conversationIdTypeC);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ekgp ekgpVar = ekoj.a;
                        matrixCursor.close();
                        return ekgpVar;
                    }
                    bote boteVar = new bote();
                    boteVar.ap("CmsConversationConsumerDelegate-update");
                    boteVar.ad(new Function() { // from class: bynq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            botl botlVar = (botl) obj;
                            cqce cqceVar = byos.a;
                            botlVar.u(arrayList);
                            return botlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    Stream streamSkip = DesugarArrays.stream(bopqVarArr).skip(1L);
                    int i = ekgb.d;
                    ekgb ekgbVar = (ekgb) streamSkip.collect(ekcv.a);
                    Context context = dqru.b;
                    boteVar.ao(ekgbVar, matrixCursor, new dqxl("$R = $V", new Object[]{"_I._id", bopqVar}));
                    boteVar.b().t(5);
                    matrixCursor.close();
                } finally {
                }
            } catch (RuntimeException e) {
                return (ekgp) Collection.EL.stream(collection).collect(ekcv.a(new Function() { // from class: bynr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cqce cqceVar = byos.a;
                        ejwj ejwjVar = (ejwj) map2.get((String) obj);
                        ejwjVar.getClass();
                        return (eqjv) ejwjVar.a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: byns
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cqce cqceVar = byos.a;
                        return e;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
            }
        }
        return ekoj.a;
    }

    public final eiju a(final eqjv eqjvVar, final boolean z) {
        eiju eijuVarH = eijx.h(new eooy() { // from class: byop
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final byos byosVar = this.a;
                cppe cppeVar = byosVar.e;
                final eqjv eqjvVar2 = eqjvVar;
                final cppr cpprVarA = cppeVar.a(eqjvVar2);
                ekhx ekhxVarD = cpprVarA.d();
                boolean zIsEmpty = ekhxVarD.isEmpty();
                final boolean z2 = z;
                if (zIsEmpty) {
                    return byosVar.d(cpprVarA, eqjvVar2, z2);
                }
                cqbd cqbdVarC = byos.a.c();
                cqbdVarC.I("Encountered unknown cms_ids in participants list for conversation.");
                cqbdVarC.b(barn.b(eqjvVar2.c).a);
                cqbdVarC.y("missingParticipantCount", ekhxVarD.size());
                cqbdVarC.r();
                eiju eijuVarE = byosVar.d.e(ekhxVarD.g());
                eooz eoozVar = new eooz() { // from class: bynt
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        final byos byosVar2;
                        ekgp ekgpVar = (ekgp) obj;
                        ekqg ekqgVarListIterator = ekgpVar.entrySet().listIterator();
                        boolean z3 = true;
                        while (true) {
                            byosVar2 = byosVar;
                            if (!ekqgVarListIterator.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                            if (((Optional) entry.getValue()).isPresent()) {
                                byosVar2.g.e("Bugle.Cms.Restore.RestoreParticipantFromConversationConsumer", 1);
                            } else {
                                cqbd cqbdVarE = byos.a.e();
                                cqbdVarE.I("Could not find participant for conversation");
                                cqbdVarE.A("participantId", entry.getKey());
                                cqbdVarE.r();
                                byosVar2.g.e("Bugle.Cms.Restore.RestoreParticipantFromConversationConsumer", 2);
                                z3 = false;
                            }
                        }
                        if (!z3) {
                            throw new byoq();
                        }
                        final boolean z4 = z2;
                        Stream map = Collection.EL.stream(ekgpVar.values()).flatMap(new Function() { // from class: bymx
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((Optional) obj2).stream();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).map(new Function() { // from class: bymz
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return byosVar2.f.f((eqnl) obj2, z4);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i = ekgb.d;
                        return eijx.l((Iterable) map.collect(ekcv.a)).a(new Callable() { // from class: byna
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                cqce cqceVar = byos.a;
                                return null;
                            }
                        }, byosVar2.h).f(Exception.class, new eooz() { // from class: bynb
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) throws Exception {
                                Exception exc = (Exception) obj2;
                                byosVar2.g.e("Bugle.Cms.Restore.RestoreParticipantFromConversationConsumer", 2);
                                throw exc;
                            }
                        }, byosVar2.i);
                    }
                };
                eosc eoscVar = byosVar.h;
                return eijuVarE.i(eoozVar, eoscVar).e(cpma.class, new ejvr() { // from class: bynv
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        byos.a.s("Exception when looking up CMS participants", (cpma) obj);
                        throw new byoq();
                    }
                }, eoscVar).i(new eooz() { // from class: bymp
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return byosVar.d(cpprVarA, eqjvVar2, z2);
                    }
                }, eoscVar);
            }
        }, this.h);
        return this.q.a() ? eijuVarH.i(new eooz() { // from class: bylt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.p.a().h(new ejvr() { // from class: bynn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cqce cqceVar = byos.a;
                        return null;
                    }
                }, eoqg.a);
            }
        }, eoqg.a) : eijuVarH;
    }

    public final eiju b(final ekgb ekgbVar, final Optional optional) {
        if (ekgbVar.isEmpty()) {
            return eijx.e(ekoj.a);
        }
        eiju eijuVarF = eijx.h(new eooy() { // from class: byml
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final byos byosVar;
                eiju eijuVarE;
                final HashMap map = new HashMap();
                final ekgi ekgiVar = new ekgi();
                ekhv ekhvVar = new ekhv();
                ekha ekhaVar = new ekha();
                final ekgb ekgbVar2 = ekgbVar;
                int size = ekgbVar2.size();
                int i = 0;
                while (true) {
                    byosVar = this.a;
                    if (i >= size) {
                        break;
                    }
                    eqjv eqjvVar = (eqjv) ekgbVar2.get(i);
                    String str = eqjvVar.c;
                    try {
                        cppr cpprVarA = byosVar.e.a(eqjvVar);
                        ekhx ekhxVarD = cpprVarA.d();
                        ekhvVar.j(ekhxVarD);
                        ekqg ekqgVarListIterator = ekhxVarD.listIterator();
                        while (ekqgVarListIterator.hasNext()) {
                            ekhaVar.l((String) ekqgVarListIterator.next(), eqjvVar);
                        }
                        map.put(str, new ejwj(eqjvVar, cpprVarA));
                    } catch (RuntimeException e) {
                        ekrw ekrwVarJ = byos.b.j();
                        ekrwVarJ.X(eksq.a, "BugleCms");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumerDelegate", "prepareForConversationRestore", 975, "CmsConversationConsumerDelegate.java")).t("Failed to prepare a conversation to restore %s.", str);
                        ekgiVar.i(eqjvVar, e);
                    }
                    i++;
                }
                final ekhe ekheVarF = ekhaVar.f();
                final ekgb ekgbVarG = ekhvVar.g().g();
                eiju eijuVarE2 = eijx.e(null);
                if (!ekgbVarG.isEmpty()) {
                    if (ekgbVarG.isEmpty()) {
                        eijuVarE = eijx.e(ekoj.a);
                    } else {
                        final Optional optional2 = optional;
                        eijuVarE = byosVar.d.e(ekgbVarG).i(new eooz() { // from class: bymq
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                ekgp ekgpVar = (ekgp) obj;
                                final ekgi ekgiVar2 = new ekgi();
                                ekqg ekqgVarListIterator2 = ekgpVar.entrySet().listIterator();
                                while (ekqgVarListIterator2.hasNext()) {
                                    Map.Entry entry = (Map.Entry) ekqgVarListIterator2.next();
                                    if (((Optional) entry.getValue()).isEmpty()) {
                                        ekrw ekrwVarH = byos.b.h();
                                        ekrwVarH.X(eksq.a, "BugleCms");
                                        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumerDelegate", "fetchMissingParticipantsFromCmsForBatch", 1145, "CmsConversationConsumerDelegate.java")).t("Could not find participant:%s for conversation restore.", entry.getKey());
                                        ekgiVar2.i((String) entry.getKey(), new byoq());
                                    }
                                }
                                Optional optional3 = optional2;
                                ekgb ekgbVar3 = ekgbVarG;
                                final byos byosVar2 = byosVar;
                                Stream map2 = Collection.EL.stream(ekgpVar.values()).filter(new Predicate() { // from class: byms
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
                                    public final boolean test(Object obj2) {
                                        return ((Optional) obj2).isPresent();
                                    }
                                }).map(new Function() { // from class: bymt
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return (eqnl) ((Optional) obj2).get();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int i2 = ekgb.d;
                                ekgb ekgbVar4 = (ekgb) map2.collect(ekcv.a);
                                final int size2 = ekgbVar3.size();
                                return byosVar2.f.a(ekgbVar4, optional3, false).h(new ejvr() { // from class: bymu
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        ekgp ekgpVar2 = (ekgp) obj2;
                                        boolean zIsEmpty = ekgpVar2.isEmpty();
                                        final byos byosVar3 = byosVar2;
                                        if (!zIsEmpty) {
                                            Collection.EL.stream(ekgpVar2.entrySet()).limit(5L).forEach(new Consumer() { // from class: byoj
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void z(Object obj3) {
                                                    Map.Entry entry2 = (Map.Entry) obj3;
                                                    byosVar3.o.w(4, 0, (Throwable) entry2.getValue(), 0, ((eqnl) entry2.getKey()).c);
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            });
                                            throw new cpyv(12, cpyz.RETRY);
                                        }
                                        ekgp ekgpVarB = ekgiVar2.b();
                                        if (!ekgpVarB.isEmpty()) {
                                            byosVar3.g.f("Bugle.Cms.Restore.RestoreParticipantFromConversationConsumer", 2, ((ekoj) ekgpVarB).d);
                                        }
                                        if (size2 > ((ekoj) ekgpVarB).d) {
                                            byosVar3.g.f("Bugle.Cms.Restore.RestoreParticipantFromConversationConsumer", 1, r0 - r3);
                                        }
                                        return ekgpVarB;
                                    }
                                }, byosVar2.i);
                            }
                        }, byosVar.h).e(cpma.class, new ejvr() { // from class: bymr
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                ekrw ekrwVarJ2 = byos.b.j();
                                ekrwVarJ2.X(eksq.a, "BugleCms");
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g((cpma) obj)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumerDelegate", "fetchMissingParticipantsFromCmsForBatch", 1207, "CmsConversationConsumerDelegate.java")).q("Exception when looking up CMS participants");
                                throw new byoq();
                            }
                        }, byosVar.i);
                    }
                    eijuVarE2 = eijuVarE.h(new ejvr() { // from class: byoe
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            cqce cqceVar = byos.a;
                            ekqg ekqgVarListIterator2 = ((ekgp) obj).entrySet().listIterator();
                            while (ekqgVarListIterator2.hasNext()) {
                                ekhe ekheVar = ekheVarF;
                                Map.Entry entry = (Map.Entry) ekqgVarListIterator2.next();
                                ekqg ekqgVarListIterator3 = ekheVar.c((String) entry.getKey()).listIterator();
                                while (ekqgVarListIterator3.hasNext()) {
                                    Map map2 = map;
                                    ekgi ekgiVar2 = ekgiVar;
                                    eqjv eqjvVar2 = (eqjv) ekqgVarListIterator3.next();
                                    ekgiVar2.i(eqjvVar2, (Exception) entry.getValue());
                                    map2.remove(eqjvVar2.c);
                                }
                            }
                            return null;
                        }
                    }, byosVar.i);
                }
                final eiju eijuVarH = eijuVarE2.h(new ejvr() { // from class: byok
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        final byos byosVar2 = byosVar;
                        boolean zA = ((eoth) ((aqes) byosVar2.r).a.b()).a("bugle.enable_batch_conversation_restore");
                        final HashMap map2 = map;
                        final ekgi ekgiVar2 = ekgiVar;
                        if (!zA) {
                            return (ekgp) byosVar2.n.b(new ejxr() { // from class: bymv
                                @Override // defpackage.ejxr
                                public final Object get() {
                                    String str2;
                                    ConversationIdType conversationIdTypeA;
                                    ekgi ekgiVar3 = new ekgi();
                                    HashMap map3 = map2;
                                    Iterator it = map3.entrySet().iterator();
                                    while (true) {
                                        ekgi ekgiVar4 = ekgiVar2;
                                        byos byosVar3 = byosVar2;
                                        if (!it.hasNext()) {
                                            final ekgp ekgpVarC = ekgiVar3.c();
                                            cajh cajhVar = byosVar3.l;
                                            Stream map4 = Collection.EL.stream(map3.entrySet()).filter(new Predicate() { // from class: bynd
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
                                                public final boolean test(Object obj2) {
                                                    Map.Entry entry = (Map.Entry) obj2;
                                                    cqce cqceVar = byos.a;
                                                    return ekgpVarC.containsKey(entry.getKey()) && ((ejwj) entry.getValue()).b != null;
                                                }
                                            }).map(new Function() { // from class: byne
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo536andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj2) {
                                                    Map.Entry entry = (Map.Entry) obj2;
                                                    cqce cqceVar = byos.a;
                                                    String str3 = (String) entry.getKey();
                                                    cppd cppdVar = (cppd) ((ejwj) entry.getValue()).b;
                                                    ConversationIdType conversationIdType = (ConversationIdType) ekgpVarC.get(str3);
                                                    conversationIdType.getClass();
                                                    return new cajg(conversationIdType.a(), str3, cppdVar.e());
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            });
                                            int i2 = ekgb.d;
                                            cajhVar.a((List) map4.collect(ekcv.a), 3);
                                            return ekgiVar4.b();
                                        }
                                        Map.Entry entry = (Map.Entry) it.next();
                                        String str3 = (String) entry.getKey();
                                        try {
                                            cppd cppdVar = (cppd) ((ejwj) entry.getValue()).b;
                                            caim caimVar = byosVar3.m;
                                            cppdVar.getClass();
                                            str3.getClass();
                                            bojl bojlVarF = cppdVar.a().F();
                                            bojlVarF.as(new cnqj());
                                            bojh bojhVarA = bojlVarF.a();
                                            if (bojhVarA.k() == 2) {
                                                bojhVarA.getClass();
                                                bojl bojlVarF2 = bojhVarA.F();
                                                bojlVarF2.ak(caimVar.f.a(bojhVarA, bojhVarA.S()));
                                                bojh bojhVarA2 = bojlVarF2.a();
                                                cicq cicqVarW = cicr.w();
                                                bojhVarA2.getClass();
                                                caim.k(cicqVarW, bojhVarA2);
                                                ekgb ekgbVarC = cppdVar.c();
                                                ekgbVarC.getClass();
                                                ArrayList arrayList = new ArrayList(fcva.p(ekgbVarC, 10));
                                                Iterator<E> it2 = ekgbVarC.iterator();
                                                while (it2.hasNext()) {
                                                    arrayList.add(Long.valueOf(((bohm) it2.next()).k()));
                                                }
                                                final ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
                                                Iterator it3 = arrayList.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList2.add(String.valueOf(((Number) it3.next()).longValue()));
                                                }
                                                bsbo bsboVarE = ParticipantsTable.e();
                                                bsboVarE.A("CmsConversationRestoreBcmProxy#loadParticipants");
                                                bsboVarE.h(new Function() { // from class: caib
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj2) {
                                                        bsbx bsbxVar = (bsbx) obj2;
                                                        bsbxVar.m(arrayList2);
                                                        return bsbxVar;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                });
                                                cicqVarW.r(bsboVarE.b().z());
                                                ((ciai) cicqVarW).e = 3;
                                                conversationIdTypeA = caimVar.b(cicqVarW, cppdVar, bojhVarA2, false);
                                                str2 = str3;
                                            } else {
                                                bojhVarA.getClass();
                                                long jA = caimVar.j.a();
                                                Optional optionalR = caimVar.b.r(caimVar.c(cppdVar));
                                                epjf epjfVar = epjf.a;
                                                optionalR.getClass();
                                                epjfVar.getClass();
                                                conversationIdTypeA = caimVar.a(optionalR, bojhVarA, epjfVar, jA, cppdVar, str3, false);
                                                str2 = str3;
                                            }
                                            try {
                                                if (byosVar3.q.a() && cppdVar.f()) {
                                                    byosVar3.p.e(str2);
                                                }
                                                ekgiVar3.i(str2, conversationIdTypeA);
                                            } catch (RuntimeException e2) {
                                                e = e2;
                                                ekgiVar4.i((eqjv) ((ejwj) entry.getValue()).a, e);
                                                ekrw ekrwVarJ2 = byos.b.j();
                                                ekrwVarJ2.X(eksq.a, "BugleCms");
                                                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumerDelegate", "runConversationRestoreUsingBcm", 902, "CmsConversationConsumerDelegate.java")).t("Restore conversation failed for cmsId:%s", str2);
                                            }
                                        } catch (RuntimeException e3) {
                                            e = e3;
                                            str2 = str3;
                                        }
                                    }
                                }
                            });
                        }
                        final ekgp ekgpVar = (ekgp) Collection.EL.stream(map2.entrySet()).collect(ekcv.a(new bymc(), new Function() { // from class: bymn
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                cppd cppdVar = (cppd) ((ejwj) ((Map.Entry) obj2).getValue()).b;
                                cppdVar.getClass();
                                bojh bojhVarA = cppdVar.a();
                                byos byosVar3 = byosVar2;
                                if (byosVar3.q.a() && cppdVar.f()) {
                                    bzap bzapVar = byosVar3.p;
                                    String strS = bojhVarA.S();
                                    strS.getClass();
                                    bzapVar.e(strS);
                                }
                                return bojhVarA;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }));
                        return (ekgp) byosVar2.n.c("runBatchedConversationRestore", new ejxr() { // from class: bync
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:128:0x06c4 A[LOOP:3: B:126:0x06be->B:128:0x06c4, LOOP_END] */
                            /* JADX WARN: Removed duplicated region for block: B:148:0x048c A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:92:0x0486  */
                            /* JADX WARN: Type inference failed for: r19v10 */
                            /* JADX WARN: Type inference failed for: r19v14 */
                            /* JADX WARN: Type inference failed for: r19v15 */
                            /* JADX WARN: Type inference failed for: r19v16 */
                            /* JADX WARN: Type inference failed for: r19v17 */
                            /* JADX WARN: Type inference failed for: r19v18 */
                            /* JADX WARN: Type inference failed for: r19v5 */
                            /* JADX WARN: Type inference failed for: r19v6 */
                            /* JADX WARN: Type inference failed for: r19v7 */
                            /* JADX WARN: Type inference failed for: r19v8 */
                            /* JADX WARN: Type inference failed for: r19v9 */
                            @Override // defpackage.ejxr
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object get() throws java.lang.Throwable {
                                /*
                                    Method dump skipped, instructions count: 1772
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.bync.get():java.lang.Object");
                            }
                        });
                    }
                }, byosVar.h);
                eooz eoozVar = new eooz() { // from class: byol
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return byosVar.c(ekgbVar2.size() - ((ekgp) obj).size());
                    }
                };
                eosc eoscVar = byosVar.i;
                return eijuVarH.i(eoozVar, eoscVar).i(new eooz() { // from class: byom
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        cqce cqceVar = byos.a;
                        return eijx.e((ekgp) eork.q(eijuVarH));
                    }
                }, eoscVar);
            }
        }, this.h).f(Exception.class, new eooz() { // from class: bymm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ekrg ekrgVar = byos.b;
                ekrw ekrwVarJ = ekrgVar.j();
                ekrz ekrzVar = eksq.a;
                ekrwVarJ.X(ekrzVar, "BugleCms");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g((Exception) obj)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumerDelegate", "executeRestoreCmsItemDataList", 307, "CmsConversationConsumerDelegate.java")).q("Conversation restore failed as a batch.");
                ekrw ekrwVarH = ekrgVar.h();
                ekrwVarH.X(ekrzVar, "BugleCms");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumerDelegate", "executeRestoreCmsItemDataList", 309, "CmsConversationConsumerDelegate.java")).q("Conversation restore falling back to one-by-one.");
                final ekgi ekgiVar = new ekgi();
                ekgb ekgbVar2 = ekgbVar;
                eiju eijuVarE = eijx.e(null);
                int size = ekgbVar2.size();
                for (int i = 0; i < size; i++) {
                    final byos byosVar = this.a;
                    final eqjv eqjvVar = (eqjv) ekgbVar2.get(i);
                    eooz eoozVar = new eooz() { // from class: byog
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            return byosVar.a(eqjvVar, true);
                        }
                    };
                    eosc eoscVar = byosVar.i;
                    eijuVarE = eijuVarE.i(eoozVar, eoscVar).e(Exception.class, new ejvr() { // from class: byoh
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            Exception exc = (Exception) obj2;
                            ekrw ekrwVarJ2 = byos.b.j();
                            ekrwVarJ2.X(eksq.a, "BugleCms");
                            ekrd ekrdVar = (ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(exc)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumerDelegate", "fallbackToOneByOneRestore", 940, "CmsConversationConsumerDelegate.java");
                            eqjv eqjvVar2 = eqjvVar;
                            ekrdVar.t("A conversation restore failed. Id:%s", eqjvVar2.c);
                            ekgiVar.i(eqjvVar2, exc);
                            return null;
                        }
                    }, eoscVar);
                }
                return eijuVarE.h(new ejvr() { // from class: byoi
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cqce cqceVar = byos.a;
                        return ekgiVar.b();
                    }
                }, eoqg.a);
            }
        }, this.i);
        return this.q.a() ? eijuVarF.i(new eooz() { // from class: bymo
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ekgp ekgpVar = (ekgp) obj;
                return this.a.p.a().h(new ejvr() { // from class: bynu
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cqce cqceVar = byos.a;
                        return ekgpVar;
                    }
                }, eoqg.a);
            }
        }, eoqg.a) : eijuVarF;
    }

    public final eiju c(int i) {
        return (cpyl.a() && this.v.a() && !this.y.a()) ? this.w.t(i) : eijx.e(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [alqm, java.lang.Object] */
    public final eiju d(final cppd cppdVar, final eqjv eqjvVar, final boolean z) {
        long jA;
        Optional optionalOfNullable;
        ekgb ekgbVarR;
        appa appaVar = this.q;
        final bojh bojhVarA = cppdVar.a();
        if (appaVar.a() && ((cppr) cppdVar).g && !TextUtils.isEmpty(bojhVarA.S())) {
            this.p.e(bojhVarA.S());
        }
        if (((Boolean) avos.a.e()).booleanValue()) {
            caim caimVar = this.m;
            String str = eqjvVar.c;
            str.getClass();
            return auvw.c(caimVar.g, fcyi.a, fdjz.a, new caij(z, cppdVar, caimVar, str, null)).i(new eooz() { // from class: byof
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return z ? this.a.c(1) : eijx.e(null);
                }
            }, this.i);
        }
        if (bojhVarA.k() == 2) {
            String str2 = ((cppq) ((cppr) cppdVar).f).get().k;
            if (true == TextUtils.isEmpty(str2)) {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                throw new byor();
            }
            bywk bywkVar = this.u;
            if (bojhVarA.k() != 2) {
                throw new bywi();
            }
            String strA = bywkVar.f.a(bojhVarA, bojhVarA.S());
            if (strA != null) {
                ekgbVarR = ekgb.r(bywkVar.d.a(strA, str2, bojhVarA.Y()));
            } else {
                eksl ekslVar = (eksl) bywk.a.j();
                ekslVar.X(bzmz.h, bojhVarA.S());
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantAndConversationToTelephonyPersister", "createParticipantsForRcsGroupConversation", 149, "CmsParticipantAndConversationToTelephonyPersister.java")).q("Cannot get MSISDN when creating fake participants name for Rcs group conversation");
                int i = ekgb.d;
                ekgbVarR = ekoe.a;
            }
            jA = bywkVar.a(ekgbVarR, bojhVarA);
        } else {
            bywk bywkVar2 = this.u;
            int i2 = ekgb.d;
            ekgb ekgbVar = ekoe.a;
            ekgb ekgbVarC = cppdVar.c();
            if (bojhVarA.k() == 2) {
                throw new bywj();
            }
            ArrayList arrayList = new ArrayList();
            int size = ekgbVarC.size();
            for (int i3 = 0; i3 < size; i3++) {
                long jK = ((bohm) ekgbVarC.get(i3)).k();
                ParticipantsTable.BindData bindDataB = ((bbca) bywkVar2.b.b()).b(String.valueOf(jK));
                if (bindDataB == null) {
                    throw new cajp(String.format(Locale.US, "Restore for participant %d failed", Long.valueOf(jK)));
                }
                Optional optionalOf = Optional.of(bywkVar2.e.q(bindDataB));
                optionalOf.isPresent();
                String strO = ((alqk) optionalOf.get()).o();
                optionalOf.isPresent();
                if (optionalOf.get().D()) {
                    throw new cajo(String.format(Locale.US, "Normalized destination for participant %d is not restored properly", Long.valueOf(jK)));
                }
                arrayList.add(strO);
            }
            jA = bywkVar2.a(ekgb.n(arrayList), bojhVarA);
        }
        bojl bojlVarF = bojhVarA.F();
        bojlVarF.as(cnqj.b(jA));
        bywk bywkVar3 = this.u;
        final bojh bojhVarA2 = bojlVarF.a();
        bywkVar3.c.L(jA, bojhVarA2.G().d());
        final epjf epjfVarE = cpyl.a() ? cppdVar.e() : epjf.a;
        cogw cogwVar = this.x;
        bzwj bzwjVar = this.t;
        long jA2 = cogwVar.a();
        String strS = bojhVarA2.S();
        if (strS == null) {
            optionalOfNullable = Optional.empty();
        } else {
            bojh bojhVarA3 = botm.a(strS);
            if (bojhVarA3 != null) {
                ((ains) ((bzwm) bzwjVar).a.b()).e("Bugle.Cms.Restore.Conversation.Outcome", 3);
            }
            optionalOfNullable = Optional.ofNullable(bojhVarA3);
        }
        if (!optionalOfNullable.isPresent()) {
            final cnqj cnqjVarN = bojhVarA2.N();
            if (cnqjVarN.d()) {
                optionalOfNullable = Optional.empty();
            } else {
                botb botbVarE = botm.e();
                botbVarE.A("findDuplicationWithSameThreadId");
                botbVarE.i(new Function() { // from class: bzwk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        botl botlVar = (botl) obj;
                        botlVar.L(cnqjVarN);
                        return botlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bopr boprVar = (bopr) botbVarE.b().p();
                try {
                    if (boprVar.moveToFirst()) {
                        ((ains) ((bzwm) bzwjVar).a.b()).e("Bugle.Cms.Restore.Conversation.Outcome", 4);
                        Optional optionalOf2 = Optional.of((bojh) boprVar.cQ());
                        boprVar.close();
                        optionalOfNullable = optionalOf2;
                    } else {
                        boprVar.close();
                        optionalOfNullable = Optional.empty();
                    }
                } finally {
                }
            }
        }
        if (!optionalOfNullable.isPresent()) {
            this.g.e("Bugle.Cms.Restore.Conversation.Outcome", 5);
            return eijx.e((ConversationIdType) this.n.c("CmsConversationConsumer#restoreCmsItemData", new ejxr() { // from class: byon
                @Override // defpackage.ejxr
                public final Object get() {
                    bojh bojhVar = bojhVarA2;
                    eqjv eqjvVar2 = eqjvVar;
                    ConversationIdType conversationIdTypeA = byox.a(bojhVar, eqjvVar2.c);
                    byox.d(cppdVar, conversationIdTypeA);
                    byos byosVar = this.a;
                    if (cpyl.a()) {
                        byosVar.l.b(epjfVarE, conversationIdTypeA.toString(), eqjvVar2.c, 3);
                    }
                    byosVar.j.c(conversationIdTypeA, bojhVarA);
                    return conversationIdTypeA;
                }
            })).h(new ejvr() { // from class: byoo
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    cqce cqceVar = byos.a;
                    byox.b((ConversationIdType) obj);
                    return null;
                }
            }, this.h);
        }
        ConversationIdType conversationIdTypeC = ((bojh) optionalOfNullable.get()).C();
        bzwjVar.a(bojhVarA2, epjfVarE, conversationIdTypeC);
        this.j.c(conversationIdTypeC, bojhVarA);
        this.g.g("Bugle.Cms.Restore.Conversation.DuplicateSearchDuration", cogwVar.a() - jA2);
        return eijx.e(null);
    }
}
