package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfqo implements eyik {
    private final dfqp a;
    private final int b;

    public dfqo(dfqp dfqpVar, int i) {
        this.a = dfqpVar;
        this.b = i;
    }

    @Override // defpackage.fcsu
    public final Object b() {
        int i = this.b;
        if (i == 0) {
            return eyjt.a(this.a.g, eyim.a);
        }
        if (i == 1) {
            dfqp dfqpVar = this.a;
            dfny dfnyVar = dfrx.a;
            return dfqpVar.a;
        }
        if (i != 2) {
            return i != 3 ? i != 4 ? new efpx(new efqd()) : new efqb() : new efpp();
        }
        dfqp dfqpVar2 = this.a;
        return new dfvi(dfqpVar2.b, dfqpVar2.o, dfqpVar2.c);
    }
}
