package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edlz extends edmn {
    private final boolean a;
    private final ejwi b;
    private final boolean c;
    private final boolean d;
    private final etvj e;
    private final int f;

    public edlz(boolean z, ejwi ejwiVar, boolean z2, boolean z3, int i, etvj etvjVar) {
        this.a = z;
        this.b = ejwiVar;
        this.c = z2;
        this.d = z3;
        this.f = i;
        this.e = etvjVar;
    }

    @Override // defpackage.edmn
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.edmn
    public final etvj b() {
        return this.e;
    }

    @Override // defpackage.edmn
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.edmn
    public final boolean d() {
        return this.c;
    }

    @Override // defpackage.edmn
    public final boolean e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edmn) {
            edmn edmnVar = (edmn) obj;
            if (this.a == edmnVar.e() && this.b.equals(edmnVar.a()) && this.c == edmnVar.d() && this.d == edmnVar.c() && this.f == edmnVar.f() && this.e.equals(edmnVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.edmn
    public final int f() {
        return this.f;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((((((((i ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237)) * 1000003) ^ this.f) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        int i = this.f;
        etvj etvjVar = this.e;
        return "ProfileState{locked=" + this.a + ", currentPhotoUrl=Optional.absent(), isDefault=" + this.c + ", hasAnyGooglePhotos=" + this.d + ", visibilityMessage=" + Integer.toString(i - 1) + ", infoMessage=" + etvjVar.toString() + "}";
    }
}
