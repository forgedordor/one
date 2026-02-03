package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dftz extends eyix {
    private final eyir b;
    private final eyir c;

    public dftz(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2) {
        super(eyikVar2, new eyji(dftz.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        TriggerGroupNotificationRequest triggerGroupNotificationRequest = (TriggerGroupNotificationRequest) list.get(0);
        dfvw dfvwVar = (dfvw) list.get(1);
        if (dfvwVar.d().isPresent()) {
            efcb efcbVar = new efcb();
            efcbVar.b(triggerGroupNotificationRequest.b());
            efcbVar.c(MessagingResult.e);
            return eork.i(efcbVar.a());
        }
        efcb efcbVar2 = new efcb();
        efcbVar2.c(dfwf.b(dfvwVar));
        efcbVar2.b(triggerGroupNotificationRequest.b());
        return eork.i(efcbVar2.a());
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        return eork.f(this.b.d(), this.c.d());
    }
}
