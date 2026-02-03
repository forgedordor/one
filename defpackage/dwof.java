package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwof extends dwsc {
    private final dwsa a;

    public dwof(dwsa dwsaVar) {
        this.a = dwsaVar;
    }

    @Override // defpackage.dwsc
    public final dwsa a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwsc) {
            return this.a.equals(((dwsc) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RichTextContentModel{content=" + this.a.toString() + "}";
    }
}
