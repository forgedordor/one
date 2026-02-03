package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctxe {
    public final Recipient a;
    public final eiju b;

    public ctxe(Recipient recipient, eiju eijuVar) {
        this.a = recipient;
        this.b = eijuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctxe)) {
            return false;
        }
        ctxe ctxeVar = (ctxe) obj;
        return fdbq.f(this.a, ctxeVar.a) && fdbq.f(this.b, ctxeVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CachedRecipient(recipient=" + this.a + ", capabilities=" + this.b + ")";
    }
}
