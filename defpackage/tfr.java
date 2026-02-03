package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfr {
    public final boolean a;
    public final String b;
    public final String c;
    public final ResolvedRecipient d;

    public tfr(boolean z, String str, String str2, ResolvedRecipient resolvedRecipient) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = resolvedRecipient;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfr)) {
            return false;
        }
        tfr tfrVar = (tfr) obj;
        return this.a == tfrVar.a && fdbq.f(this.b, tfrVar.b) && fdbq.f(this.c, tfrVar.c) && fdbq.f(this.d, tfrVar.d);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = ((true != this.a ? 1237 : 1231) * 31) + (str == null ? 0 : str.hashCode());
        String str2 = this.c;
        int iHashCode2 = ((iHashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31;
        ResolvedRecipient resolvedRecipient = this.d;
        return iHashCode2 + (resolvedRecipient != null ? resolvedRecipient.hashCode() : 0);
    }

    public final String toString() {
        return "SaveBirthdayBannerData(isBannerEligible=" + this.a + ", bannerTitle=" + this.b + ", bannerBodyText=" + this.c + ", recipient=" + this.d + ")";
    }
}
