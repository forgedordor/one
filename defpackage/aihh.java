package defpackage;

import android.app.AlarmManager;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aihh implements cmcx {
    public static final eksp a = eksp.c("BugleScheduledSend");
    public final cogw b;
    public final eosc c;
    public final eosc d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final egzh h;
    public final fcsu i;
    public final aiht j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;

    public aihh(cogw cogwVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, egzh egzhVar, aiht aihtVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9) {
        this.b = cogwVar;
        this.c = eoscVar;
        this.d = eoscVar2;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = egzhVar;
        this.i = fcsuVar5;
        this.j = aihtVar;
        this.k = fcsuVar4;
        this.l = fcsuVar6;
        this.m = fcsuVar7;
        this.n = fcsuVar8;
        this.o = fcsuVar9;
    }

    @Override // defpackage.cmcx
    public final eiju a(final MessageCoreData messageCoreData, final Instant instant) {
        messageCoreData.bU(16);
        final aigk aigkVar = (aigk) this.k.b();
        return eijx.g(new Callable() { // from class: aigi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final MessageCoreData messageCoreData2 = messageCoreData;
                ejwl.a(messageCoreData2.k() == 16);
                final Instant instant2 = instant;
                final aigk aigkVar2 = aigkVar;
                return (ScheduledSendTable.BindData) aigkVar2.e.c("ScheduledSendDatabaseOperations#insertScheduledMessage", new ejxr() { // from class: aigj
                    @Override // defpackage.ejxr
                    public final Object get() {
                        aigk aigkVar3 = aigkVar2;
                        bauh bauhVar = (bauh) aigkVar3.f.b();
                        MessageCoreData messageCoreData3 = messageCoreData2;
                        MessageIdType messageIdTypeE = bauhVar.e(messageCoreData3, false);
                        if (messageCoreData3.A().b()) {
                            throw new IllegalArgumentException("empty conversationId");
                        }
                        Instant instant3 = instant2;
                        String[] strArr = ScheduledSendTable.a;
                        cmbi cmbiVar = new cmbi();
                        cmbiVar.f(messageIdTypeE);
                        cmbiVar.c(messageCoreData3.A());
                        cmbiVar.g(instant3);
                        cmbiVar.d(aigkVar3.c.f());
                        cmbiVar.h(cmct.SCHEDULED);
                        final ScheduledSendTable.BindData bindDataB = cmbiVar.b(new Supplier() { // from class: cmbf
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new cmbe();
                            }
                        });
                        final dqsy dqsyVarC = ScheduledSendTable.c();
                        dqru.b(ScheduledSendTable.c(), "scheduled_send", bindDataB, new Function() { // from class: cmaz
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Long.valueOf(dqsyVarC.P("scheduled_send", (dqst) obj));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Consumer() { // from class: cmba
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                bindDataB.o((Long) obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        ((bxlc) aigkVar3.d.b()).l(messageCoreData3.A(), messageIdTypeE, new String[0]);
                        return bindDataB;
                    }
                });
            }
        }, aigkVar.a).i(new eooz() { // from class: aihf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ScheduledSendTable.BindData bindData = (ScheduledSendTable.BindData) obj;
                return this.a.e().h(new ejvr() { // from class: aigs
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        eksp ekspVar = aihh.a;
                        return bindData;
                    }
                }, eoqg.a);
            }
        }, this.d).h(new ejvr() { // from class: aihg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ScheduledSendTable.BindData bindData = (ScheduledSendTable.BindData) obj;
                baxe baxeVar = (baxe) this.a.n.b();
                MessageCoreData messageCoreData2 = messageCoreData;
                baxeVar.ab(messageCoreData2.A(), messageCoreData2, true);
                return bindData;
            }
        }, this.c);
    }

    public final eiju b(cmcr cmcrVar, final long j, final cldb cldbVar) {
        eiju eijuVarF = f(cmcrVar, cmct.SENDING);
        eooz eoozVar = new eooz() { // from class: aigp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                aigk aigkVar = (aigk) this.a.k.b();
                Stream map = Collection.EL.stream((ekgb) obj).map(new Function() { // from class: aihb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((ScheduledSendTable.BindData) obj2).n();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = ekgb.d;
                final List list = (List) map.collect(ekcv.a);
                dqxe dqxeVar = cmax.a;
                cmap cmapVarA = cmas.a();
                cmapVarA.A("+ScheduledSendQueries#getQueryForIds");
                cmapVarA.c(new Function() { // from class: cmaw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        cmar cmarVar = (cmar) obj2;
                        dqxe dqxeVar2 = cmax.a;
                        cmarVar.ap(new dqpm("scheduled_send._id", 3, cmar.as(list), false));
                        return cmarVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final cman cmanVarB = cmapVarA.b();
                return eijx.g(new Callable() { // from class: aigc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Stream streamE = cmanVarB.E();
                        try {
                            Stream map2 = streamE.map(new Function() { // from class: aigb
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return new cmcv((clpq) obj2);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i2 = ekgb.d;
                            ekgb ekgbVar = (ekgb) map2.collect(ekcv.a);
                            if (streamE != null) {
                                streamE.close();
                            }
                            return ekgbVar;
                        } catch (Throwable th) {
                            if (streamE != null) {
                                try {
                                    streamE.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                }, aigkVar.a);
            }
        };
        eosc eoscVar = this.d;
        return eijuVarF.i(eoozVar, eoscVar).i(new eooz() { // from class: aigq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ekgb ekgbVar = (ekgb) obj;
                ((eksl) ((eksl) aihh.a.h()).h("com/google/android/apps/messaging/scheduledsend/dataservice/ScheduledSendDataServiceImpl", "sendScheduledMessages", 378, "ScheduledSendDataServiceImpl.java")).r("Processing %d scheduled messages for sending.", ekgbVar.size());
                Stream stream = Collection.EL.stream(ekgbVar);
                final aihh aihhVar = this.a;
                final long j2 = j;
                final cldb cldbVar2 = cldbVar;
                return eijx.a((ekgb) stream.map(new Function() { // from class: aigy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        final cmcw cmcwVar = (cmcw) obj2;
                        final aihh aihhVar2 = aihhVar;
                        Callable callable = new Callable() { // from class: aigt
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                final aihh aihhVar3 = aihhVar2;
                                MessageCoreData messageCoreDataA = ((bveg) aihhVar3.f.b()).a();
                                cmcw cmcwVar2 = cmcwVar;
                                messageCoreDataA.aN(cmcwVar2.b());
                                MessageData messageData = (MessageData) messageCoreDataA;
                                messageData.j = messageData.j.a().K();
                                messageCoreDataA.bq(null);
                                messageData.j.j(null);
                                messageCoreDataA.bt(null);
                                messageCoreDataA.bA(Optional.of(UUID.randomUUID()));
                                String strF = cmcwVar2.a().f();
                                if (strF != null) {
                                    messageData.r = new baxt(strF);
                                }
                                Stream map = DesugarArrays.stream(cmcwVar2.a().b).map(new Function() { // from class: aigu
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        MessagePartData messagePartDataE = ((bahv) aihhVar3.g.b()).e((PartsTable.BindData) obj3);
                                        messagePartDataE.ac();
                                        messagePartDataE.aO(bary.a);
                                        return messagePartDataE;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int i = ekgb.d;
                                ((bbae) aihhVar3.m.b()).b(messageCoreDataA, (ekgb) map.collect(ekcv.a), true);
                                return messageCoreDataA;
                            }
                        };
                        eosc eoscVar2 = aihhVar2.c;
                        eiju eijuVarG = eijx.g(callable, eoscVar2);
                        ejvr ejvrVar = new ejvr() { // from class: aigx
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                MessageCoreData messageCoreData = (MessageCoreData) obj3;
                                eksp ekspVar = aihh.a;
                                messageCoreData.bU(4);
                                return messageCoreData;
                            }
                        };
                        eosc eoscVar3 = aihhVar2.d;
                        eiju eijuVarH = eijuVarG.h(ejvrVar, eoscVar3);
                        final cldb cldbVar3 = cldbVar2;
                        final long j3 = j2;
                        return eijuVarH.i(new eooz() { // from class: aigl
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                MessageCoreData messageCoreData = (MessageCoreData) obj3;
                                eksl ekslVar = (eksl) aihh.a.h();
                                cmcw cmcwVar2 = cmcwVar;
                                ekslVar.X(aihl.a, cmcwVar2.d());
                                ekslVar.X(cqnc.r, cmcwVar2.b().D().toString());
                                ekslVar.X(cqnc.a, cmcwVar2.b().E().b());
                                ((eksl) ekslVar.h("com/google/android/apps/messaging/scheduledsend/dataservice/ScheduledSendDataServiceImpl", "sendScheduledMessage", 423, "ScheduledSendDataServiceImpl.java")).q("Queueing scheduled message for sending.");
                                SelfIdentityId selfIdentityIdV = messageCoreData.v();
                                aihh aihhVar3 = aihhVar2;
                                if (selfIdentityIdV == null) {
                                    selfIdentityIdV = ((bakt) aihhVar3.o.b()).i(messageCoreData.A());
                                    selfIdentityIdV.getClass();
                                    messageCoreData.aP(selfIdentityIdV);
                                }
                                long j4 = j3;
                                cldb cldbVar4 = cldbVar3;
                                axcy axcyVarE = ((bbdl) aihhVar3.l.b()).e(selfIdentityIdV);
                                axcyVarE.getClass();
                                int iE = axcyVarE.e();
                                return cldbVar4 != null ? ((ajpu) aihhVar3.e.b()).d(iE, messageCoreData, j4, cldbVar4) : ((ajpu) aihhVar3.e.b()).c(iE, messageCoreData, j4);
                            }
                        }, eoscVar2).i(new eooz() { // from class: aigm
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                final cmcw cmcwVar2 = cmcwVar;
                                Instant instantM = cmcwVar2.a().c.m();
                                aihh aihhVar3 = aihhVar2;
                                final Duration durationBetween = Duration.between(instantM, aihhVar3.b.f());
                                aiek aiekVar = (aiek) aihhVar3.i.b();
                                final ScheduledSendTable.BindData bindDataC = cmcwVar2.c();
                                aiekVar.k(new Supplier() { // from class: aiei
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        enhf enhfVar = (enhf) enhg.a.createBuilder();
                                        ScheduledSendTable.BindData bindData = bindDataC;
                                        Instant instantTruncatedTo = bindData.k().truncatedTo(ChronoUnit.HOURS);
                                        Instant instantTruncatedTo2 = bindData.m().truncatedTo(ChronoUnit.HOURS);
                                        enhd enhdVar = (enhd) enhe.a.createBuilder();
                                        long jD = aieq.d(instantTruncatedTo);
                                        enhdVar.copyOnWrite();
                                        enhe enheVar = (enhe) enhdVar.instance;
                                        enheVar.b |= 1;
                                        enheVar.c = jD;
                                        long jD2 = aieq.d(instantTruncatedTo2);
                                        enhdVar.copyOnWrite();
                                        enhe enheVar2 = (enhe) enhdVar.instance;
                                        enheVar2.b |= 2;
                                        enheVar2.d = jD2;
                                        long millis = Duration.between(instantTruncatedTo, instantTruncatedTo2).toMillis();
                                        enhdVar.copyOnWrite();
                                        enhe enheVar3 = (enhe) enhdVar.instance;
                                        enheVar3.b |= 4;
                                        enheVar3.e = millis;
                                        enhe enheVar4 = (enhe) enhdVar.build();
                                        enhfVar.copyOnWrite();
                                        enhg enhgVar = (enhg) enhfVar.instance;
                                        enheVar4.getClass();
                                        enhgVar.c = enheVar4;
                                        enhgVar.b |= 1;
                                        long millis2 = durationBetween.toMillis();
                                        enhfVar.copyOnWrite();
                                        enhg enhgVar2 = (enhg) enhfVar.instance;
                                        enhgVar2.b |= 2;
                                        enhgVar2.d = millis2;
                                        return (enhg) enhfVar.build();
                                    }
                                });
                                final aigk aigkVar = (aigk) aihhVar3.k.b();
                                eiju eijuVarG2 = eijx.g(new Callable() { // from class: aigd
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        cdww cdwwVar = (cdww) aigkVar.b.b();
                                        cmcw cmcwVar3 = cmcwVar2;
                                        ekgb ekgbVarR = ekgb.r(cmcwVar3.b().E());
                                        ConversationIdType conversationIdTypeD = cmcwVar3.b().D();
                                        conversationIdTypeD.getClass();
                                        return Boolean.valueOf(cdwwVar.c(ekgbVarR, conversationIdTypeD, false) > 0);
                                    }
                                }, aigkVar.a);
                                ConversationIdType conversationIdTypeD = cmcwVar2.b().D();
                                conversationIdTypeD.getClass();
                                aihhVar3.h.a(eijuVarG2, "scheduled_messages_for_conversation_".concat(conversationIdTypeD.toString()));
                                return eijuVarG2;
                            }
                        }, eoscVar3).h(new ejvr() { // from class: aign
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                Boolean bool = (Boolean) obj3;
                                eksp ekspVar = aihh.a;
                                if (!bool.booleanValue()) {
                                    cmcw cmcwVar2 = cmcwVar;
                                    eksl ekslVar = (eksl) aihh.a.i();
                                    ekslVar.X(aihl.a, cmcwVar2.d());
                                    ekslVar.X(cqnc.r, cmcwVar2.b().D().toString());
                                    ekslVar.X(cqnc.a, cmcwVar2.b().E().b());
                                    ((eksl) ekslVar.h("com/google/android/apps/messaging/scheduledsend/dataservice/ScheduledSendDataServiceImpl", "sendScheduledMessage", 460, "ScheduledSendDataServiceImpl.java")).q("Failed to delete scheduled message after processing for sending.");
                                }
                                return bool;
                            }
                        }, eoscVar3).e(Exception.class, new ejvr() { // from class: aigo
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                eksl ekslVar = (eksl) aihh.a.i();
                                cmcw cmcwVar2 = cmcwVar;
                                ekslVar.X(aihl.a, cmcwVar2.d());
                                ekslVar.X(cqnc.r, cmcwVar2.b().D().toString());
                                ekslVar.X(cqnc.a, cmcwVar2.b().E().b());
                                ((eksl) ((eksl) ekslVar.g((Exception) obj3)).h("com/google/android/apps/messaging/scheduledsend/dataservice/ScheduledSendDataServiceImpl", "sendScheduledMessage", 480, "ScheduledSendDataServiceImpl.java")).q("Failed to send scheduled message.");
                                return false;
                            }
                        }, eoscVar3);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(ekcv.a)).h(new ejvr() { // from class: aigz
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        eksp ekspVar = aihh.a;
                        long jCount = Collection.EL.stream((List) obj2).filter(new Predicate() { // from class: aigw
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
                            public final boolean test(Object obj3) {
                                eksp ekspVar2 = aihh.a;
                                return ((Boolean) obj3).booleanValue();
                            }
                        }).count();
                        ((eksl) ((eksl) aihh.a.h()).h("com/google/android/apps/messaging/scheduledsend/dataservice/ScheduledSendDataServiceImpl", "sendScheduledMessages", 393, "ScheduledSendDataServiceImpl.java")).z("%d scheduled messages successfully processed. %d failed to process.", jCount, r9.size() - jCount);
                        return ekgbVar;
                    }
                }, aihhVar.d);
            }
        }, eoscVar);
    }

    @Override // defpackage.cmcx
    public final eiju c(final String str) {
        aigk aigkVar = (aigk) this.k.b();
        final Instant instantF = this.b.f();
        return eijx.g(new Callable() { // from class: aiga
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] strArr = ScheduledSendTable.a;
                cmcq cmcqVar = new cmcq();
                cmcqVar.ap("updateScheduledTime");
                Instant instant = instantF;
                if (instant == null) {
                    cmcqVar.a.putNull("scheduled_time");
                } else {
                    cmcqVar.a.put("scheduled_time", Long.valueOf(bart.a(instant)));
                }
                final String str2 = str;
                cmcqVar.af(new cmcr((cmcs) new Function() { // from class: aigh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cmcs cmcsVar = (cmcs) obj;
                        cmcsVar.c(str2);
                        return cmcsVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new cmcs())));
                final cmcp cmcpVarB = cmcqVar.b();
                return (ScheduledSendTable.BindData) ((ekgb) ScheduledSendTable.c().p("updateAndReturnUpdatedRowsAfterUpdate-txn-scheduled_send", new ejxr() { // from class: cmcn
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.ejxr
                    public final Object get() {
                        cmcm cmcmVarB = ScheduledSendTable.b();
                        cmcmVarB.A("updateAndReturnUpdatedRowsAfterUpdate-pre-scheduled_send");
                        cmcmVarB.v();
                        cmcmVarB.n(new dqxl("ROWID", new Object[0]), "_rowid");
                        cmcp cmcpVar = cmcpVarB;
                        ekgb ekgbVar = cmcpVar.e;
                        int i = ((ekoe) ekgbVar).c;
                        for (int i2 = 0; i2 < i; i2++) {
                            cmcmVarB.k((cmcr) ((dqyj) ekgbVar.get(i2)));
                        }
                        if (((dqpb) cmcpVar.d).b) {
                            cmcs cmcsVar = new cmcs();
                            cmcsVar.ar(cmcpVar.h());
                            cmcmVarB.d(cmcsVar);
                        }
                        ekfw ekfwVar = new ekfw();
                        cmbz cmbzVar = (cmbz) cmcmVarB.b().p();
                        while (cmbzVar.moveToNext()) {
                            try {
                                ekfwVar.h(cmbzVar.de("_rowid"));
                            } catch (Throwable th) {
                                try {
                                    cmbzVar.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                        cmbzVar.close();
                        String str3 = (String) Collection.EL.stream(ekfwVar.g()).collect(Collectors.joining(","));
                        cmcpVar.e();
                        cmcm cmcmVarB2 = ScheduledSendTable.b();
                        cmcmVarB2.A("updateAndReturnUpdatedRowsAfterUpdate-post-scheduled_send");
                        cmcs cmcsVar2 = new cmcs();
                        cmcsVar2.ar(new dqxl("ROWID IN ($R)", new Object[]{str3}));
                        cmcmVarB2.d(cmcsVar2);
                        return cmcmVarB2.b().z();
                    }
                })).get(0);
            }
        }, aigkVar.a).i(new eooz() { // from class: aihc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                String[] strArr = ScheduledSendTable.a;
                cmcs cmcsVar = new cmcs();
                cmcsVar.c(str);
                cmcr cmcrVar = new cmcr(cmcsVar);
                aihh aihhVar = this.a;
                return aihhVar.b(cmcrVar, aihhVar.b.a(), null);
            }
        }, this.d).h(new ejvr() { // from class: aihd
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = aihh.a;
                return ((cmcw) ((ekgb) obj).get(0)).c();
            }
        }, eoqg.a);
    }

    @Override // defpackage.cmcx
    public final eiju d(cldb cldbVar) {
        String[] strArr = ScheduledSendTable.a;
        cmcs cmcsVar = new cmcs();
        cmcsVar.d(cmct.SCHEDULED);
        cogw cogwVar = this.b;
        cmcsVar.ap(new dqpj("scheduled_send.scheduled_time", 10, Long.valueOf(bart.a(cogwVar.f()))));
        return b(new cmcr(cmcsVar), cogwVar.a(), cldbVar).h(new ejvr() { // from class: aigv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = aihh.a;
                return null;
            }
        }, eoqg.a);
    }

    @Override // defpackage.cmcx
    public final eiju e() {
        return eijx.g(new Callable() { // from class: aigg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cmcm cmcmVarB = ScheduledSendTable.b();
                cmcmVarB.A("getEarliestScheduledTime");
                cmcmVarB.e(new Function() { // from class: aige
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cmcs cmcsVar = (cmcs) obj;
                        cmcsVar.d(cmct.SCHEDULED);
                        return cmcsVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                cmby cmbyVar = ScheduledSendTable.c.d;
                cmcmVarB.c(cmbyVar);
                cmcmVarB.D((String) DesugarArrays.stream(new cmcj[]{new cmcj(cmbyVar)}).map(new Function() { // from class: cmcl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((cmcj) obj).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.joining(", ")));
                cmcmVarB.y(1);
                return Optional.ofNullable((ScheduledSendTable.BindData) cmcmVarB.b().l()).map(new Function() { // from class: aigf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ScheduledSendTable.BindData) obj).m();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, ((aigk) this.k.b()).a).h(new ejvr() { // from class: aihe
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                boolean zIsPresent = optional.isPresent();
                aihh aihhVar = this.a;
                if (zIsPresent) {
                    aiht aihtVar = aihhVar.j;
                    Instant instant = (Instant) optional.get();
                    aiju aijuVarA = aiht.a();
                    aijuVarA.getClass();
                    aijs aijsVar = aihtVar.a;
                    Object systemService = aijsVar.a.getSystemService("alarm");
                    systemService.getClass();
                    aijsVar.b = (AlarmManager) systemService;
                    AlarmManager alarmManager = aijsVar.b;
                    if (alarmManager == null) {
                        fdbq.c("alarmManager");
                        alarmManager = null;
                    }
                    aijq aijqVar = new aijq(alarmManager);
                    AlarmManager alarmManager2 = aijsVar.b;
                    if (alarmManager2 == null) {
                        fdbq.c("alarmManager");
                        alarmManager2 = null;
                    }
                    aijsVar.b(instant, aijuVarA, false, aijqVar, new aijr(alarmManager2));
                } else {
                    aihhVar.j.a.a(aiht.a());
                }
                return null;
            }
        }, this.d);
    }

    @Override // defpackage.cmcx
    public final eiju f(final cmcr cmcrVar, final cmct cmctVar) {
        return eijx.g(new Callable() { // from class: aifz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] strArr = ScheduledSendTable.a;
                cmcq cmcqVar = new cmcq();
                cmcqVar.ap("updateStatusForScheduledMessages");
                cmcqVar.af(cmcrVar);
                cmct cmctVar2 = cmctVar;
                if (cmctVar2 == null) {
                    cmcqVar.a.putNull("status");
                } else {
                    cmcqVar.a.put("status", Integer.valueOf(cmctVar2.ordinal()));
                }
                final cmcp cmcpVarB = cmcqVar.b();
                final int i = 0;
                return (ekgb) ScheduledSendTable.c().p("scheduled_send.updateAndReturnUpdatedRows-txn", new ejxr() { // from class: cmco
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.ejxr
                    public final Object get() {
                        cmcm cmcmVarB = ScheduledSendTable.b();
                        cmcmVarB.A("scheduled_send.updateAndReturnUpdatedRows-query");
                        cmcp cmcpVar = cmcpVarB;
                        ekgb ekgbVar = cmcpVar.e;
                        int i2 = ((ekoe) ekgbVar).c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            cmcmVarB.k((cmcr) ((dqyj) ekgbVar.get(i3)));
                        }
                        dqpb dqpbVar = (dqpb) cmcpVar.d;
                        if (dqpbVar.b) {
                            cmcs cmcsVar = new cmcs();
                            cmcsVar.ar(cmcpVar.h());
                            cmcmVarB.d(cmcsVar);
                        }
                        if (dqpbVar.c) {
                            cmcmVarB.s();
                        }
                        Integer num = i;
                        ekgb ekgbVarZ = cmcmVarB.b().z();
                        num.intValue();
                        cmcpVar.t(0);
                        return ekgbVarZ;
                    }
                });
            }
        }, ((aigk) this.k.b()).a).i(new eooz() { // from class: aigr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ekgb ekgbVar = (ekgb) obj;
                return this.a.e().h(new ejvr() { // from class: aiha
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        eksp ekspVar = aihh.a;
                        return ekgbVar;
                    }
                }, eoqg.a);
            }
        }, this.d);
    }
}
