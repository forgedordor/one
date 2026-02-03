package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iab extends iay {
    public huv a;
    public int b;
    public int c;

    public iab(long j, huv huvVar) {
        super(j);
        this.a = huvVar;
    }

    @Override // defpackage.iay
    public final iay a(long j) {
        return new iab(j, this.a);
    }

    @Override // defpackage.iay
    public final void b(iay iayVar) {
        synchronized (iad.a) {
            iayVar.getClass();
            iab iabVar = (iab) iayVar;
            this.a = iabVar.a;
            this.b = iabVar.b;
            this.c = iabVar.c;
        }
    }
}
