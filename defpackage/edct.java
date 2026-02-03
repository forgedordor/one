package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edct extends edcr {
    public ekgb a;
    public ekgb b;
    public ejwi c = ejud.a;
    public ekgb d;
    public int e;

    @Override // defpackage.edcr
    public final void a(ejwi ejwiVar) {
        if (ejwiVar == null) {
            throw new NullPointerException("Null errorState");
        }
        this.c = ejwiVar;
    }

    @Override // defpackage.edcr
    public final void b(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null searchInterests");
        }
        this.a = ekgbVar;
    }

    @Override // defpackage.edcr
    public final void c(int i) {
        if (i == 0) {
            throw new NullPointerException("Null searchState");
        }
        this.e = i;
    }

    @Override // defpackage.edcr
    public final void d(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null searchSuggestions");
        }
        this.b = ekgbVar;
    }
}
