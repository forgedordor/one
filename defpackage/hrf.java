package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hrf extends iay {
    public float a;

    public hrf(long j, float f) {
        super(j);
        this.a = f;
    }

    @Override // defpackage.iay
    public final iay a(long j) {
        return new hrf(j, this.a);
    }

    @Override // defpackage.iay
    public final void b(iay iayVar) {
        iayVar.getClass();
        this.a = ((hrf) iayVar).a;
    }
}
