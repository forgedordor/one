package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.data.AutoValue_Message;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.TraceId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfst extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;
    private final eyir e;
    private final eyir f;
    private final eyir g;

    public dfst(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3, eyir eyirVar4, eyir eyirVar5, eyir eyirVar6) {
        super(eyikVar2, new eyji(dfst.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
        this.e = eyje.c(eyirVar4);
        this.f = eyje.c(eyirVar5);
        this.g = eyje.c(eyirVar6);
    }

    @Override // defpackage.eyix
    public final /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        dftb dftbVar = (dftb) list.get(0);
        Conversation conversation = (Conversation) list.get(1);
        Context context = (Context) list.get(2);
        dfuv dfuvVar = (dfuv) list.get(3);
        dfvk dfvkVar = (dfvk) list.get(4);
        TraceId traceId = (TraceId) list.get(5);
        dhip dhipVar = dfsq.a;
        try {
            Message messageD = dfuvVar.d(conversation, (dgyx) dftbVar.a().orElseThrow(new Supplier() { // from class: dfsb
                @Override // java.util.function.Supplier
                public final Object get() {
                    dhip dhipVar2 = dfsq.a;
                    return new IllegalArgumentException("No message in request.");
                }
            }));
            if (dfvkVar.a(traceId, conversation, messageD)) {
                Intent intent = new Intent("com.google.android.apps.messaging.shared.messaging.incoming_chat_message_action");
                intent.putExtra(RcsIntents.EXTRA_TRACE_ID, traceId.a());
                dhja.d(dfsq.a.b("produceIncomingMessageResult"), "sending an intent for incoming message: rcsMessageId{id:%s}", ((AutoValue_Message) messageD).a);
                dhjm.b(context, intent, "com.google.android.apps.messaging.shared.rcs.messaging.MessagingServiceResponseReceiver", dhjl.RECEIVE_MESSAGE_PRODUCER_MODULE);
            }
            return eork.i(Optional.of(messageD));
        } catch (IOException e) {
            throw new IllegalArgumentException("Error converting Instant message to Message", e);
        }
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        eyir eyirVar = this.g;
        eyir eyirVar2 = this.f;
        eyir eyirVar3 = this.e;
        eyir eyirVar4 = this.d;
        return eork.f(this.b.d(), this.c.d(), eyirVar4.d(), eyirVar3.d(), eyirVar2.d(), eyirVar.d());
    }
}
