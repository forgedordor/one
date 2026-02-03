package defpackage;

/* loaded from: classes2.dex */
public final class agvs extends fcyv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ agvt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agvs(agvt agvtVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = agvtVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fO(null, this);
    }
}
