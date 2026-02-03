package defpackage;

/* loaded from: classes3.dex */
public final class cymb extends fcyv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ cymc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cymb(cymc cymcVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = cymcVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fO(null, this);
    }
}
