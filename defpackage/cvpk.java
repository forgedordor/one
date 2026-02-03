package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvpk {
    public final ResolvedRecipient a;
    public final boolean b;
    private final boolean c;

    public cvpk(ResolvedRecipient resolvedRecipient, boolean z, boolean z2) {
        this.a = resolvedRecipient;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvpk)) {
            return false;
        }
        cvpk cvpkVar = (cvpk) obj;
        return fdbq.f(this.a, cvpkVar.a) && this.b == cvpkVar.b && this.c == cvpkVar.c;
    }

    public final int hashCode() {
        ResolvedRecipient resolvedRecipient = this.a;
        return ((((resolvedRecipient == null ? 0 : resolvedRecipient.hashCode()) * 31) + cvpj.a(this.b)) * 31) + cvpj.a(this.c);
    }

    public final String toString() {
        return "AddContactBanner2LoadedData(recipient=" + this.a + ", isBannerEligible=" + this.b + ", isAddContactEligible=" + this.c + ")";
    }
}
