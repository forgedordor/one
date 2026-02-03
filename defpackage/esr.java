package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class esr extends enm {
    public final eqp a;
    private final fdav b;
    private final fdap c;

    public esr(fdav fdavVar, fdap fdapVar, int i) {
        this.b = fdavVar;
        this.c = fdapVar;
        eqp eqpVar = new eqp();
        eqpVar.b(i, new esf(fdapVar, fdavVar));
        this.a = eqpVar;
    }

    @Override // defpackage.enm
    public final eqp b() {
        return this.a;
    }
}
