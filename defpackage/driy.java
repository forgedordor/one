package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class driy implements drjc {
    final /* synthetic */ driz a;

    public driy(driz drizVar) {
        this.a = drizVar;
    }

    @Override // defpackage.drjc
    public final void a(int i) {
        driz drizVar = this.a;
        drizVar.d = Integer.toString(i);
        drizVar.e = i;
        drizVar.ag.b();
        if (drizVar.a.g) {
            ((driv) drizVar.G()).D();
        } else {
            ((driw) drizVar.G()).F(drizVar.r(), drizVar);
        }
    }
}
