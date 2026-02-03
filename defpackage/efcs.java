package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efcs extends effs {
    public Conversation a;
    public efiw b;
    public TraceId c;
    public evqs d;

    @Override // defpackage.effs
    public final void a(TraceId traceId) {
        if (traceId == null) {
            throw new NullPointerException("Null traceId");
        }
        this.c = traceId;
    }
}
