package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.SendMessageResponse;
import com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.android.rcs.client.messaging.data.TraceId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjax implements cjaa {
    public final RcsMessagingService a;
    public final cogw b;
    public final cjbf c;
    public final cjae d;
    private final atai e;
    private final asrc f;
    private final cjbu g;
    private final cjaj h;
    private final crru i;
    private final BiFunction j;
    private final eosc k;
    private final cjce l;
    private final eosc m;

    public cjax(atai ataiVar, RcsMessagingService rcsMessagingService, asrc asrcVar, cogw cogwVar, cjbu cjbuVar, cjaj cjajVar, crru crruVar, BiFunction biFunction, eosc eoscVar, cjbf cjbfVar, cjae cjaeVar, cjce cjceVar, eosc eoscVar2) {
        this.e = ataiVar;
        this.a = rcsMessagingService;
        this.f = asrcVar;
        this.b = cogwVar;
        this.g = cjbuVar;
        this.h = cjajVar;
        this.i = crruVar;
        this.j = biFunction;
        this.k = eoscVar;
        this.c = cjbfVar;
        this.d = cjaeVar;
        this.m = eoscVar2;
        this.l = cjceVar;
    }

    private final augy n(aubl aublVar, evqs evqsVar) {
        augy augyVar = (augy) augz.a.createBuilder();
        augyVar.copyOnWrite();
        augz augzVar = (augz) augyVar.instance;
        aublVar.getClass();
        augzVar.c = aublVar;
        augzVar.b |= 1;
        augyVar.copyOnWrite();
        augz augzVar2 = (augz) augyVar.instance;
        evqsVar.getClass();
        augzVar2.b |= 2;
        augzVar2.d = evqsVar;
        evvp evvpVarB = evwz.b(this.b.f());
        augyVar.copyOnWrite();
        augz augzVar3 = (augz) augyVar.instance;
        evvpVarB.getClass();
        augzVar3.e = evvpVarB;
        augzVar3.b |= 4;
        elpg elpgVarA = this.h.a();
        augyVar.copyOnWrite();
        augz augzVar4 = (augz) augyVar.instance;
        elpgVarA.getClass();
        augzVar4.h = elpgVarA;
        augzVar4.b |= 32;
        return augyVar;
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Intent a(Object obj) {
        augw augwVar = (augw) obj;
        Intent intentPutExtra = new Intent("com.google.android.apps.messaging.messaging_service_send_message_response").putExtra("messaging_service_send_message_response_extra", augwVar.l.I());
        auib auibVar = augwVar.n;
        if (auibVar == null) {
            auibVar = auib.a;
        }
        return intentPutExtra.putExtra(RcsIntents.EXTRA_TRACE_ID, auibVar.c);
    }

    @Override // defpackage.cjaa
    public final aubl b(Intent intent) {
        return cjcc.a(MessagingOperationResult.f(intent).a());
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ eiju c(Object obj) {
        return this.f.i((augz) obj);
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ eiju d(Object obj) {
        eiju eijuVarG;
        final SendMessageRequest sendMessageRequest = (SendMessageRequest) obj;
        final basd basdVarA = basd.a(sendMessageRequest.c().h());
        final auib auibVar = (auib) this.l.fH().fM(sendMessageRequest.h());
        if (((Boolean) ((cczi) cjbf.a.get()).e()).booleanValue()) {
            this.c.c(auibVar, basdVarA, 4, 15);
        }
        if (this.a.isConnected()) {
            this.d.c(1);
            eijuVarG = eijx.g(new Callable() { // from class: cjaw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.a.sendMessage(sendMessageRequest);
                }
            }, this.k);
        } else {
            this.d.c(2);
            final Instant instantOfEpochMilli = Instant.ofEpochMilli(this.b.a());
            eijuVarG = this.i.a(this.j, RcsMessagingService.class).f(TimeoutException.class, new eooz() { // from class: cjau
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj2) {
                    this.a.d.b.c("Bugle.MessagingService.SendMessageRequest.Binder.OnDemand.Connect.Timeout.Count");
                    return eijx.d((TimeoutException) obj2);
                }
            }, this.m).h(new ejvr() { // from class: cjav
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    cjax cjaxVar = this.a;
                    cjaxVar.d.b.g("Bugle.MessagingService.SendMessageRequest.Binder.OnDemand.Connect.Latency", Duration.between(instantOfEpochMilli, Instant.ofEpochMilli(cjaxVar.b.a())).toMillis());
                    return ((RcsMessagingService) obj2).sendMessage(sendMessageRequest);
                }
            }, this.k);
        }
        return eijuVarG.h(new ejvr() { // from class: cjat
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                SendMessageResponse sendMessageResponse = (SendMessageResponse) obj2;
                if (((Boolean) ((cczi) cjbf.a.get()).e()).booleanValue()) {
                    basd basdVar = basdVarA;
                    this.a.c.c(auibVar, basdVar, 9, 15);
                }
                return sendMessageResponse;
            }
        }, this.m);
    }

    @Override // defpackage.cjaa
    public final evqs e(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("messaging_service_send_message_response_extra");
        if (byteArrayExtra != null) {
            return evqs.x(byteArrayExtra);
        }
        throw new IllegalArgumentException("Opaque data is missing from intent");
    }

    @Override // defpackage.cjaa
    public final /* synthetic */ evqs f(Object obj) {
        return ((augw) obj).l;
    }

    @Override // defpackage.cjaa
    public final Optional g(Intent intent) {
        Conversation conversationB = MessagingOperationResult.f(intent).b();
        return conversationB.c() == 2 ? Optional.of(conversationB.b()) : Optional.empty();
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Object h(aubl aublVar, evqs evqsVar) {
        return (augz) n(aublVar, evqsVar).build();
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Object i(Object obj, evqs evqsVar) {
        SendMessageResponse sendMessageResponse = (SendMessageResponse) obj;
        augy augyVarN = n(cjcc.a(sendMessageResponse.a()), evqsVar);
        augm augmVarA = cjan.a(sendMessageResponse.a());
        augyVarN.copyOnWrite();
        augz augzVar = (augz) augyVarN.instance;
        augz augzVar2 = augz.a;
        augmVarA.getClass();
        augzVar.g = augmVarA;
        augzVar.b |= 16;
        return (augz) augyVarN.build();
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Object j(aubl aublVar, Intent intent, evqs evqsVar) {
        MessagingOperationResult messagingOperationResultF = MessagingOperationResult.f(intent);
        augy augyVarN = n(aublVar, evqsVar);
        boolean zD = messagingOperationResultF.d();
        augyVarN.copyOnWrite();
        augz augzVar = (augz) augyVarN.instance;
        augz augzVar2 = augz.a;
        augzVar.b |= 8;
        augzVar.f = zD;
        augm augmVarA = cjan.a(messagingOperationResultF.a());
        augyVarN.copyOnWrite();
        augz augzVar3 = (augz) augyVarN.instance;
        augmVarA.getClass();
        augzVar3.g = augmVarA;
        augzVar3.b |= 16;
        return (augz) augyVarN.build();
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Object k(Object obj, PendingIntent pendingIntent) {
        augw augwVar = (augw) obj;
        aubp aubpVar = aubp.GROUP;
        aubq aubqVar = augwVar.d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        int i = true == aubpVar.equals(aubpVarB) ? 2 : 1;
        efhi efhiVar = new efhi();
        aubq aubqVar2 = augwVar.d;
        if (aubqVar2 == null) {
            aubqVar2 = aubq.a;
        }
        efhiVar.b(cjbl.b(aubqVar2));
        efhiVar.c(augwVar.i);
        efhiVar.d(i);
        Conversation conversationA = efhiVar.a();
        efjr efjrVarI = Message.i();
        efjrVarI.f(augwVar.h);
        aubq aubqVar3 = augwVar.c;
        if (aubqVar3 == null) {
            aubqVar3 = aubq.a;
        }
        efjrVarI.i(cjbl.b(aubqVar3));
        atai ataiVar = this.e;
        aubt aubtVar = augwVar.k;
        if (aubtVar == null) {
            aubtVar = aubt.a;
        }
        efjrVarI.k(AutoOneOf_Message_MessageContent.a((ChatMessage) ataiVar.fM(aubtVar)));
        eyga eygaVar = augwVar.j;
        if (eygaVar == null) {
            eygaVar = eyga.a;
        }
        int i2 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        for (Map.Entry entry : DesugarCollections.unmodifiableMap(eygaVar.b).entrySet()) {
            for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((eyge) entry.getValue()).b).entrySet()) {
                efhy efhyVar = new efhy();
                efhyVar.c((String) entry.getKey());
                efhyVar.b((String) entry2.getKey());
                efhyVar.d((String) entry2.getValue());
                ekfwVar.h(efhyVar.a());
            }
        }
        efjrVarI.e(ekfwVar.g());
        aubp aubpVar2 = aubp.UNKNOWN_TYPE;
        aubq aubqVar4 = augwVar.e;
        if (aubqVar4 == null) {
            aubqVar4 = aubq.a;
        }
        aubp aubpVarB2 = aubp.b(aubqVar4.c);
        if (aubpVarB2 == null) {
            aubpVarB2 = aubpVar2;
        }
        if (!aubpVar2.equals(aubpVarB2)) {
            aubq aubqVar5 = augwVar.e;
            if (aubqVar5 == null) {
                aubqVar5 = aubq.a;
            }
            efjrVarI.h(cjbl.b(aubqVar5));
        }
        effw effwVarJ = SendMessageRequest.j();
        effwVarJ.b(conversationA);
        effwVarJ.d(efjrVarI.a());
        cjbu cjbuVar = this.g;
        aufx aufxVar = augwVar.m;
        if (aufxVar == null) {
            aufxVar = aufx.a;
        }
        effwVarJ.e((MessageClass) cjbuVar.fM(aufxVar));
        cjce cjceVar = this.l;
        auib auibVar = augwVar.n;
        if (auibVar == null) {
            auibVar = auib.a;
        }
        effwVarJ.h((TraceId) cjceVar.fM(auibVar));
        effwVarJ.c(pendingIntent);
        if (((Boolean) cizt.b.e()).booleanValue()) {
            effwVarJ.g(augwVar.l);
        }
        return effwVarJ.a();
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ String l(Object obj) {
        return "RcsMessageId: ".concat(String.valueOf(((augw) obj).h));
    }

    @Override // defpackage.cjaa
    public final String m() {
        return "sendMessage";
    }
}
