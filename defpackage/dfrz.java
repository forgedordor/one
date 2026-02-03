package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.rcs.client.messaging.data.AutoValue_GroupNotification;
import com.google.android.rcs.client.messaging.data.GroupNotification;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfrz extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;
    private final eyir e;

    public dfrz(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3, eyir eyirVar4) {
        super(eyikVar2, new eyji(dfrz.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
        this.e = eyje.c(eyirVar4);
    }

    @Override // defpackage.eyix
    public final /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        dfvb dfvbVar = (dfvb) list.get(0);
        Context context = (Context) list.get(1);
        dfvj dfvjVar = (dfvj) list.get(2);
        cjjf cjjfVar = (cjjf) list.get(3);
        if (((Boolean) dfrx.a.a()).booleanValue()) {
            String strB = ((AutoValue_GroupNotification) dfvbVar.a()).a.b();
            cjkg cjkgVarB = cjkg.b((cjjfVar.c == 3 ? (cjjj) cjjfVar.d : cjjj.a).c);
            if (cjkgVarB == null) {
                cjkgVarB = cjkg.RESPONSE_STATUS_UNKNOWN;
            }
            dhja.k("[%s] Group notification completed, result: %s", strB, cjkgVarB);
        } else {
            GroupNotification groupNotificationA = dfvbVar.a();
            synchronized (dfvjVar.a) {
                Queue queue = dfvjVar.b;
                queue.add(groupNotificationA);
                dhja.c("Group notifications queue: push operation, conversationId:{%s}, queueSize:{%s}.", ((AutoValue_GroupNotification) groupNotificationA).a.b(), Integer.valueOf(queue.size()));
            }
            dhjm.b(context, new Intent("com.google.android.apps.messaging.shared.messaging.incoming_group_notification_action"), "com.google.android.apps.messaging.shared.rcs.messaging.MessagingServiceResponseReceiver", dhjl.RECEIVE_GROUP_NOTIFY_PRODUCER_MODULE);
        }
        return eork.i(dfvbVar.a());
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        eyir eyirVar = this.e;
        eyir eyirVar2 = this.d;
        return eork.f(this.b.d(), this.c.d(), eyirVar2.d(), eyirVar.d());
    }
}
