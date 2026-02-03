package defpackage;

/* loaded from: classes2.dex */
public final class znb extends fcyv {
    /* synthetic */ Object a;
    int b;
    Object c;
    final /* synthetic */ znc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public znb(znc zncVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.d = zncVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.fO(null, this);
    }
}
