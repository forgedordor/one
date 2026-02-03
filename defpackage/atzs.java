package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionsJsonParser;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.data.BasicTextMessage;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import com.google.android.rcs.client.messaging.data.LocationInformation;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atzs implements efkl {
    public static final eksp a = eksp.c("Bugle");
    public final atys b;
    public final atzr c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    private final fcsu k;
    private final eosc l;
    private final atal m = new atal();
    private final cogw n;
    private final Bundle o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;
    private final fcsu t;
    private final fcsu u;
    private final fcsu v;
    private final fcsu w;

    public atzs(atys atysVar, atzr atzrVar, Bundle bundle, eosc eoscVar, cogw cogwVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16) {
        this.b = atysVar;
        this.c = atzrVar;
        this.o = bundle;
        this.h = fcsuVar8;
        this.r = fcsuVar9;
        this.i = fcsuVar10;
        this.l = eoscVar;
        this.n = cogwVar;
        this.p = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar;
        this.q = fcsuVar4;
        this.k = fcsuVar5;
        this.f = fcsuVar6;
        this.g = fcsuVar7;
        this.s = fcsuVar11;
        this.t = fcsuVar12;
        this.u = fcsuVar13;
        this.j = fcsuVar14;
        this.v = fcsuVar15;
        this.w = fcsuVar16;
    }

    private final eiju h() {
        eieu eieuVarK = eiiy.k("UnencryptedIncomingChatMessageVisitor::clearTypingIndicatorAsync");
        try {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "clearTypingIndicator", 876, "UnencryptedIncomingChatMessageVisitor.java")).q("Clearing typing indicator on incoming message async.");
            eiju eijuVarH = eijx.h(new eooy() { // from class: atzn
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    efhu efhuVar = new efhu();
                    efhuVar.c(efjm.STOP);
                    IsComposingMessage isComposingMessageA = efhuVar.a();
                    atzs atzsVar = this.a;
                    return ((atwz) atzsVar.e.b()).a(isComposingMessageA, atzsVar.b.b());
                }
            }, this.l);
            eieuVarK.b(eijuVarH);
            eijuVarH.k(auvh.b(), eoqg.a);
            eiju eijuVarE = eijx.e(null);
            eieuVarK.close();
            return eijuVarE;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final void i(MessageReceipt messageReceipt, int i) {
        String strF = messageReceipt.f();
        atys atysVar = this.b;
        evvp evvpVar = atysVar.b().n;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        long epochMilli = evwz.d(evvpVar).toEpochMilli();
        aubq aubqVar = atysVar.b().d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        String str = aubqVar.d;
        aubp aubpVar = aubp.GROUP;
        aubq aubqVar2 = atysVar.b().f;
        if (aubqVar2 == null) {
            aubqVar2 = aubq.a;
        }
        aubp aubpVarB = aubp.b(aubqVar2.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        ChatSessionMessageEvent chatSessionMessageEvent = new ChatSessionMessageEvent(0L, strF, epochMilli, i, str, aubpVar.equals(aubpVarB));
        ciwi ciwiVar = (ciwi) this.r.b();
        cbqz cbqzVar = cbqz.a;
        basd basdVarA = basd.a(atysVar.b().j);
        elpg elpgVar = atysVar.b().o;
        if (elpgVar == null) {
            elpgVar = elpg.b;
        }
        ciwiVar.a(chatSessionMessageEvent, cbqzVar, basdVarA, elpgVar).k(auvh.c(new Consumer() { // from class: atzj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                eksl ekslVar = (eksl) atzs.a.h();
                ekrz ekrzVar = cqnc.f;
                atzs atzsVar = this.a;
                atys atysVar2 = atzsVar.b;
                ekslVar.X(ekrzVar, basd.a(atysVar2.b().j));
                ekslVar.X(cqnc.s, barn.b(atysVar2.b().k));
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "processDeliveryOrDisplayReceipt", 471, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for Message Receipt from Persistent Work Queue.");
                atzsVar.c.a(atav.SUCCESS);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), this.l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r3v6, types: [chxn] */
    public final chxn a() {
        ?? Equals;
        Bundle bundle = new Bundle();
        atys atysVar = this.b;
        elpg elpgVar = atysVar.b().o;
        if (elpgVar == null) {
            elpgVar = elpg.b;
        }
        bundle.putByteArray("chat.extra.logData", elpgVar.toByteArray());
        bundle.putAll(this.o);
        eyga eygaVar = atysVar.b().l;
        if (eygaVar == null) {
            eygaVar = eyga.a;
        }
        eyge eygeVar = eyge.a;
        evub evubVar = eygaVar.b;
        evub evubVar2 = (evubVar.containsKey("http://www.gsma.com/rcs/") ? (eyge) evubVar.get("http://www.gsma.com/rcs/") : eygeVar).b;
        String str = evubVar2.containsKey("advised-action") ? (String) evubVar2.get("advised-action") : "";
        if (str.equals("warn")) {
            Equals = 1;
        } else if (str.equals("hide")) {
            Equals = 2;
        } else {
            eyga eygaVar2 = atysVar.b().l;
            if (eygaVar2 == null) {
                eygaVar2 = eyga.a;
            }
            evub evubVar3 = eygaVar2.b;
            if (evubVar3.containsKey("http://id.messages.google.com")) {
                eygeVar = (eyge) evubVar3.get("http://id.messages.google.com");
            }
            evub evubVar4 = eygeVar.b;
            Equals = "warn".equals(evubVar4.containsKey("warn-level") ? (String) evubVar4.get("warn-level") : "");
        }
        ?? F = chxo.F();
        chug chugVar = (chug) F;
        chugVar.a = basd.a(atysVar.b().j);
        aubq aubqVar = atysVar.b().d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        F.l(aubqVar.d);
        aubq aubqVar2 = atysVar.b().d;
        if (aubqVar2 == null) {
            aubqVar2 = aubq.a;
        }
        F.k(aubqVar2);
        evvp evvpVar = atysVar.b().n;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        F.o(evxc.a(evvpVar));
        F.j(this.n.f().toEpochMilli());
        atal atalVar = this.m;
        aubx aubxVar = atysVar.e().c;
        if (aubxVar == null) {
            aubxVar = aubx.a;
        }
        chugVar.h = ((ContentType) atalVar.fM(aubxVar)).toString();
        F.i();
        aubp aubpVar = aubp.GROUP;
        aubq aubqVar3 = atysVar.b().f;
        if (aubqVar3 == null) {
            aubqVar3 = aubq.a;
        }
        aubp aubpVarB = aubp.b(aubqVar3.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        F.e(aubpVar.equals(aubpVarB));
        F.p(Equals);
        aubp aubpVar2 = aubp.BOT;
        aubq aubqVar4 = atysVar.b().d;
        if (aubqVar4 == null) {
            aubqVar4 = aubq.a;
        }
        aubp aubpVarB2 = aubp.b(aubqVar4.c);
        if (aubpVarB2 == null) {
            aubpVarB2 = aubp.UNKNOWN_TYPE;
        }
        F.f(aubpVar2.equals(aubpVarB2));
        eyga eygaVar3 = atysVar.b().l;
        if (eygaVar3 == null) {
            eygaVar3 = eyga.a;
        }
        chugVar.i = eygaVar3;
        aubq aubqVar5 = atysVar.b().h;
        if (aubqVar5 == null) {
            aubqVar5 = aubq.a;
        }
        F.m(aubqVar5);
        F.b(bundle);
        F.q();
        awky awkyVar = atysVar.b().e;
        if (awkyVar == null) {
            awkyVar = awky.a;
        }
        F.n(awjj.a(awkyVar));
        if (((arph) this.v.b()).a()) {
            axfx axfxVar = atysVar.b().i;
            if (axfxVar == null) {
                axfxVar = axfx.a;
            }
            chugVar.c = awzn.a(axfxVar);
        }
        aubq aubqVar6 = atysVar.b().f;
        if (aubqVar6 == null) {
            aubqVar6 = aubq.a;
        }
        aubp aubpVarB3 = aubp.b(aubqVar6.c);
        if (aubpVarB3 == null) {
            aubpVarB3 = aubp.UNKNOWN_TYPE;
        }
        if (aubpVarB3.equals(aubpVar)) {
            chugVar.f = atysVar.b().k;
            aubq aubqVar7 = atysVar.b().f;
            if (aubqVar7 == null) {
                aubqVar7 = aubq.a;
            }
            chugVar.g = aubqVar7.d;
            awso awsoVar = atysVar.b().g;
            if (awsoVar == null) {
                awsoVar = awso.a;
            }
            chugVar.e = awou.a(awsoVar);
        }
        evsz evszVar = new evsz(atysVar.b().q, aufh.a);
        F.c(evszVar.contains(aufg.POSITIVE_DELIVERY));
        F.d(evszVar.contains(aufg.DISPLAY));
        F.g(evszVar.contains(aufg.NEGATIVE_DELIVERY));
        if (((arns) this.w.b()).a() && (atysVar.b().c & 16384) != 0) {
            basd basdVarA = basd.a(atysVar.b().r);
            if (basdVarA.k()) {
                chugVar.b = basdVarA;
            }
        }
        return F;
    }

    @Override // defpackage.efkl
    public final void b(final BasicTextMessage basicTextMessage) {
        eiju eijuVarH = h();
        eooz eoozVar = new eooz() { // from class: atyu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                atzs atzsVar = this.a;
                civx civxVar = (civx) atzsVar.h.b();
                chxn chxnVarA = atzsVar.a();
                ((chug) chxnVarA).d = basicTextMessage.a();
                return civxVar.b(chxnVarA.r());
            }
        };
        eosc eoscVar = this.l;
        eijuVarH.i(eoozVar, eoscVar).h(new ejvr() { // from class: atyv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksl ekslVar = (eksl) atzs.a.h();
                ekrz ekrzVar = cqnc.f;
                atzs atzsVar = this.a;
                atys atysVar = atzsVar.b;
                ekslVar.X(ekrzVar, basd.a(atysVar.b().j));
                ekslVar.X(cqnc.s, barn.b(atysVar.b().k));
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 262, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for BasicTextMessage from Persistent Work Queue.");
                atzr atzrVar = atzsVar.c;
                atav atavVar = atav.SUCCESS;
                atzrVar.a(atavVar);
                return atavVar;
            }
        }, eoscVar).e(atyb.class, new ejvr() { // from class: atyw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                atzr atzrVar = this.a.c;
                atav atavVar = atav.FAIL_RETRY;
                atzrVar.a(atavVar);
                return atavVar;
            }
        }, eoscVar).e(cgsu.class, new ejvr() { // from class: atyx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((eksl) ((eksl) ((eksl) atzs.a.j()).g((cgsu) obj)).h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 278, "UnencryptedIncomingChatMessageVisitor.java")).q("Received GeminiParticipantsLookupException. Retying.");
                atzr atzrVar = this.a.c;
                atav atavVar = atav.FAIL_RETRY;
                atzrVar.a(atavVar);
                return atavVar;
            }
        }, eoscVar).k(auvh.b(), eoqg.a);
    }

    @Override // defpackage.efkl
    public final void c(final ChatMessage chatMessage) {
        boolean zA;
        if (efne.f.g(chatMessage.a())) {
            eiju eijuVarH = h();
            eooz eoozVar = new eooz() { // from class: atyt
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    atzs atzsVar = this.a;
                    civx civxVar = (civx) atzsVar.h.b();
                    chxn chxnVarA = atzsVar.a();
                    ((chug) chxnVarA).d = chatMessage.b().E();
                    return civxVar.b(chxnVarA.r());
                }
            };
            eosc eoscVar = this.l;
            eijuVarH.i(eoozVar, eoscVar).h(new ejvr() { // from class: atze
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    eksl ekslVar = (eksl) atzs.a.h();
                    ekrz ekrzVar = cqnc.f;
                    atzs atzsVar = this.a;
                    atys atysVar = atzsVar.b;
                    ekslVar.X(ekrzVar, basd.a(atysVar.b().j));
                    ekslVar.X(cqnc.s, barn.b(atysVar.b().k));
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visitIncomingRbmMessage", 592, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for incoming RBM message from Persistent Work Queue.");
                    atzr atzrVar = atzsVar.c;
                    atav atavVar = atav.SUCCESS;
                    atzrVar.a(atavVar);
                    return atavVar;
                }
            }, eoscVar).k(auvh.b(), eoqg.a);
            return;
        }
        if (efne.g.g(chatMessage.a())) {
            final aspa aspaVar = (aspa) this.k.b();
            final atys atysVar = this.b;
            eiju eijuVarI = eijx.g(new Callable() { // from class: asox
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String strF = ((auau) aspaVar.e.b()).a().f();
                    atys atysVar2 = atysVar;
                    String str = atysVar2.b().j;
                    ArrayList<ConversationSuggestion> arrayList = new ConversationSuggestionsJsonParser().parse(chatMessage.b().E());
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ConversationSuggestion conversationSuggestion = arrayList.get(i);
                        conversationSuggestion.setRcsMessageId(strF);
                        conversationSuggestion.setTargetRcsMessageId(str);
                    }
                    if (Objects.isNull(arrayList) || dhic.a(arrayList) || TextUtils.isEmpty(str)) {
                        return Optional.empty();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArrayList(RcsIntents.EXTRA_CONVERSATION_SUGGESTIONS, arrayList);
                    aubq aubqVar = atysVar2.b().d;
                    if (aubqVar == null) {
                        aubqVar = aubq.a;
                    }
                    bundle.putString(RcsIntents.EXTRA_USER_ID, aubqVar.d);
                    basd.h(bundle, RcsIntents.EXTRA_MESSAGE_ID, basd.a(strF));
                    basd.h(bundle, RcsIntents.EXTRA_TARGET_RCS_MESSAGE_ID, basd.a(str));
                    return Optional.of(bundle);
                }
            }, aspaVar.c).i(new eooz() { // from class: asoy
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final atys atysVar2 = atysVar;
                    Optional optional = (Optional) obj;
                    if (optional != null && optional.isPresent()) {
                        aspa aspaVar2 = aspaVar;
                        return ((aybx) aspaVar2.d.b()).a((Bundle) optional.get()).p().h(new ejvr() { // from class: asoz
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                cqbd cqbdVarC = aspa.a.c();
                                atys atysVar3 = atysVar2;
                                cqbdVarC.h(basd.a(atysVar3.b().j));
                                cqbdVarC.g(atysVar3.b().k);
                                cqbdVarC.I("Completed action for incoming RBM suggestions from Persistent Work Queue.");
                                cqbdVarC.r();
                                return atav.SUCCESS;
                            }
                        }, aspaVar2.b);
                    }
                    cqbd cqbdVarE = aspa.a.e();
                    cqbdVarE.h(basd.a(atysVar2.b().j));
                    cqbdVarE.g(atysVar2.b().k);
                    cqbdVarE.I("RBM suggestions could not be processed. Discarding..");
                    cqbdVarE.r();
                    return eijx.e(atav.FAIL_NO_RETRY);
                }
            }, aspaVar.b);
            final atzr atzrVar = this.c;
            eijuVarI.k(auvh.c(new Consumer() { // from class: atzf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    atzrVar.a((atav) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), this.l);
            return;
        }
        if (dfqc.a.g(chatMessage.a())) {
            eiju eijuVarH2 = h();
            eooz eoozVar2 = new eooz() { // from class: atzo
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    atzs atzsVar = this.a;
                    civx civxVar = (civx) atzsVar.h.b();
                    chxn chxnVarA = atzsVar.a();
                    ((chug) chxnVarA).d = chatMessage.b().E();
                    return civxVar.b(chxnVarA.r());
                }
            };
            eosc eoscVar2 = this.l;
            eijuVarH2.i(eoozVar2, eoscVar2).h(new ejvr() { // from class: atzp
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    eksl ekslVar = (eksl) atzs.a.h();
                    ekrz ekrzVar = cqnc.f;
                    atzs atzsVar = this.a;
                    atys atysVar2 = atzsVar.b;
                    ekslVar.X(ekrzVar, basd.a(atysVar2.b().j));
                    ekslVar.X(cqnc.s, barn.b(atysVar2.b().k));
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visitProtoMessage", 623, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for Proto Message from Persistent Work Queue.");
                    atzr atzrVar2 = atzsVar.c;
                    atav atavVar = atav.SUCCESS;
                    atzrVar2.a(atavVar);
                    return atavVar;
                }
            }, eoscVar2).k(auvh.b(), eoqg.a);
            return;
        }
        if (((bvur) this.f.b()).g()) {
            ContentType contentTypeA = chatMessage.a();
            zA = true;
            if (!dfqb.a(contentTypeA) && !dfqb.c(contentTypeA)) {
                zA = false;
            }
        } else {
            zA = dfqb.a(chatMessage.a());
        }
        if (zA) {
            eksl ekslVar = (eksl) a.j();
            ekslVar.X(cqnc.f, basd.a(this.b.b().j));
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visitUnsupportedEncryptedMessage", 637, "UnencryptedIncomingChatMessageVisitor.java")).q("Incoming Etouffee message. Check if the release was compiled with the Etouffee module. Message will be processed as a basic text message.");
            eiju eijuVarH3 = h();
            eooz eoozVar3 = new eooz() { // from class: atzk
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    atzs atzsVar = this.a;
                    if (((bvur) atzsVar.f.b()).g()) {
                        chxn chxnVarA = atzsVar.a();
                        chug chugVar = (chug) chxnVarA;
                        chugVar.h = efne.e.toString();
                        chugVar.d = ((Context) atzsVar.i.b()).getString(((bwfx) atzsVar.g.b()).a());
                        chxnVarA.h(114);
                        return ((civx) atzsVar.h.b()).b(chxnVarA.r());
                    }
                    ChatMessage chatMessage2 = chatMessage;
                    chxn chxnVarA2 = atzsVar.a();
                    chug chugVar2 = (chug) chxnVarA2;
                    chugVar2.h = efne.e.toString();
                    chugVar2.d = chatMessage2.b().E();
                    return ((civx) atzsVar.h.b()).b(chxnVarA2.r());
                }
            };
            eosc eoscVar3 = this.l;
            eijuVarH3.i(eoozVar3, eoscVar3).k(auvh.c(new Consumer() { // from class: atzl
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    eksl ekslVar2 = (eksl) atzs.a.h();
                    ekrz ekrzVar = cqnc.f;
                    atzs atzsVar = this.a;
                    atys atysVar2 = atzsVar.b;
                    ekslVar2.X(ekrzVar, basd.a(atysVar2.b().j));
                    ekslVar2.X(cqnc.s, barn.b(atysVar2.b().k));
                    ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visitUnsupportedEncryptedMessage", 676, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for Unknown Encrypted message from Persistent Work Queue.");
                    atzsVar.c.a(atav.SUCCESS);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), eoscVar3);
            return;
        }
        eksl ekslVar2 = (eksl) a.j();
        ekslVar2.X(cqnc.f, basd.a(this.b.b().j));
        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visitUnknownContentTypeMessage", 690, "UnencryptedIncomingChatMessageVisitor.java")).D("Incoming message with unknown content type. type: %s, subType: %s", chatMessage.a().c(), chatMessage.a().b());
        eiju eijuVarH4 = h();
        eooz eoozVar4 = new eooz() { // from class: atyy
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                atzs atzsVar = this.a;
                civx civxVar = (civx) atzsVar.h.b();
                chxn chxnVarA = atzsVar.a();
                chxnVarA.h(116);
                return civxVar.b(chxnVarA.r());
            }
        };
        eosc eoscVar4 = this.l;
        eijuVarH4.i(eoozVar4, eoscVar4).h(new ejvr() { // from class: atyz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksl ekslVar3 = (eksl) atzs.a.h();
                ekrz ekrzVar = cqnc.f;
                atzs atzsVar = this.a;
                atys atysVar2 = atzsVar.b;
                ekslVar3.X(ekrzVar, basd.a(atysVar2.b().j));
                ekslVar3.X(cqnc.s, barn.b(atysVar2.b().k));
                ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visitUnknownContentTypeMessage", 716, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for Unknown Content Type message from Persistent Work Queue.");
                atzr atzrVar2 = atzsVar.c;
                atav atavVar = atav.SUCCESS;
                atzrVar2.a(atavVar);
                return atavVar;
            }
        }, eoscVar4).k(auvh.b(), eoqg.a);
    }

    @Override // defpackage.efkl
    public final void d(final FileTransferInformation fileTransferInformation) {
        final cosv cosvVar = (cosv) this.q.b();
        final aufh aufhVarB = this.b.b();
        final basd basdVarA = basd.a(aufhVarB.j);
        aubq aubqVar = aufhVarB.d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        final aubq aubqVar2 = aubqVar;
        aubq aubqVar3 = aufhVarB.f;
        if (aubqVar3 == null) {
            aubqVar3 = aubq.a;
        }
        final aubq aubqVar4 = aubqVar3;
        aubq aubqVar5 = aufhVarB.h;
        if (aubqVar5 == null) {
            aubqVar5 = aubq.a;
        }
        final aubq aubqVar6 = aubqVar5;
        fcsu fcsuVar = cosvVar.N;
        ((cfep) fcsuVar.b()).a(aubqVar2.d, 24);
        ((cfep) fcsuVar.b()).a(aubqVar6.d, 25);
        evvp evvpVar = aufhVarB.n;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        final Instant instantOfEpochSecond = Instant.ofEpochSecond(evvpVar.b, evvpVar.c);
        final Instant instantF = (cosv.j(aubqVar2) && instantOfEpochSecond.isAfter(Instant.MIN)) ? instantOfEpochSecond : cosvVar.u.f();
        final Bundle bundle = this.o;
        Callable callable = new Callable() { // from class: corn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(((cpjp) cosvVar.z.b()).e(aubqVar2.d));
            }
        };
        eosc eoscVar = cosvVar.c;
        eiju eijuVarI = eijx.g(callable, eoscVar).i(new eooz() { // from class: coqr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                basd basdVar;
                aufh aufhVar;
                final Optional optionalEmpty;
                eiju eijuVarH;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                final cosv cosvVar2 = cosvVar;
                final aufh aufhVar2 = aufhVarB;
                final basd basdVar2 = basdVarA;
                final Bundle bundle2 = bundle;
                final aubq aubqVar7 = aubqVar2;
                final aubq aubqVar8 = aubqVar6;
                final aubq aubqVar9 = aubqVar4;
                final Instant instant = instantOfEpochSecond;
                if (zBooleanValue) {
                    if (!new evsz(aufhVar2.q, aufh.a).contains(aufg.POSITIVE_DELIVERY)) {
                        ekrw ekrwVarN = cosv.a.n();
                        ekrwVarN.X(cqnc.f, basdVar2);
                        ekrwVarN.X(cqnc.q, cqcv.b(aubqVar7.d));
                        ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "sendDeliveryReportForBlockedUser", 1075, "IncomingFileTransferProcessor.java")).q("Do not send a delivery report as it is not requested.");
                        return eijx.e(atav.SUCCESS);
                    }
                    eksl ekslVar = (eksl) cosv.a.h();
                    ekslVar.X(cqnc.f, basdVar2);
                    ekslVar.X(cqnc.q, cqcv.b(aubqVar7.d));
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "sendDeliveryReportForBlockedUser", 1082, "IncomingFileTransferProcessor.java")).q("Received a file transfer message from a blocked user. Sending delivery report");
                    if (((aryl) cosvVar2.W.b()).a()) {
                        eijuVarH = cosvVar2.d(aufhVar2).i(new eooz() { // from class: coqv
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                return cosvVar2.i(aufhVar2, basdVar2, bundle2, (axcm) obj2);
                            }
                        }, cosvVar2.d);
                    } else {
                        final asrg asrgVar = cosv.k(aubqVar9) ? new asrg(cosvVar2.l.a.a(aufhVar2.k, aubqVar9.d), ekgb.r(aubqVar7), true) : new asrg(aubqVar7);
                        eijuVarH = eijx.h(new eooy() { // from class: coqw
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                Optional optionalEmpty2;
                                Bundle bundle3 = bundle2;
                                basd basdVar3 = basdVar2;
                                String string = bundle3.getString("chat.extra.customDeliveryReceiptContentType");
                                byte[] byteArray = bundle3.getByteArray("chat.extra.customDeliveryReceipt");
                                if (string != null && byteArray != null) {
                                    optionalEmpty2 = Optional.of(new cmnr(string, byteArray));
                                } else {
                                    if (string != null || byteArray != null) {
                                        eksl ekslVar2 = (eksl) cosv.a.j();
                                        ekslVar2.X(cqnc.f, basdVar3);
                                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getOptionalRcsMessageReceiptConverter", 1203, "IncomingFileTransferProcessor.java")).t("custom report contentType or receipt is null. Content type: %s", string);
                                        throw new IllegalArgumentException("custom contentType and receipt must both be null or not null");
                                    }
                                    optionalEmpty2 = Optional.empty();
                                }
                                Optional optional = optionalEmpty2;
                                cosv cosvVar3 = cosvVar2;
                                aubq aubqVar10 = aubqVar8;
                                asrg asrgVar2 = asrgVar;
                                return cosvVar3.k.b(basdVar3, instant, asrgVar2, optional, aubqVar10, bundle3);
                            }
                        }, cosvVar2.c);
                    }
                    return eijuVarH.i(new eooz() { // from class: coqx
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            chwo chwoVar = (chwo) obj2;
                            ajhd ajhdVar = (ajhd) cosvVar2.e.b();
                            enxu enxuVar = chwoVar.b;
                            enyw enywVar = chwoVar.c;
                            basd basdVar3 = basdVar2;
                            ajhdVar.aa(basdVar3, enxuVar, enywVar);
                            boolean z = chwoVar.a;
                            aubq aubqVar10 = aubqVar7;
                            if (z) {
                                eksl ekslVar2 = (eksl) cosv.a.h();
                                ekslVar2.X(cqnc.f, basdVar3);
                                ekslVar2.X(cqnc.q, cqcv.b(aubqVar10.d));
                                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "sendDeliveryReportForBlockedUser", 1127, "IncomingFileTransferProcessor.java")).q("Completed a file transfer from a blocked user.");
                                return eijx.e(atav.SUCCESS);
                            }
                            eksl ekslVar3 = (eksl) cosv.a.i();
                            ekslVar3.X(cqnc.f, basdVar3);
                            ekslVar3.X(cqnc.q, cqcv.b(aubqVar10.d));
                            ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "sendDeliveryReportForBlockedUser", 1135, "IncomingFileTransferProcessor.java")).q("Failed to send delivery report for incoming file transfer push message from a blocked user. InvocationResultAndDiagnostic is not successful");
                            return eijx.e(atav.FAIL_RETRY);
                        }
                    }, cosvVar2.c);
                }
                final FileTransferInformation fileTransferInformation2 = fileTransferInformation;
                final Instant instant2 = instantF;
                if (cosvVar2.P.a()) {
                    final eiju eijuVarC = cosvVar2.c(aubqVar7);
                    eooz eoozVar = new eooz() { // from class: corp
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            final awjl awjlVarA;
                            aufh aufhVar3 = aufhVar2;
                            final cosv cosvVar3 = cosvVar2;
                            if (cosvVar3.Y.a()) {
                                awjlVarA = ((atvy) cosvVar3.Z.b()).a(aufhVar3);
                            } else if ((aufhVar3.c & 32) != 0) {
                                awnf awnfVar = (awnf) cosvVar3.T.b();
                                awso awsoVar = aufhVar3.g;
                                if (awsoVar == null) {
                                    awsoVar = awso.a;
                                }
                                awjlVarA = awnfVar.a(awou.a(awsoVar));
                            } else {
                                awky awkyVar = aufhVar3.e;
                                if (awkyVar == null) {
                                    awkyVar = awky.a;
                                }
                                awjlVarA = awjj.a(awkyVar);
                            }
                            if ((aufhVar3.c & 32) != 0) {
                                return ((auab) cosvVar3.R.b()).c(awjlVarA);
                            }
                            if (cosvVar3.X.a()) {
                                auab auabVar = (auab) cosvVar3.R.b();
                                axfx axfxVar = aufhVar3.i;
                                if (axfxVar == null) {
                                    axfxVar = axfx.a;
                                }
                                return auabVar.d(awjlVarA, awzn.a(axfxVar), ajsm.b);
                            }
                            awxu awxuVar = (awxu) cosvVar3.Q.b();
                            aubq aubqVar10 = aufhVar3.h;
                            if (aubqVar10 == null) {
                                aubqVar10 = aubq.a;
                            }
                            return awxuVar.i(aubqVar10).i(new eooz() { // from class: corr
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj3) {
                                    return ((auab) cosvVar3.R.b()).d(awjlVarA, ((awxn) obj3).b(), ajsm.b);
                                }
                            }, cosvVar3.c);
                        }
                    };
                    eosc eoscVar2 = cosvVar2.c;
                    return eijuVarC.i(eoozVar, eoscVar2).i(new eooz() { // from class: corq
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            eiju eijuVarH2;
                            final ConversationIdType conversationIdType = (ConversationIdType) obj2;
                            boolean zB = conversationIdType.b();
                            final basd basdVar3 = basdVar2;
                            final aubq aubqVar10 = aubqVar7;
                            if (zB) {
                                eksl ekslVar2 = (eksl) cosv.a.i();
                                ekslVar2.X(cqnc.f, basdVar3);
                                ekslVar2.X(cqnc.q, cqcv.b(aubqVar10.d));
                                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "processFileTransferPushMessageForNonBlockedUserWithDestination", 655, "IncomingFileTransferProcessor.java")).q("Failed to process incoming file transfer push message. Could not retrieve the conversation for this message.");
                                return eijx.e(atav.FAIL_RETRY);
                            }
                            eiju eijuVar = eijuVarC;
                            final aufh aufhVar3 = aufhVar2;
                            final cosv cosvVar3 = cosvVar2;
                            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) eork.q(eijuVar);
                            if (bindData != null) {
                                eksl ekslVar3 = (eksl) cosv.a.h();
                                ekslVar3.X(cqnc.q, cqcv.b(aubqVar10.d));
                                ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "updateRbmSenderParticipantInDb", 1442, "IncomingFileTransferProcessor.java")).q("Existing RBM bot participant found. No need to update.");
                                eijuVarH2 = eijx.e(bindData);
                            } else if (cosv.j(aubqVar10)) {
                                ParticipantsTable.BindData bindDataC = ((bbca) cosvVar3.f.b()).c(aubqVar10.d);
                                bindDataC.getClass();
                                final String strR = bindDataC.R();
                                eiju eijuVarB = cosvVar3.b(aubqVar10);
                                ejvr ejvrVar = new ejvr() { // from class: cosp
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        BusinessInfoData businessInfoData = (BusinessInfoData) obj3;
                                        asof asofVar = (asof) cosvVar3.S.b();
                                        aufh aufhVar4 = aufhVar3;
                                        String str = aubqVar10.d;
                                        eyga eygaVar = aufhVar4.l;
                                        if (eygaVar == null) {
                                            eygaVar = eyga.a;
                                        }
                                        return Boolean.valueOf(asofVar.c(strR, str, businessInfoData, eygaVar));
                                    }
                                };
                                eosc eoscVar3 = cosvVar3.c;
                                eijuVarH2 = eijuVarB.h(ejvrVar, eoscVar3).h(new ejvr() { // from class: cosq
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        ParticipantsTable.BindData bindDataB = ((bbca) cosvVar3.f.b()).b(strR);
                                        bindDataB.getClass();
                                        return bindDataB;
                                    }
                                }, eoscVar3);
                            } else {
                                ParticipantsTable.BindData bindDataD = ((bbca) cosvVar3.f.b()).d(aubqVar10.d);
                                bindDataD.getClass();
                                eijuVarH2 = eijx.e(bindDataD);
                            }
                            final Bundle bundle3 = bundle2;
                            final FileTransferInformation fileTransferInformation3 = fileTransferInformation2;
                            final aubq aubqVar11 = aubqVar9;
                            final Instant instant3 = instant2;
                            final Instant instant4 = instant;
                            final aubq aubqVar12 = aubqVar8;
                            return eijuVarH2.i(new eooz() { // from class: coso
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj3) {
                                    cosv cosvVar4 = cosvVar3;
                                    aubq aubqVar13 = aubqVar11;
                                    basd basdVar4 = basdVar3;
                                    ConversationIdType conversationIdType2 = conversationIdType;
                                    FileTransferInformation fileTransferInformation4 = fileTransferInformation3;
                                    return cosvVar4.g(basdVar4, aubqVar10, aubqVar12, (ParticipantsTable.BindData) obj3, null, conversationIdType2, instant4, instant3, null, aubqVar13, fileTransferInformation4, aufhVar3, bundle3);
                                }
                            }, cosvVar3.c);
                        }
                    }, eoscVar2);
                }
                final eiju eijuVarC2 = cosvVar2.c(aubqVar7);
                final eiju eijuVarB = cosvVar2.b(aubqVar7);
                eyga eygaVar = aufhVar2.l;
                if (eygaVar == null) {
                    eygaVar = eyga.a;
                }
                if (eygaVar == null) {
                    optionalEmpty = Optional.empty();
                    basdVar = basdVar2;
                    aufhVar = aufhVar2;
                } else {
                    basdVar = basdVar2;
                    aufhVar = aufhVar2;
                    ((eksl) ((eksl) cosv.a.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getAgentNameFromCpimHeader", 1396, "IncomingFileTransferProcessor.java")).q("Trying to get Agent Name from custom CPIM header");
                    eyge eygeVar = eyge.a;
                    evub evubVar = eygaVar.b;
                    if (evubVar.containsKey("urn:rcs:google:")) {
                        eygeVar = (eyge) evubVar.get("urn:rcs:google:");
                    }
                    evub evubVar2 = eygeVar.b;
                    String str = evubVar2.containsKey("Agent-Name") ? (String) evubVar2.get("Agent-Name") : "";
                    optionalEmpty = TextUtils.isEmpty(str) ? Optional.empty() : Optional.of(str);
                }
                eijw eijwVarM = eijx.m(eijuVarC2, eijuVarB);
                Callable callable2 = new Callable() { // from class: cosa
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        eksp ekspVar = cosv.a;
                        Object objQ = eork.q(eijuVarC2);
                        aubq aubqVar10 = aubqVar7;
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) objQ;
                        BusinessInfoData businessInfoData = (BusinessInfoData) eork.q(eijuVarB);
                        if (!cosv.l(aubqVar10, bindData)) {
                            return bbbd.b(aubqVar10.d);
                        }
                        if (bindData != null) {
                            eksl ekslVar2 = (eksl) cosv.a.h();
                            ekslVar2.X(cqnc.q, cqcv.b(aubqVar10.d));
                            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getSenderParticipant", 1250, "IncomingFileTransferProcessor.java")).q("Existing RBM bot participant found");
                            return bindData;
                        }
                        if (businessInfoData == null) {
                            Optional optional = optionalEmpty;
                            if (optional.isPresent()) {
                                ((eksl) ((eksl) cosv.a.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getSenderParticipant", 1256, "IncomingFileTransferProcessor.java")).q("Using Agent Name from Custom Header to create participant");
                                return bbbd.a(aubqVar10.d, (String) optional.get(), null);
                            }
                        }
                        if (businessInfoData == null) {
                            eksl ekslVar3 = (eksl) cosv.a.j();
                            ekslVar3.X(cqnc.q, cqcv.b(aubqVar10.d));
                            ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getNewParticipantDataForRbmBot", 1412, "IncomingFileTransferProcessor.java")).q("No business info available for incoming RCS file transfer. Using defaults");
                        }
                        String name = businessInfoData == null ? null : businessInfoData.getName();
                        String color = businessInfoData != null ? businessInfoData.getColor() : null;
                        ParticipantsTable.BindData bindDataA = bbbd.a(aubqVar10.d, name, color);
                        eksl ekslVar4 = (eksl) cosv.a.h();
                        ekslVar4.X(cqnc.q, cqcv.b(aubqVar10.d));
                        ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getNewParticipantDataForRbmBot", 1423, "IncomingFileTransferProcessor.java")).D("No existing bot participant. Creating one: Name: %s. Color: %s", cqcv.b(name), color);
                        return bindDataA;
                    }
                };
                eosc eoscVar3 = cosvVar2.c;
                final eiju eijuVarA = eijwVarM.a(callable2, eoscVar3);
                ListenableFuture[] listenableFutureArr = {eijuVarA, eijuVarC2};
                final basd basdVar3 = basdVar;
                final aufh aufhVar3 = aufhVar;
                return eijx.m(listenableFutureArr).a(new Callable() { // from class: cosb
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) eork.q(eijuVarA);
                        ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) eork.q(eijuVarC2);
                        aufh aufhVar4 = aufhVar3;
                        String str2 = aufhVar4.k;
                        eyga eygaVar2 = aufhVar4.l;
                        if (eygaVar2 == null) {
                            eygaVar2 = eyga.a;
                        }
                        aubq aubqVar10 = aubqVar9;
                        aubp aubpVarB = aubp.b(aubqVar10.c);
                        if (aubpVarB == null) {
                            aubpVarB = aubp.UNKNOWN_TYPE;
                        }
                        aubq aubqVar11 = aubqVar7;
                        cosv cosvVar3 = cosvVar2;
                        boolean zEquals = aubpVarB.equals(aubp.GROUP);
                        cicq cicqVarW = cicr.w();
                        cicqVarW.j(!zEquals);
                        cicqVarW.p(cosv.l(aubqVar11, bindData2));
                        cicqVarW.q(zEquals);
                        cicqVarW.w(emaf.INCOMING_FILE_TRANSFER);
                        cicqVarW.r(ekgb.r(bindData));
                        cicqVarW.k(eygaVar2);
                        if (zEquals) {
                            ejwl.b(!str2.isEmpty(), "RCS group ID missing");
                            ejwl.b(true ^ aubqVar10.d.isEmpty(), "Conference URI is missing");
                            cicqVarW.u(str2);
                            cicqVarW.s(aubqVar10.d);
                        } else {
                            if (cosvVar3.aa.c(bundle2)) {
                                cicqVarW.B(true);
                                cicqVarW.i(ajsm.b);
                            }
                        }
                        basd basdVar4 = basdVar3;
                        cpeb cpebVarC = cosvVar3.m.c(cicqVarW.D());
                        if (cpebVarC == null) {
                            eksl ekslVar2 = (eksl) cosv.a.j();
                            ekslVar2.X(cqnc.f, basdVar4);
                            ekslVar2.X(cqnc.q, cqcv.b(aubqVar11.d));
                            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getConversation", 1359, "IncomingFileTransferProcessor.java")).q("Incoming RCS file transfer but we could not get/create the conversation");
                            cpebVarC = null;
                        } else {
                            eksl ekslVar3 = (eksl) cosv.a.h();
                            ekslVar3.X(cqnc.f, basdVar4);
                            ekslVar3.X(cqnc.q, cqcv.b(aubqVar11.d));
                            ekslVar3.X(cqnc.s, cpebVarC.a());
                            ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getConversation", 1368, "IncomingFileTransferProcessor.java")).q("Conversation found for incoming RCS file transfer");
                        }
                        return Optional.ofNullable(cpebVarC);
                    }
                }, eoscVar3).i(new eooz() { // from class: cosc
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        Optional optional = (Optional) obj2;
                        boolean zIsEmpty = optional.isEmpty();
                        basd basdVar4 = basdVar3;
                        aubq aubqVar10 = aubqVar7;
                        if (zIsEmpty) {
                            eksl ekslVar2 = (eksl) cosv.a.i();
                            ekslVar2.X(cqnc.f, basdVar4);
                            ekslVar2.X(cqnc.q, cqcv.b(aubqVar10.d));
                            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "processFileTransferPushMessageForNonBlockedUser", 557, "IncomingFileTransferProcessor.java")).q("Failed to process incoming file transfer push message. Could not retrieve the conversation for this message.");
                            return eijx.e(atav.FAIL_RETRY);
                        }
                        Bundle bundle3 = bundle2;
                        aufh aufhVar4 = aufhVar3;
                        FileTransferInformation fileTransferInformation3 = fileTransferInformation2;
                        aubq aubqVar11 = aubqVar9;
                        eiju eijuVar = eijuVarB;
                        Instant instant3 = instant2;
                        Instant instant4 = instant;
                        eiju eijuVar2 = eijuVarA;
                        return cosvVar2.g(basdVar4, aubqVar10, aubqVar8, (ParticipantsTable.BindData) eork.q(eijuVar2), (cpeb) optional.get(), null, instant4, instant3, (BusinessInfoData) eork.q(eijuVar), aubqVar11, fileTransferInformation3, aufhVar4, bundle3);
                    }
                }, eoscVar3);
            }
        }, eoscVar);
        ejvr ejvrVar = new ejvr() { // from class: atzg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((eksl) ((eksl) ((eksl) atzs.a.j()).g((IllegalStateException) obj)).h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 341, "UnencryptedIncomingChatMessageVisitor.java")).q("File transfer processing failed.");
                return atav.FAIL_RETRY;
            }
        };
        eosc eoscVar2 = this.l;
        eijuVarI.e(IllegalStateException.class, ejvrVar, eoscVar2).e(cgsu.class, new ejvr() { // from class: atzh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((eksl) ((eksl) ((eksl) atzs.a.j()).g((cgsu) obj)).h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 348, "UnencryptedIncomingChatMessageVisitor.java")).q("Received GeminiParticipantsLookupException. Retying.");
                atzr atzrVar = this.a.c;
                atav atavVar = atav.FAIL_RETRY;
                atzrVar.a(atavVar);
                return atavVar;
            }
        }, eoscVar2).k(auvh.c(new Consumer() { // from class: atzi
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                eksl ekslVar = (eksl) atzs.a.h();
                ekrz ekrzVar = cqnc.e;
                atzs atzsVar = this.a;
                atys atysVar = atzsVar.b;
                ekslVar.X(ekrzVar, atysVar.b().j);
                ekslVar.X(cqnc.s, barn.b(atysVar.b().k));
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 365, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for FileTransferInformation from Persistent Work Queue.");
                atzsVar.c.a((atav) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), eoscVar2);
    }

    @Override // defpackage.efkl
    public final void e(final IsComposingMessage isComposingMessage) {
        ((atwz) this.e.b()).a(isComposingMessage, this.b.b()).k(auvh.c(new Consumer() { // from class: atzq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                eksl ekslVar = (eksl) atzs.a.h();
                ekrz ekrzVar = cqnc.e;
                atzs atzsVar = this.a;
                atys atysVar = atzsVar.b;
                ekslVar.X(ekrzVar, atysVar.b().j);
                ekslVar.X(cqnc.N, atysVar.b().k);
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 430, "UnencryptedIncomingChatMessageVisitor.java")).t("Completed processing IsComposing message with state: %s", isComposingMessage.a());
                atzsVar.c.a(atav.SUCCESS);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), this.l);
    }

    @Override // defpackage.efkl
    public final void f(LocationInformation locationInformation) {
        final com.google.android.ims.rcsservice.locationsharing.LocationInformation locationInformation2 = new com.google.android.ims.rcsservice.locationsharing.LocationInformation();
        locationInformation2.d = locationInformation.a();
        locationInformation2.c = locationInformation.b();
        if (locationInformation.d().isPresent()) {
            locationInformation2.f = ((Instant) locationInformation.d().get()).toEpochMilli();
        }
        locationInformation.g().ifPresent(new Consumer() { // from class: atza
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                locationInformation2.e = ((Double) obj).doubleValue();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        locationInformation.e().ifPresent(new Consumer() { // from class: atzb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                locationInformation2.a = (String) obj;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        civx civxVar = (civx) this.h.b();
        chxn chxnVarA = a();
        ((chug) chxnVarA).j = locationInformation2;
        eiju eijuVarB = civxVar.b(chxnVarA.r());
        ejvr ejvrVar = new ejvr() { // from class: atzc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksl ekslVar = (eksl) atzs.a.h();
                ekrz ekrzVar = cqnc.e;
                atzs atzsVar = this.a;
                atys atysVar = atzsVar.b;
                ekslVar.X(ekrzVar, atysVar.b().j);
                ekslVar.X(cqnc.s, barn.b(atysVar.b().k));
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 312, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for Location Information from Persistent Work Queue.");
                atzr atzrVar = atzsVar.c;
                atav atavVar = atav.SUCCESS;
                atzrVar.a(atavVar);
                return atavVar;
            }
        };
        eosc eoscVar = this.l;
        eijuVarB.h(ejvrVar, eoscVar).e(atyb.class, new ejvr() { // from class: atzd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                atzr atzrVar = this.a.c;
                atav atavVar = atav.FAIL_RETRY;
                atzrVar.a(atavVar);
                return atavVar;
            }
        }, eoscVar).k(auvh.b(), eoqg.a);
    }

    @Override // defpackage.efkl
    public final void g(MessageReceipt messageReceipt) {
        eksp ekspVar = a;
        eksl ekslVar = (eksl) ekspVar.h();
        ekrz ekrzVar = cqnc.e;
        atys atysVar = this.b;
        ekslVar.X(ekrzVar, atysVar.b().j);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 379, "UnencryptedIncomingChatMessageVisitor.java")).D("Received unencrypted RCS report for message %s. Type: %s", messageReceipt.f(), messageReceipt.a().name());
        int iOrdinal = messageReceipt.a().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (!messageReceipt.h()) {
                    i(messageReceipt, 50035);
                    return;
                }
                basd basdVarA = basd.a(messageReceipt.f());
                MessageCoreData messageCoreDataY = ((baxe) this.t.b()).y(basdVarA);
                if (messageCoreDataY == null) {
                    eksl ekslVar2 = (eksl) ekspVar.j();
                    ekslVar2.X(cqnc.f, basdVarA);
                    ekslVar2.X(cqnc.s, barn.b(atysVar.b().k));
                    ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "processFailedDeliveryReceipt", 489, "UnencryptedIncomingChatMessageVisitor.java")).t("Ignoring Message Receipt with type: %s as the RCS message not found", messageReceipt.a().name());
                } else {
                    ajhd ajhdVar = (ajhd) this.u.b();
                    elpg elpgVar = atysVar.b().o;
                    if (elpgVar == null) {
                        elpgVar = elpg.b;
                    }
                    enyw enywVarB = enyw.b(elpgVar.Y);
                    if (enywVarB == null) {
                        enywVarB = enyw.UNKNOWN_RCS_TYPE;
                    }
                    ajhdVar.t(basdVarA, messageCoreDataY, 3, enywVarB);
                    ajqy ajqyVarP = ajrb.p();
                    ajqyVarP.c(messageCoreDataY.C());
                    ajqyVarP.h(24);
                    ajqyVarP.g(embo.RECIPIENT_NEGATIVE_DELIVERY);
                    ((ajrc) this.s.b()).c(ajqyVarP.a());
                }
                this.c.a(atav.SUCCESS);
                return;
            }
            if (iOrdinal == 2) {
                i(messageReceipt, 50032);
                return;
            }
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return;
                }
                basd basdVarA2 = basd.a(messageReceipt.f());
                aubp aubpVar = aubp.GROUP;
                aubq aubqVar = atysVar.b().f;
                if (aubqVar == null) {
                    aubqVar = aubq.a;
                }
                aubp aubpVarB = aubp.b(aubqVar.c);
                if (aubpVarB == null) {
                    aubpVarB = aubp.UNKNOWN_TYPE;
                }
                if (aubpVar.equals(aubpVarB)) {
                    eksl ekslVar3 = (eksl) ekspVar.j();
                    ekslVar3.X(cqnc.f, basd.a(atysVar.b().j));
                    ekslVar3.X(cqnc.s, barn.b(atysVar.b().k));
                    ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "processInterworkingReceipt", 526, "UnencryptedIncomingChatMessageVisitor.java")).q("Ignoring Interworking Message Receipt received for group conversation.");
                    this.c.a(atav.FAIL_NO_RETRY);
                    return;
                }
                boolean zEquals = efkk.INTERWORKING.f.equals(messageReceipt.g());
                final String str = true != zEquals ? "Bugle.Rcs.Chat.Message.Interworked.Mms.Fallback.Counts" : "Bugle.Rcs.Chat.Message.Interworked.Sms.Fallback.Counts";
                int i = true != zEquals ? 5 : 4;
                axnv axnvVar = (axnv) this.p.b();
                elpg elpgVar2 = atysVar.b().o;
                if (elpgVar2 == null) {
                    elpgVar2 = elpg.b;
                }
                enyw enywVarB2 = enyw.b(elpgVar2.Y);
                if (enywVarB2 == null) {
                    enywVarB2 = enyw.UNKNOWN_RCS_TYPE;
                }
                axnvVar.a(basdVarA2, i, enywVarB2).p().k(auvh.c(new Consumer() { // from class: atzm
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        atzs atzsVar = this.a;
                        ((ains) atzsVar.d.b()).g(str, 0L);
                        eksl ekslVar4 = (eksl) atzs.a.h();
                        ekrz ekrzVar2 = cqnc.f;
                        atys atysVar2 = atzsVar.b;
                        ekslVar4.X(ekrzVar2, basd.a(atysVar2.b().j));
                        ekslVar4.X(cqnc.s, barn.b(atysVar2.b().k));
                        ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "processInterworkingReceipt", 563, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for Message Receipt from Persistent Work Queue.");
                        atzsVar.c.a(atav.SUCCESS);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }), this.l);
                return;
            }
        }
        eksl ekslVar4 = (eksl) ekspVar.j();
        ekslVar4.X(cqnc.f, basd.a(atysVar.b().j));
        ekslVar4.X(cqnc.s, barn.b(atysVar.b().k));
        ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 410, "UnencryptedIncomingChatMessageVisitor.java")).t("Ignoring unknown Message Receipt with type: %s", messageReceipt.a().name());
        this.c.a(atav.FAIL_NO_RETRY);
    }
}
