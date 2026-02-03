package defpackage;

/* loaded from: classes2.dex */
public final class tcp extends fcyv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ tcq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcp(tcq tcqVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = tcqVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fO(null, this);
    }
}
