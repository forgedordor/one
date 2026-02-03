package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pwf {
    public static final String a = "pwf";
    private final pwe b;
    private final pwb c;
    private final psq d;
    private final psg e;

    public pwf(pwe pweVar, pwb pwbVar, psq psqVar, psg psgVar) {
        this.b = pweVar;
        this.c = pwbVar;
        this.d = psqVar;
        this.e = psgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwf)) {
            return false;
        }
        pwf pwfVar = (pwf) obj;
        return fdbq.f(this.b, pwfVar.b) && fdbq.f(this.c, pwfVar.c) && fdbq.f(this.d, pwfVar.d) && fdbq.f(this.e, pwfVar.e);
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "pwf:{splitType=" + this.b + ", layoutDir=" + this.c + ", animationParams=" + this.d + ", dividerAttributes=" + this.e + " }";
    }
}
