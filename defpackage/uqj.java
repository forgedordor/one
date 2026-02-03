package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uqj extends mo {
    final /* synthetic */ ekgb a;
    final /* synthetic */ ekgb b;

    public uqj(ekgb ekgbVar, ekgb ekgbVar2) {
        this.a = ekgbVar;
        this.b = ekgbVar2;
    }

    @Override // defpackage.mo
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.mo
    public final int b() {
        return this.a.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mo
    public final boolean d(int i, int i2) {
        if (((bagd) this.b.get(i2)).equals(bagd.SETTING_XMS_MODE)) {
            return false;
        }
        return e(i, i2);
    }

    @Override // defpackage.mo
    public final boolean e(int i, int i2) {
        return this.a.get(i) == this.b.get(i2);
    }
}
