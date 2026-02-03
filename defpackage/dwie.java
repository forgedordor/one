package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwie extends dwik {
    private final ejwi a;
    private final ejwi b;
    private final ejwi c;

    public dwie(ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3) {
        this.a = ejwiVar;
        this.b = ejwiVar2;
        this.c = ejwiVar3;
    }

    @Override // defpackage.dwik
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.dwik
    public final ejwi b() {
        return this.c;
    }

    @Override // defpackage.dwik
    public final ejwi c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwik) {
            dwik dwikVar = (dwik) obj;
            if (this.a.equals(dwikVar.c()) && this.b.equals(dwikVar.a()) && this.c.equals(dwikVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.c;
        ejwi ejwiVar2 = this.b;
        return "LighterMessageTypeDetail{intendedRenderingType=" + String.valueOf(this.a) + ", actualRenderingType=" + String.valueOf(ejwiVar2) + ", contentType=" + String.valueOf(ejwiVar) + "}";
    }
}
