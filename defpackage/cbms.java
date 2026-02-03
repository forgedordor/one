package defpackage;

/* loaded from: classes7.dex */
public final class cbms extends fcyv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ cbmt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbms(cbmt cbmtVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = cbmtVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fO(null, this);
    }
}
