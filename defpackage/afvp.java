package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afvp {
    public final String a;
    public final List b;
    public final Pattern c;
    public final dzub d;

    public afvp() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afvp)) {
            return false;
        }
        afvp afvpVar = (afvp) obj;
        return fdbq.f(this.a, afvpVar.a) && fdbq.f(this.b, afvpVar.b) && fdbq.f(this.c, afvpVar.c) && fdbq.f(this.d, afvpVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Pattern pattern = this.c;
        int iHashCode2 = ((iHashCode * 31) + (pattern == null ? 0 : pattern.hashCode())) * 31;
        dzub dzubVar = this.d;
        return iHashCode2 + (dzubVar != null ? dzubVar.hashCode() : 0);
    }

    public final String toString() {
        return "PersonalSearchResults(query=" + this.a + ", contacts=" + this.b + ", highlightPattern=" + this.c + ", timer=" + this.d + ")";
    }

    public afvp(String str, List list, Pattern pattern, dzub dzubVar) {
        str.getClass();
        this.a = str;
        this.b = list;
        this.c = pattern;
        this.d = dzubVar;
    }

    public /* synthetic */ afvp(byte[] bArr) {
        this("", fcvo.a, null, null);
    }
}
