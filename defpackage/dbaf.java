package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbaf extends fcyv {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ dbai d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbaf(dbai dbaiVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.d = dbaiVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(0, this);
    }
}
