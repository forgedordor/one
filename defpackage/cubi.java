package defpackage;

/* loaded from: classes3.dex */
public final class cubi extends fcyv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ cubj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cubi(cubj cubjVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = cubjVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fO(null, this);
    }
}
