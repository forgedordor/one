package defpackage;

import android.text.SpannableString;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjzh {
    public final String a;
    public final SpannableString b;
    public final SpannableString c;
    public final boolean d;

    public cjzh(String str, SpannableString spannableString, SpannableString spannableString2, boolean z) {
        str.getClass();
        this.a = str;
        this.b = spannableString;
        this.c = spannableString2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjzh)) {
            return false;
        }
        cjzh cjzhVar = (cjzh) obj;
        return fdbq.f(this.a, cjzhVar.a) && fdbq.f(this.b, cjzhVar.b) && fdbq.f(this.c, cjzhVar.c) && this.d == cjzhVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "WelcomeMessageRequest(simId=" + this.a + ", title=" + ((Object) this.b) + ", message=" + ((Object) this.c) + ", settingsButtonEnabled=" + this.d + ")";
    }
}
