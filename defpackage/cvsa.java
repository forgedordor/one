package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvsa {
    public final ResolvedRecipient a;
    public final boolean b;
    public final boolean c;

    public cvsa(ResolvedRecipient resolvedRecipient, boolean z, boolean z2) {
        this.a = resolvedRecipient;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvsa)) {
            return false;
        }
        cvsa cvsaVar = (cvsa) obj;
        return fdbq.f(this.a, cvsaVar.a) && this.b == cvsaVar.b && this.c == cvsaVar.c;
    }

    public final int hashCode() {
        ResolvedRecipient resolvedRecipient = this.a;
        return ((((resolvedRecipient == null ? 0 : resolvedRecipient.hashCode()) * 31) + cvrz.a(this.b)) * 31) + cvrz.a(this.c);
    }

    public final String toString() {
        return "SpamBanner2LoadedData(targetRecipient=" + this.a + ", isGroup=" + this.b + ", isBannerEligible=" + this.c + ")";
    }
}
