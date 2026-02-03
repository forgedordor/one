package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzlh {
    public final List a;
    public final List b;

    public bzlh(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzlh)) {
            return false;
        }
        bzlh bzlhVar = (bzlh) obj;
        return fdbq.f(this.a, bzlhVar.a) && fdbq.f(this.b, bzlhVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ItemsIgnoredInBatchBackup(messagesIgnored=" + this.a + ", conversationsIgnored=" + this.b + ")";
    }
}
