package defpackage;

/* loaded from: classes2.dex */
public final class vsu extends fcyv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ vsv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsu(vsv vsvVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = vsvVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fO(null, this);
    }
}
