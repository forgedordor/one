package defpackage;

/* loaded from: classes2.dex */
public final class vho extends fcyv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ vhp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vho(vhp vhpVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = vhpVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fO(null, this);
    }
}
