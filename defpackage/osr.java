package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class osr extends fcyv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ osu c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osr(osu osuVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = osuVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
