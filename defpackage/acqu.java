package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acqu extends vq {
    final /* synthetic */ dzub a;
    final /* synthetic */ acrt b;

    public acqu(acrt acrtVar, dzub dzubVar) {
        this.a = dzubVar;
        this.b = acrtVar;
    }

    @Override // defpackage.vq
    public final void d(int i, int i2) {
        acrt acrtVar = this.b;
        if (acrtVar.a() > 0) {
            acrtVar.Z.f(this.a, new dzfh("HomeRenderedFirstConversationLatency"), null, dzua.SUCCESS);
            ((acwj) acrtVar.q.b()).C(this);
        }
    }
}
