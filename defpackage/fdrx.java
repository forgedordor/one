package defpackage;

/* loaded from: classes6.dex */
public final class fdrx extends fcyv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ fdry c;
    Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdrx(fdry fdryVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = fdryVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fO(null, this);
    }
}
