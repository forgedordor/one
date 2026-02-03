package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adjv {
    public final String a;
    public final CharSequence b;
    public final String c;
    public final String d;
    public final DialogInterface.OnClickListener e;
    public final DialogInterface.OnClickListener f;

    public adjv(String str, CharSequence charSequence, String str2, String str3, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        str.getClass();
        charSequence.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = charSequence;
        this.c = str2;
        this.d = str3;
        this.e = onClickListener;
        this.f = onClickListener2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adjv)) {
            return false;
        }
        adjv adjvVar = (adjv) obj;
        return fdbq.f(this.a, adjvVar.a) && fdbq.f(this.b, adjvVar.b) && fdbq.f(this.c, adjvVar.c) && fdbq.f(this.d, adjvVar.d) && fdbq.f(this.e, adjvVar.e) && fdbq.f(this.f, adjvVar.f);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        DialogInterface.OnClickListener onClickListener = this.e;
        int iHashCode2 = ((iHashCode * 31) + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31;
        DialogInterface.OnClickListener onClickListener2 = this.f;
        return iHashCode2 + (onClickListener2 != null ? onClickListener2.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateFlowDialogInfo(title=" + this.a + ", message=" + ((Object) this.b) + ", positiveButtonText=" + this.c + ", negativeButtonText=" + this.d + ", negativeButtonListener=" + this.e + ", positiveButtonListener=" + this.f + ")";
    }
}
