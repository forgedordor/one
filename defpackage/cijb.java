package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cijb extends cayv {
    public static final eksp a = eksp.c("BugleGroupManagement");
    public final cicm b;
    public final dqsn c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final cogw h;
    public final fcsu i;
    public final chwq j;
    private final Context k;
    private final eosd l;
    private final eosc m;
    private final fcsu n;
    private final bxkp o;

    public cijb(Context context, eosd eosdVar, eosc eoscVar, cicm cicmVar, dqsn dqsnVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, bxkp bxkpVar, fcsu fcsuVar4, fcsu fcsuVar5, cogw cogwVar, fcsu fcsuVar6, chwq chwqVar) {
        this.k = context;
        this.l = eosdVar;
        this.m = eoscVar;
        this.b = cicmVar;
        this.c = dqsnVar;
        this.n = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.o = bxkpVar;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
        this.h = cogwVar;
        this.i = fcsuVar6;
        this.j = chwqVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("IncomingRcsGroupInvitationHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cijd.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        cijd cijdVar = (cijd) evuhVar;
        if (craf.i(this.k)) {
            ((eksl) a.n().h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "processPendingWorkItemAsync", 137, "IncomingRcsGroupInvitationHandler.java")).q("Ignoring incoming RCS group invitation for secondary user");
            return eijx.e(cbcw.i());
        }
        eiju eijuVarH = eijx.e(cijdVar).h(new ejvr() { // from class: ciit
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final ConversationIdType conversationIdType;
                cijd cijdVar2 = (cijd) obj;
                if (cijdVar2.c.isEmpty()) {
                    ((eksl) ((eksl) cijb.a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "areValidIncomingRcsGroupInvitationParameters", 246, "IncomingRcsGroupInvitationHandler.java")).q("Invalid parameters. RCS group ID not set");
                } else if (cijdVar2.d.isEmpty()) {
                    ((eksl) ((eksl) cijb.a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "areValidIncomingRcsGroupInvitationParameters", 251, "IncomingRcsGroupInvitationHandler.java")).q("Invalid parameters. RCS conference URI not set");
                } else {
                    if (cijdVar2.f.size() != 0) {
                        final cijb cijbVar = this.a;
                        cicq cicqVarW = cicr.w();
                        cicqVarW.q(true);
                        cicqVarW.w(emaf.INCOMING_GROUP_INVITE_HANDLER);
                        cicqVarW.p(false);
                        cicqVarW.z(cijdVar2.b);
                        cicqVarW.u(cijdVar2.c);
                        cicqVarW.n(cijdVar2.e);
                        cicqVarW.j(false);
                        cicr cicrVarD = cicqVarW.D();
                        cicm cicmVar = cijbVar.b;
                        final ConversationIdType conversationIdTypeA = cicmVar.a(cicrVarD);
                        if (conversationIdTypeA.b()) {
                            cicqVarW.j(true);
                            cicqVarW.s(cijdVar2.d);
                            Stream map = Collection.EL.stream(cijdVar2.f).map(new Function() { // from class: ciix
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    eksp ekspVar = cijb.a;
                                    return bbbd.f((String) obj2).a();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i = ekgb.d;
                            cicqVarW.r((List) map.collect(ekcv.a));
                            final ConversationIdType conversationIdTypeA2 = cicmVar.a(cicqVarW.D());
                            if (conversationIdTypeA2.b()) {
                                eksl ekslVar = (eksl) cijb.a.i();
                                ekslVar.X(cqnc.L, Long.valueOf(cijdVar2.b));
                                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "processPendingWorkItemAsync", 195, "IncomingRcsGroupInvitationHandler.java")).q("Unable to get or create conversation for incoming RCS group.");
                                return cbcw.m();
                            }
                            ekrw ekrwVarN = cijb.a.n();
                            ekrwVarN.X(cqnc.r, conversationIdTypeA2.toString());
                            ekrwVarN.X(cqnc.L, Long.valueOf(cijdVar2.b));
                            ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "processPendingWorkItemAsync", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "IncomingRcsGroupInvitationHandler.java")).q("Received a group invitation for a new conversation");
                            final evtg evtgVar = cijdVar2.f;
                            final String str = cijdVar2.g;
                            final long j = cijdVar2.b;
                            cijbVar.c.d("IncomingRcsGroupInvitationHandler.handleIncomingInviteForNewConversation", new Runnable() { // from class: ciiy
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cijb cijbVar2;
                                    ArrayList<ParticipantsTable.BindData> arrayList = new ArrayList();
                                    Iterator it = evtgVar.iterator();
                                    while (true) {
                                        cijbVar2 = cijbVar;
                                        if (!it.hasNext()) {
                                            break;
                                        } else {
                                            arrayList.add(cijbVar2.k((String) it.next()));
                                        }
                                    }
                                    String str2 = str;
                                    ParticipantsTable.BindData bindDataK = ejwk.c(str2) ? null : cijbVar2.k(str2);
                                    long j2 = j;
                                    ConversationIdType conversationIdType2 = conversationIdTypeA2;
                                    String str3 = "com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler";
                                    if (bindDataK != null) {
                                        for (ParticipantsTable.BindData bindData : arrayList) {
                                            ekrw ekrwVarN2 = cijb.a.n();
                                            ekrwVarN2.X(cqnc.r, conversationIdType2.toString());
                                            ekrwVarN2.X(cqnc.L, Long.valueOf(j2));
                                            eksl ekslVar2 = (eksl) ekrwVarN2.h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "insertNewConversationParticipantTombstoneWithReferrer", 404, "IncomingRcsGroupInvitationHandler.java");
                                            fcsu fcsuVar = cijbVar2.i;
                                            ekslVar2.D("%s added %s", cqcv.b(((bbcc) fcsuVar.b()).a(bindDataK, true)), cqcv.b(((bbcc) fcsuVar.b()).a(bindData, true)));
                                        }
                                        ((byeb) cijbVar2.f.b()).l(Optional.empty(), conversationIdType2, cijbVar2.j.g(), bindDataK, arrayList, BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, cijbVar2.h.f().toEpochMilli(), j2, null);
                                        return;
                                    }
                                    eksp ekspVar = cijb.a;
                                    ((eksl) ekspVar.n().h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "handleIncomingInviteForNewConversation", 305, "IncomingRcsGroupInvitationHandler.java")).q("Referrer msisdn is empty. Adding participants individually");
                                    for (ParticipantsTable.BindData bindData2 : arrayList) {
                                        ekrw ekrwVarN3 = ekspVar.n();
                                        ekrwVarN3.X(cqnc.r, conversationIdType2.toString());
                                        ekrwVarN3.X(cqnc.L, Long.valueOf(j2));
                                        ((eksl) ekrwVarN3.h(str3, "insertNewConversationParticipantTombstoneNoReferrer", 373, "IncomingRcsGroupInvitationHandler.java")).t("%s joined", cqcv.b(((bbcc) cijbVar2.i.b()).a(bindData2, true)));
                                        long j3 = j2;
                                        ConversationIdType conversationIdType3 = conversationIdType2;
                                        ((byeb) cijbVar2.f.b()).l(Optional.empty(), conversationIdType3, cijbVar2.j.g(), bindData2, new ArrayList(ekgb.r(bindData2)), BasePaymentResult.ERROR_REQUEST_FAILED, cijbVar2.h.f().toEpochMilli(), j3, null);
                                        str3 = str3;
                                        conversationIdType2 = conversationIdType3;
                                        j2 = j3;
                                    }
                                }
                            });
                            conversationIdType = conversationIdTypeA2;
                        } else {
                            ekrw ekrwVarN2 = cijb.a.n();
                            ekrwVarN2.X(cqnc.r, conversationIdTypeA.toString());
                            ekrwVarN2.X(cqnc.L, Long.valueOf(cijdVar2.b));
                            ((eksl) ekrwVarN2.h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "processPendingWorkItemAsync", 173, "IncomingRcsGroupInvitationHandler.java")).q("Received a group invitation for an existing conversation");
                            final long j2 = cijdVar2.b;
                            cijbVar.c.d("IncomingRcsGroupInvitationHandler.handleIncomingInviteForExistingConversation", new Runnable() { // from class: ciiw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final cijb cijbVar2 = cijbVar;
                                    final ConversationIdType conversationIdType2 = conversationIdTypeA;
                                    final long j3 = j2;
                                    botm.m(conversationIdType2, new Consumer() { // from class: cija
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void z(Object obj2) {
                                            if (((bojh) obj2).n() == 2) {
                                                long j4 = j3;
                                                ConversationIdType conversationIdType3 = conversationIdType2;
                                                cijb cijbVar3 = cijbVar2;
                                                ((byeb) cijbVar3.f.b()).n(cijbVar3.j.g(), cijbVar3.h.f().toEpochMilli(), conversationIdType3, j4, BasePaymentResult.ERROR_REQUEST_FAILED);
                                            }
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                }
                            });
                            conversationIdType = conversationIdTypeA;
                        }
                        final MessageCoreData messageCoreDataO = ((baxe) cijbVar.d.b()).o(conversationIdType);
                        final long j3 = cijdVar2.b;
                        final String str2 = cijdVar2.g;
                        cijbVar.c.d("IncomingRcsGroupInvitationHandler.updateConversationMetadata", new Runnable() { // from class: ciiz
                            @Override // java.lang.Runnable
                            public final void run() {
                                ConversationIdType conversationIdType2 = conversationIdType;
                                cijb cijbVar2 = cijbVar;
                                String str3 = str2;
                                bvdk bvdkVarG = bvdk.UNARCHIVED;
                                if (!ejwk.c(str3)) {
                                    bvdkVarG = ((baxe) cijbVar2.d.b()).G(conversationIdType2, str3, ((cpjp) cijbVar2.g.b()).e(str3), true);
                                }
                                bvdk bvdkVar = bvdkVarG;
                                MessageCoreData messageCoreData = messageCoreDataO;
                                baqi baqiVar = (baqi) cijbVar2.e.b();
                                MessageIdType messageIdTypeC = messageCoreData == null ? bary.a : messageCoreData.C();
                                long epochMilli = messageCoreData == null ? cijbVar2.h.f().toEpochMilli() : messageCoreData.o();
                                baqiVar.f(conversationIdType2, messageIdTypeC, Long.valueOf(epochMilli), bvdkVar, j3, 0);
                            }
                        });
                        return cbcw.i();
                    }
                    ((eksl) ((eksl) cijb.a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "areValidIncomingRcsGroupInvitationParameters", 256, "IncomingRcsGroupInvitationHandler.java")).q("Invalid parameters. Empty participants");
                }
                eksl ekslVar2 = (eksl) cijb.a.j();
                ekslVar2.X(cqnc.N, cijdVar2.c);
                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "processPendingWorkItemAsync", 148, "IncomingRcsGroupInvitationHandler.java")).r("IncomingRcsGroupInvitationParameters still invalid after retrieving information from RCS process. Participant count: %d", cijdVar2.f.size());
                return cbcw.m();
            }
        }, this.l);
        eooz eoozVar = new eooz() { // from class: ciiu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eksp ekspVar = cijb.a;
                return eijx.e(cbcw.m());
            }
        };
        eosc eoscVar = this.m;
        return eijuVarH.f(TimeoutException.class, eoozVar, eoscVar).f(efao.class, new eooz() { // from class: ciiv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eksp ekspVar = cijb.a;
                return eijx.e(cbcw.m());
            }
        }, eoscVar);
    }

    public final ParticipantsTable.BindData k(String str) {
        fcsu fcsuVar = this.n;
        brvp brvpVarF = bbbd.f(str);
        brvpVarF.v(((bbca) fcsuVar.b()).j(brvpVarF));
        this.o.e(brvpVarF, 3);
        return brvpVarF.a();
    }
}
