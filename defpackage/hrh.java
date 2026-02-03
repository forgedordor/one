package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hrh extends iay {
    public int a;

    public hrh(long j, int i) {
        super(j);
        this.a = i;
    }

    @Override // defpackage.iay
    public final iay a(long j) {
        return new hrh(j, this.a);
    }

    @Override // defpackage.iay
    public final void b(iay iayVar) {
        iayVar.getClass();
        this.a = ((hrh) iayVar).a;
    }
}
