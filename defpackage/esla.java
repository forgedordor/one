package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esla extends esle {
    private final String a;
    private final String b;

    public esla(String str, String str2) {
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }

    @Override // defpackage.esle
    public final String a() {
        return this.a;
    }

    @Override // defpackage.esle
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof esle) {
            esle esleVar = (esle) obj;
            if (this.a.equals(esleVar.a()) && this.b.equals(esleVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + "}";
    }
}
