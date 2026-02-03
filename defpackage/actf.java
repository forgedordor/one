package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class actf extends actn {
    private final String a;
    private final int b;
    private final CharSequence c;
    private final CharSequence d;
    private final boolean e;
    private final CharSequence f;
    private final CharSequence g;
    private final actm h;
    private final actm i;
    private final actl j;

    public actf(String str, int i, CharSequence charSequence, CharSequence charSequence2, boolean z, CharSequence charSequence3, CharSequence charSequence4, actm actmVar, actm actmVar2, actl actlVar) {
        this.a = str;
        this.b = i;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = z;
        this.f = charSequence3;
        this.g = charSequence4;
        this.h = actmVar;
        this.i = actmVar2;
        this.j = actlVar;
    }

    @Override // defpackage.actn
    public final int a() {
        return this.b;
    }

    @Override // defpackage.actn
    public final actl b() {
        return this.j;
    }

    @Override // defpackage.actn
    public final actm c() {
        return this.h;
    }

    @Override // defpackage.actn
    public final actm d() {
        return this.i;
    }

    @Override // defpackage.actn
    public final CharSequence e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        CharSequence charSequence;
        actm actmVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof actn) {
            actn actnVar = (actn) obj;
            if (this.a.equals(actnVar.i()) && this.b == actnVar.a()) {
                actnVar.k();
                CharSequence charSequence2 = this.c;
                if (charSequence2 != null ? charSequence2.equals(actnVar.h()) : actnVar.h() == null) {
                    CharSequence charSequence3 = this.d;
                    if (charSequence3 != null ? charSequence3.equals(actnVar.e()) : actnVar.e() == null) {
                        if (this.e == actnVar.j() && this.f.equals(actnVar.f()) && ((charSequence = this.g) != null ? charSequence.equals(actnVar.g()) : actnVar.g() == null) && this.h.equals(actnVar.c()) && ((actmVar = this.i) != null ? actmVar.equals(actnVar.d()) : actnVar.d() == null) && this.j.equals(actnVar.b())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.actn
    public final CharSequence f() {
        return this.f;
    }

    @Override // defpackage.actn
    public final CharSequence g() {
        return this.g;
    }

    @Override // defpackage.actn
    public final CharSequence h() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        CharSequence charSequence = this.c;
        int iHashCode2 = ((((iHashCode * 1000003) ^ this.b) * (-721379959)) ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        CharSequence charSequence2 = this.d;
        int iHashCode3 = (((((iHashCode2 ^ (charSequence2 == null ? 0 : charSequence2.hashCode())) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode()) * 1000003;
        CharSequence charSequence3 = this.g;
        int iHashCode4 = (((iHashCode3 ^ (charSequence3 == null ? 0 : charSequence3.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003;
        actm actmVar = this.i;
        return ((iHashCode4 ^ (actmVar != null ? actmVar.hashCode() : 0)) * 1000003) ^ this.j.hashCode();
    }

    @Override // defpackage.actn
    public final String i() {
        return this.a;
    }

    @Override // defpackage.actn
    public final boolean j() {
        return this.e;
    }

    public final String toString() {
        actl actlVar = this.j;
        actm actmVar = this.i;
        actm actmVar2 = this.h;
        CharSequence charSequence = this.g;
        CharSequence charSequence2 = this.f;
        CharSequence charSequence3 = this.d;
        return "HomeBannerBindData{bannerName=" + this.a + ", iconRes=" + this.b + ", iconUrl=null, title=" + String.valueOf(this.c) + ", body=" + String.valueOf(charSequence3) + ", canIgnore=" + this.e + ", negativeButtonText=" + charSequence2.toString() + ", positiveButtonText=" + String.valueOf(charSequence) + ", negativeButtonOnClickListener=" + actmVar2.toString() + ", positiveButtonOnClickListener=" + String.valueOf(actmVar) + ", logger=" + actlVar.toString() + "}";
    }

    @Override // defpackage.actn
    public final void k() {
    }
}
