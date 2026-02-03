package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acqm extends vq {
    final /* synthetic */ acrt a;

    public acqm(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.vq
    public final void d(int i, int i2) {
        acrt acrtVar = this.a;
        if (acrtVar.aU) {
            boolean z = acrtVar.x.a() == 0;
            acrtVar.aU = z;
            acrtVar.z(z);
        }
    }

    @Override // defpackage.vq
    public final void e(int i, int i2) {
        eieu eieuVarK = eiiy.k("ConcatAdapterObserver#onItemRangeRemoved");
        try {
            acrt acrtVar = this.a;
            if (!acrtVar.aU && acrtVar.x.a() == 0 && acrtVar.j().w()) {
                acrtVar.aU = true;
                acrtVar.z(true);
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
