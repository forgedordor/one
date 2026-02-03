package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eyjs extends eyjm {
    private final eyjm b;

    public eyjs(eyjm eyjmVar) {
        this.b = eyjmVar;
    }

    @Override // defpackage.eyjm
    public final eyjh a(eyji eyjiVar) {
        try {
            return new eyjq(this.b.a(eyjiVar));
        } catch (RuntimeException e) {
            eyjt.d(e, this.b, eyjiVar);
            return eyjh.a;
        }
    }
}
