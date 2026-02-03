package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.TraceId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfsl extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;
    private final eyir e;
    private final eyir f;
    private final eyir g;
    private final eyir h;
    private final eyir i;

    public dfsl(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3, eyir eyirVar4, eyir eyirVar5, eyir eyirVar6, eyir eyirVar7, eyir eyirVar8) {
        super(eyikVar2, new eyji(dfsl.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
        this.e = eyje.c(eyirVar4);
        this.f = eyje.c(eyirVar5);
        this.g = eyje.c(eyirVar6);
        this.h = eyje.c(eyirVar7);
        this.i = eyje.c(eyirVar8);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        Context context = (Context) list.get(0);
        Conversation conversation = (Conversation) list.get(1);
        eyiq eyiqVar = (eyiq) list.get(2);
        Optional optionalEmpty = (Optional) list.get(3);
        Optional optional = (Optional) list.get(4);
        dfvk dfvkVar = (dfvk) list.get(5);
        eyiq eyiqVar2 = (eyiq) list.get(6);
        TraceId traceId = (TraceId) list.get(7);
        dfsd.a(eyiqVar);
        if (optional.isPresent()) {
            optionalEmpty = Optional.empty();
        } else if (!optionalEmpty.isEmpty()) {
            if (((Boolean) dfsd.b.a()).booleanValue()) {
                dfsd.a(eyiqVar2);
            } else if (dfvkVar.a(traceId, conversation, (Message) optionalEmpty.get())) {
                Intent intent = new Intent("com.google.android.apps.messaging.shared.messaging.incoming_chat_message_action");
                intent.putExtra(RcsIntents.EXTRA_TRACE_ID, traceId.a());
                dhjm.b(context, intent, "com.google.android.apps.messaging.shared.rcs.messaging.MessagingServiceResponseReceiver", dhjl.RECEIVE_MESSAGE_PRODUCER_MODULE2);
            }
        }
        return eork.i(optionalEmpty);
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        eyir eyirVar = this.d;
        eyir eyirVar2 = this.c;
        ListenableFuture listenableFutureD = this.b.d();
        ListenableFuture listenableFutureD2 = eyirVar2.d();
        ListenableFuture listenableFutureA = eyje.a(eyirVar.d());
        eyir eyirVar3 = this.h;
        eyir eyirVar4 = this.g;
        return eork.f(listenableFutureD, listenableFutureD2, listenableFutureA, this.e.d(), this.f.d(), eyirVar4.d(), eyje.a(eyirVar3.d()), this.i.d());
    }
}
