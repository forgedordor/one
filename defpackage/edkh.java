package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edkh extends ediz {
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final ekgb e;
    private final ekgb f;
    private final ekgp g;
    private final ejwi h;
    private final ekgb i;

    public edkh(String str, String str2, String str3, long j, ekgb ekgbVar, ekgb ekgbVar2, ekgp ekgpVar, ejwi ejwiVar, ekgb ekgbVar3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = ekgbVar;
        this.f = ekgbVar2;
        this.g = ekgpVar;
        this.h = ejwiVar;
        this.i = ekgbVar3;
    }

    @Override // defpackage.ediz
    public final long a() {
        return this.d;
    }

    @Override // defpackage.ediz
    public final ejwi c() {
        return this.h;
    }

    @Override // defpackage.ediz
    public final ekgb d() {
        return this.i;
    }

    @Override // defpackage.ediz
    public final ekgb e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ediz) {
            ediz edizVar = (ediz) obj;
            if (this.a.equals(edizVar.i()) && this.b.equals(edizVar.h()) && this.c.equals(edizVar.j()) && this.d == edizVar.a() && ekjz.h(this.e, edizVar.f()) && ekjz.h(this.f, edizVar.e()) && ekmi.m(this.g, edizVar.g()) && this.h.equals(edizVar.c()) && ekjz.h(this.i, edizVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ediz
    public final ekgb f() {
        return this.e;
    }

    @Override // defpackage.ediz
    public final ekgp g() {
        return this.g;
    }

    @Override // defpackage.ediz
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (((((((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.ediz
    public final String i() {
        return this.a;
    }

    @Override // defpackage.ediz
    public final String j() {
        return this.c;
    }

    public final String toString() {
        return "ArtPhoto{name=" + this.a + ", accessibilityLabel=" + this.b + ", url=" + this.c + ", id=" + this.d + ", presets=" + this.e.toString() + ", frames=" + this.f.toString() + ", layers=" + ekmi.g(this.g) + ", errorState=" + String.valueOf(this.h) + ", eventLogs=" + this.i.toString() + "}";
    }
}
