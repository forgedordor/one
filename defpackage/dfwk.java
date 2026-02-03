package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfwk implements eora {
    public final eksp a = eksp.c(dhin.a);
    private final CreateGroupRequest b;
    private final Context c;
    private final fcsu d;
    private final eosc e;
    private final efpp f;
    private final efqv g;

    public dfwk(CreateGroupRequest createGroupRequest, Context context, efpp efppVar, efqv efqvVar, fcsu fcsuVar, eosc eoscVar) {
        this.b = createGroupRequest;
        this.c = context;
        this.f = efppVar;
        this.g = efqvVar;
        this.d = fcsuVar;
        this.e = eoscVar;
    }

    private final void c(GroupOperationResult groupOperationResult) throws PendingIntent.CanceledException {
        CreateGroupRequest createGroupRequest = this.b;
        if (!createGroupRequest.c().isPresent()) {
            d(groupOperationResult);
            return;
        }
        Conversation conversationB = groupOperationResult.b();
        MessagingResult messagingResultA = groupOperationResult.a();
        cjgs cjgsVar = (cjgs) cjgt.a.createBuilder();
        cjgr cjgrVar = (cjgr) this.f.fH().fM(conversationB);
        cjgsVar.copyOnWrite();
        cjgt cjgtVar = (cjgt) cjgsVar.instance;
        cjgrVar.getClass();
        cjgtVar.e = cjgrVar;
        cjgtVar.b |= 8;
        cjjb cjjbVarF = this.g.f(messagingResultA);
        cjgsVar.copyOnWrite();
        cjgt cjgtVar2 = (cjgt) cjgsVar.instance;
        cjjbVarF.getClass();
        cjgtVar2.d = cjjbVarF;
        cjgtVar2.b |= 4;
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        Object obj = createGroupRequest.c().get();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).c = (evqs) obj;
        cjgsVar.copyOnWrite();
        cjgt cjgtVar3 = (cjgt) cjgsVar.instance;
        evqe evqeVar = (evqe) evqdVar.build();
        evqeVar.getClass();
        cjgtVar3.c = evqeVar;
        cjgtVar3.b |= 1;
        cjgt cjgtVar4 = (cjgt) cjgsVar.build();
        cjgr cjgrVar2 = cjgtVar4.e;
        if (cjgrVar2 == null) {
            cjgrVar2 = cjgr.a;
        }
        cjjr cjjrVar = cjgrVar2.e;
        if (cjjrVar == null) {
            cjjrVar = cjjr.a;
        }
        fcsu fcsuVar = this.d;
        String str = cjjrVar.c;
        cjim cjimVar = (cjim) fcsuVar.b();
        eork.r(fcrw.a(cjimVar.a.a(cjip.b(), cjimVar.b), cjgtVar4), new dfwj(this, str), this.e);
    }

    private final void d(GroupOperationResult groupOperationResult) throws PendingIntent.CanceledException {
        Conversation conversationB = groupOperationResult.b();
        Intent intent = new Intent();
        try {
            GroupOperationResult.d(intent, groupOperationResult);
            Context context = this.c;
            dhff.c(context, intent);
            this.b.a().send(context, groupOperationResult.a().b(), intent);
        } catch (PendingIntent.CanceledException e) {
            ((eksl) ((eksl) ((eksl) this.a.j()).g(e)).h("com/google/android/ims/messaging/v2/CreateGroupOperationResultProcessor", "sendIntent", 130, "CreateGroupOperationResultProcessor.java")).t("[%s] Callback intent canceled", conversationB);
        }
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) throws PendingIntent.CanceledException {
        GroupOperationResult groupOperationResult = (GroupOperationResult) obj;
        groupOperationResult.getClass();
        ((eksl) ((eksl) this.a.h()).h("com/google/android/ims/messaging/v2/CreateGroupOperationResultProcessor", "onSuccess", 64, "CreateGroupOperationResultProcessor.java")).B("[%s] Group operation completed, result: %s", groupOperationResult.b(), groupOperationResult.a().b());
        c(groupOperationResult);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) throws PendingIntent.CanceledException {
        eksl ekslVar = (eksl) ((eksl) ((eksl) this.a.j()).g(th)).h("com/google/android/ims/messaging/v2/CreateGroupOperationResultProcessor", "onFailure", 73, "CreateGroupOperationResultProcessor.java");
        CreateGroupRequest createGroupRequest = this.b;
        ekslVar.D("[%s] Group operation failed: %s", createGroupRequest.d(), th.getMessage());
        efhi efhiVar = new efhi();
        efhiVar.c(createGroupRequest.d());
        efhiVar.d(2);
        efid efidVar = new efid();
        efidVar.b("");
        efidVar.c(2);
        efhiVar.b(efidVar.a());
        Conversation conversationA = efhiVar.a();
        effe effeVarD = MessagingResult.d();
        effeVarD.c(16);
        effeVarD.b(7);
        MessagingResult messagingResultE = effeVarD.e();
        efcb efcbVar = new efcb();
        efcbVar.b(conversationA);
        efcbVar.c(messagingResultE);
        c(efcbVar.a());
    }
}
