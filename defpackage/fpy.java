package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpy extends fcyv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ fqa c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpy(fqa fqaVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = fqaVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
