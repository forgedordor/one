package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvi {
    public final List a;
    public final dnjo b;
    public final cilq c;
    private final CharSequence d;

    public wvi(List list, CharSequence charSequence, dnjo dnjoVar, cilq cilqVar) {
        this.a = list;
        this.d = charSequence;
        this.b = dnjoVar;
        this.c = cilqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvi)) {
            return false;
        }
        wvi wviVar = (wvi) obj;
        return fdbq.f(this.a, wviVar.a) && fdbq.f(this.d, wviVar.d) && fdbq.f(this.b, wviVar.b) && fdbq.f(this.c, wviVar.c);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + this.b.hashCode();
        cilq cilqVar = this.c;
        return (iHashCode * 31) + (cilqVar == null ? 0 : cilqVar.hashCode());
    }

    public final String toString() {
        return "State(mentionSuggestions=" + this.a + ", content=" + ((Object) this.d) + ", textSelection=" + this.b + ", draftMentions=" + this.c + ")";
    }
}
