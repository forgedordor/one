package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iae extends iay {
    public hux a;
    public int b;

    public iae(long j, hux huxVar) {
        super(j);
        this.a = huxVar;
    }

    @Override // defpackage.iay
    public final iay a(long j) {
        return new iae(j, this.a);
    }

    @Override // defpackage.iay
    public final void b(iay iayVar) {
        iayVar.getClass();
        iae iaeVar = (iae) iayVar;
        synchronized (iag.a) {
            this.a = iaeVar.a;
            this.b = iaeVar.b;
        }
    }
}
