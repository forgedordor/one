package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acda extends fcyv {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ acdc c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acda(acdc acdcVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = acdcVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
