package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfva extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ cfvb b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfva(cfvb cfvbVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = cfvbVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
