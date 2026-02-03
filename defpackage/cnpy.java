package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnpy extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ cnpz b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnpy(cnpz cnpzVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = cnpzVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
