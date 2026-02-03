package defpackage;

/* loaded from: classes3.dex */
public final class cylv extends fcyv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ cylw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cylv(cylw cylwVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = cylwVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fO(null, this);
    }
}
