package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfwh implements eora {
    public final eksp a = eksp.c(dhin.a);
    private final AddUserToGroupRequest b;
    private final Context c;
    private final fcsu d;
    private final eosc e;
    private final efpp f;
    private final efqv g;

    public dfwh(AddUserToGroupRequest addUserToGroupRequest, Context context, efpp efppVar, efqv efqvVar, fcsu fcsuVar, eosc eoscVar) {
        this.b = addUserToGroupRequest;
        this.c = context;
        this.f = efppVar;
        this.g = efqvVar;
        this.d = fcsuVar;
        this.e = eoscVar;
    }

    private final void c(GroupOperationResult groupOperationResult) throws PendingIntent.CanceledException {
        AddUserToGroupRequest addUserToGroupRequest = this.b;
        if (!addUserToGroupRequest.d().isPresent()) {
            d(groupOperationResult);
            return;
        }
        Conversation conversationB = groupOperationResult.b();
        MessagingResult messagingResultA = groupOperationResult.a();
        cjgc cjgcVar = (cjgc) cjgd.a.createBuilder();
        cjgr cjgrVar = (cjgr) this.f.fH().fM(conversationB);
        cjgcVar.copyOnWrite();
        cjgd cjgdVar = (cjgd) cjgcVar.instance;
        cjgrVar.getClass();
        cjgdVar.e = cjgrVar;
        cjgdVar.b |= 8;
        cjjb cjjbVarF = this.g.f(messagingResultA);
        cjgcVar.copyOnWrite();
        cjgd cjgdVar2 = (cjgd) cjgcVar.instance;
        cjjbVarF.getClass();
        cjgdVar2.d = cjjbVarF;
        cjgdVar2.b |= 4;
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        Object obj = addUserToGroupRequest.d().get();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).c = (evqs) obj;
        cjgcVar.copyOnWrite();
        cjgd cjgdVar3 = (cjgd) cjgcVar.instance;
        evqe evqeVar = (evqe) evqdVar.build();
        evqeVar.getClass();
        cjgdVar3.c = evqeVar;
        cjgdVar3.b |= 1;
        cjgd cjgdVar4 = (cjgd) cjgcVar.build();
        cjgr cjgrVar2 = cjgdVar4.e;
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
        eork.r(fcrw.a(cjimVar.a.a(cjip.a(), cjimVar.b), cjgdVar4), new dfwg(this, str), this.e);
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
            ((eksl) ((eksl) ((eksl) this.a.j()).g(e)).h("com/google/android/ims/messaging/v2/AddUserToGroupOperationResultProcessor", "sendIntent", 135, "AddUserToGroupOperationResultProcessor.java")).t("[%s] Callback intent canceled", conversationB);
        }
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) throws PendingIntent.CanceledException {
        GroupOperationResult groupOperationResult = (GroupOperationResult) obj;
        groupOperationResult.getClass();
        ((eksl) ((eksl) this.a.h()).h("com/google/android/ims/messaging/v2/AddUserToGroupOperationResultProcessor", "onSuccess", 64, "AddUserToGroupOperationResultProcessor.java")).B("[%s] Group operation completed, result: %s", groupOperationResult.b(), groupOperationResult.a().b());
        c(groupOperationResult);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) throws PendingIntent.CanceledException {
        AddUserToGroupRequest addUserToGroupRequest = this.b;
        ((eksl) ((eksl) ((eksl) this.a.j()).g(th)).h("com/google/android/ims/messaging/v2/AddUserToGroupOperationResultProcessor", "onFailure", 74, "AddUserToGroupOperationResultProcessor.java")).D("[%s] Group operation failed: %s", addUserToGroupRequest.b().b(), th.getMessage());
        effe effeVarD = MessagingResult.d();
        effeVarD.c(16);
        effeVarD.b(7);
        MessagingResult messagingResultE = effeVarD.e();
        efcb efcbVar = new efcb();
        efcbVar.c(messagingResultE);
        efcbVar.b(addUserToGroupRequest.b());
        c(efcbVar.a());
    }
}
