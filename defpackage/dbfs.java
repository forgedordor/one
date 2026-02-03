package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbfs extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ dbft b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbfs(dbft dbftVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = dbftVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, this);
    }
}
