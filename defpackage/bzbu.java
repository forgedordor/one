package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzbu extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ bzbx b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzbu(bzbx bzbxVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = bzbxVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objJ = this.b.j(null, null, this);
        return objJ == fcyl.a ? objJ : new fctk(objJ);
    }
}
