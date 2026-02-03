package defpackage;

import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import io.grpc.StatusException;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfxb extends cjit {
    private static final eksp a = eksp.c(dhin.a);
    private final eosc b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final dfxl k;
    private final dfxi l;
    private final dfwl m;
    private final dfwi n;
    private final dfxf o;
    private final dfxr p;
    private final dfxo q;

    public dfxb(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, dfxl dfxlVar, dfxi dfxiVar, dfwl dfwlVar, dfwi dfwiVar, dfxf dfxfVar, dfxr dfxrVar, dfxo dfxoVar, eosc eoscVar, fcsu fcsuVar8) {
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.j = fcsuVar7;
        this.k = dfxlVar;
        this.l = dfxiVar;
        this.m = dfwlVar;
        this.n = dfwiVar;
        this.o = dfxfVar;
        this.p = dfxrVar;
        this.q = dfxoVar;
        this.b = eoscVar;
        this.c = fcsuVar8;
    }

    private static StatusException j(RuntimeException runtimeException) {
        return Status.e.d(runtimeException).withDescription((String) Optional.ofNullable(runtimeException.getMessage()).orElse("")).asException();
    }

    @Override // defpackage.cjit, defpackage.cjir
    public final void b(cjgh cjghVar, fcsf fcsfVar) {
        cjgr cjgrVar = cjghVar.d;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        cjjr cjjrVar = cjgrVar.e;
        if (cjjrVar == null) {
            cjjrVar = cjjr.a;
        }
        String str = cjjrVar.c;
        ((eksl) ((eksl) a.h()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "addUserToGroup", 227, "MessagingEngineServerImpl.java")).t("[%s] Adding user to group", str);
        try {
            AddUserToGroupRequest addUserToGroupRequestD = ((efon) this.g.b()).apply(cjghVar);
            ListenableFuture listenableFutureB = ((dfru) this.c.b()).b(addUserToGroupRequestD);
            fcsfVar.c(cjgj.a);
            fcsfVar.a();
            eork.r(listenableFutureB, this.n.a(addUserToGroupRequestD), this.b);
        } catch (IllegalArgumentException e) {
            e = e;
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "addUserToGroup", 244, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "addUserToGroup");
            fcsfVar.b(j(e));
        } catch (IllegalStateException e2) {
            e = e2;
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "addUserToGroup", 244, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "addUserToGroup");
            fcsfVar.b(j(e));
        } catch (Throwable th) {
            ((eksl) ((eksl) ((eksl) a.j()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "addUserToGroup", 248, "MessagingEngineServerImpl.java")).D("[%s] %s: Error while processing request", str, "addUserToGroup");
            fcsfVar.b(th);
        }
    }

    @Override // defpackage.cjit, defpackage.cjir
    public final void c(cjgx cjgxVar, fcsf fcsfVar) {
        cjjr cjjrVar = cjgxVar.d;
        if (cjjrVar == null) {
            cjjrVar = cjjr.a;
        }
        String str = cjjrVar.c;
        ((eksl) ((eksl) a.h()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "createGroup", 194, "MessagingEngineServerImpl.java")).B("[%s] Create group, number of participants: %s", str, cjgxVar.f.size());
        try {
            CreateGroupRequest createGroupRequestA = ((efpq) this.f.b()).apply(cjgxVar);
            ListenableFuture listenableFutureC = ((dfru) this.c.b()).c(createGroupRequestA);
            fcsfVar.c(cjgz.a);
            fcsfVar.a();
            eork.r(listenableFutureC, this.m.a(createGroupRequestA), this.b);
        } catch (IllegalArgumentException e) {
            e = e;
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "createGroup", 212, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "createGroup");
            fcsfVar.b(j(e));
        } catch (IllegalStateException e2) {
            e = e2;
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "createGroup", 212, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "createGroup");
            fcsfVar.b(j(e));
        } catch (Throwable th) {
            ((eksl) ((eksl) ((eksl) a.j()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "createGroup", 216, "MessagingEngineServerImpl.java")).D("[%s] %s:  Error while processing request", str, "createGroup");
            fcsfVar.b(th);
        }
    }

    @Override // defpackage.cjit, defpackage.cjir
    public final void d(cjkc cjkcVar, fcsf fcsfVar) {
        cjgr cjgrVar = cjkcVar.d;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        cjjr cjjrVar = cjgrVar.e;
        if (cjjrVar == null) {
            cjjrVar = cjjr.a;
        }
        String str = cjjrVar.c;
        ((eksl) ((eksl) a.h()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "removeUserFromGroup", 260, "MessagingEngineServerImpl.java")).t("[%s] Removing user from group", str);
        try {
            RemoveUserFromGroupRequest removeUserFromGroupRequestA = ((efqx) this.h.b()).apply(cjkcVar);
            ListenableFuture listenableFutureD = ((dfru) this.c.b()).d(removeUserFromGroupRequestA);
            fcsfVar.c(cjke.a);
            fcsfVar.a();
            eork.r(listenableFutureD, this.o.a(removeUserFromGroupRequestA), this.b);
        } catch (IllegalArgumentException e) {
            e = e;
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "removeUserFromGroup", 277, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "removeUserFromGroup");
            fcsfVar.b(j(e));
        } catch (IllegalStateException e2) {
            e = e2;
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "removeUserFromGroup", 277, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "removeUserFromGroup");
            fcsfVar.b(j(e));
        } catch (Throwable th) {
            ((eksl) ((eksl) ((eksl) a.j()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "removeUserFromGroup", 281, "MessagingEngineServerImpl.java")).D("[%s] %s: Error while processing request", str, "removeUserFromGroup");
            fcsfVar.b(th);
        }
    }

    @Override // defpackage.cjit, defpackage.cjir
    public final void e(cjky cjkyVar, fcsf fcsfVar) {
        cjhi cjhiVar = cjkyVar.f;
        if (cjhiVar == null) {
            cjhiVar = cjhi.b;
        }
        cjjw cjjwVar = cjhiVar.d;
        if (cjjwVar == null) {
            cjjwVar = cjjw.a;
        }
        String str = cjjwVar.c;
        cjgr cjgrVar = cjkyVar.e;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        cjjr cjjrVar = cjgrVar.e;
        if (cjjrVar == null) {
            cjjrVar = cjjr.a;
        }
        String str2 = cjjrVar.c;
        ((eksl) ((eksl) a.h()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendFile", 156, "MessagingEngineServerImpl.java")).D("[%s, %s] sendFile", str2, str);
        try {
            efft efftVarA = ((efqy) this.e.b()).apply(cjkyVar);
            dfrv dfrvVarA = ((dfru) this.c.b()).a();
            dfrvVarA.b(efftVarA);
            ListenableFuture listenableFutureD = ((dfqu) dfrvVarA.a()).Q.d();
            fcsfVar.c(cjla.a);
            fcsfVar.a();
            dfxi dfxiVar = this.l;
            eork.r(listenableFutureD, new dfxh(efftVarA, (efpp) dfxiVar.a.b(), (efqv) dfxiVar.b.b(), dfxiVar.c, (eosc) dfxiVar.d.b(), (deza) dfxiVar.e.b(), (dfux) dfxiVar.f.b()), this.b);
        } catch (IllegalArgumentException e) {
            e = e;
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendFile", 173, "MessagingEngineServerImpl.java")).I("[%s, %s] %s: Ignoring invalid data", str2, str, "sendFile");
            fcsfVar.b(j(e));
        } catch (IllegalStateException e2) {
            e = e2;
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendFile", 173, "MessagingEngineServerImpl.java")).I("[%s, %s] %s: Ignoring invalid data", str2, str, "sendFile");
            fcsfVar.b(j(e));
        } catch (Throwable th) {
            ((eksl) ((eksl) ((eksl) a.j()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendFile", 177, "MessagingEngineServerImpl.java")).I("[%s, %s] %s: Error while processing request", str2, str, "sendFile");
            fcsfVar.b(th);
        }
    }

    @Override // defpackage.cjit, defpackage.cjir
    public final void f(cjlg cjlgVar, fcsf fcsfVar) {
        cjib cjibVar = cjlgVar.f;
        if (cjibVar == null) {
            cjibVar = cjib.b;
        }
        cjjw cjjwVar = cjibVar.d;
        if (cjjwVar == null) {
            cjjwVar = cjjw.a;
        }
        String str = cjjwVar.c;
        cjgr cjgrVar = cjlgVar.e;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        cjjr cjjrVar = cjgrVar.e;
        if (cjjrVar == null) {
            cjjrVar = cjjr.a;
        }
        String str2 = cjjrVar.c;
        ((eksl) ((eksl) a.h()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendMessage", 123, "MessagingEngineServerImpl.java")).D("[%s, %s] sendMessage", str2, str);
        try {
            SendMessageRequest sendMessageRequestA = ((efqz) this.d.b()).apply(cjlgVar);
            ListenableFuture listenableFutureE = ((dfru) this.c.b()).e(sendMessageRequestA);
            fcsfVar.c(cjli.a);
            fcsfVar.a();
            eork.r(listenableFutureE, this.k.a(sendMessageRequestA), this.b);
        } catch (IllegalArgumentException e) {
            e = e;
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendMessage", 140, "MessagingEngineServerImpl.java")).I("[%s, %s] %s: Ignoring invalid data", str2, str, "sendMessage");
            fcsfVar.b(j(e));
        } catch (IllegalStateException e2) {
            e = e2;
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendMessage", 140, "MessagingEngineServerImpl.java")).I("[%s, %s] %s: Ignoring invalid data", str2, str, "sendMessage");
            fcsfVar.b(j(e));
        } catch (Throwable th) {
            ((eksl) ((eksl) ((eksl) a.j()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendMessage", 144, "MessagingEngineServerImpl.java")).I("[%s, %s] %s: Error while processing request", str2, str, "sendMessage");
            fcsfVar.b(th);
        }
    }

    @Override // defpackage.cjit, defpackage.cjir
    public final void g(cjls cjlsVar, fcsf fcsfVar) {
        cjgr cjgrVar = cjlsVar.d;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        cjjr cjjrVar = cjgrVar.e;
        if (cjjrVar == null) {
            cjjrVar = cjjr.a;
        }
        String str = cjjrVar.c;
        ((eksl) ((eksl) a.h()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "triggerGroupNotification", 325, "MessagingEngineServerImpl.java")).t("[%s] Triggering group update", str);
        try {
            TriggerGroupNotificationRequest triggerGroupNotificationRequestA = ((efrb) this.j.b()).apply(cjlsVar);
            ListenableFuture listenableFutureF = ((dfru) this.c.b()).f(triggerGroupNotificationRequestA);
            fcsfVar.c(cjlu.a);
            fcsfVar.a();
            eork.r(listenableFutureF, this.q.a(triggerGroupNotificationRequestA), this.b);
        } catch (IllegalArgumentException e) {
            e = e;
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "triggerGroupNotification", 344, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "triggerGroupNotification");
            fcsfVar.b(j(e));
        } catch (IllegalStateException e2) {
            e = e2;
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "triggerGroupNotification", 344, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "triggerGroupNotification");
            fcsfVar.b(j(e));
        } catch (Throwable th) {
            ((eksl) ((eksl) ((eksl) a.j()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "triggerGroupNotification", 348, "MessagingEngineServerImpl.java")).D("[%s] %s: Error while processing request", str, "triggerGroupNotification");
            fcsfVar.b(th);
        }
    }

    @Override // defpackage.cjit, defpackage.cjir
    public final void h(cjma cjmaVar, fcsf fcsfVar) {
        cjgr cjgrVar = cjmaVar.d;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        cjjr cjjrVar = cjgrVar.e;
        if (cjjrVar == null) {
            cjjrVar = cjjr.a;
        }
        String str = cjjrVar.c;
        ((eksl) ((eksl) a.h()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "updateGroup", 292, "MessagingEngineServerImpl.java")).t("[%s] Updating group", str);
        try {
            UpdateGroupRequest updateGroupRequestA = ((efrc) this.i.b()).apply(cjmaVar);
            ListenableFuture listenableFutureG = ((dfru) this.c.b()).g(updateGroupRequestA);
            fcsfVar.c(cjmc.a);
            fcsfVar.a();
            eork.r(listenableFutureG, this.p.a(updateGroupRequestA), this.b);
        } catch (IllegalArgumentException e) {
            e = e;
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "updateGroup", 309, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "updateGroup");
            fcsfVar.b(j(e));
        } catch (IllegalStateException e2) {
            e = e2;
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "updateGroup", 309, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "updateGroup");
            fcsfVar.b(j(e));
        } catch (Throwable th) {
            ((eksl) ((eksl) ((eksl) a.j()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "updateGroup", 313, "MessagingEngineServerImpl.java")).D("[%s] %s: Error while processing request", str, "updateGroup");
            fcsfVar.b(th);
        }
    }

    @Override // defpackage.cjit, defpackage.cjir
    public final void i() {
        throw new IllegalStateException("Not implemented anymore!");
    }
}
