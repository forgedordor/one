package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfxq implements eora {
    public final eksp a = eksp.c(dhin.a);
    private final UpdateGroupRequest b;
    private final Context c;
    private final fcsu d;
    private final eosc e;
    private final efpp f;
    private final efqv g;

    public dfxq(UpdateGroupRequest updateGroupRequest, Context context, efpp efppVar, efqv efqvVar, fcsu fcsuVar, eosc eoscVar) {
        this.b = updateGroupRequest;
        this.c = context;
        this.f = efppVar;
        this.g = efqvVar;
        this.d = fcsuVar;
        this.e = eoscVar;
    }

    private final void c(GroupOperationResult groupOperationResult) throws PendingIntent.CanceledException {
        UpdateGroupRequest updateGroupRequest = this.b;
        if (!updateGroupRequest.c().isPresent()) {
            d(groupOperationResult);
            return;
        }
        Conversation conversationB = groupOperationResult.b();
        MessagingResult messagingResultA = groupOperationResult.a();
        cjlv cjlvVar = (cjlv) cjlw.a.createBuilder();
        cjgr cjgrVar = (cjgr) this.f.fH().fM(conversationB);
        cjlvVar.copyOnWrite();
        cjlw cjlwVar = (cjlw) cjlvVar.instance;
        cjgrVar.getClass();
        cjlwVar.e = cjgrVar;
        cjlwVar.b |= 8;
        cjjb cjjbVarF = this.g.f(messagingResultA);
        cjlvVar.copyOnWrite();
        cjlw cjlwVar2 = (cjlw) cjlvVar.instance;
        cjjbVarF.getClass();
        cjlwVar2.d = cjjbVarF;
        cjlwVar2.b |= 4;
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        Object obj = updateGroupRequest.c().get();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).c = (evqs) obj;
        cjlvVar.copyOnWrite();
        cjlw cjlwVar3 = (cjlw) cjlvVar.instance;
        evqe evqeVar = (evqe) evqdVar.build();
        evqeVar.getClass();
        cjlwVar3.c = evqeVar;
        cjlwVar3.b |= 1;
        cjlw cjlwVar4 = (cjlw) cjlvVar.build();
        cjgr cjgrVar2 = cjlwVar4.e;
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
        eork.r(fcrw.a(cjimVar.a.a(cjip.j(), cjimVar.b), cjlwVar4), new dfxp(this, str), this.e);
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
            ((eksl) ((eksl) ((eksl) this.a.j()).g(e)).h("com/google/android/ims/messaging/v2/UpdateGroupOperationResultProcessor", "sendIntent", 123, "UpdateGroupOperationResultProcessor.java")).t("[%s] Callback intent canceled", conversationB);
        }
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) throws PendingIntent.CanceledException {
        GroupOperationResult groupOperationResult = (GroupOperationResult) obj;
        groupOperationResult.getClass();
        ((eksl) ((eksl) this.a.h()).h("com/google/android/ims/messaging/v2/UpdateGroupOperationResultProcessor", "onSuccess", 64, "UpdateGroupOperationResultProcessor.java")).B("[%s] Group operation completed, result: %d", groupOperationResult.b(), groupOperationResult.a().b());
        c(groupOperationResult);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) throws PendingIntent.CanceledException {
        Conversation conversationB = this.b.b();
        ((eksl) ((eksl) ((eksl) this.a.j()).g(th)).h("com/google/android/ims/messaging/v2/UpdateGroupOperationResultProcessor", "onFailure", 74, "UpdateGroupOperationResultProcessor.java")).D("[%s] Group operation failed: %s", conversationB.b(), th.getMessage());
        effe effeVarD = MessagingResult.d();
        effeVarD.c(16);
        effeVarD.b(7);
        MessagingResult messagingResultE = effeVarD.e();
        efcb efcbVar = new efcb();
        efcbVar.c(messagingResultE);
        efcbVar.b(conversationB);
        c(efcbVar.a());
    }
}
