package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vcl extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ vcq b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcl(vcq vcqVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = vcqVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, this);
    }
}
