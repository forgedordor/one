package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfoo extends fcyv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ cfou d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfoo(cfou cfouVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.d = cfouVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, null, this);
    }
}
