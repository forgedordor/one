package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajsj implements ajrc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/control/status/control/MessageStatusControllerImpl");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final eosc f;
    public final eosc g;
    public final aqav h;
    public final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final aqbh n;

    public ajsj(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar8, aqav aqavVar, fcsu fcsuVar9, aqbh aqbhVar) {
        this.j = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.k = fcsuVar5;
        this.l = fcsuVar6;
        this.e = fcsuVar7;
        this.m = fcsuVar8;
        this.f = eoscVar;
        this.g = eoscVar2;
        this.h = aqavVar;
        this.i = fcsuVar9;
        this.n = aqbhVar;
    }

    public static void h(final brdu brduVar, ajrb ajrbVar) {
        l(brduVar, ajrbVar.a());
        ajrbVar.e().ifPresent(new Consumer() { // from class: ajsh
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                brduVar.q(((Boolean) obj).booleanValue());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public static boolean i(int i) {
        ekgb ekgbVar = baui.a;
        return i == 17 || i == 21 || i == 19 || i == 22 || i == 24;
    }

    private final int k(final brdu brduVar, final int i, final embo emboVar, final boolean z) {
        l(brduVar, i);
        final baxe baxeVar = (baxe) this.j.b();
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#updateAndReturnUpdatedMessages");
        try {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("updateAndReturnUpdatedMessages#query");
            brdrVarD.h(new Function() { // from class: bawf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    cqce cqceVar = baxe.a;
                    brdu brduVar2 = brduVar;
                    brduVar2.ap("updateAndReturnUpdatedMessages#update");
                    Stream map = Collection.EL.stream(brduVar2.b().b()).map(new bauj());
                    int i2 = ekgb.d;
                    brecVar.t((Iterable) map.collect(ekcv.a));
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            Stream map = Collection.EL.stream(brdrVarD.b().z()).map(new Function() { // from class: bawg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    MessageCoreData messageCoreDataA = ((bveg) baxeVar.e.b()).a();
                    messageCoreDataA.aN((MessagesTable.BindData) obj);
                    return messageCoreDataA;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i2 = ekgb.d;
            Collector collector = ekcv.a;
            final ekgb ekgbVar = (ekgb) map.collect(collector);
            if (!ekgbVar.isEmpty()) {
                Map.EL.forEach((HashMap) Collection.EL.stream(ekgbVar).collect(Collectors.groupingBy(new Function() { // from class: bawh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((MessageCoreData) obj).A();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Supplier() { // from class: bawi
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new HashMap();
                    }
                }, Collectors.mapping(new Function() { // from class: bawk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((MessageCoreData) obj).C();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, collector))), new BiConsumer() { // from class: bawl
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        ((bxlc) baxeVar.h.b()).m((ConversationIdType) obj, (ekgb) obj2, new String[0]);
                    }

                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                    }
                });
            }
            eieuVarK.close();
            ((dqsn) this.m.b()).g(new dqsm() { // from class: ajrg
                @Override // defpackage.dqsm
                public final eieu a() {
                    return eiiy.k("MessageStatusController::failUndeliveredMessagesWithLogAndThenAttemptFallback");
                }
            }, null, new Runnable() { // from class: ajrh
                @Override // java.lang.Runnable
                public final void run() {
                    ekgb ekgbVar2 = ekgbVar;
                    Stream stream = Collection.EL.stream(ekgbVar2);
                    final ajsj ajsjVar = this.a;
                    final int i3 = i;
                    final embo emboVar2 = emboVar;
                    stream.forEach(new Consumer() { // from class: ajrd
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            MessageCoreData messageCoreData = (MessageCoreData) obj;
                            embo emboVar3 = emboVar2;
                            ajsj ajsjVar2 = ajsjVar;
                            if (ajsj.i(i3)) {
                                ajsjVar2.f(messageCoreData, emboVar3);
                                return;
                            }
                            ajqy ajqyVarP = ajrb.p();
                            ajqyVarP.c(messageCoreData.C());
                            ajqyVarP.i(Instant.ofEpochMilli(messageCoreData.r()));
                            ((ajqm) ajqyVarP).f = Optional.of(ajqz.f());
                            ajqyVarP.g(emboVar3);
                            ajsjVar2.g(messageCoreData, ajqyVarP.a());
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    if (ajsjVar.h.a() && z) {
                        auvh.h(eijx.i(((anpp) ajsjVar.e.b()).c(ekgbVar2, eljx.SEND_MESSAGE_FAILED)).h(new ejvr() { // from class: ajro
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                long jCount = Collection.EL.stream((List) obj).filter(new Predicate() { // from class: ajsa
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
                                        return ((anpq) obj2) == null;
                                    }
                                }).count();
                                ekrw ekrwVarJ = ajsj.a.j();
                                ekrwVarJ.X(eksq.a, "BugleDataModel");
                                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/api/messaging/control/status/control/MessageStatusControllerImpl", "failUndeliveredMessagesWithLogAndThenAttemptFallback", 250, "MessageStatusControllerImpl.java")).I("%s fallback attempts are cancelled or failed, with %d and %s", Long.valueOf(jCount), Integer.valueOf(i3), emboVar2.name());
                                return null;
                            }
                        }, ajsjVar.f));
                    }
                }
            });
            return ekgbVar.size();
        } finally {
        }
    }

    private static void l(brdu brduVar, int i) {
        if (i(i)) {
            brduVar.X(new Function() { // from class: ajrj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    brecVar.an(2, 11);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            brduVar.X(new Function() { // from class: ajrk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    brecVar.an(2, 11);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        brduVar.U(i);
    }

    private final boolean m(ajrb ajrbVar, BiFunction biFunction) {
        boolean zA = this.n.a();
        MessageIdType messageIdType = ((ajqn) ajrbVar).a;
        final MessageCoreData messageCoreDataW = zA ? ((baxe) this.j.b()).w(messageIdType) : ((baxe) this.j.b()).A(messageIdType);
        if (messageCoreDataW != null) {
            if (!messageCoreDataW.cX()) {
                return ((Boolean) biFunction.apply(messageCoreDataW, ajrbVar)).booleanValue();
            }
            boolean zBooleanValue = ((Boolean) biFunction.apply(messageCoreDataW, ajrbVar)).booleanValue();
            ((dqsn) this.m.b()).g(new dqsm() { // from class: ajrn
                @Override // defpackage.dqsm
                public final eieu a() {
                    return eiiy.k("MessageStatusController::failAndThenFallback");
                }
            }, null, new Runnable() { // from class: ajrp
                @Override // java.lang.Runnable
                public final void run() {
                    final ajsj ajsjVar = this.a;
                    boolean zA2 = ((aquo) ajsjVar.i.b()).a();
                    final MessageCoreData messageCoreData = messageCoreDataW;
                    if (!zA2) {
                        auvh.h(((anpp) ajsjVar.e.b()).a(messageCoreData, eljx.SEND_MESSAGE_FAILED));
                        return;
                    }
                    final eiju eijuVarG = eijx.g(new Callable() { // from class: ajsc
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ajsj ajsjVar2 = ajsjVar;
                            List listK = ((bakt) ajsjVar2.b.b()).K(messageCoreData.A());
                            if (listK.size() != 1) {
                                return Optional.empty();
                            }
                            alqm alqmVarQ = ((alrj) ajsjVar2.d.b()).q((ParticipantsTable.BindData) listK.get(0));
                            return (!alqmVarQ.v() || alqmVarQ.e().isEmpty()) ? Optional.empty() : Optional.of(alqmVarQ);
                        }
                    }, ajsjVar.g);
                    eooz eoozVar = new eooz() { // from class: ajsd
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            final ajsj ajsjVar2 = ajsjVar;
                            return (ListenableFuture) ((Optional) obj).map(new Function() { // from class: ajsi
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return ((ccwi) ajsjVar2.c.b()).b(((aubq) ((alqm) obj2).e().get()).d, amrb.a);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).orElseGet(new Supplier() { // from class: ajre
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return eijx.e(null);
                                }
                            });
                        }
                    };
                    eosc eoscVar = ajsjVar.f;
                    auvh.h(eijuVarG.i(eoozVar, eoscVar).i(new eooz() { // from class: ajse
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            return (((Optional) eork.q(eijuVarG)).isPresent() && ((amqj) obj) == null) ? eijx.e(eljx.EMERGENCY_RCS_PROTOCOL_DETERMINATION_MESSAGE_FAILED) : eijx.e(eljx.SEND_MESSAGE_FAILED);
                        }
                    }, eoscVar).i(new eooz() { // from class: ajri
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            return ((anpp) ajsjVar.e.b()).a(messageCoreData, (eljx) obj);
                        }
                    }, eoscVar));
                }
            });
            return zBooleanValue;
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleDataModel");
        ekrd ekrdVar = (ekrd) ekrwVarJ;
        ekrdVar.X(cqnc.b, messageIdType);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/control/status/control/MessageStatusControllerImpl", "handleSendOrDeliveryFailureForSingleMessage", 187, "MessageStatusControllerImpl.java")).q("failed in finding message from Messages Table");
        return false;
    }

    @Override // defpackage.ajrc
    public final int a(embo emboVar) {
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.X(new Function() { // from class: ajrz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.ai(5, 6, 10, 20);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return k(brduVar, 8, emboVar, this.h.a());
    }

    @Override // defpackage.ajrc
    public final int b(final Iterable iterable, ajsl ajslVar) {
        ajqq ajqqVar = (ajqq) ajslVar;
        int i = ajqqVar.c;
        ejwl.b(i(i), "terminal status is not a delivery failure");
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.X(new Function() { // from class: ajrf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.t(iterable);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return k(brduVar, i, ajqqVar.b, ajqqVar.d == 1);
    }

    @Override // defpackage.ajrc
    public final boolean c(ajrb ajrbVar) {
        ejwl.b(i(((ajqn) ajrbVar).b), "terminal status is not a delivery failure");
        return m(ajrbVar, new BiFunction() { // from class: ajsb
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                MessageCoreData messageCoreData = (MessageCoreData) obj;
                ajrb ajrbVar2 = (ajrb) obj2;
                messageCoreData.bz(ajrbVar2.n());
                final brdu brduVarK = messageCoreData.K();
                brduVarK.ap("MessageStatusControllerImpl#failOrExpireSentMessage");
                ajrbVar2.h().ifPresent(new Consumer() { // from class: ajsf
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj3) {
                        brduVarK.E((basd) obj3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                ajrbVar2.j().ifPresent(new Consumer() { // from class: ajsg
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj3) {
                        brduVarK.L(((Integer) obj3).intValue());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                ajsj.h(brduVarK, ajrbVar2);
                boolean zM = ajrbVar2.m();
                ajsj ajsjVar = this.a;
                if (zM) {
                    ajsjVar.f(messageCoreData, ajrbVar2.c());
                }
                return Boolean.valueOf(ajsjVar.j(messageCoreData, brduVarK));
            }
        });
    }

    @Override // defpackage.ajrc
    public final boolean d(ajrb ajrbVar) {
        ejwl.b(!i(((ajqn) ajrbVar).b), "terminal status is not a send failure");
        return m(ajrbVar, new BiFunction() { // from class: ajrs
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                final MessageCoreData messageCoreData = (MessageCoreData) obj;
                ajrb ajrbVar2 = (ajrb) obj2;
                Optional optionalG = ajrbVar2.g();
                messageCoreData.getClass();
                optionalG.ifPresent(new Consumer() { // from class: ajrt
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj3) {
                        messageCoreData.bK(((Integer) obj3).intValue());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                ajrbVar2.i().ifPresent(new Consumer() { // from class: ajru
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj3) {
                        messageCoreData.bO(((Integer) obj3).intValue());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                ajrbVar2.d().ifPresent(new Consumer() { // from class: ajrv
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj3) {
                        messageCoreData.bR(((Integer) obj3).intValue());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                messageCoreData.bz(ajrbVar2.n());
                ajrbVar2.k().ifPresent(new Consumer() { // from class: ajrw
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj3) {
                        Instant instant = (Instant) obj3;
                        long epochMilli = instant.toEpochMilli();
                        MessageCoreData messageCoreData2 = messageCoreData;
                        messageCoreData2.bQ(epochMilli);
                        messageCoreData2.bL(instant.toEpochMilli());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                messageCoreData.bU(ajrbVar2.a());
                ajrbVar2.l().ifPresent(new Consumer() { // from class: ajrx
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj3) {
                        messageCoreData.ca((bvec) obj3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                final brdu brduVarK = messageCoreData.K();
                brduVarK.ap("MessageStatusControllerImpl#failSendingMessage");
                ajrbVar2.l().ifPresent(new Consumer() { // from class: ajry
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj3) {
                        brduVarK.V((bvec) obj3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                ajsj.h(brduVarK, ajrbVar2);
                ajsj ajsjVar = this.a;
                boolean zJ = ajsjVar.j(messageCoreData, brduVarK);
                if (ajrbVar2.m()) {
                    ajsjVar.g(messageCoreData, ajrbVar2);
                }
                return Boolean.valueOf(zJ);
            }
        });
    }

    @Override // defpackage.ajrc
    public final void e(final Iterable iterable, ajsl ajslVar) {
        String[] strArr = MessagesTable.a;
        final brdu brduVar = new brdu();
        brduVar.X(new Function() { // from class: ajrl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.t(iterable);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ajqq ajqqVar = (ajqq) ajslVar;
        ajqqVar.a.ifPresent(new Consumer() { // from class: ajrm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                brduVar.B(((Integer) obj).intValue());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        k(brduVar, ajqqVar.c, ajqqVar.b, ajqqVar.d == 1);
    }

    public final void f(MessageCoreData messageCoreData, embo emboVar) {
        ajhd ajhdVar = (ajhd) this.k.b();
        if (messageCoreData == null) {
            throw new NullPointerException("Null messageSnapshot");
        }
        if (emboVar == null) {
            throw new NullPointerException("Null outgoingMessageFailureReason");
        }
        ajhdVar.M(new ajem(messageCoreData, emboVar));
    }

    public final void g(MessageCoreData messageCoreData, ajrb ajrbVar) {
        ajqz ajqzVar = (ajqz) ajrbVar.f().orElse(ajqz.f());
        final ajek ajekVar = new ajek();
        ajekVar.e(messageCoreData);
        SelfIdentityId selfIdentityIdV = messageCoreData.v();
        fcsu fcsuVar = this.l;
        axcy axcyVarC = ((bbdl) fcsuVar.b()).c(selfIdentityIdV);
        if (axcyVarC == null) {
            axcyVarC = ((bbdl) fcsuVar.b()).b();
        }
        ajekVar.h(axcyVarC != null ? axcyVarC.e() : -1);
        ajekVar.f(((Integer) ajrbVar.i().orElse(-2)).intValue());
        ajekVar.c(ajqzVar.a());
        ajekVar.b(((Integer) ajrbVar.d().orElse(-1)).intValue());
        ajekVar.d = ajqzVar.e();
        ajekVar.d(ajqzVar.b());
        ajekVar.c = Optional.of(ajrbVar.c());
        if (this.n.a() && messageCoreData.da()) {
            ajekVar.g(messageCoreData.cC() ? elpa.END_OF_EMERGENCY : elpa.SOS_MESSAGE);
        }
        ajqzVar.d().ifPresent(new Consumer() { // from class: ajrq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((ajek) ajekVar).a = Optional.of((enxu) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ajqzVar.c().ifPresent(new Consumer() { // from class: ajrr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((ajek) ajekVar).b = Optional.of((elol) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((ajhd) this.k.b()).D(ajekVar.a());
    }

    public final boolean j(MessageCoreData messageCoreData, brdu brduVar) {
        boolean zV = ((baxe) this.j.b()).V(messageCoreData.A(), messageCoreData.C(), brduVar);
        if (!zV) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleDataModel");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.X(cqnc.b, messageCoreData.C());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/control/status/control/MessageStatusControllerImpl", "updateMessageStorage", 511, "MessageStatusControllerImpl.java")).t("failed in updating message in Message Table. Message might be deleted. SnapshotStatus=%s", messageCoreData.aD());
        }
        return zV;
    }
}
