package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agfu implements afzv {
    public final ResolvedRecipient a;
    public final xvc b;

    public agfu(ResolvedRecipient resolvedRecipient, xvc xvcVar) {
        this.a = resolvedRecipient;
        this.b = xvcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agfu)) {
            return false;
        }
        agfu agfuVar = (agfu) obj;
        return fdbq.f(this.a, agfuVar.a) && fdbq.f(this.b, agfuVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ShowOrAddContact(recipient=" + this.a + ", layoutRect=" + this.b + ")";
    }

    public /* synthetic */ agfu(ResolvedRecipient resolvedRecipient) {
        this(resolvedRecipient, new xvc(0, 0, 0, 0));
    }
}
