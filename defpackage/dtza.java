package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtza extends dtzi {
    private final boolean a;
    private final ejwi b;

    public dtza(boolean z, ejwi ejwiVar) {
        this.a = z;
        this.b = ejwiVar;
    }

    @Override // defpackage.dtzi
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.dtzi
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtzi) {
            dtzi dtziVar = (dtzi) obj;
            if (this.a == dtziVar.b() && this.b.equals(dtziVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CheckContentChangeResponse{contentChanged=" + this.a + ", freshETagOptional=" + this.b.toString() + "}";
    }
}
