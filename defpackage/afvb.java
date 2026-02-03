package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afvb {
    public final String a;
    public final List b;
    public final Pattern c;

    public afvb() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afvb)) {
            return false;
        }
        afvb afvbVar = (afvb) obj;
        return fdbq.f(this.a, afvbVar.a) && fdbq.f(this.b, afvbVar.b) && fdbq.f(this.c, afvbVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Pattern pattern = this.c;
        return (iHashCode * 31) + (pattern == null ? 0 : pattern.hashCode());
    }

    public final String toString() {
        return "BasicSearchResults(query=" + this.a + ", contacts=" + this.b + ", highlightPattern=" + this.c + ")";
    }

    public afvb(String str, List list, Pattern pattern) {
        str.getClass();
        this.a = str;
        this.b = list;
        this.c = pattern;
    }

    public /* synthetic */ afvb(byte[] bArr) {
        this("", fcvo.a, null);
    }
}
