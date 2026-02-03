package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvvh extends fcyv {
    Object a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ bvvn d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvvh(bvvn bvvnVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.d = bvvnVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(null, null, null, this);
    }
}
