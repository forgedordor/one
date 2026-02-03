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

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfss extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;
    private final eyir e;
    private final eyir f;
    private final eyir g;

    public dfss(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3, eyir eyirVar4, eyir eyirVar5, eyir eyirVar6) {
        super(eyikVar2, new eyji(dfss.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
        this.e = eyje.c(eyirVar4);
        this.f = eyje.c(eyirVar5);
        this.g = eyje.c(eyirVar6);
    }

    @Override // defpackage.eyix
    public final /* synthetic */ ListenableFuture b(Object obj) {
        dgyx dgyxVar;
        Optional optionalOf;
        List list = (List) obj;
        dftb dftbVar = (dftb) list.get(0);
        Context context = (Context) list.get(1);
        Optional optional = (Optional) list.get(2);
        dfvk dfvkVar = (dfvk) list.get(3);
        dfuv dfuvVar = (dfuv) list.get(4);
        TraceId traceId = (TraceId) list.get(5);
        dhip dhipVar = dfsq.a;
        if (dftbVar.b().isEmpty() || optional.isPresent() || (dgyxVar = ((dgzn) dftbVar.b().get()).N) == null) {
            optionalOf = Optional.empty();
        } else {
            Conversation conversationD = dfwf.d((dgzn) dftbVar.b().get());
            try {
                Message messageD = dfuvVar.d(conversationD, dgyxVar);
                if (dfvkVar.a(traceId, conversationD, messageD)) {
                    Intent intent = new Intent("com.google.android.apps.messaging.shared.messaging.incoming_chat_message_action");
                    intent.putExtra(RcsIntents.EXTRA_TRACE_ID, traceId.a());
                    dhja.d(dfsq.a.b("produceHandleInitialMessageResult"), "sending an intent for initial incoming message: rcsMessageId{id:%s}", ((AutoValue_Message) messageD).a);
                    dhjm.b(context, intent, "com.google.android.apps.messaging.shared.rcs.messaging.MessagingServiceResponseReceiver", dhjl.RECEIVE_MESSAGE_PRODUCER_MODULE);
                }
                optionalOf = Optional.of(messageD);
            } catch (IOException e) {
                throw new IllegalArgumentException("Error converting InstantMessage to Message", e);
            }
        }
        return eork.i(optionalOf);
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
