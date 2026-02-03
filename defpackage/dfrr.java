package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfrr {
    private final fcsu a;
    private final fcsu b;

    public dfrr(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    final dfto a(Conversation conversation, Message message, MessageClass messageClass, dgzn dgznVar) {
        return new dfto((Context) ((eyig) this.a).a, (dfuw) this.b.b(), conversation, message, messageClass, dgznVar);
    }
}
