package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iqv extends fcyv {
    long a;
    long b;
    /* synthetic */ Object c;
    final /* synthetic */ iqy d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqv(iqy iqyVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.d = iqyVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(0L, 0L, this);
    }
}
