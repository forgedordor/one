package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.rcsservice.ims.ImsEvent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfsz extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;
    private final eyir e;

    public dfsz(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3, eyir eyirVar4) {
        super(eyikVar2, new eyji(dfsz.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
        this.e = eyje.c(eyirVar4);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        boolean zK = false;
        Optional optional = (Optional) list.get(0);
        Conversation conversation = (Conversation) list.get(1);
        dfdd dfddVar = (dfdd) list.get(2);
        Context context = (Context) list.get(3);
        if (!((Boolean) dfsq.c.a()).booleanValue() || conversation.c() == 1) {
            if (!((Boolean) dfsq.b.a()).booleanValue()) {
                zK = dfddVar.k((String) optional.orElse(null));
            } else if (!optional.isEmpty()) {
                dhdq dhdqVar = new dhdq();
                dhdqVar.a = 30015;
                dhdqVar.b = (String) optional.get();
                ImsEvent imsEventA = dhdqVar.a();
                Intent intent = new Intent(RcsIntents.ACTION_NEW_EVENT);
                intent.putExtra(RcsIntents.EXTRA_EVENT, imsEventA);
                dhjm.a(context, intent, dhjl.RECEIVE_MESSAGE_PRODUCER_MODULE);
                zK = true;
            }
        }
        return eork.i(Boolean.valueOf(zK));
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        eyir eyirVar = this.e;
        eyir eyirVar2 = this.d;
        return eork.f(this.b.d(), this.c.d(), eyirVar2.d(), eyirVar.d());
    }
}
