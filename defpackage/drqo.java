package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drqo implements eora {
    final /* synthetic */ drqt a;

    public drqo(drqt drqtVar) {
        this.a = drqtVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ekgb ekgbVar = (ekgb) obj;
        drpv drpvVar = this.a.z;
        if (drpvVar != null) {
            drpvVar.q.d(0, ekgbVar);
            drpvVar.n.remove(Integer.valueOf(drpvVar.m));
            drpvVar.u(0, drpvVar.F(0));
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
    }
}
