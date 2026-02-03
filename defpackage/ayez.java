package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveP2pSuggestionsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.ims.util.common.RcsIntents;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayez {
    public static final cqce a = cqce.g("Bugle", "requestSmartSuggestionsActionHelper");
    public final crbb b;
    public final cray c;
    public final eosc d;
    public final eosc e;
    private final fcsu f;
    private final fcsu g;
    private final aybu h;
    private final axpa i;

    public ayez(fcsu fcsuVar, crbb crbbVar, cray crayVar, fcsu fcsuVar2, aybu aybuVar, eosc eoscVar, eosc eoscVar2, axpa axpaVar) {
        this.f = fcsuVar;
        this.b = crbbVar;
        this.c = crayVar;
        this.g = fcsuVar2;
        this.h = aybuVar;
        this.d = eoscVar;
        this.e = eoscVar2;
        this.i = axpaVar;
    }

    private static MessageCoreData e(List list) {
        return (MessageCoreData) list.get(0);
    }

    public final eiju a(final List list) {
        ListenableFuture listenableFutureI;
        final MessageCoreData messageCoreDataE = e(list);
        ThrottledAction throttledActionB = this.i.b();
        final int i = (int) messageCoreDataE.C().a;
        String str = String.format(Locale.US, "%d-%d-%d", 1, Integer.valueOf(i), 3);
        synchronized (GenericWorkerQueueAction.a) {
            Map map = GenericWorkerQueueAction.c;
            listenableFutureI = (ListenableFuture) map.get(str);
            if (listenableFutureI == null) {
                final GenericWorkerQueueAction genericWorkerQueueAction = (GenericWorkerQueueAction) throttledActionB;
                eiju eijuVarG = eijx.g(new Callable() { // from class: axoj
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ArrayList arrayList;
                        ecem.b();
                        GenericWorkerQueueAction genericWorkerQueueAction2 = genericWorkerQueueAction;
                        final int i2 = i;
                        synchronized (GenericWorkerQueueAction.a) {
                            fcsu fcsuVar = genericWorkerQueueAction2.k;
                            ((byfv) fcsuVar.b()).b();
                            final byfv byfvVar = (byfv) fcsuVar.b();
                            cqaz.h();
                            arrayList = new ArrayList((ekgb) byfvVar.c.c("WorkerDatabaseOperations#getNextGenericWorkerQueueBatchForSpecificItem", new ejxr() { // from class: byfl
                                @Override // defpackage.ejxr
                                public final Object get() {
                                    bpra bpraVarA = bprf.a();
                                    bpraVarA.A("getNextGenericWorkerQueueBatchForSpecificItem1");
                                    final byfv byfvVar2 = byfvVar;
                                    final int i3 = i2;
                                    bpraVarA.d(new Function() { // from class: byft
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            bpre bpreVar = (bpre) obj;
                                            bpreVar.f(byfvVar2.b.f().toEpochMilli());
                                            bpreVar.ap(new dqty("generic_worker_queue.item_table_type", 1, 1));
                                            bpreVar.ap(new dqpj("generic_worker_queue.item_id", 1, String.valueOf(String.valueOf(i3))));
                                            bpreVar.j(3);
                                            return bpreVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    bpraVarA.c(new bpqx(bprf.c.g));
                                    final ekgb ekgbVarZ = bpraVarA.b().z();
                                    if (!ekgbVarZ.isEmpty()) {
                                        bprc bprcVar = new bprc();
                                        bprcVar.ap("getNextGenericWorkerQueueBatchForSpecificItem2");
                                        bprcVar.ak();
                                        bprcVar.c(true);
                                        bprcVar.d(new Function() { // from class: byfu
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj) {
                                                bpre bpreVar = (bpre) obj;
                                                cqce cqceVar = byfv.a;
                                                bpreVar.c((String[]) Collection.EL.stream(ekgbVarZ).map(new byff()).toArray(new IntFunction() { // from class: byfq
                                                    @Override // java.util.function.IntFunction
                                                    public final Object apply(int i4) {
                                                        cqce cqceVar2 = byfv.a;
                                                        return new String[i4];
                                                    }
                                                }));
                                                return bpreVar;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        bprcVar.a().e();
                                    }
                                    return ekgbVarZ;
                                }
                            }));
                            GenericWorkerQueueAction.n(arrayList);
                        }
                        return arrayList;
                    }
                }, ((GenericWorkerQueueAction) throttledActionB).m());
                final GenericWorkerQueueAction genericWorkerQueueAction2 = (GenericWorkerQueueAction) throttledActionB;
                listenableFutureI = eijuVarG.i(new eooz() { // from class: axop
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return genericWorkerQueueAction2.l((ArrayList) obj);
                    }
                }, ((GenericWorkerQueueAction) throttledActionB).m());
                map.put(str, listenableFutureI);
                eika.l(listenableFutureI, new axoy(str), eoqg.a);
            }
        }
        eiju eijuVarE = eiju.g(listenableFutureI).e(Throwable.class, new ejvr() { // from class: ayet
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqbd cqbdVarE = ayez.a.e();
                cqbdVarE.I("Couldn't ensure annotations are generated");
                MessageCoreData messageCoreData = messageCoreDataE;
                cqbdVarE.I(messageCoreData.C());
                cqbdVarE.s((Throwable) obj);
                crap crapVar = new crap();
                crapVar.b(ezac.EXCEPTION_THROWN);
                this.a.c(messageCoreData, emig.UNKNOWN_REPLY_MODE, 1, crapVar.a());
                return null;
            }
        }, this.d);
        eooz eoozVar = new eooz() { // from class: ayeu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.c.a(list);
            }
        };
        eosc eoscVar = this.e;
        return eijuVarE.i(eoozVar, eoscVar).h(new ejvr() { // from class: ayev
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ayez ayezVar = this.a;
                crbb crbbVar = ayezVar.b;
                MessageCoreData messageCoreData = messageCoreDataE;
                crbg crbgVar = (crbg) obj;
                ayezVar.c(messageCoreData, crbbVar.a(messageCoreData), 0, crbgVar);
                return crbgVar;
            }
        }, eoscVar);
    }

    public final List b(ConversationIdType conversationIdType, MessageIdType messageIdType, int i) {
        if (conversationIdType.b()) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Conversation Id is empty or null:");
            cqbdVarE.c(conversationIdType);
            cqbdVarE.r();
            throw new IllegalArgumentException("Empty conversationId");
        }
        if (i <= 0) {
            cqbd cqbdVarE2 = a.e();
            cqbdVarE2.I("Context message count is");
            cqbdVarE2.G(i);
            cqbdVarE2.r();
            throw new IllegalArgumentException("Non-positive message count.");
        }
        List listN = ((baxe) this.f.b()).N(conversationIdType, i);
        if (Collection.EL.stream(listN).anyMatch(new Predicate() { // from class: ayep
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
                return ((MessageCoreData) obj).O().a();
            }
        })) {
            throw new IllegalStateException("Conversation has verified sms messages, don't generate smart replies.");
        }
        if (!this.b.d(listN, 1, "RequestSmartSuggestionsAction: %s. Do not generate smart replies.")) {
            throw new IllegalStateException("Message ineligible for SmartReplies.");
        }
        if (e(listN).C().equals(messageIdType)) {
            return listN;
        }
        throw new IllegalStateException("Target message is not latest message in conversation.");
    }

    public final void c(MessageCoreData messageCoreData, emig emigVar, int i, crbg crbgVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = crbgVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(new SmartSuggestionItemSuggestionData((ezgi) it.next()));
        }
        ((crcp) this.g.b()).c(emigVar, arrayList.size(), i, arrayList, crbgVar.c, crbgVar.e, crbgVar.f, messageCoreData);
    }

    public final void d(crbg crbgVar, MessageIdType messageIdType) {
        if (crbgVar == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("target_message_id", messageIdType.b());
        ArrayList<? extends Parcelable> arrayList = (ArrayList) Collection.EL.stream(crbgVar.a).map(new Function() { // from class: ayeq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new ProtoParsers.InternalDontUse(null, (ezgi) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: ayer
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
        ArrayList<? extends Parcelable> arrayList2 = (ArrayList) Collection.EL.stream(crbgVar.c).map(new Function() { // from class: ayes
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new ProtoParsers.InternalDontUse(null, (ezgd) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: ayer
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
        bundle.putParcelableArrayList(RcsIntents.EXTRA_CONVERSATION_SUGGESTIONS, arrayList);
        bundle.putParcelableArrayList("rcs.intent.extra.conversationClassifications", new ArrayList<>(crbgVar.b));
        bundle.putParcelableArrayList("rcs.intent.extra.messageClassifications", arrayList2);
        if (((Boolean) ((cczi) tet.k.get()).e()).booleanValue() || ((Boolean) ((cczi) crbf.by.get()).e()).booleanValue()) {
            bundle.putParcelableArrayList("rcs.intent.extra.conversationTags", (ArrayList) Collection.EL.stream(crbgVar.d).map(new Function() { // from class: ayes
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new ProtoParsers.InternalDontUse(null, (ezgd) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: ayer
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            })));
        }
        ayca aycaVar = (ayca) this.h.a.b();
        aycaVar.getClass();
        new ReceiveP2pSuggestionsAction(aycaVar, bundle).s();
    }
}
