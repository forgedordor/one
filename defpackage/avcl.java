package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avcl extends fcyv {
    boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ avco c;
    int d;
    avde e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avcl(avco avcoVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = avcoVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(false, this);
    }
}
