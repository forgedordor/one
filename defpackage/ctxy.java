package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctxy {
    public final String a;
    public final List b;
    public final Pattern c;

    public ctxy() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctxy)) {
            return false;
        }
        ctxy ctxyVar = (ctxy) obj;
        return fdbq.f(this.a, ctxyVar.a) && fdbq.f(this.b, ctxyVar.b) && fdbq.f(this.c, ctxyVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Pattern pattern = this.c;
        return (iHashCode * 31) + (pattern == null ? 0 : pattern.hashCode());
    }

    public final String toString() {
        return "BasicSearchResults(query=" + this.a + ", contacts=" + this.b + ", highlightPattern=" + this.c + ")";
    }

    public ctxy(String str, List list, Pattern pattern) {
        str.getClass();
        this.a = str;
        this.b = list;
        this.c = pattern;
    }

    public /* synthetic */ ctxy(byte[] bArr) {
        this("", fcvo.a, null);
    }
}
