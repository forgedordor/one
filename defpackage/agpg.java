package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.knowledge.hobbes.chat.p13n.features.PredicatesAggregator;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agpg implements agpc {
    public final agpj a;
    public final eosc b;
    public final agoz c;
    private final agpi d;

    public agpg(agoz agozVar, agpi agpiVar, agpj agpjVar, eosc eoscVar) {
        this.c = agozVar;
        this.d = agpiVar;
        this.a = agpjVar;
        this.b = eoscVar;
    }

    public final eiju a(final Queue queue) {
        eijs eijsVarF;
        if (queue.isEmpty()) {
            return eijx.e(null);
        }
        final Instant instant = (Instant) queue.remove();
        final agpi agpiVar = this.d;
        Instant instantB = barq.b(instant.toEpochMilli());
        final agpb agpbVar = new agpb(instantB.toEpochMilli(), instantB.plus(Duration.ofDays(1L)).minusMillis(1L).toEpochMilli());
        final agqj agqjVar = agpiVar.d;
        if (agqjVar.d.a()) {
            eiju eijuVarG = eiju.g(agqjVar.b.d(ejlx.a((String) agqj.a.e())));
            ejvr ejvrVar = new ejvr() { // from class: agqi
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Optional optional = (Optional) obj;
                    cczi ccziVar = agqj.a;
                    return optional.isEmpty() ? optional : Optional.of(Uri.parse(((String) optional.get()).replace("android://", "file:///data/user/0/")).toString());
                }
            };
            eosc eoscVar = agqjVar.c;
            eijsVarF = eijs.c(eijuVarG.h(ejvrVar, eoscVar)).f(new eopo() { // from class: agqh
                /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
                @Override // defpackage.eopo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object a(defpackage.eopt r7, java.lang.Object r8) {
                    /*
                        r6 = this;
                        j$.util.Optional r8 = (j$.util.Optional) r8
                        r8.getClass()
                        boolean r0 = r8.isEmpty()
                        agqj r1 = r1
                        if (r0 == 0) goto L12
                        j$.util.Optional r7 = j$.util.Optional.empty()
                        return r7
                    L12:
                        java.lang.Object r8 = r8.get()     // Catch: java.lang.Exception -> L66
                        java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L66
                        euox r0 = defpackage.euox.a     // Catch: java.lang.Exception -> L66
                        evsf r0 = r0.createBuilder()     // Catch: java.lang.Exception -> L66
                        euow r0 = (defpackage.euow) r0     // Catch: java.lang.Exception -> L66
                        r0.copyOnWrite()     // Catch: java.lang.Exception -> L66
                        MessageType extends evsn<MessageType, BuilderType> r2 = r0.instance     // Catch: java.lang.Exception -> L66
                        euox r2 = (defpackage.euox) r2     // Catch: java.lang.Exception -> L66
                        r2.b = r8     // Catch: java.lang.Exception -> L66
                        evsn r8 = r0.build()     // Catch: java.lang.Exception -> L66
                        euox r8 = (defpackage.euox) r8     // Catch: java.lang.Exception -> L66
                        euov r0 = defpackage.euov.a     // Catch: java.lang.Exception -> L66
                        evsf r0 = r0.createBuilder()     // Catch: java.lang.Exception -> L66
                        euou r0 = (defpackage.euou) r0     // Catch: java.lang.Exception -> L66
                        r0.copyOnWrite()     // Catch: java.lang.Exception -> L66
                        MessageType extends evsn<MessageType, BuilderType> r2 = r0.instance     // Catch: java.lang.Exception -> L66
                        euov r2 = (defpackage.euov) r2     // Catch: java.lang.Exception -> L66
                        r8.getClass()     // Catch: java.lang.Exception -> L66
                        r2.c = r8     // Catch: java.lang.Exception -> L66
                        int r8 = r2.b     // Catch: java.lang.Exception -> L66
                        r8 = r8 | 2
                        r2.b = r8     // Catch: java.lang.Exception -> L66
                        evsn r8 = r0.build()     // Catch: java.lang.Exception -> L66
                        euov r8 = (defpackage.euov) r8     // Catch: java.lang.Exception -> L66
                        byte[] r8 = r8.toByteArray()     // Catch: java.lang.Exception -> L66
                        com.google.knowledge.hobbes.chat.p13n.features.PredicatesAggregator r0 = new com.google.knowledge.hobbes.chat.p13n.features.PredicatesAggregator     // Catch: java.lang.Exception -> L66
                        long r2 = com.google.knowledge.hobbes.chat.p13n.features.PredicatesAggregator.nativeCreatePredicateEvaluator(r8)     // Catch: java.lang.Exception -> L66
                        r0.<init>(r2)     // Catch: java.lang.Exception -> L66
                        eosc r8 = r1.c     // Catch: java.lang.Exception -> L66
                        r7.a(r0, r8)     // Catch: java.lang.Exception -> L66
                        j$.util.Optional r7 = j$.util.Optional.of(r0)     // Catch: java.lang.Exception -> L66
                        return r7
                    L66:
                        r7 = move-exception
                        java.lang.String r8 = r7.getMessage()
                        if (r8 == 0) goto L72
                        java.lang.String r8 = r7.getMessage()
                        goto L74
                    L72:
                        java.lang.String r8 = ""
                    L74:
                        int r0 = r8.hashCode()
                        r2 = -1642953530(0xffffffff9e1284c6, float:-7.7566325E-21)
                        r3 = 1
                        java.lang.String r4 = "SENTENCE_PIECE_CONFIG_IS_EMPTY"
                        java.lang.String r5 = "SENTENCE_PIECE_CONFIG_NOT_FOUND"
                        if (r0 == r2) goto L90
                        r2 = 615976424(0x24b70de8, float:7.938716E-17)
                        if (r0 == r2) goto L88
                        goto L98
                    L88:
                        boolean r8 = r8.equals(r4)
                        if (r8 == 0) goto L98
                        r8 = 0
                        goto L99
                    L90:
                        boolean r8 = r8.equals(r5)
                        if (r8 == 0) goto L98
                        r8 = r3
                        goto L99
                    L98:
                        r8 = -1
                    L99:
                        if (r8 == 0) goto La7
                        if (r8 == r3) goto La3
                        java.lang.String r8 = "UNKNOWN_PREDICATES_AGGREGATOR_ERROR"
                        r1.a(r8, r7)
                        goto Laa
                    La3:
                        r1.a(r5, r7)
                        goto Laa
                    La7:
                        r1.a(r4, r7)
                    Laa:
                        j$.util.Optional r7 = j$.util.Optional.empty()
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.agqh.a(eopt, java.lang.Object):java.lang.Object");
                }
            }, eoscVar);
        } else {
            eijsVarF = eijs.c(eijx.e(Optional.empty()));
        }
        return eijsVarF.f(new eopo() { // from class: agph
            @Override // defpackage.eopo
            public final Object a(eopt eoptVar, Object obj) {
                Optional optional = (Optional) obj;
                optional.getClass();
                if (optional.isEmpty()) {
                    return Optional.empty();
                }
                agpb agpbVar2 = agpbVar;
                agpi agpiVar2 = agpiVar;
                baxe baxeVar = (baxe) agpiVar2.c.a.b();
                Object objE = agpz.b.e();
                objE.getClass();
                int iIntValue = ((Number) objE).intValue();
                final long j = agpbVar2.a;
                final long j2 = agpbVar2.b;
                eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getSentMessages");
                try {
                    ecem.b();
                    ArrayList arrayList = new ArrayList();
                    brdr brdrVarD = MessagesTable.d();
                    brdrVarD.A("getSentMessages");
                    brdrVarD.h(new Function() { // from class: bauu
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            brec brecVar = (brec) obj2;
                            cqce cqceVar = baxe.a;
                            brecVar.ah(avbn.f);
                            brecVar.Z(j);
                            brecVar.ap(new dqty("messages.sent_timestamp", 10, Long.valueOf(j2)));
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brdrVarD.y(iIntValue);
                    brap brapVar = (brap) brdrVarD.b().p();
                    while (brapVar.moveToNext()) {
                        try {
                            MessageCoreData messageCoreDataA = ((bveg) baxeVar.e.b()).a();
                            messageCoreDataA.aO(brapVar);
                            ((bbae) baxeVar.f.b()).c(messageCoreDataA, false);
                            baxeVar.O(messageCoreDataA);
                            arrayList.add(messageCoreDataA);
                        } finally {
                        }
                    }
                    brapVar.close();
                    eieuVarK.close();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String strAs = ((MessageCoreData) it.next()).as();
                        if (strAs != null) {
                            arrayList2.add(strAs);
                        }
                    }
                    ekgb ekgbVarA = ekfv.a(arrayList2);
                    if (ekgbVarA.isEmpty()) {
                        return Optional.empty();
                    }
                    PredicatesAggregator predicatesAggregator = (PredicatesAggregator) optional.get();
                    try {
                        int size = ekgbVarA.size();
                        ekgi ekgiVar = new ekgi();
                        ekgiVar.g(predicatesAggregator.a(ekgbVarA));
                        ekgiVar.i((String) agpz.c.e(), Integer.valueOf(size));
                        return Optional.of(ekgiVar.b());
                    } catch (euoq e) {
                        agpiVar2.a.o("Error calculating p13n features", e);
                        return Optional.empty();
                    }
                } catch (Throwable th) {
                    try {
                        eieuVarK.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, agpiVar.b).h().i(new eooz() { // from class: agpd
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return eijx.e(null);
                }
                final Queue queue2 = queue;
                final Instant instant2 = instant;
                final agpg agpgVar = this.a;
                final ekgp ekgpVar = (ekgp) optional.get();
                final Instant instantMinus = instant2.minus(Duration.ofDays(1L));
                final agpy agpyVar = (agpy) agpgVar.a;
                return eijx.f(new Runnable() { // from class: agpk
                    @Override // java.lang.Runnable
                    public final void run() {
                        final Instant instantB2 = barq.b(instantMinus.toEpochMilli());
                        String[] strArr = brgt.a;
                        String[] strArr2 = brgt.a;
                        final brgq brgqVar = new brgq(strArr2);
                        brgqVar.A("getLatestDecayedFeaturesBeforeDate-p13_decayed_feature_values_table1");
                        brgqVar.e(new Function() { // from class: crho
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                brgs brgsVar = (brgs) obj2;
                                brgsVar.ap(new dqpj("smarts_personalization_decayed_feature_values.date", 10, Long.valueOf(barq.a(instantB2))));
                                return brgsVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        brgqVar.c(new brgn(brgt.c.b));
                        brgqVar.y(1);
                        brgq brgqVar2 = new brgq(strArr2);
                        brgqVar2.A("getLatestDecayedFeaturesBeforeDate-p13_decayed_feature_values_table2");
                        brgqVar2.e(new Function() { // from class: crhp
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                brgs brgsVar = (brgs) obj2;
                                Function function = new Function() { // from class: crhx
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function2) {
                                        return Function$CC.$default$andThen(this, function2);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        return ((brgd) obj3).b;
                                    }

                                    public final /* synthetic */ Function compose(Function function2) {
                                        return Function$CC.$default$compose(this, function2);
                                    }
                                };
                                brgq brgqVar3 = brgqVar;
                                brgqVar3.d(function);
                                brgsVar.ap(new dqpk("smarts_personalization_decayed_feature_values.date", 1, brgqVar3.b()));
                                return brgsVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        brgf brgfVar = (brgf) brgqVar2.b().p();
                        try {
                            ekgi ekgiVar = new ekgi();
                            while (brgfVar.moveToNext()) {
                                final brfq brfqVar = (brfq) brgfVar.cQ();
                                brhs brhsVarA = brhv.a();
                                brhsVarA.A("getLatestDecayedFeaturesBeforeDate-p13_features1");
                                brhsVarA.c(new Function() { // from class: crhq
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        brfq brfqVar2 = brfqVar;
                                        brhu brhuVar = (brhu) obj2;
                                        brfqVar2.aA(0, "feature_id");
                                        brhuVar.ap(new dqpj("smarts_personalization_features.feature_id", 1, Long.valueOf(bash.a(brfqVar2.a))));
                                        return brhuVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                brhj brhjVar = (brhj) brhsVarA.b().p();
                                try {
                                    ejwl.b(brhjVar.getCount() == 1, "No feature id for feature: ");
                                    brgx brgxVar = (brgx) brhjVar.cS();
                                    if (brgxVar != null) {
                                        String str = brgxVar.m().b;
                                        if (!TextUtils.isEmpty(str)) {
                                            brfqVar.aA(2, "feature_value");
                                            ekgiVar.i(str, Float.valueOf(brfqVar.c));
                                        }
                                    }
                                    brhjVar.close();
                                } finally {
                                }
                            }
                            ekgp ekgpVarC = ekgiVar.c();
                            final Instant instant3 = instant2;
                            final ekgp ekgpVar2 = ekgpVar;
                            final agpy agpyVar2 = agpyVar;
                            brgfVar.close();
                            final ekgp ekgpVarA = agpy.a(ekgpVarC, new Function() { // from class: agpu
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    cczi ccziVar = agpy.a;
                                    return Float.valueOf(((Float) ((Map.Entry) obj2).getValue()).floatValue() * ((Float) agpy.a.e()).floatValue());
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            ekhv ekhvVar = new ekhv();
                            ekhvVar.j(ekgpVar2.keySet());
                            ekhvVar.j(ekgpVarA.keySet());
                            final ekgp ekgpVar3 = (ekgp) Collection.EL.stream(ekhvVar.g()).collect(ekcv.a(new Function() { // from class: agpm
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    String str2 = (String) obj2;
                                    cczi ccziVar = agpy.a;
                                    return str2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: agpn
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    String str2 = (String) obj2;
                                    cczi ccziVar = agpy.a;
                                    return Float.valueOf(((Integer) ekgpVar2.getOrDefault(str2, 0)).intValue() + ((Float) ekgpVarA.getOrDefault(str2, Float.valueOf(0.0f))).floatValue());
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }));
                            final float fFloatValue = ((Float) ekgpVar3.getOrDefault(agpz.c.e(), Float.valueOf(1.0f))).floatValue();
                            ekgp ekgpVar4 = (ekgp) Collection.EL.stream(ekgpVar3.entrySet()).filter(new Predicate() { // from class: agpp
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
                                    cczi ccziVar = agpy.a;
                                    return !((String) ((Map.Entry) obj2).getKey()).equals(agpz.c.e());
                                }
                            }).collect(ekcv.a(new Function() { // from class: agpq
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return (String) ((Map.Entry) obj2).getKey();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: agpr
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return (Float) ((Map.Entry) obj2).getValue();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }));
                            final TreeMap treeMap = new TreeMap(new Comparator() { // from class: agpv
                                @Override // java.util.Comparator
                                public final int compare(Object obj2, Object obj3) {
                                    Map.Entry entry = (Map.Entry) obj2;
                                    Map.Entry entry2 = (Map.Entry) obj3;
                                    cczi ccziVar = agpy.a;
                                    int iCompareTo = ((Comparable) entry.getValue()).compareTo(entry2.getValue());
                                    if (iCompareTo == 0) {
                                        iCompareTo = ((Comparable) entry.getKey()).compareTo(entry2.getKey());
                                    }
                                    return -iCompareTo;
                                }
                            });
                            Collection.EL.stream(ekgpVar4.entrySet()).forEach(new Consumer() { // from class: agpw
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj2) {
                                    Map.Entry entry = (Map.Entry) obj2;
                                    cczi ccziVar = agpy.a;
                                    Comparable comparable = (Comparable) entry.getKey();
                                    TreeMap treeMap2 = treeMap;
                                    treeMap2.put(entry, comparable);
                                    if (treeMap2.size() > ((Integer) agpy.b.e()).intValue()) {
                                        treeMap2.pollLastEntry();
                                    }
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            final ekgp ekgpVarA2 = agpy.a((ekgp) Collection.EL.stream(treeMap.keySet()).collect(ekcv.a(new Function() { // from class: agpx
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return (Comparable) ((Map.Entry) obj2).getKey();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: agpl
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return (Comparable) ((Map.Entry) obj2).getValue();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            })), new Function() { // from class: agps
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    cczi ccziVar = agpy.a;
                                    return Float.valueOf(((Float) ((Map.Entry) obj2).getValue()).floatValue() / fFloatValue);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            agpyVar2.d.d("P13nFeatureWriter#insertFeatures", new Runnable() { // from class: agpo
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Instant instant4 = instant3;
                                    final Instant instantB3 = barq.b(instant4.toEpochMilli());
                                    eieu eieuVarK = eiiy.k("P13nFeaturesDatabaseOperationsImpl#insertDecayedFeatures");
                                    crid cridVar = agpyVar2.e;
                                    final ekgp ekgpVar5 = ekgpVarA2;
                                    final ekgp ekgpVar6 = ekgpVar3;
                                    try {
                                        ecem.b();
                                        final AtomicReference atomicReference = new AtomicReference();
                                        dqsn dqsnVar = cridVar.a;
                                        dqsnVar.d("P13nFeaturesDatabaseOperationsImpl#insertDecayedFeatures", new Runnable() { // from class: crhs
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                brhs brhsVarA2 = brhv.a();
                                                brhsVarA2.A("+getOrCreateFeatureIds");
                                                final ekgp ekgpVar7 = ekgpVar6;
                                                brhsVarA2.c(new Function() { // from class: crhn
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj2) {
                                                        brhu brhuVar = (brhu) obj2;
                                                        Stream map = Collection.EL.stream(ekgpVar7.keySet()).map(new Function() { // from class: crhr
                                                            @Override // java.util.function.Function
                                                            /* renamed from: andThen */
                                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                                return Function$CC.$default$andThen(this, function);
                                                            }

                                                            @Override // java.util.function.Function
                                                            public final Object apply(Object obj3) {
                                                                return basi.a((String) obj3);
                                                            }

                                                            public final /* synthetic */ Function compose(Function function) {
                                                                return Function$CC.$default$compose(this, function);
                                                            }
                                                        });
                                                        int i = ekgb.d;
                                                        Iterable iterable = (Iterable) map.collect(ekcv.a);
                                                        int iIntValue = brhv.c().intValue();
                                                        if (iIntValue < 54060) {
                                                            dqru.x("feature", iIntValue);
                                                        }
                                                        ekfw ekfwVar = new ekfw();
                                                        Iterator it = iterable.iterator();
                                                        while (it.hasNext()) {
                                                            ekfwVar.h(String.valueOf(basi.d((basi) it.next())));
                                                        }
                                                        brhuVar.ap(new dqpm("smarts_personalization_features.feature", 3, brhu.as(ekfwVar.g()), false));
                                                        return brhuVar;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                });
                                                ekgb ekgbVarZ = brhsVarA2.b().z();
                                                final Set set = (Set) Collection.EL.stream(ekgbVarZ).map(new Function() { // from class: crhu
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj2) {
                                                        return basi.e(((brgx) obj2).m());
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }).collect(ekcv.b);
                                                Stream streamFilter = Collection.EL.stream(ekgpVar7.keySet()).filter(new Predicate() { // from class: crhy
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
                                                        return !set.contains((String) obj2);
                                                    }
                                                });
                                                final Instant instant5 = instantB3;
                                                brgx[] brgxVarArr = (brgx[]) streamFilter.map(new Function() { // from class: crhz
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj2) {
                                                        String[] strArr3 = brhv.a;
                                                        brha brhaVar = new brha();
                                                        brhaVar.b(basi.a((String) obj2));
                                                        brhaVar.d(instant5);
                                                        return brhaVar.a();
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }).toArray(new IntFunction() { // from class: cria
                                                    @Override // java.util.function.IntFunction
                                                    public final Object apply(int i) {
                                                        return new brgx[i];
                                                    }
                                                });
                                                long[] jArrB = dqru.B(brhv.b(), 0, true, new BiConsumer() { // from class: brgv
                                                    @Override // java.util.function.BiConsumer
                                                    public final void accept(Object obj2, Object obj3) {
                                                        brgx brgxVar2 = (brgx) obj2;
                                                        Long l = (Long) obj3;
                                                        String[] strArr3 = brhv.a;
                                                        if (l.longValue() >= 0) {
                                                            brgxVar2.a = new bash(l.longValue());
                                                            brgxVar2.fN(0);
                                                        }
                                                    }

                                                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                                                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                                                    }
                                                }, brgxVarArr);
                                                if (jArrB == null) {
                                                    throw new IllegalStateException("Unable to insert missing P13n features");
                                                }
                                                for (int i = 0; i < brgxVarArr.length; i++) {
                                                    brgx brgxVar2 = brgxVarArr[i];
                                                    brha brhaVar = new brha();
                                                    BitSet bitSet = brgxVar2.cL;
                                                    brhaVar.az = bitSet == null ? null : (BitSet) bitSet.clone();
                                                    BitSet bitSet2 = brhaVar.az;
                                                    if (bitSet2 == null || bitSet2.get(0)) {
                                                        brhaVar.a = brgxVar2.k();
                                                    }
                                                    BitSet bitSet3 = brhaVar.az;
                                                    if (bitSet3 == null || bitSet3.get(1)) {
                                                        brhaVar.b = brgxVar2.m();
                                                    }
                                                    BitSet bitSet4 = brhaVar.az;
                                                    if (bitSet4 == null || bitSet4.get(2)) {
                                                        brgxVar2.aA(2, "start_date");
                                                        brhaVar.c = brgxVar2.c;
                                                    }
                                                    brhaVar.c(new bash(jArrB[i]));
                                                    brgxVarArr[i] = brhaVar.a();
                                                }
                                                AtomicReference atomicReference2 = atomicReference;
                                                int i2 = ekgb.d;
                                                ekfw ekfwVar = new ekfw();
                                                ekfwVar.j(ekgbVarZ);
                                                ekfwVar.j(Arrays.asList(brgxVarArr));
                                                atomicReference2.set((ekgp) Collection.EL.stream(ekfwVar.g()).collect(ekcv.a(new Function() { // from class: crhv
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj2) {
                                                        return ((brgx) obj2).m();
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }, new Function() { // from class: crhw
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj2) {
                                                        return ((brgx) obj2).k();
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                })));
                                            }
                                        });
                                        final ekgp ekgpVar7 = (ekgp) atomicReference.get();
                                        dqsnVar.d("P13nFeaturesDatabaseOperationsImpl#insertDecayedFeatures", new Runnable() { // from class: cric
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final ekgp ekgpVar8 = ekgpVar7;
                                                final Instant instant5 = instantB3;
                                                Map.EL.forEach(ekgpVar6, new BiConsumer() { // from class: crib
                                                    @Override // java.util.function.BiConsumer
                                                    public final void accept(Object obj2, Object obj3) {
                                                        String str2 = (String) obj2;
                                                        Float f = (Float) obj3;
                                                        bash bashVar = (bash) ekgpVar8.get(basi.a(str2));
                                                        if (bashVar == null) {
                                                            throw new IllegalStateException("Feature id not present for feature:".concat(String.valueOf(str2)));
                                                        }
                                                        Instant instant6 = instant5;
                                                        String[] strArr3 = brgt.a;
                                                        brfv brfvVar = new brfv();
                                                        brfvVar.b(instant6);
                                                        brfvVar.c(bashVar);
                                                        brfvVar.d(f.floatValue());
                                                        brfq brfqVarA = brfvVar.a(new Supplier() { // from class: brfs
                                                            @Override // java.util.function.Supplier
                                                            public final Object get() {
                                                                return new brfr();
                                                            }
                                                        });
                                                        final dqsy dqsyVarA = brgt.a();
                                                        dqru.b(brgt.a(), "smarts_personalization_decayed_feature_values", brfqVarA, new Function() { // from class: brfm
                                                            @Override // java.util.function.Function
                                                            /* renamed from: andThen */
                                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                                return Function$CC.$default$andThen(this, function);
                                                            }

                                                            @Override // java.util.function.Function
                                                            public final Object apply(Object obj4) {
                                                                return Long.valueOf(dqsyVarA.P("smarts_personalization_decayed_feature_values", (dqst) obj4));
                                                            }

                                                            public final /* synthetic */ Function compose(Function function) {
                                                                return Function$CC.$default$compose(this, function);
                                                            }
                                                        }, new Consumer() { // from class: brfn
                                                            @Override // java.util.function.Consumer
                                                            /* renamed from: accept */
                                                            public final void z(Object obj4) {
                                                            }

                                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                                return Consumer$CC.$default$andThen(this, consumer);
                                                            }
                                                        });
                                                    }

                                                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                                                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                                                    }
                                                });
                                            }
                                        });
                                        eieuVarK.close();
                                        final Instant instantB4 = barq.b(instant4.toEpochMilli());
                                        eieuVarK = eiiy.k("P13nFeaturesDatabaseOperationsImpl#insertNormalizedFeatures");
                                        try {
                                            ecem.b();
                                            cridVar.a.d("P13nFeaturesDatabaseOperationsImpl#insertNormalizedFeatures", new Runnable() { // from class: crht
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    String[] strArr3 = briz.a;
                                                    brir brirVar = new brir();
                                                    brirVar.f("insertNormalizedFeatures");
                                                    brirVar.d();
                                                    brif brifVar = new brif();
                                                    brifVar.b(instantB4);
                                                    ekgp ekgpVar8 = ekgpVar5;
                                                    ekgpVar8.getClass();
                                                    ejqp ejqpVar = (ejqp) ejqq.a.createBuilder();
                                                    ejqpVar.getClass();
                                                    Set<Map.Entry> setEntrySet = ekgpVar8.entrySet();
                                                    setEntrySet.getClass();
                                                    for (Map.Entry entry : setEntrySet) {
                                                        String str2 = (String) entry.getKey();
                                                        float fFloatValue2 = ((Number) entry.getValue()).floatValue();
                                                        ejqn ejqnVar = (ejqn) ejqo.a.createBuilder();
                                                        ejqnVar.getClass();
                                                        str2.getClass();
                                                        ejqnVar.copyOnWrite();
                                                        ((ejqo) ejqnVar.instance).b = str2;
                                                        ejqnVar.copyOnWrite();
                                                        ((ejqo) ejqnVar.instance).c = fFloatValue2;
                                                        evsn evsnVarBuild = ejqnVar.build();
                                                        evsnVarBuild.getClass();
                                                        ejqo ejqoVar = (ejqo) evsnVarBuild;
                                                        ejqpVar.copyOnWrite();
                                                        ejqq ejqqVar = (ejqq) ejqpVar.instance;
                                                        evtg evtgVar = ejqqVar.b;
                                                        if (!evtgVar.c()) {
                                                            ejqqVar.b = evsn.mutableCopy(evtgVar);
                                                        }
                                                        ejqqVar.b.add(ejqoVar);
                                                    }
                                                    evsn evsnVarBuild2 = ejqpVar.build();
                                                    evsnVarBuild2.getClass();
                                                    brifVar.c((ejqq) evsnVarBuild2);
                                                    bria briaVarA = brifVar.a(new Supplier() { // from class: bric
                                                        @Override // java.util.function.Supplier
                                                        public final Object get() {
                                                            return new brib();
                                                        }
                                                    });
                                                    final dqsy dqsyVarA = briz.a();
                                                    dqru.b(briz.a(), "smarts_personalization_normalized_feature_values", briaVarA, new Function() { // from class: brhx
                                                        @Override // java.util.function.Function
                                                        /* renamed from: andThen */
                                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                                            return Function$CC.$default$andThen(this, function);
                                                        }

                                                        @Override // java.util.function.Function
                                                        public final Object apply(Object obj2) {
                                                            return Long.valueOf(dqsyVarA.P("smarts_personalization_normalized_feature_values", (dqst) obj2));
                                                        }

                                                        public final /* synthetic */ Function compose(Function function) {
                                                            return Function$CC.$default$compose(this, function);
                                                        }
                                                    }, new Consumer() { // from class: brhy
                                                        @Override // java.util.function.Consumer
                                                        /* renamed from: accept */
                                                        public final void z(Object obj2) {
                                                        }

                                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                            return Consumer$CC.$default$andThen(this, consumer);
                                                        }
                                                    });
                                                }
                                            });
                                            eieuVarK.close();
                                        } finally {
                                        }
                                    } finally {
                                    }
                                }
                            });
                        } catch (Throwable th) {
                            try {
                                brgfVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }, agpyVar.c).i(new eooz() { // from class: agpf
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return agpgVar.a(queue2);
                    }
                }, agpgVar.b);
            }
        }, this.b);
    }
}
