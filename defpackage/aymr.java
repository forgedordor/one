package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionExecutorImpl;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aymr {
    public final int a;
    public String b;
    public final aymq c;
    public final List d = new ArrayList();
    public aymp e;
    public final cldb f;
    public final boolean g;

    public aymr(String str, int i, aymq aymqVar, cldb cldbVar, boolean z) {
        this.a = i;
        this.c = aymqVar;
        this.f = cldbVar;
        this.g = z;
        this.b = str;
    }

    public static int a(Action action) {
        return action instanceof ThrottledAction ? ((ThrottledAction) action).f() : action.u.hashCode();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [aymp, aynm] */
    public final ListenableFuture b(Action action) {
        this.d.add(action);
        action.y(this);
        cqaz.l(this.e);
        ?? r5 = this.e;
        if (r5 == 0) {
            return eork.h(new RuntimeException("JobData has no ActionListener"));
        }
        ActionExecutorImpl actionExecutorImpl = (ActionExecutorImpl) r5;
        actionExecutorImpl.i();
        actionExecutorImpl.o.incrementAndGet();
        ayml.d(action, 1, 2);
        SettableFuture settableFutureCreate = SettableFuture.create();
        String strC = action.c();
        if (!TextUtils.isEmpty(strC)) {
            actionExecutorImpl.d.c(strC, action.u);
        }
        ayop ayopVar = new ayop(this, action, settableFutureCreate, r5, actionExecutorImpl.f, actionExecutorImpl.j, actionExecutorImpl.k, actionExecutorImpl.l);
        ayopVar.c(actionExecutorImpl.d.a("Bugle.DataModel.ActionBreakdown.ExecutionQueue.Latency", action.y, action.u));
        synchronized (actionExecutorImpl.m) {
            ((ActionExecutorImpl) r5).g.add(ayopVar);
            ((ActionExecutorImpl) r5).h.a(((ActionExecutorImpl) r5).p);
        }
        actionExecutorImpl.d("ACTION_EXECUTE_QUEUED_", action);
        return settableFutureCreate;
    }

    public final boolean c() {
        return this.f != null;
    }
}
