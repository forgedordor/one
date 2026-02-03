package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdww {
    public static final cqce a = cqce.g("BugleDataModel", "DeleteDatabaseOperations");
    public final fcsu b;
    public final dqsn c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final arkz i;
    public final fcsu j;
    private final fcsu k;

    public cdww(fcsu fcsuVar, dqsn dqsnVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, arkz arkzVar, fcsu fcsuVar8) {
        this.b = fcsuVar;
        this.c = dqsnVar;
        this.k = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
        this.h = fcsuVar7;
        this.i = arkzVar;
        this.j = fcsuVar8;
    }

    private final cdvs i(final ConversationIdType conversationIdType, final long j, final SuperSortLabel superSortLabel, final boolean z) {
        cqaz.h();
        ((awlc) this.k.b()).d(new Consumer() { // from class: cdvt
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((cnos) obj).a(conversationIdType);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (((arqh) this.h.b()).a()) {
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("Delete conversation in transaction");
            cqbdVarC.c(conversationIdType);
            cqbdVarC.z("CutoffTimestamp", j);
            cqbdVarC.B("ClearCMSId", z);
            cqbdVarC.r();
        } else {
            cqbd cqbdVarC2 = a.c();
            cqbdVarC2.I("Delete conversation in transaction");
            cqbdVarC2.c(conversationIdType);
            cqbdVarC2.z("CutoffTimestamp", j);
            cqbdVarC2.B("ClearCMSId", z);
            cqbdVarC2.B("IsSpecific", superSortLabel.b());
            cqbdVarC2.r();
        }
        return (cdvs) this.c.c("DeleteDatabaseOperations#deleteConversation", new ejxr() { // from class: cdwe
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejxr
            public final Object get() {
                ekgb ekgbVarA;
                long j2;
                ekgb ekgbVar;
                int i = ekgb.d;
                ekgb ekgbVarG = ekoe.a;
                cdvo cdvoVar = new cdvo();
                cdvoVar.a(false);
                boolean z2 = z;
                final ConversationIdType conversationIdType2 = conversationIdType;
                if (z2) {
                    cqaz.h();
                    String[] strArr = botm.a;
                    bote boteVar = new bote();
                    boteVar.ap("setConversationCmsId");
                    boteVar.ad(new Function() { // from class: cpqi
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            botl botlVar = (botl) obj;
                            botlVar.r(conversationIdType2);
                            botlVar.g();
                            return botlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    boteVar.k("");
                    boolean z3 = boteVar.b().e() > 0;
                    cqbd cqbdVarC3 = cdww.a.c();
                    cqbdVarC3.B("clearCmsIdSuccess", z3);
                    cqbdVarC3.r();
                }
                bojh bojhVarB = botm.b(conversationIdType2);
                String strS = bojhVarB != null ? bojhVarB.S() : null;
                if (strS != null && !strS.isEmpty()) {
                    eieu eieuVarK = eiiy.k("DeleteDatabaseOperations#deleteConversation#excludeMessagesFromCms");
                    try {
                        String[] strArr2 = MessagesTable.a;
                        brdu brduVar = new brdu();
                        brduVar.ap("DeleteDatabaseOperations#deleteConversation#excludeMessagesFromCms");
                        brduVar.m(cpyi.EXCLUDED);
                        brduVar.X(new Function() { // from class: cdwq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                brec brecVar = (brec) obj;
                                brecVar.m(conversationIdType2);
                                int iIntValue = MessagesTable.g().intValue();
                                if (iIntValue < 58210) {
                                    dqru.x("cms_life_cycle", iIntValue);
                                }
                                brecVar.ap(new dqpn("messages.cms_life_cycle", 6));
                                return brecVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int iE = brduVar.b().e();
                        cqbd cqbdVarC4 = cdww.a.c();
                        cqbdVarC4.y("excludedMessagesFromCmsCount", iE);
                        cqbdVarC4.r();
                        eieuVarK.close();
                    } finally {
                    }
                }
                final long j3 = j;
                if (j3 == Long.MAX_VALUE || j3 < 0) {
                    cqbd cqbdVarC5 = cdww.a.c();
                    cqbdVarC5.A("Delete messages, ConversationId", conversationIdType2);
                    cqbdVarC5.r();
                    String[] strArr3 = MessagesTable.a;
                    brdk brdkVar = new brdk();
                    brdkVar.c(new Function() { // from class: cdwu
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            brecVar.m(conversationIdType2);
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    ekgbVarA = brdkVar.b().a();
                } else {
                    cqbd cqbdVarC6 = cdww.a.c();
                    cqbdVarC6.I("Delete all messages prior to cutoff.");
                    cqbdVarC6.c(conversationIdType2);
                    cqbdVarC6.z("Cut Off", j3);
                    cqbdVarC6.r();
                    brdr brdrVarD = MessagesTable.d();
                    brdrVarD.A("deleteConversation");
                    brdrVarD.f(new Function() { // from class: cdwv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((bran) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brdrVarD.h(new Function() { // from class: cdvu
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            brecVar.m(conversationIdType2);
                            brecVar.T(j3);
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final brdp brdpVarB = brdrVarD.b();
                    brdk brdkVar2 = new brdk();
                    brdkVar2.c(new Function() { // from class: cdvv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            brecVar.s(brdpVarB);
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    ekgbVarA = brdkVar2.b().a();
                }
                final cdww cdwwVar = this.a;
                if (cdwwVar.i.a()) {
                    j2 = 0;
                    Collection.EL.stream(ekgbVarA).filter(new Predicate() { // from class: cdvw
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
                            MessagesTable.BindData bindData = (MessagesTable.BindData) obj;
                            return (bindData == null || bindData.I().equals(basd.a)) ? false : true;
                        }
                    }).forEach(new Consumer() { // from class: cdvx
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            cdwx cdwxVar = (cdwx) cdwwVar.j.b();
                            basd basdVarI = ((MessagesTable.BindData) obj).I();
                            basdVarI.getClass();
                            ellg ellgVar = (ellg) ellh.a.createBuilder();
                            ellgVar.getClass();
                            elgr.g(ellf.BUGLE_MESSAGE, ellgVar);
                            elof elofVar = (elof) elpg.b.createBuilder();
                            elofVar.getClass();
                            elhf.f(basdVarI.f(), elofVar);
                            elhf.h(5, elofVar);
                            elgr.d(elhf.a(elofVar), ellgVar);
                            ((aimb) cdwxVar.a.b()).a().j((ellg) elgr.a(ellgVar).toBuilder(), aioj.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                } else {
                    j2 = 0;
                }
                cqce cqceVar = cdww.a;
                cqbd cqbdVarC7 = cqceVar.c();
                cqbdVarC7.I("Messages in conversation were deleted");
                cqbdVarC7.c(conversationIdType2);
                cqbdVarC7.y("DeleteCount", ekgbVarA.size());
                cqbdVarC7.r();
                cdvoVar.a = ekgbVarA.size();
                cdvoVar.d = (byte) (cdvoVar.d | 1);
                ekgb ekgbVar2 = (ekgb) Collection.EL.stream(ekgbVarA).map(new Function() { // from class: cdvy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        Uri uriC = ((MessagesTable.BindData) obj).C();
                        return uriC == null ? Uri.EMPTY : uriC;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: cdvz
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
                        return !((Uri) obj).equals(Uri.EMPTY);
                    }
                }).collect(ekcv.a);
                if (ekgbVar2 == null) {
                    throw new NullPointerException("Null messageUrisDeleted");
                }
                cdvoVar.b = ekgbVar2;
                if (j3 < Long.MAX_VALUE && j3 > j2) {
                    cqceVar.p("Look for any messages left in conversation which are restricted.");
                    brdr brdrVarD2 = MessagesTable.d();
                    brdrVarD2.A("deleteConversation2");
                    brdrVarD2.f(new Function() { // from class: cdwa
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((bran) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brdrVarD2.h(new Function() { // from class: cdwr
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            brecVar.m(conversationIdType2);
                            brecVar.ak();
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brdrVarD2.d(new brdo(MessagesTable.c.i, false));
                    brdrVarD2.y(1);
                    ekgbVarG = brdrVarD2.b().g();
                }
                if (ekgbVarG.isEmpty()) {
                    bost bostVar = new bost();
                    bostVar.f("deleteConversation");
                    bostVar.a(new Function() { // from class: cdws
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            botl botlVar = (botl) obj;
                            botlVar.r(conversationIdType2);
                            return botlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int iD = bostVar.d();
                    boolean z4 = iD > 0;
                    cdvoVar.a(z4);
                    cqbd cqbdVarC8 = cqceVar.c();
                    cqbdVarC8.I("Conversations deleted");
                    cqbdVarC8.c(conversationIdType2);
                    cqbdVarC8.y("DeletedCount", iD);
                    cqbdVarC8.B("DeleteSuccess", z4);
                    cqbdVarC8.r();
                } else {
                    SuperSortLabel superSortLabel2 = superSortLabel;
                    fcsu fcsuVar = cdwwVar.h;
                    if (((arqh) fcsuVar.b()).a() || !superSortLabel2.b()) {
                        if (((arqh) fcsuVar.b()).a()) {
                            cqbd cqbdVarC9 = cqceVar.c();
                            cqbdVarC9.I("Conversation delete failure");
                            cqbdVarC9.c(conversationIdType2);
                            cqbdVarC9.A("LastMessageId", ((MessageIdType) ekgbVarG.get(0)).b());
                            cqbdVarC9.r();
                        } else {
                            cqbd cqbdVarC10 = cqceVar.c();
                            cqbdVarC10.I("Conversation delete failure");
                            cqbdVarC10.c(conversationIdType2);
                            cqbdVarC10.B("IsSpecific", superSortLabel2.b());
                            cqbdVarC10.A("LastMessageId", ((MessageIdType) ekgbVarG.get(0)).b());
                            cqbdVarC10.r();
                        }
                        ((ains) cdwwVar.g.b()).c("Bugle.ConversationDeletion.Failure.Counts");
                    } else {
                        MessageCoreData messageCoreDataW = ((baxe) cdwwVar.d.b()).w((MessageIdType) ekgbVarG.get(0));
                        messageCoreDataW.getClass();
                        bote boteVar2 = new bote();
                        boteVar2.ap("DeleteDatabaseOperations#deleteConversation");
                        baxe.W(messageCoreDataW, boteVar2, null);
                        boteVar2.ad(new Function() { // from class: cdwt
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                botl botlVar = (botl) obj;
                                botlVar.r(conversationIdType2);
                                return botlVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        boteVar2.b().e();
                        cdvoVar.a(true);
                        cqbd cqbdVarC11 = cqceVar.c();
                        cqbdVarC11.I("Specific conversation delete success");
                        cqbdVarC11.c(conversationIdType2);
                        cqbdVarC11.A("RestrictedLabel", superSortLabel2);
                        cqbdVarC11.r();
                    }
                }
                if (cdvoVar.d == 3 && (ekgbVar = cdvoVar.b) != null) {
                    return new cdvp(cdvoVar.a, ekgbVar, cdvoVar.c);
                }
                StringBuilder sb = new StringBuilder();
                if ((cdvoVar.d & 1) == 0) {
                    sb.append(" numberOfDeletedMessages");
                }
                if (cdvoVar.b == null) {
                    sb.append(" messageUrisDeleted");
                }
                if ((cdvoVar.d & 2) == 0) {
                    sb.append(" isConversationDeleted");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        });
    }

    public final int a(MessageIdType messageIdType) {
        eieu eieuVarK = eiiy.k("DeleteDatabaseOperations#deleteMessage");
        try {
            MessageCoreData messageCoreDataA = ((baxe) this.d.b()).A(messageIdType);
            int iB = messageCoreDataA != null ? b(Collections.singletonList(messageIdType), messageCoreDataA.A()) : 0;
            eieuVarK.close();
            return iB;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final int b(List list, ConversationIdType conversationIdType) {
        return c(list, conversationIdType, true);
    }

    public final int c(final List list, final ConversationIdType conversationIdType, final boolean z) {
        int iIntValue;
        eieu eieuVarK = eiiy.k("DeleteDatabaseOperations#deleteMessagesInConversation");
        try {
            cqaz.h();
            if (list.isEmpty()) {
                iIntValue = 0;
            } else {
                ((awlc) this.k.b()).d(new Consumer() { // from class: cdwm
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ((cnos) obj).b(conversationIdType, ekgb.n(list));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                iIntValue = ((Integer) this.c.c("DeleteDatabaseOperations#deleteMessagesInConversation", new ejxr() { // from class: cdwn
                    @Override // defpackage.ejxr
                    public final Object get() {
                        String[] strArr = MessagesTable.a;
                        brdk brdkVar = new brdk();
                        brdkVar.f("deleteMessagesInConversation");
                        final ConversationIdType conversationIdType2 = conversationIdType;
                        final List list2 = list;
                        brdkVar.c(new Function() { // from class: cdwf
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                brec brecVar = (brec) obj;
                                brecVar.m(conversationIdType2);
                                brecVar.t(list2);
                                return brecVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int iD = brdkVar.d();
                        cdww cdwwVar = this.a;
                        fcsu fcsuVar = cdwwVar.b;
                        ((bxlc) fcsuVar.b()).m(conversationIdType2, list2, new String[0]);
                        if (!z || !cdwwVar.g(conversationIdType2)) {
                            bvdk bvdkVarS = ((bakt) cdwwVar.e.b()).s(conversationIdType2);
                            if (bvdkVarS == null) {
                                bvdkVarS = bvdk.UNARCHIVED;
                            }
                            ((baqi) cdwwVar.f.b()).b(conversationIdType2, false, bvdkVarS);
                            ((bxlc) fcsuVar.b()).c();
                        }
                        return Integer.valueOf(iD);
                    }
                })).intValue();
            }
            eieuVarK.close();
            return iIntValue;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final cdvs d(ConversationIdType conversationIdType, long j) {
        return e(conversationIdType, SuperSortLabel.ALL, j);
    }

    public final cdvs e(ConversationIdType conversationIdType, SuperSortLabel superSortLabel, long j) {
        return i(conversationIdType, j, superSortLabel, false);
    }

    public final cdvs f(ConversationIdType conversationIdType, SuperSortLabel superSortLabel, long j) {
        return i(conversationIdType, j, superSortLabel, true);
    }

    public final boolean g(final ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("DeleteDatabaseOperations#deleteConversationIfEmpty");
        try {
            cqaz.h();
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("deleteConversationIfEmpty#hasNoMessagesQuery");
            brdrVarD.h(new Function() { // from class: cdwg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    brecVar.m(conversationIdType);
                    brecVar.A(false);
                    brecVar.b(new Function() { // from class: cdwc
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            brec brecVar2 = (brec) obj2;
                            brecVar2.ak();
                            return brecVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: cdwd
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            brec brecVar2 = (brec) obj2;
                            brecVar2.af();
                            return brecVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            boolean z = true;
            brdrVarD.d(new brdo(MessagesTable.c.i, false));
            brdrVarD.y(1);
            brdrVarD.f(new Function() { // from class: cdwh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bran) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            boolean zW = brdrVarD.b().W();
            bpct bpctVarA = bpcy.a();
            bpctVarA.A("deleteConversationIfEmpty");
            bpctVarA.k(new bpcw((bpcx) new Function() { // from class: cdwi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bpcx bpcxVar = (bpcx) obj;
                    bpcxVar.b(conversationIdType);
                    return bpcxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }.apply(new bpcx())));
            bpctVarA.y(1);
            if (!bpctVarA.b().W()) {
                cqbd cqbdVarC = a.c();
                cqbdVarC.I("Could not delete empty conversation; has draft");
                cqbdVarC.c(conversationIdType);
                cqbdVarC.r();
            } else {
                if (zW) {
                    String[] strArr = botm.a;
                    bost bostVar = new bost();
                    bostVar.f("deleteConversationIfEmpty#deleteConversation");
                    bostVar.a(new Function() { // from class: cdwj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            botl botlVar = (botl) obj;
                            botlVar.r(conversationIdType);
                            return botlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bostVar.d();
                    cqbd cqbdVarC2 = a.c();
                    cqbdVarC2.I("Deleted empty");
                    cqbdVarC2.c(conversationIdType);
                    cqbdVarC2.r();
                    eieuVarK.close();
                    return z;
                }
                cqbd cqbdVarC3 = a.c();
                cqbdVarC3.I("Could not delete empty conversation; has message");
                cqbdVarC3.c(conversationIdType);
                cqbdVarC3.r();
            }
            z = false;
            eieuVarK.close();
            return z;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h(ConversationIdType conversationIdType, long j) {
        eieu eieuVarK = eiiy.k("DeleteDatabaseOperations#resetConversationDeleteTimeStampIfNoOldMessageExists");
        try {
            cqaz.h();
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.m(conversationIdType);
            brecVar.S(j);
            brdv brdvVar = new brdv(brecVar);
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("resetConversationDeleteTimeStampIfNoOldMessageExists");
            brdrVarD.f(new Function() { // from class: cdwk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bran) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.k(brdvVar);
            brdp brdpVarB = brdrVarD.b();
            String[] strArr2 = botm.a;
            botl botlVar = new botl();
            botlVar.ar(new dqwi(brdpVarB));
            botlVar.r(conversationIdType);
            botf botfVar = new botf(botlVar);
            bote boteVar = new bote();
            boteVar.ap("DeleteDatabaseOperations#resetConversationDeleteTimeStampIfNoOldMessageExists.conversations");
            boteVar.o(0L);
            boteVar.af(botfVar);
            boteVar.b().e();
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
