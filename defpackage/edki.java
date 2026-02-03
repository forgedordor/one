package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edki extends edja {
    private final String a;
    private final ekgb b;

    public edki(String str, ekgb ekgbVar) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.a = str;
        if (ekgbVar == null) {
            throw new NullPointerException("Null hueRotations");
        }
        this.b = ekgbVar;
    }

    @Override // defpackage.edja
    public final ekgb b() {
        return this.b;
    }

    @Override // defpackage.edja
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edja) {
            edja edjaVar = (edja) obj;
            if (this.a.equals(edjaVar.c()) && ekjz.h(this.b, edjaVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ArtPreset{url=" + this.a + ", hueRotations=" + this.b.toString() + "}";
    }
}
