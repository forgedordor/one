package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drdv extends drdx {
    private final String a;
    private final ejwi b;

    public drdv(String str, ejwi ejwiVar) {
        this.a = str;
        this.b = ejwiVar;
    }

    @Override // defpackage.drdx
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.drdx
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof drdx) {
            drdx drdxVar = (drdx) obj;
            if (this.a.equals(drdxVar.b()) && this.b.equals(drdxVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ElementId{key=" + this.a + ", timestampMicros=" + String.valueOf(this.b) + "}";
    }
}
