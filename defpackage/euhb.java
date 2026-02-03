package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euhb extends eulf {
    public final boolean a;
    public final euki b;
    public final ekgb c;
    public final eujv d;
    public final eujv e;
    public final eujv f;
    public final eujv g;
    public final eujv h;
    public final eujv i;
    public final eujv j;
    public final eujv k;
    private final euja l;
    private final eule m;

    public euhb(eujv eujvVar, eujv eujvVar2, eujv eujvVar3, eujv eujvVar4, eujv eujvVar5, eujv eujvVar6, eujv eujvVar7, eujv eujvVar8, boolean z, euki eukiVar, euja eujaVar, ekgb ekgbVar, eule euleVar) {
        this.d = eujvVar;
        this.e = eujvVar2;
        this.f = eujvVar3;
        this.g = eujvVar4;
        this.h = eujvVar5;
        this.i = eujvVar6;
        this.j = eujvVar7;
        this.k = eujvVar8;
        this.a = z;
        this.b = eukiVar;
        this.l = eujaVar;
        this.c = ekgbVar;
        this.m = euleVar;
    }

    @Override // defpackage.eulf
    public final ekgb a() {
        return this.c;
    }

    @Override // defpackage.eulf
    public final euja b() {
        return this.l;
    }

    @Override // defpackage.eulf
    public final euki c() {
        return this.b;
    }

    @Override // defpackage.eulf
    public final eule d() {
        return this.m;
    }

    @Override // defpackage.eulf
    public final boolean e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        euki eukiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eulf) {
            eulf eulfVar = (eulf) obj;
            if (this.d.equals(eulfVar.h()) && this.e.equals(eulfVar.j()) && this.f.equals(eulfVar.f()) && this.g.equals(eulfVar.m()) && this.h.equals(eulfVar.l()) && this.i.equals(eulfVar.g()) && this.j.equals(eulfVar.k()) && this.k.equals(eulfVar.i()) && this.a == eulfVar.e() && ((eukiVar = this.b) != null ? eukiVar.equals(eulfVar.c()) : eulfVar.c() == null)) {
                eulfVar.n();
                eulfVar.o();
                if (this.l.equals(eulfVar.b()) && ekjz.h(this.c, eulfVar.a()) && this.m.equals(eulfVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.eulf
    public final eujv f() {
        return this.f;
    }

    @Override // defpackage.eulf
    public final eujv g() {
        return this.i;
    }

    @Override // defpackage.eulf
    public final eujv h() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
        euki eukiVar = this.b;
        return (((((((((((((iHashCode * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ (eukiVar == null ? 0 : eukiVar.hashCode())) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 385622423;
    }

    @Override // defpackage.eulf
    public final eujv i() {
        return this.k;
    }

    @Override // defpackage.eulf
    public final eujv j() {
        return this.e;
    }

    @Override // defpackage.eulf
    public final eujv k() {
        return this.j;
    }

    @Override // defpackage.eulf
    public final eujv l() {
        return this.h;
    }

    @Override // defpackage.eulf
    public final eujv m() {
        return this.g;
    }

    public final String toString() {
        return "TextClassifierOptions{coreModelProvider=" + this.d.toString() + ", langIdModelProvider=" + this.e.toString() + ", actionsSuggestionsModelProvider=" + this.f.toString() + ", webrefModelProvider=" + this.g.toString() + ", personNameModelProvider=" + this.h.toString() + ", alternateContactModelProvider=" + this.i.toString() + ", neuralMatchingEncoderProvider=" + this.j.toString() + ", deepCluModelProvider=" + this.k.toString() + ", enableFallback=" + this.a + ", contactOptions=" + String.valueOf(this.b) + ", enableInstalledApps=false, enableTranslationInClassifier=false, eventLogger=" + this.l.toString() + ", actionsSuggestionsLocales=" + this.c.toString() + ", intentGenerationOptions=IntentGenerationOptions{addContactIntentEnabled=false, searchIntentEnabled=false}}";
    }

    @Override // defpackage.eulf
    public final void n() {
    }

    @Override // defpackage.eulf
    public final void o() {
    }
}
