package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afvm extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ afvn b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afvm(afvn afvnVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = afvnVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
