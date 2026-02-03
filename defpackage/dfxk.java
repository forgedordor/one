package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.SendMessageRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfxk implements eora {
    public final eksp a = eksp.c(dhin.a);
    private final SendMessageRequest b;
    private final Context c;
    private final fcsu d;
    private final eosc e;
    private final deza f;
    private final efpp g;
    private final efqv h;
    private final dfux i;
    private final efqt j;

    public dfxk(SendMessageRequest sendMessageRequest, Context context, efpp efppVar, efqv efqvVar, fcsu fcsuVar, eosc eoscVar, deza dezaVar, dfux dfuxVar, efqt efqtVar) {
        this.b = sendMessageRequest;
        this.c = context;
        this.g = efppVar;
        this.h = efqvVar;
        this.d = fcsuVar;
        this.e = eoscVar;
        this.f = dezaVar;
        this.i = dfuxVar;
        this.j = efqtVar;
    }

    private final void c(MessagingOperationResult messagingOperationResult) throws PendingIntent.CanceledException {
        SendMessageRequest sendMessageRequest = this.b;
        if (!sendMessageRequest.i().isPresent()) {
            d(messagingOperationResult);
            return;
        }
        cjlb cjlbVar = (cjlb) cjlc.a.createBuilder();
        cjgr cjgrVar = (cjgr) this.g.fH().fM(sendMessageRequest.b());
        cjlbVar.copyOnWrite();
        cjlc cjlcVar = (cjlc) cjlbVar.instance;
        cjgrVar.getClass();
        cjlcVar.g = cjgrVar;
        cjlcVar.b |= 16;
        cjjb cjjbVarA = sendMessageRequest.g().equals(efkm.MESSAGING_METHOD_SLM) ? this.h.apply(messagingOperationResult.a()) : this.h.f(messagingOperationResult.a());
        cjlbVar.copyOnWrite();
        cjlc cjlcVar2 = (cjlc) cjlbVar.instance;
        cjjbVarA.getClass();
        cjlcVar2.e = cjjbVarA;
        cjlcVar2.b |= 4;
        cjjv cjjvVar = (cjjv) cjjw.a.createBuilder();
        String strH = sendMessageRequest.c().h();
        cjjvVar.copyOnWrite();
        cjjw cjjwVar = (cjjw) cjjvVar.instance;
        cjjwVar.b |= 1;
        cjjwVar.c = strH;
        cjlbVar.copyOnWrite();
        cjlc cjlcVar3 = (cjlc) cjlbVar.instance;
        cjjw cjjwVar2 = (cjjw) cjjvVar.build();
        cjjwVar2.getClass();
        cjlcVar3.f = cjjwVar2;
        cjlcVar3.b |= 8;
        boolean zD = messagingOperationResult.d();
        cjlbVar.copyOnWrite();
        cjlc cjlcVar4 = (cjlc) cjlbVar.instance;
        cjlcVar4.b |= 32;
        cjlcVar4.h = zD;
        cjll cjllVar = (cjll) cjlm.a.createBuilder();
        String strA = sendMessageRequest.h().a();
        cjllVar.copyOnWrite();
        cjlm cjlmVar = (cjlm) cjllVar.instance;
        cjlmVar.b |= 1;
        cjlmVar.c = strA;
        cjlbVar.copyOnWrite();
        cjlc cjlcVar5 = (cjlc) cjlbVar.instance;
        cjlm cjlmVar2 = (cjlm) cjllVar.build();
        cjlmVar2.getClass();
        cjlcVar5.d = cjlmVar2;
        cjlcVar5.b |= 2;
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        Object obj = sendMessageRequest.i().get();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).c = (evqs) obj;
        cjlbVar.copyOnWrite();
        cjlc cjlcVar6 = (cjlc) cjlbVar.instance;
        evqe evqeVar = (evqe) evqdVar.build();
        evqeVar.getClass();
        cjlcVar6.c = evqeVar;
        cjlcVar6.b |= 1;
        cjix cjixVar = (cjix) this.j.fH().fM(sendMessageRequest.g());
        cjlbVar.copyOnWrite();
        cjlc cjlcVar7 = (cjlc) cjlbVar.instance;
        cjlcVar7.i = cjixVar.d;
        cjlcVar7.b |= 64;
        cjlc cjlcVar8 = (cjlc) cjlbVar.build();
        cjim cjimVar = (cjim) this.d.b();
        eork.r(fcrw.a(cjimVar.a.a(cjip.h(), cjimVar.b), cjlcVar8), new dfxj(this, cjlcVar8), this.e);
    }

    private final void d(MessagingOperationResult messagingOperationResult) throws PendingIntent.CanceledException {
        Intent intent = new Intent();
        try {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.containsKey("MESSAGING_OPERATION_RESULT")) {
                throw new IllegalArgumentException("Intent extra already contains MESSAGING_OPERATION_RESULT key");
            }
            Parcel parcelObtain = Parcel.obtain();
            messagingOperationResult.writeToParcel(parcelObtain, 0);
            intent.putExtra("MESSAGING_OPERATION_RESULT", parcelObtain.marshall());
            parcelObtain.recycle();
            Context context = this.c;
            dhff.c(context, intent);
            this.b.a().send(context, messagingOperationResult.a().b(), intent);
        } catch (PendingIntent.CanceledException e) {
            ((eksl) ((eksl) ((eksl) this.a.j()).g(e)).h("com/google/android/ims/messaging/v2/SendMessageOperationResultProcessor", "sendIntent", 151, "SendMessageOperationResultProcessor.java")).t("[%s] Callback intent canceled", messagingOperationResult.c());
        }
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) throws PendingIntent.CanceledException {
        MessagingOperationResult messagingOperationResult = (MessagingOperationResult) obj;
        messagingOperationResult.getClass();
        String strC = messagingOperationResult.c();
        ((eksl) ((eksl) this.a.h()).h("com/google/android/ims/messaging/v2/SendMessageOperationResultProcessor", "onSuccess", 80, "SendMessageOperationResultProcessor.java")).D("[%s] Messaging operation completed, %s", strC, messagingOperationResult.a().e());
        c(messagingOperationResult);
        if (((Boolean) deza.b.a()).booleanValue()) {
            this.f.e((fhaz) this.i.fM(this.b.h()), strC);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) throws PendingIntent.CanceledException {
        eksl ekslVar = (eksl) ((eksl) ((eksl) this.a.j()).g(th)).h("com/google/android/ims/messaging/v2/SendMessageOperationResultProcessor", "onFailure", 93, "SendMessageOperationResultProcessor.java");
        SendMessageRequest sendMessageRequest = this.b;
        ekslVar.D("[%s] Messaging operation failed: %s", sendMessageRequest.c().h(), th.getMessage());
        effe effeVarD = MessagingResult.d();
        effeVarD.c(16);
        effeVarD.b(7);
        MessagingResult messagingResultE = effeVarD.e();
        effc effcVarE = MessagingOperationResult.e();
        effcVarE.b(sendMessageRequest.b());
        effcVarE.d(sendMessageRequest.c().h());
        effcVarE.e(messagingResultE);
        effcVarE.c(false);
        c(effcVarE.a());
        if (((Boolean) deza.b.a()).booleanValue()) {
            this.f.d((fhaz) this.i.fM(sendMessageRequest.h()), sendMessageRequest.c().h());
        }
    }
}
