package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnqs extends dnqu {
    public final dnmj a;
    private final int b;

    public dnqs(dnmj dnmjVar, int i) {
        dnmjVar.getClass();
        this.a = dnmjVar;
        this.b = i;
        dnmjVar.a().a().toString();
    }

    @Override // defpackage.dnqu
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dnqu
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnqs)) {
            return false;
        }
        dnqs dnqsVar = (dnqs) obj;
        return fdbq.f(this.a, dnqsVar.a) && this.b == dnqsVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Emoji(emojiSet=" + this.a + ", categoryId=" + this.b + ")";
    }
}
