package defpackage;

/* loaded from: classes2.dex */
public final class yjv extends fcyv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ yjw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjv(yjw yjwVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = yjwVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fO(null, this);
    }
}
