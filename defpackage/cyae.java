package defpackage;

/* loaded from: classes3.dex */
public final class cyae extends fcyv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ cyaf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyae(cyaf cyafVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = cyafVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fO(null, this);
    }
}
