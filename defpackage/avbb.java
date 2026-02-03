package defpackage;

/* loaded from: classes6.dex */
public final class avbb extends fcyv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ avbc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avbb(avbc avbcVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = avbcVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fO(null, this);
    }
}
