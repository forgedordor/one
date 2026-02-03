package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugy implements ufz {
    final /* synthetic */ dqwl a;
    private dqpi b;

    public ugy(dqwl dqwlVar) {
        this.a = dqwlVar;
    }

    @Override // defpackage.ufz
    public final void a(fdae fdaeVar) {
        ugx ugxVar = new ugx(fdaeVar);
        this.b = ugxVar;
        this.a.M(ugxVar);
    }

    @Override // defpackage.ufz
    public final void b() {
        dqpi dqpiVar = this.b;
        if (dqpiVar == null) {
            fdbq.c("changeListener");
            dqpiVar = null;
        }
        this.a.Q(dqpiVar);
    }
}
