package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfxe implements eora {
    public final eksp a = eksp.c(dhin.a);
    private final RemoveUserFromGroupRequest b;
    private final Context c;
    private final fcsu d;
    private final eosc e;
    private final efpp f;
    private final efqv g;

    public dfxe(RemoveUserFromGroupRequest removeUserFromGroupRequest, Context context, efpp efppVar, efqv efqvVar, fcsu fcsuVar, eosc eoscVar) {
        this.b = removeUserFromGroupRequest;
        this.c = context;
        this.f = efppVar;
        this.g = efqvVar;
        this.d = fcsuVar;
        this.e = eoscVar;
    }

    private final void c(GroupOperationResult groupOperationResult) throws PendingIntent.CanceledException {
        RemoveUserFromGroupRequest removeUserFromGroupRequest = this.b;
        if (!removeUserFromGroupRequest.d().isPresent()) {
            d(groupOperationResult);
            return;
        }
        Conversation conversationB = groupOperationResult.b();
        MessagingResult messagingResultA = groupOperationResult.a();
        cjjx cjjxVar = (cjjx) cjjy.a.createBuilder();
        cjgr cjgrVar = (cjgr) this.f.fH().fM(conversationB);
        cjjxVar.copyOnWrite();
        cjjy cjjyVar = (cjjy) cjjxVar.instance;
        cjgrVar.getClass();
        cjjyVar.e = cjgrVar;
        cjjyVar.b |= 8;
        cjjb cjjbVarF = this.g.f(messagingResultA);
        cjjxVar.copyOnWrite();
        cjjy cjjyVar2 = (cjjy) cjjxVar.instance;
        cjjbVarF.getClass();
        cjjyVar2.d = cjjbVarF;
        cjjyVar2.b |= 4;
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        Object obj = removeUserFromGroupRequest.d().get();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).c = (evqs) obj;
        cjjxVar.copyOnWrite();
        cjjy cjjyVar3 = (cjjy) cjjxVar.instance;
        evqe evqeVar = (evqe) evqdVar.build();
        evqeVar.getClass();
        cjjyVar3.c = evqeVar;
        cjjyVar3.b |= 1;
        cjjy cjjyVar4 = (cjjy) cjjxVar.build();
        cjgr cjgrVar2 = cjjyVar4.e;
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
        eork.r(fcrw.a(cjimVar.a.a(cjip.e(), cjimVar.b), cjjyVar4), new dfxd(this, str), this.e);
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
            ((eksl) ((eksl) ((eksl) this.a.j()).g(e)).h("com/google/android/ims/messaging/v2/RemoveUserFromGroupOperationResultProcessor", "sendIntent", 123, "RemoveUserFromGroupOperationResultProcessor.java")).t("[%s] Callback intent canceled", conversationB);
        }
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) throws PendingIntent.CanceledException {
        GroupOperationResult groupOperationResult = (GroupOperationResult) obj;
        groupOperationResult.getClass();
        ((eksl) ((eksl) this.a.h()).h("com/google/android/ims/messaging/v2/RemoveUserFromGroupOperationResultProcessor", "onSuccess", 63, "RemoveUserFromGroupOperationResultProcessor.java")).B("[%s] Group operation completed, result: %s", groupOperationResult.b(), groupOperationResult.a().b());
        c(groupOperationResult);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) throws PendingIntent.CanceledException {
        Conversation conversationB = this.b.b();
        ((eksl) ((eksl) ((eksl) this.a.j()).g(th)).h("com/google/android/ims/messaging/v2/RemoveUserFromGroupOperationResultProcessor", "onFailure", 74, "RemoveUserFromGroupOperationResultProcessor.java")).D("[%s] Group operation failed: %s", conversationB.b(), th.getMessage());
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
