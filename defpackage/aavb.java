package defpackage;

import android.text.SpannableStringBuilder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aavb extends aavd {
    public final SpannableStringBuilder a;
    public final aarx b;

    public aavb(SpannableStringBuilder spannableStringBuilder, aarx aarxVar) {
        this.a = spannableStringBuilder;
        this.b = aarxVar;
    }

    @Override // defpackage.aavd
    public final SpannableStringBuilder a() {
        return this.a;
    }

    @Override // defpackage.aavd
    public final aarx b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aavd) {
            aavd aavdVar = (aavd) obj;
            if (this.a.equals(aavdVar.a()) && this.b.equals(aavdVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        aarx aarxVar = this.b;
        return "RedactedEditResult{editedText=" + this.a.toString() + ", editDistance=" + aarxVar.toString() + "}";
    }
}
