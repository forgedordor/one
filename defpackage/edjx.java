package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edjx extends edhr {
    private final String a;
    private final ekgb b;

    public edjx(String str, ekgb ekgbVar) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        if (ekgbVar == null) {
            throw new NullPointerException("Null collections");
        }
        this.b = ekgbVar;
    }

    @Override // defpackage.edhr
    public final ekgb b() {
        return this.b;
    }

    @Override // defpackage.edhr
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edhr) {
            edhr edhrVar = (edhr) obj;
            if (this.a.equals(edhrVar.c()) && ekjz.h(this.b, edhrVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ArtCategory{name=" + this.a + ", collections=" + this.b.toString() + "}";
    }
}
