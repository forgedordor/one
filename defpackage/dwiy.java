package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dwiy extends dwrl {
    public final ejwi a;
    public final ejwi b;
    public final ejwi c;
    private final String d;
    private final ejwi e;

    public dwiy(String str, ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3, ejwi ejwiVar4) {
        this.d = str;
        if (ejwiVar == null) {
            throw new NullPointerException("Null predefinedStyle");
        }
        this.a = ejwiVar;
        if (ejwiVar2 == null) {
            throw new NullPointerException("Null lineStyles");
        }
        this.b = ejwiVar2;
        if (ejwiVar3 == null) {
            throw new NullPointerException("Null formattedTextSpans");
        }
        this.c = ejwiVar3;
        if (ejwiVar4 == null) {
            throw new NullPointerException("Null skipLeadingNewline");
        }
        this.e = ejwiVar4;
    }

    @Override // defpackage.dwrl
    public final ejwi a() {
        return this.c;
    }

    @Override // defpackage.dwrl
    public final ejwi b() {
        return this.b;
    }

    @Override // defpackage.dwrl
    public final ejwi c() {
        return this.a;
    }

    @Override // defpackage.dwrl
    public final ejwi d() {
        return this.e;
    }

    @Override // defpackage.dwrl
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwrl) {
            dwrl dwrlVar = (dwrl) obj;
            if (this.d.equals(dwrlVar.e()) && this.a.equals(dwrlVar.c()) && this.b.equals(dwrlVar.b()) && this.c.equals(dwrlVar.a()) && this.e.equals(dwrlVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.e;
        ejwi ejwiVar2 = this.c;
        ejwi ejwiVar3 = this.b;
        return "FormattedLine{rawText=" + this.d + ", predefinedStyle=" + this.a.toString() + ", lineStyles=" + ejwiVar3.toString() + ", formattedTextSpans=" + ejwiVar2.toString() + ", skipLeadingNewline=" + ejwiVar.toString() + "}";
    }
}
