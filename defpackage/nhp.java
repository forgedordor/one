package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nhp extends nhz implements Comparable {
    private final int e;
    private final int f;

    public nhp(int i, mcm mcmVar, int i2, nhs nhsVar, int i3) {
        super(i, mcmVar, i2);
        this.e = mti.g(i3, nhsVar.R) ? 1 : 0;
        this.f = this.d.a();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(nhp nhpVar) {
        return Integer.compare(this.f, nhpVar.f);
    }

    @Override // defpackage.nhz
    public final int b() {
        return this.e;
    }

    @Override // defpackage.nhz
    public final /* bridge */ /* synthetic */ boolean c(nhz nhzVar) {
        return false;
    }
}
