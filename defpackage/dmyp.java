package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmyp extends dmyq {
    public final dmyg a;

    public dmyp(dmyg dmygVar) {
        this.a = dmygVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmyp) && fdbq.f(this.a, ((dmyp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Spanned(gridSizeLookup=" + this.a + ")";
    }
}
