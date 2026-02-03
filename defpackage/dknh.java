package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dknh {
    public final dknr a;
    public final dkng b;
    public final int c;

    public dknh(int i, dknr dknrVar, dkng dkngVar) {
        this.c = i;
        this.a = dknrVar;
        this.b = dkngVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dknh)) {
            return false;
        }
        dknh dknhVar = (dknh) obj;
        return this.c == dknhVar.c && fdbq.f(this.a, dknhVar.a) && fdbq.f(this.b, dknhVar.b);
    }

    public final int hashCode() {
        return (((this.c * 31) + this.a.hashCode()) * 31) + 1231;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarOverlayUiData(progressBarPosition=");
        int i = this.c;
        sb.append((Object) (i != 1 ? i != 2 ? "CENTER" : VCardConstants.PROPERTY_END : "START"));
        sb.append(", progressBarUiData=");
        sb.append(this.a);
        sb.append(", flags=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ dknh(int i, dknr dknrVar) {
        this(i, dknrVar, new dkng(null));
    }
}
