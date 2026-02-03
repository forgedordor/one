package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class diaj {
    public final dbjt a;
    public final long b;

    public diaj(dbjt dbjtVar, long j) {
        ejwl.b(true, "secondsFixIsValid must be >= 0");
        this.a = dbjtVar;
        this.b = j;
    }

    protected abstract diap a(diap diapVar, ejwi ejwiVar);

    protected abstract String b();
}
