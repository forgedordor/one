package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efct extends efft {
    public final Conversation a;
    public final efiw b;
    public final TraceId c;
    public final evqs d;

    public efct(Conversation conversation, efiw efiwVar, TraceId traceId, evqs evqsVar) {
        this.a = conversation;
        this.b = efiwVar;
        this.c = traceId;
        this.d = evqsVar;
    }

    @Override // defpackage.efft
    public final efiw a() {
        return this.b;
    }

    @Override // defpackage.efft, defpackage.efdi
    public final Conversation b() {
        return this.a;
    }

    @Override // defpackage.efft
    public final TraceId c() {
        return this.c;
    }

    @Override // defpackage.efft
    public final evqs d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efft) {
            efft efftVar = (efft) obj;
            if (this.a.equals(efftVar.b()) && this.b.equals(efftVar.a()) && this.c.equals(efftVar.c()) && this.d.equals(efftVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        evqs evqsVar = this.d;
        TraceId traceId = this.c;
        efiw efiwVar = this.b;
        return "SendFileOverMsrpRequest{conversation=" + this.a.toString() + ", message=" + efiwVar.toString() + ", traceId=" + traceId.toString() + ", opaqueData=" + evqsVar.toString() + "}";
    }
}
