package defpackage;

/* loaded from: classes7.dex */
public final class cfvt extends fcyv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ cfvu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfvt(cfvu cfvuVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = cfvuVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fO(null, this);
    }
}
