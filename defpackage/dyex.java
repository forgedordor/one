package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyex extends dygr {
    private final ejwi a;
    private final ejwi b;
    private final boolean c;

    public dyex(ejwi ejwiVar, ejwi ejwiVar2, boolean z) {
        this.a = ejwiVar;
        this.b = ejwiVar2;
        this.c = z;
    }

    @Override // defpackage.dygr
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.dygr
    public final ejwi b() {
        return this.a;
    }

    @Override // defpackage.dygr
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dygr) {
            dygr dygrVar = (dygr) obj;
            if (this.a.equals(dygrVar.b()) && this.b.equals(dygrVar.a()) && this.c == dygrVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        ejwi ejwiVar = this.b;
        return "TextualCardTrailingTitle{textViewData=" + String.valueOf(this.a) + ", icon=" + String.valueOf(ejwiVar) + ", hasCaptionStyle=" + this.c + "}";
    }
}
