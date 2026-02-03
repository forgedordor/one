package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cite extends cayv {
    public static final eksp a = eksp.c("BugleGroupManagement");
    public final eosc b;
    public final eosc c;
    public final fcsu d;
    public final fcsu e;
    public final asre f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;

    public cite(eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, fcsu fcsuVar2, asre asreVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        this.b = eoscVar;
        this.c = eoscVar2;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = asreVar;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
        this.j = fcsuVar6;
        this.k = fcsuVar7;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("RemoveMembersFromRcsConversationHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return citg.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final citg citgVar = (citg) evuhVar;
        final ConversationIdType conversationIdTypeB = barn.b(citgVar.c);
        return eijx.g(new citd(this, conversationIdTypeB), this.b).i(new eooz() { // from class: cita
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final bojh bojhVar = (bojh) obj;
                if (bojhVar == null) {
                    ConversationIdType conversationIdType = conversationIdTypeB;
                    eksl ekslVar = (eksl) cite.a.j();
                    ekslVar.X(cqnc.r, conversationIdType.toString());
                    ekslVar.X(cqnc.N, null);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/rcs/groups/participants/RemoveMembersFromRcsConversationHandler", "processPendingWorkItemAsync", 131, "RemoveMembersFromRcsConversationHandler.java")).q("Conversation is null when attempting to remove users from RCS group conversation.");
                    return eijx.e(cbcw.k());
                }
                final citg citgVar2 = citgVar;
                ejwl.a(1 == (citgVar2.b & 1));
                final String str = citgVar2.e;
                aubq aubqVar = citgVar2.d;
                if (aubqVar == null) {
                    aubqVar = aubq.a;
                }
                final aubq aubqVar2 = aubqVar;
                auib auibVar = citgVar2.f;
                if (auibVar == null) {
                    auibVar = auib.a;
                }
                final auib auibVar2 = auibVar;
                final cite citeVar = this.a;
                if (ejwk.c(bojhVar.ae())) {
                    ((cifw) citeVar.e.b()).l(auibVar2, citeVar.k(bojhVar), enxi.CHAT_API_INVALID_CONVERSATION_ID);
                    throw new IllegalStateException("No RCS group ID found for the conversation.");
                }
                if (ejwk.c(bojhVar.ad())) {
                    ((cifw) citeVar.e.b()).l(auibVar2, citeVar.k(bojhVar), enxi.CHAT_API_INVALID_CONFERENCE_URI);
                    throw new IllegalStateException("No RCS conference ID found for the conversation.");
                }
                final String strAe = bojhVar.ae();
                strAe.getClass();
                String strAd = bojhVar.ad();
                strAd.getClass();
                final audu auduVarA = ((asra) citeVar.g.b()).a(strAe, strAd);
                Callable callable = new Callable() { // from class: cisz
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return ((bbca) citeVar.i.b()).b(str);
                    }
                };
                eosc eoscVar = citeVar.b;
                eiju eijuVarI = eijx.g(callable, eoscVar).i(new eooz() { // from class: citb
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        long jA;
                        final cite citeVar2 = citeVar;
                        bojh bojhVar2 = bojhVar;
                        auib auibVar3 = auibVar2;
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj2;
                        if (bindData == null) {
                            ((cifw) citeVar2.e.b()).l(auibVar3, citeVar2.k(bojhVar2), enxi.CHAT_API_INVALID_REMOTE_PARTICIPANT);
                            throw new IllegalStateException("Could not resolve Recipient for given bugleParticipantId.");
                        }
                        alqm alqmVarQ = ((alrj) citeVar2.h.b()).q(bindData);
                        if (alqmVarQ.e().isEmpty()) {
                            ((cifw) citeVar2.e.b()).l(auibVar3, citeVar2.k(bojhVar2), enxi.CHAT_API_REMOTE_PARTICIPANT_NOT_RCS_CAPABLE);
                            throw new IllegalStateException("no RCS identifier found for the participant to remove");
                        }
                        String str2 = strAe;
                        String str3 = str;
                        final aubq aubqVar3 = (aubq) alqmVarQ.e().get();
                        cbqz cbqzVarJ = bojhVar2.J();
                        augf augfVar = (augf) augg.a.createBuilder();
                        augfVar.copyOnWrite();
                        augg auggVar = (augg) augfVar.instance;
                        auggVar.b |= 1;
                        auggVar.c = str2;
                        augfVar.copyOnWrite();
                        augg auggVar2 = (augg) augfVar.instance;
                        str3.getClass();
                        auggVar2.b |= 2;
                        auggVar2.d = str3;
                        augfVar.copyOnWrite();
                        augg auggVar3 = (augg) augfVar.instance;
                        auibVar3.getClass();
                        auggVar3.f = auibVar3;
                        auggVar3.b |= 16;
                        if (((armi) citeVar2.j.b()).a()) {
                            cbqz cbqzVar = cbqz.a;
                            jA = cbqy.a(cbqzVarJ);
                        } else {
                            jA = 0;
                        }
                        final aubq aubqVar4 = aubqVar2;
                        long j = jA;
                        final audu auduVar = auduVarA;
                        augfVar.copyOnWrite();
                        augg auggVar4 = (augg) augfVar.instance;
                        auggVar4.b |= 32;
                        auggVar4.g = j;
                        final augg auggVar5 = (augg) augfVar.build();
                        return eijx.h(new eooy() { // from class: citc
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                augh aughVar = (augh) augi.a.createBuilder();
                                aughVar.copyOnWrite();
                                augi augiVar = (augi) aughVar.instance;
                                audu auduVar2 = auduVar;
                                auduVar2.getClass();
                                augiVar.c = auduVar2;
                                augiVar.b |= 1;
                                aughVar.a(aubqVar3);
                                augg auggVar6 = auggVar5;
                                evqs byteString = auggVar6.toByteString();
                                aughVar.copyOnWrite();
                                augi augiVar2 = (augi) aughVar.instance;
                                augiVar2.b |= 2;
                                augiVar2.e = byteString;
                                aughVar.copyOnWrite();
                                augi augiVar3 = (augi) aughVar.instance;
                                aubq aubqVar5 = aubqVar4;
                                aubqVar5.getClass();
                                augiVar3.f = aubqVar5;
                                augiVar3.b |= 4;
                                auib auibVar4 = auggVar6.f;
                                if (auibVar4 == null) {
                                    auibVar4 = auib.a;
                                }
                                cite citeVar3 = citeVar2;
                                aughVar.copyOnWrite();
                                augi augiVar4 = (augi) aughVar.instance;
                                auibVar4.getClass();
                                augiVar4.g = auibVar4;
                                augiVar4.b |= 8;
                                return citeVar3.f.c((augi) aughVar.build());
                            }
                        }, citeVar2.b);
                    }
                }, eoscVar);
                eooz eoozVar = new eooz() { // from class: cisw
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        augk augkVar = (augk) obj2;
                        aubl aublVar = augkVar.c;
                        if (aublVar == null) {
                            aublVar = aubl.a;
                        }
                        aubk aubkVarB = aubk.b(aublVar.c);
                        if (aubkVarB == null) {
                            aubkVarB = aubk.UNKNOWN_STATUS;
                        }
                        bojh bojhVar2 = bojhVar;
                        if (aubkVarB.equals(aubk.PENDING) || aubkVarB.equals(aubk.OK)) {
                            eksl ekslVar2 = (eksl) cite.a.e();
                            ekslVar2.X(cqnc.s, bojhVar2.C());
                            ekslVar2.X(cqnc.N, bojhVar2.ae());
                            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/rcs/groups/participants/RemoveMembersFromRcsConversationHandler", "removeUserFromValidRcsGroupConversation", 156, "RemoveMembersFromRcsConversationHandler.java")).q("Users successfully queued to be removed from RCS group conversation.");
                            return eijx.e(cbcw.i());
                        }
                        citg citgVar3 = citgVar2;
                        cite citeVar2 = citeVar;
                        eksl ekslVar3 = (eksl) cite.a.e();
                        ekslVar3.X(cqnc.s, bojhVar2.C());
                        ekslVar3.X(cqnc.N, bojhVar2.ae());
                        ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/rcs/groups/participants/RemoveMembersFromRcsConversationHandler", "removeUserFromValidRcsGroupConversation", 164, "RemoveMembersFromRcsConversationHandler.java")).q("Users not successfully queued to be removed from RCS group conversation.");
                        cifw cifwVar = (cifw) citeVar2.e.b();
                        auib auibVar3 = citgVar3.f;
                        if (auibVar3 == null) {
                            auibVar3 = auib.a;
                        }
                        auib auibVar4 = auibVar3;
                        aubl aublVar2 = augkVar.c;
                        if (aublVar2 == null) {
                            aublVar2 = aubl.a;
                        }
                        cbqz cbqzVarK = citeVar2.k(bojhVar2);
                        auibVar4.getClass();
                        cbqzVarK.getClass();
                        cifw.v(cifwVar, 19, 3, null, auibVar4, null, cifwVar.m(3, aublVar2), 0, cbqzVarK, null, 340);
                        return eijx.e(cbcw.k());
                    }
                };
                eosc eoscVar2 = citeVar.c;
                eiju eijuVarI2 = eijuVarI.i(eoozVar, eoscVar2);
                eijuVarI2.k(new cqob(new Consumer() { // from class: cisx
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        eksp ekspVar = cite.a;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Consumer() { // from class: cisy
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        cite citeVar2 = citeVar;
                        boolean zA = ((ardt) citeVar2.k.b()).a();
                        citg citgVar3 = citgVar2;
                        bojh bojhVar2 = bojhVar;
                        if (zA) {
                            cifw cifwVar = (cifw) citeVar2.e.b();
                            auib auibVar3 = citgVar3.f;
                            if (auibVar3 == null) {
                                auibVar3 = auib.a;
                            }
                            cifwVar.s(auibVar3, 30, citeVar2.k(bojhVar2));
                            return;
                        }
                        cifw cifwVar2 = (cifw) citeVar2.e.b();
                        auib auibVar4 = citgVar3.f;
                        if (auibVar4 == null) {
                            auibVar4 = auib.a;
                        }
                        cbqz cbqzVarK = citeVar2.k(bojhVar2);
                        auibVar4.getClass();
                        cbqzVarK.getClass();
                        cifwVar2.l(auibVar4, cbqzVarK, enxi.CHAT_API_ERROR_CAUSE_UNKNOWN);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }), eoscVar2);
                return eijuVarI2;
            }
        }, this.c);
    }

    public final cbqz k(bojh bojhVar) {
        return ((armi) this.j.b()).a() ? bojhVar.J() : cbqz.a;
    }
}
