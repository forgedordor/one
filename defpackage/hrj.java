package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hrj extends iay {
    public long a;

    public hrj(long j, long j2) {
        super(j);
        this.a = j2;
    }

    @Override // defpackage.iay
    public final iay a(long j) {
        return new hrj(j, this.a);
    }

    @Override // defpackage.iay
    public final void b(iay iayVar) {
        iayVar.getClass();
        this.a = ((hrj) iayVar).a;
    }
}
