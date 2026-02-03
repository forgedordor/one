package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmin extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ cmio b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmin(cmio cmioVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = cmioVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, this);
    }
}
