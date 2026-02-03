package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edtp extends edtu {
    private final edtt a;
    private final edtm b;
    private final boolean c;
    private final eygg d;
    private final int e;
    private final int f;
    private final edts g;
    private final ejwi h;

    public edtp(edtt edttVar, edtm edtmVar, boolean z, eygg eyggVar, int i, int i2, edts edtsVar, ejwi ejwiVar) {
        this.a = edttVar;
        this.b = edtmVar;
        this.c = z;
        this.d = eyggVar;
        this.e = i;
        this.f = i2;
        this.g = edtsVar;
        this.h = ejwiVar;
    }

    @Override // defpackage.edtu
    public final int a() {
        return this.e;
    }

    @Override // defpackage.edtu
    public final int b() {
        return this.f;
    }

    @Override // defpackage.edtu
    public final edtm c() {
        return this.b;
    }

    @Override // defpackage.edtu
    public final edts d() {
        return this.g;
    }

    @Override // defpackage.edtu
    public final edtt e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edtu) {
            edtu edtuVar = (edtu) obj;
            if (this.a.equals(edtuVar.e()) && this.b.equals(edtuVar.c()) && this.c == edtuVar.h() && this.d.equals(edtuVar.g()) && this.e == edtuVar.a() && this.f == edtuVar.b() && this.g.equals(edtuVar.d()) && this.h.equals(edtuVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.edtu
    public final ejwi f() {
        return this.h;
    }

    @Override // defpackage.edtu
    public final eygg g() {
        return this.d;
    }

    @Override // defpackage.edtu
    public final boolean h() {
        return this.c;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.h;
        edts edtsVar = this.g;
        eygg eyggVar = this.d;
        edtm edtmVar = this.b;
        return "SuggestionTab{kind=" + this.a.toString() + ", fragmentStartMode=" + edtmVar.toString() + ", enabled=" + this.c + ", fragmentLazy=" + eyggVar.toString() + ", tabNameRes=" + this.e + ", visualElementId=" + this.f + ", iconApplier=" + edtsVar.toString() + ", onTabSelected=" + String.valueOf(ejwiVar) + "}";
    }
}
