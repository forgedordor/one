package defpackage;

/* loaded from: classes4.dex */
public final class dnvl extends fcyv {
    /* synthetic */ Object a;
    int b;
    Object c;
    final /* synthetic */ dnvm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnvl(dnvm dnvmVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.d = dnvmVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.fO(null, this);
    }
}
