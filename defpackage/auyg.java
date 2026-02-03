package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auyg extends auyj implements fdpl {
    private final String b;
    private final fdpl c;

    public auyg(String str, fdpl fdplVar) {
        super(str);
        this.b = str;
        this.c = fdplVar;
    }

    @Override // defpackage.fdpl
    public final Object a(fdpm fdpmVar, fcxy fcxyVar) {
        return this.c.a(fdpmVar, fcxyVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auyg)) {
            return false;
        }
        auyg auygVar = (auyg) obj;
        return fdbq.f(this.b, auygVar.b) && fdbq.f(this.c, auygVar.c);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    @Override // defpackage.auyj
    public final String toString() {
        return "NamedFlow(name=" + this.b + ", flow=" + this.c + ")";
    }
}
