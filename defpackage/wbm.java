package defpackage;

/* loaded from: classes2.dex */
public final class wbm extends fcyv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ wbn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbm(wbn wbnVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = wbnVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fO(null, this);
    }
}
