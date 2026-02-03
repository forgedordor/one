package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciwi {
    public static final cqce a = cqce.g("BugleDataModel", "RcsDeliveryReportProcessor");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/rcs/incoming/RcsDeliveryReportProcessor");
    private final fcsu A;
    private final fcsu B;
    private final eosc C;
    private final eosc D;
    private final fcsu E;
    private final fcsu F;
    private final fcsu G;
    private final apto H;
    private final awlc I;
    public final ajhd c;
    public final cogw d;
    public final fcsu e;
    public final fcsu f;
    public final dqsn g;
    public final cqjy h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final awlc n;
    public final asbq o;
    private final cteb p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;
    private final ains t;
    private final Optional u;
    private final auau v;
    private final fcsu w;
    private final fcsu x;
    private final fcsu y;
    private final fcsu z;

    public ciwi(cteb ctebVar, ajhd ajhdVar, cogw cogwVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, ains ainsVar, dqsn dqsnVar, cqjy cqjyVar, Optional optional, auau auauVar, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar16, awlc awlcVar, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, apto aptoVar, awlc awlcVar2, asbq asbqVar) {
        this.p = ctebVar;
        this.c = ajhdVar;
        this.d = cogwVar;
        this.e = fcsuVar3;
        this.s = fcsuVar4;
        this.A = fcsuVar5;
        this.t = ainsVar;
        this.g = dqsnVar;
        this.h = cqjyVar;
        this.u = optional;
        this.v = auauVar;
        this.w = fcsuVar6;
        this.x = fcsuVar7;
        this.y = fcsuVar8;
        this.z = fcsuVar9;
        this.i = fcsuVar10;
        this.j = fcsuVar11;
        this.q = fcsuVar;
        this.r = fcsuVar2;
        this.B = fcsuVar12;
        this.k = fcsuVar13;
        this.f = fcsuVar14;
        this.l = fcsuVar15;
        this.C = eoscVar;
        this.D = eoscVar2;
        this.m = fcsuVar16;
        this.n = awlcVar;
        this.E = fcsuVar17;
        this.F = fcsuVar18;
        this.G = fcsuVar19;
        this.H = aptoVar;
        this.I = awlcVar2;
        this.o = asbqVar;
    }

    private final String d(ChatSessionMessageEvent chatSessionMessageEvent) {
        String str = chatSessionMessageEvent.a;
        if (str == null) {
            throw new IllegalStateException("RcsDeliveryReportProcessor: User ID of sender was null.");
        }
        fcsu fcsuVar = this.s;
        ParticipantsTable.BindData bindDataC = ((bbca) fcsuVar.b()).c(str);
        if (bindDataC == null) {
            return ((bbca) fcsuVar.b()).j(bbbd.f(str));
        }
        String strR = bindDataC.R();
        strR.getClass();
        return strR;
    }

    private final void e(ConversationIdType conversationIdType, aubq aubqVar, aubq aubqVar2, boolean z) {
        ekrd ekrdVarI = a.i();
        ekrdVarI.X(cqnc.I, aubqVar.d);
        ((ekrd) ekrdVarI.h("com/google/android/apps/messaging/shared/rcs/incoming/RcsDeliveryReportProcessor", "logAndDisableEncryptionForRemoteRegistration", 728, "RcsDeliveryReportProcessor.java")).t("Disable [isGroup=%s] encryption on the remote instance.", Boolean.valueOf(z));
        ((bagy) this.G.b()).a(aubqVar2, conversationIdType).c(aubqVar, z, elyd.RECEIVED_PLAINTEXT_DELIVERY_RECEIPT);
    }

    private final void f(MessageCoreData messageCoreData, ConversationIdType conversationIdType, enyw enywVar) {
        ainn ainnVarA = ainm.a(this.d);
        Optional optionalEmpty = Optional.empty();
        bajf bajfVarA = ((axgh) this.q.b()).a(conversationIdType);
        if (bajfVarA != null) {
            optionalEmpty = Optional.of(Integer.valueOf(bajfVarA.E()));
        }
        this.c.ab(messageCoreData, optionalEmpty, enywVar, ainnVarA);
    }

    public final eiju a(final ChatSessionMessageEvent chatSessionMessageEvent, final cbqz cbqzVar, final basd basdVar, final elpg elpgVar) {
        final basd basdVarA = basd.a(chatSessionMessageEvent.c);
        return ((ciza) this.F.b()).a(ciyz.DELIVERED).i(new eooz() { // from class: ciwg
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ciwi ciwiVar = this.a;
                cmoi cmoiVar = (cmoi) ciwiVar.l.b();
                final basd basdVar2 = basdVarA;
                cmoiVar.e(basdVar2, 2);
                if (chatSessionMessageEvent.h == 50035) {
                    final MessageIdType messageIdType = bary.a;
                    ekrg ekrgVar = ciwi.b;
                    ((ekrd) ((ekrd) ekrgVar.e()).h("com/google/android/apps/messaging/shared/rcs/incoming/RcsDeliveryReportProcessor", "updateStatusInUiWithoutDb", 377, "RcsDeliveryReportProcessor.java")).t("Setting delivered status in status tracker using rcsMessageId only for rcsMessageId: %s", basdVar2);
                    if (((byej) ciwiVar.m.b()).c(basdVar2, 2)) {
                        ((ekrd) ((ekrd) ekrgVar.e()).h("com/google/android/apps/messaging/shared/rcs/incoming/RcsDeliveryReportProcessor", "updateStatusInUiWithoutDb", 390, "RcsDeliveryReportProcessor.java")).q("Successfully updated status in status tracker to delivered; now notifying UI.");
                        eieu eieuVarK = eiiy.k("RcsDeliveryReportProcessor::onMessageStatusChanging");
                        try {
                            ciwiVar.n.d(new Consumer() { // from class: ciwd
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj2) {
                                    ((byee) obj2).c(messageIdType, basdVar2);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            eieuVarK.close();
                        } catch (Throwable th) {
                            try {
                                eieuVarK.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else {
                        ((ekrd) ((ekrd) ciwi.b.e()).h("com/google/android/apps/messaging/shared/rcs/incoming/RcsDeliveryReportProcessor", "updateStatusInUiWithoutDb", 397, "RcsDeliveryReportProcessor.java")).q("Status in status tracker was unchanged.");
                    }
                }
                return ((cmoi) ciwiVar.l.b()).b(basdVar2);
            }
        }, this.D).h(new ejvr() { // from class: ciwh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final ciwi ciwiVar = this.a;
                final ChatSessionMessageEvent chatSessionMessageEvent2 = chatSessionMessageEvent;
                final cbqz cbqzVar2 = cbqzVar;
                final basd basdVar2 = basdVar;
                final elpg elpgVar2 = elpgVar;
                return (Void) ciwiVar.g.b(new ejxr() { // from class: ciwb
                    @Override // defpackage.ejxr
                    public final Object get() {
                        final int i;
                        eieu eieuVarK = eiiy.k("RcsDeliveryReportProcessor.processInternal");
                        final elpg elpgVar3 = elpgVar2;
                        basd basdVar3 = basdVar2;
                        final ChatSessionMessageEvent chatSessionMessageEvent3 = chatSessionMessageEvent2;
                        final cbqz cbqzVar3 = cbqzVar2;
                        final ciwi ciwiVar2 = ciwiVar;
                        try {
                            if (ciwiVar2.h.s) {
                                cqbd cqbdVarA = ciwi.a.a();
                                cqbdVarA.I("Ignoring received RCS IMDN for debugging");
                                cqbdVarA.r();
                            } else {
                                final long epochMilli = ciwiVar2.d.f().toEpochMilli();
                                basd basdVarA2 = basd.a(chatSessionMessageEvent3.c);
                                final MessageCoreData messageCoreDataY = ((baxe) ciwiVar2.e.b()).y(basdVarA2);
                                fhaz fhazVarAJ = messageCoreDataY == null ? null : messageCoreDataY.aJ();
                                if (messageCoreDataY == null) {
                                    ((ains) ciwiVar2.f.b()).c("Bugle.Rcs.Chat.Message.DeliveryReport.Nonexistent.Counts");
                                    if (((eoth) ((asbe) ciwiVar2.o).a.b()).a("bugle.enable_log_imdn_for_non_existent_message")) {
                                        int i2 = chatSessionMessageEvent3.h;
                                        ciwiVar2.c.s(basdVarA2, i2 != 50032 ? i2 != 50035 ? 3 : 1 : 10);
                                    }
                                }
                                if (((Boolean) cmxp.d.e()).booleanValue()) {
                                    String strF = basdVar3.f();
                                    if (fhazVarAJ != null) {
                                        String str = fhazVarAJ.b;
                                        fcsu fcsuVar = ciwiVar2.k;
                                        ((cmxn) fcsuVar.b()).c(strF, str);
                                        ((cmxn) fcsuVar.b()).e(str, 10, cmxn.k);
                                    }
                                }
                                int i3 = chatSessionMessageEvent3.h;
                                if (i3 == 50032) {
                                    ciwiVar2.b(fhazVarAJ, chatSessionMessageEvent3, febt.BUGLE_SENDING_INTERNAL_STATUS_DISPLAYED);
                                    i = 11;
                                } else if (i3 != 50035) {
                                    ciwiVar2.b(fhazVarAJ, chatSessionMessageEvent3, febt.BUGLE_SENDING_INTERNAL_STATUS_DELIVERY_EVENT_UNHANDLED);
                                    cqbd cqbdVarE = ciwi.a.e();
                                    cqbdVarE.I("Unhandled delivery event");
                                    cqbdVarE.I(chatSessionMessageEvent3);
                                    cqbdVarE.r();
                                } else {
                                    ciwiVar2.b(fhazVarAJ, chatSessionMessageEvent3, febt.BUGLE_SENDING_INTERNAL_STATUS_DELIVERED);
                                    i = 2;
                                }
                                if (messageCoreDataY == null) {
                                    cqbd cqbdVarB = ciwi.a.b();
                                    cqbdVarB.I("cannot find");
                                    cqbdVarB.d(bary.b(chatSessionMessageEvent3.c));
                                    cqbdVarB.r();
                                } else {
                                    ciwiVar2.g.d("RcsDeliveryReportProcessor#executeAction", new Runnable() { // from class: ciwc
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            MessageCoreData messageCoreDataW;
                                            ciwi ciwiVar3 = ciwiVar2;
                                            MessageCoreData messageCoreData = messageCoreDataY;
                                            ChatSessionMessageEvent chatSessionMessageEvent4 = chatSessionMessageEvent3;
                                            cbqz cbqzVar4 = cbqzVar3;
                                            long j = epochMilli;
                                            int i4 = i;
                                            elpg elpgVar4 = elpgVar3;
                                            ciwiVar3.c(messageCoreData, chatSessionMessageEvent4, cbqzVar4, j, i4, elpgVar4);
                                            if (messageCoreData.D().c()) {
                                                return;
                                            }
                                            MessageIdType messageIdTypeD = messageCoreData.D();
                                            if (messageIdTypeD.c() || (messageCoreDataW = ((baxe) ciwiVar3.e.b()).w(messageIdTypeD)) == null) {
                                                return;
                                            }
                                            ciwiVar3.c(messageCoreDataW, chatSessionMessageEvent4, cbqzVar4, j, i4, elpgVar4);
                                        }
                                    });
                                    ((bxlc) ciwiVar2.j.b()).j(messageCoreDataY.A(), messageCoreDataY.C());
                                    if (i == 2) {
                                        bayi bayiVar = (bayi) ciwiVar2.i.b();
                                        eieu eieuVarH = eiiy.h("OnMessageUpdatedCompositeListener.onProcessDeliveredSuccess");
                                        try {
                                            for (bayg baygVar : (Set) bayiVar.b.b()) {
                                                eieu eieuVarA = baygVar.a();
                                                try {
                                                    baygVar.b(messageCoreDataY);
                                                    fczl.a(eieuVarA, null);
                                                } catch (Throwable th) {
                                                    try {
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        fczl.a(eieuVarA, th);
                                                        throw th2;
                                                    }
                                                }
                                            }
                                            fczl.a(eieuVarH, null);
                                        } finally {
                                        }
                                    }
                                }
                            }
                            eieuVarK.close();
                            return null;
                        } finally {
                        }
                    }
                });
            }
        }, this.C);
    }

    public final void b(fhaz fhazVar, ChatSessionMessageEvent chatSessionMessageEvent, febt febtVar) {
        ((aylz) this.w.b()).c(fhazVar, basd.a(chatSessionMessageEvent.c), 7, Optional.of(febtVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0286  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(final com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r21, final com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent r22, final defpackage.cbqz r23, long r24, int r26, defpackage.elpg r27) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciwi.c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent, cbqz, long, int, elpg):void");
    }
}
