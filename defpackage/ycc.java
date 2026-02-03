package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ycc extends fcyv {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ycd c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycc(ycd ycdVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = ycdVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0, this);
    }
}
