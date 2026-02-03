package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amrm extends amrn {
    private final ResolvedRecipient a;
    private final Instant b;

    public amrm(ResolvedRecipient resolvedRecipient, Instant instant) {
        this.a = resolvedRecipient;
        this.b = instant;
    }

    @Override // defpackage.ajld
    public final ResolvedRecipient a() {
        return this.a;
    }

    @Override // defpackage.ajld
    public final Instant b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amrn) {
            amrn amrnVar = (amrn) obj;
            if (this.a.equals(amrnVar.a()) && this.b.equals(amrnVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Instant instant = this.b;
        return "BugleActiveComposer{recipient=" + this.a.toString() + ", expiry=" + instant.toString() + "}";
    }
}
