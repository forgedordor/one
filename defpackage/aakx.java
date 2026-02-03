package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aakx extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ aaky b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aakx(aaky aakyVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = aakyVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
