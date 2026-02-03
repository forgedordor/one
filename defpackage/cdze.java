package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdze {
    public final String a;
    public final List b;

    public cdze(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdze)) {
            return false;
        }
        cdze cdzeVar = (cdze) obj;
        return fdbq.f(this.a, cdzeVar.a) && fdbq.f(this.b, cdzeVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MarkdownResult(displayableText=" + this.a + ", annotations=" + this.b + ")";
    }
}
