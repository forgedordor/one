package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmvb extends fcyv {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cmvd c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmvb(cmvd cmvdVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = cmvdVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(0, this);
    }
}
