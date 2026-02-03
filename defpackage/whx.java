package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class whx extends fcyv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ wiq c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whx(wiq wiqVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = wiqVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objE = this.c.e(null, this);
        return objE == fcyl.a ? objE : new whq((vvs) objE);
    }
}
