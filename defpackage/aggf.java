package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aggf implements afzv {
    public final ResolvedRecipient a;
    public final aoer b;

    public aggf(ResolvedRecipient resolvedRecipient, aoer aoerVar) {
        this.a = resolvedRecipient;
        this.b = aoerVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aggf)) {
            return false;
        }
        aggf aggfVar = (aggf) obj;
        return fdbq.f(this.a, aggfVar.a) && fdbq.f(this.b, aggfVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return cqcv.b(super.toString()).toString();
    }
}
