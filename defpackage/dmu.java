package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmu extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ dmx b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(dmx dmxVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = dmxVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
