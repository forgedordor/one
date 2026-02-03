package defpackage;

import android.text.SpannableStringBuilder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwui {
    public final SpannableStringBuilder a;
    public final String b;
    public final Integer c;
    public final boolean d;
    private final String e = "";
    private final String f = null;
    private final String g = null;
    private final String h = null;
    private final String i = null;

    public cwui(SpannableStringBuilder spannableStringBuilder, String str, Integer num, boolean z) {
        this.a = spannableStringBuilder;
        this.b = str;
        this.c = num;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwui)) {
            return false;
        }
        cwui cwuiVar = (cwui) obj;
        if (!fdbq.f(this.a, cwuiVar.a) || !fdbq.f(this.b, cwuiVar.b) || !fdbq.f(this.c, cwuiVar.c) || this.d != cwuiVar.d || !fdbq.f(this.e, cwuiVar.e)) {
            return false;
        }
        String str = cwuiVar.f;
        if (!fdbq.f(null, null)) {
            return false;
        }
        String str2 = cwuiVar.g;
        if (!fdbq.f(null, null)) {
            return false;
        }
        String str3 = cwuiVar.h;
        if (!fdbq.f(null, null)) {
            return false;
        }
        String str4 = cwuiVar.i;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Integer num = this.c;
        return ((((((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.e.hashCode()) * 923521;
    }

    public final String toString() {
        return "ToolstoneUiData(text=" + ((Object) this.a) + ", linkText=" + this.b + ", iconRes=" + this.c + ", hasCloseButton=" + this.d + ", title=" + this.e + ", descriptionText=null, primaryButtonLabel=null, secondaryButtonLabel=null, linkUrl=null)";
    }
}
