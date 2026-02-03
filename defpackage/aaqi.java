package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqi extends aivg implements aaqa {
    public static final cczv a = cdag.h(cdag.b, "enable_custodian_clearcut_reporter", true);
    private static final eksp b = eksp.c("ClearcutReporter");

    public aaqi(fcsu fcsuVar, aaql aaqlVar, Executor executor) {
        super(fcsuVar, aaqlVar, executor);
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aaqd
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((emvj) obj).mergeFrom((emvj) obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.aapx
    public final void b(final aapw aapwVar) {
        if (((Boolean) a.e()).booleanValue()) {
            aapt aaptVar = (aapt) aapwVar;
            emvl emvlVar = aaptVar.a;
            int iOrdinal = emvlVar.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal == 3) {
                    final Optional optional = aaptVar.e;
                    ejwl.b(optional.isPresent() && !((ekgb) optional.get()).isEmpty(), "NEW_CONVERSATION_WITH_EXISTING_RCS_GROUP_ID error has no forkedConversationJoinStates");
                    ((eksl) b.n().h("com/google/android/apps/messaging/custodian/reporter/sinks/clearcut/ClearcutReporter", "logNewConversationWithExistingRcsGroupId", 134, "ClearcutReporter.java")).q("Logging NewConversationWithExistingRcsGroupId event to Clearcut");
                    k(new Supplier() { // from class: aaqb
                        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable, java.lang.Object] */
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            cczv cczvVar = aaqi.a;
                            final emvt emvtVar = (emvt) emvu.a.createBuilder();
                            ?? r1 = optional.get();
                            emvtVar.copyOnWrite();
                            emvu emvuVar = (emvu) emvtVar.instance;
                            evsx evsxVar = emvuVar.c;
                            if (!evsxVar.c()) {
                                emvuVar.c = evsn.mutableCopy(evsxVar);
                            }
                            aapw aapwVar2 = aapwVar;
                            evpz.addAll(r1, emvuVar.c);
                            aapt aaptVar2 = (aapt) aapwVar2;
                            aaptVar2.f.ifPresent(new Consumer() { // from class: aaqg
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    int iIntValue = ((Integer) obj).intValue();
                                    emvt emvtVar2 = emvtVar;
                                    emvtVar2.copyOnWrite();
                                    emvu emvuVar2 = (emvu) emvtVar2.instance;
                                    emvu emvuVar3 = emvu.a;
                                    emvuVar2.b |= 1;
                                    emvuVar2.d = iIntValue;
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            emvj emvjVar = (emvj) emvm.a.createBuilder();
                            emvjVar.copyOnWrite();
                            emvm emvmVar = (emvm) emvjVar.instance;
                            emvmVar.e = aaptVar2.a.h;
                            emvmVar.b |= 1;
                            emvjVar.copyOnWrite();
                            emvm emvmVar2 = (emvm) emvjVar.instance;
                            emvu emvuVar2 = (emvu) emvtVar.build();
                            emvuVar2.getClass();
                            emvmVar2.d = emvuVar2;
                            emvmVar2.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                            return (emvm) emvjVar.build();
                        }
                    });
                    return;
                }
                if (iOrdinal != 4) {
                    if (iOrdinal == 5) {
                        ((eksl) b.n().h("com/google/android/apps/messaging/custodian/reporter/sinks/clearcut/ClearcutReporter", "logConversationForking", 115, "ClearcutReporter.java")).q("Logging Conversation Forking event to Clearcut");
                        if (aaptVar.g.isPresent()) {
                            k(new Supplier() { // from class: aaqh
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    cczv cczvVar = aaqi.a;
                                    emvj emvjVar = (emvj) emvm.a.createBuilder();
                                    emvjVar.copyOnWrite();
                                    emvm emvmVar = (emvm) emvjVar.instance;
                                    aapt aaptVar2 = (aapt) aapwVar;
                                    emvmVar.e = aaptVar2.a.h;
                                    emvmVar.b |= 1;
                                    Object obj = aaptVar2.g.get();
                                    emvjVar.copyOnWrite();
                                    emvm emvmVar2 = (emvm) emvjVar.instance;
                                    emvmVar2.d = obj;
                                    emvmVar2.c = 102;
                                    return (emvm) emvjVar.build();
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (iOrdinal != 6) {
                        return;
                    }
                    ((eksl) b.n().h("com/google/android/apps/messaging/custodian/reporter/sinks/clearcut/ClearcutReporter", "logMixedUpParticipantStatistics", 103, "ClearcutReporter.java")).q("Logging Mixed Up Participant event to Clearcut");
                    if (aaptVar.h.isPresent()) {
                        k(new Supplier() { // from class: aaqf
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                cczv cczvVar = aaqi.a;
                                emvj emvjVar = (emvj) emvm.a.createBuilder();
                                emvjVar.copyOnWrite();
                                emvm emvmVar = (emvm) emvjVar.instance;
                                aapt aaptVar2 = (aapt) aapwVar;
                                emvmVar.e = aaptVar2.a.h;
                                emvmVar.b |= 1;
                                Object obj = aaptVar2.h.get();
                                emvjVar.copyOnWrite();
                                emvm emvmVar2 = (emvm) emvjVar.instance;
                                emvmVar2.d = obj;
                                emvmVar2.c = 103;
                                return (emvm) emvjVar.build();
                            }
                        });
                        return;
                    }
                    return;
                }
            }
            ((eksl) b.n().h("com/google/android/apps/messaging/custodian/reporter/sinks/clearcut/ClearcutReporter", "logSimpleError", 93, "ClearcutReporter.java")).t("Logging [%s] event to Clearcut", emvlVar);
            k(new Supplier() { // from class: aaqe
                @Override // java.util.function.Supplier
                public final Object get() {
                    cczv cczvVar = aaqi.a;
                    final emvj emvjVar = (emvj) emvm.a.createBuilder();
                    emvjVar.copyOnWrite();
                    emvm emvmVar = (emvm) emvjVar.instance;
                    aapt aaptVar2 = (aapt) aapwVar;
                    emvmVar.e = aaptVar2.a.h;
                    emvmVar.b |= 1;
                    aaptVar2.c.ifPresent(new Consumer() { // from class: aaqc
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            int iIntValue = ((Integer) obj).intValue();
                            emvj emvjVar2 = emvjVar;
                            emvjVar2.copyOnWrite();
                            emvm emvmVar2 = (emvm) emvjVar2.instance;
                            emvm emvmVar3 = emvm.a;
                            emvmVar2.b |= 2;
                            emvmVar2.f = iIntValue;
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return (emvm) emvjVar.build();
                }
            });
        }
    }
}
