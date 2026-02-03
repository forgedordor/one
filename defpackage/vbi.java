package defpackage;

/* loaded from: classes2.dex */
public final class vbi extends fcyv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ vbj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbi(vbj vbjVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = vbjVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fO(null, this);
    }
}
