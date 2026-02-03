package defpackage;

/* loaded from: classes2.dex */
public final class vlt extends fcyv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ vlu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vlt(vlu vluVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = vluVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fO(null, this);
    }
}
