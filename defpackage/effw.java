package defpackage;

import android.app.PendingIntent;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class effw {
    public abstract SendMessageRequest a();

    public abstract void b(Conversation conversation);

    public abstract void c(PendingIntent pendingIntent);

    public abstract void d(Message message);

    public abstract void e(MessageClass messageClass);

    public abstract void f(efkm efkmVar);

    public abstract void g(evqs evqsVar);

    public abstract void h(TraceId traceId);
}
