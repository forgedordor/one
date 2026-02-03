package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlro {
    public final List a;
    public final Uri b;
    public final long c;
    public final long d;
    public final float e;
    public final boolean f;
    public final int g;
    public final boolean h;

    public dlro(List list, Uri uri, long j, long j2, float f, boolean z, int i, boolean z2) {
        this.a = list;
        this.b = uri;
        this.c = j;
        this.d = j2;
        this.e = f;
        this.f = z;
        this.g = i;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlro)) {
            return false;
        }
        dlro dlroVar = (dlro) obj;
        return fdbq.f(this.a, dlroVar.a) && fdbq.f(this.b, dlroVar.b) && this.c == dlroVar.c && this.d == dlroVar.d && Float.compare(this.e, dlroVar.e) == 0 && this.f == dlroVar.f && this.g == dlroVar.g && this.h == dlroVar.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return ((((((((((((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31) + dlrm.a(this.c)) * 31) + dlrm.a(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + dlrn.a(this.f)) * 31) + this.g) * 31) + dlrn.a(this.h);
    }

    public final String toString() {
        return "VoiceMoodBoxUiData(animatedEmojis=" + this.a + ", backgroundUri=" + this.b + ", gradientStartColorHex=" + this.c + ", gradientEndColorHex=" + this.d + ", gradientAngle=" + this.e + ", onlyShowStaticPrimaryEmoji=" + this.f + ", contentDescriptionResId=" + this.g + ", animateEmoji=" + this.h + ")";
    }
}
