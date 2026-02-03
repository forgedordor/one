package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agcn implements afzx {
    public final Uri a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;

    public agcn(Uri uri, String str, int i, String str2, boolean z) {
        str.getClass();
        this.a = uri;
        this.b = str;
        this.e = i;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agcn)) {
            return false;
        }
        agcn agcnVar = (agcn) obj;
        return fdbq.f(this.a, agcnVar.a) && fdbq.f(this.b, agcnVar.b) && this.e == agcnVar.e && fdbq.f(this.c, agcnVar.c) && this.d == agcnVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return (((((iHashCode * 31) + this.e) * 31) + (str == null ? 0 : str.hashCode())) * 31) + (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.c;
        String strD = cqcy.d(this.a);
        CharSequence charSequenceC = str != null ? cqcy.c(str) : null;
        int i = this.e;
        String str2 = this.b;
        boolean z = this.d;
        StringBuilder sb = new StringBuilder("DirectSendViewer(uri=");
        sb.append(strD);
        sb.append(", contentType=");
        sb.append(str2);
        sb.append(", primaryButtonType=");
        sb.append((Object) (i != 1 ? "ADD" : "SEND"));
        sb.append(", textCaption=");
        sb.append((Object) charSequenceC);
        sb.append(", useEncryptedIcon=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
