package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cihb extends cayv {
    public static final eksp a = eksp.c("BugleGroupManagement");
    static final ejxr b = cdag.w(195615977, "enable_rcs_group_identifiers_telephony_batch_migration");
    public final eosc c;
    public final cigo d;
    public final eoqr e = new eoqr();
    private final eosc f;

    public cihb(eosc eoscVar, eosc eoscVar2, cigo cigoVar) {
        this.c = eoscVar;
        this.f = eoscVar2;
        this.d = cigoVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("RcsGroupIdentifiersTelephonyMigrationHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cihd.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        if (!((Boolean) ((cczi) b.get()).e()).booleanValue()) {
            ((eksl) a.n().h("com/google/android/apps/messaging/shared/rcs/groups/datamigration/RcsGroupIdentifiersTelephonyMigrationHandler", "processPendingWorkItemAsync", 93, "RcsGroupIdentifiersTelephonyMigrationHandler.java")).q("Returning failed no retry in RcsGroupIdentifiersTelephonyMigrationHandler because allowswitch is disabled.");
            return eijx.e(cbcw.k());
        }
        Callable callable = new Callable() { // from class: cigz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eksp ekspVar = cihb.a;
                botb botbVarE = botm.e();
                botbVarE.A("getConversationIdsThatRequireMigration");
                botbVarE.i(new Function() { // from class: cigr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        botl botlVar = (botl) obj;
                        eksp ekspVar2 = cihb.a;
                        botlVar.j(2);
                        botlVar.b(new Function() { // from class: cigp
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                botl botlVar2 = (botl) obj2;
                                eksp ekspVar3 = cihb.a;
                                botlVar2.E("");
                                return botlVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: cigs
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                botl botlVar2 = (botl) obj2;
                                botlVar2.G();
                                return botlVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: cigt
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                botl botlVar2 = (botl) obj2;
                                eksp ekspVar3 = cihb.a;
                                botlVar2.D("");
                                return botlVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: cigu
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                botl botlVar2 = (botl) obj2;
                                int iIntValue = botm.g().intValue();
                                if (iIntValue < 40050) {
                                    dqru.x("rcs_conference_uri", iIntValue);
                                }
                                botlVar2.ap(new dqpn("conversations.rcs_conference_uri", 5));
                                return botlVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: cigv
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                botl botlVar2 = (botl) obj2;
                                eksp ekspVar3 = cihb.a;
                                botlVar2.I("");
                                return botlVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: cigw
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                botl botlVar2 = (botl) obj2;
                                int iIntValue = botm.g().intValue();
                                if (iIntValue < 58540) {
                                    dqru.x("rcs_group_self_msisdn", iIntValue);
                                }
                                botlVar2.ap(new dqpn("conversations.rcs_group_self_msisdn", 5));
                                return botlVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        return botlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                botbVarE.s();
                ekgb ekgbVarG = botbVarE.b().g();
                ((eksl) cihb.a.n().h("com/google/android/apps/messaging/shared/rcs/groups/datamigration/RcsGroupIdentifiersTelephonyMigrationHandler", "getConversationIdsThatRequireMigration", 168, "RcsGroupIdentifiersTelephonyMigrationHandler.java")).r("Attempting RCS group identifiers Telephony data batch migration. Conversations needed to migrate: %d", ((ekoe) ekgbVarG).c);
                return ekgbVarG;
            }
        };
        eosc eoscVar = this.f;
        return eijx.g(callable, eoscVar).h(new ejvr() { // from class: ciha
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekgb ekgbVar = (ekgb) obj;
                int i = ekgb.d;
                ekfw ekfwVar = new ekfw();
                int size = ekgbVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    final cihb cihbVar = this.a;
                    final ConversationIdType conversationIdType = (ConversationIdType) ekgbVar.get(i2);
                    ekfwVar.h(eiju.g(cihbVar.e.b(eiid.c(new eooy() { // from class: cigx
                        @Override // defpackage.eooy
                        public final ListenableFuture a() {
                            final cigo cigoVar = cihbVar.d;
                            final ConversationIdType conversationIdType2 = conversationIdType;
                            return eijx.g(new Callable() { // from class: cign
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    final cigo cigoVar2 = cigoVar;
                                    final ConversationIdType conversationIdType3 = conversationIdType2;
                                    return (Boolean) cigoVar2.f.c("RcsGroupIdentifiersTelephonyMigrationHelper#migrateRcsGroupIdentifiersFromTelephony", new ejxr() { // from class: cigm
                                        @Override // defpackage.ejxr
                                        public final Object get() {
                                            final cigo cigoVar3 = cigoVar2;
                                            Function function = new Function() { // from class: cigk
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo536andThen(Function function2) {
                                                    return Function$CC.$default$andThen(this, function2);
                                                }

                                                /* JADX WARN: Multi-variable type inference failed */
                                                /* JADX WARN: Removed duplicated region for block: B:47:0x01f8  */
                                                @Override // java.util.function.Function
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                    To view partially-correct add '--show-bad-code' argument
                                                */
                                                public final java.lang.Object apply(java.lang.Object r24) {
                                                    /*
                                                        Method dump skipped, instructions count: 996
                                                        To view this dump add '--comments-level debug' option
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cigk.apply(java.lang.Object):java.lang.Object");
                                                }

                                                public final /* synthetic */ Function compose(Function function2) {
                                                    return Function$CC.$default$compose(this, function2);
                                                }
                                            };
                                            final ConversationIdType conversationIdType4 = conversationIdType3;
                                            return (Boolean) botm.i(conversationIdType4, function, new Supplier() { // from class: cigl
                                                @Override // java.util.function.Supplier
                                                public final Object get() {
                                                    eksl ekslVar = (eksl) cigo.a.j();
                                                    ekslVar.X(cqnc.r, conversationIdType4.toString());
                                                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/rcs/groups/datamigration/RcsGroupIdentifiersTelephonyMigrationActuator", "migrateRcsGroupIdentifiersFromTelephony", 116, "RcsGroupIdentifiersTelephonyMigrationActuator.java")).q("No conversation data found while attempting to migrate RCS group identifiers from Telephony.");
                                                    return false;
                                                }
                                            });
                                        }
                                    });
                                }
                            }, cigoVar.b);
                        }
                    }), cihbVar.c)));
                }
                return ekfwVar.g();
            }
        }, this.c).i(new eooz() { // from class: cigq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ekgb ekgbVar = (ekgb) obj;
                return eijx.j(ekgbVar).a(new Callable() { // from class: cigy
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        eksp ekspVar = cihb.a;
                        ekgb ekgbVar2 = ekgbVar;
                        int size = ekgbVar2.size();
                        int i = 0;
                        for (int i2 = 0; i2 < size; i2++) {
                            if (!((Boolean) eork.q((eiju) ekgbVar2.get(i2))).booleanValue()) {
                                i++;
                            }
                        }
                        ((eksl) cihb.a.n().h("com/google/android/apps/messaging/shared/rcs/groups/datamigration/RcsGroupIdentifiersTelephonyMigrationHandler", "processPendingWorkItemAsync", 131, "RcsGroupIdentifiersTelephonyMigrationHandler.java")).I("Finished RCS group identifiers Telephony data batch migration. Migration attempted count: %d. Success count: %d. Failed count: %d", Integer.valueOf(ekgbVar2.size()), Integer.valueOf(ekgbVar2.size() - i), Integer.valueOf(i));
                        return i == 0 ? cbcw.i() : cbcw.k();
                    }
                }, this.a.c);
            }
        }, eoscVar);
    }
}
