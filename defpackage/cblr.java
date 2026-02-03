package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cblr implements cayy {
    final caye a;
    final cazc b;
    final /* synthetic */ cbdg c;
    final /* synthetic */ String d;
    final /* synthetic */ ekgb e;
    final /* synthetic */ cazg f;
    final /* synthetic */ cbls g;

    public cblr(cbls cblsVar, cbdg cbdgVar, String str, ekgb ekgbVar, cazg cazgVar) {
        this.c = cbdgVar;
        this.d = str;
        this.e = ekgbVar;
        this.f = cazgVar;
        this.g = cblsVar;
        this.a = cblsVar.n.a(cbdgVar);
        this.b = cazc.j(str, ekgbVar);
    }

    @Override // defpackage.cayy
    public final cazc a() {
        return this.b;
    }

    @Override // defpackage.cayy
    public final boolean b() {
        return this.a.d(cayd.CANCELLED);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cayy
    public final boolean c() {
        cazg cazgVar = this.f;
        int i = ((caxl) cazgVar.a()).d;
        if (!(cazgVar instanceof cayl)) {
            return this.c.k() + 1 < i;
        }
        ekgb ekgbVar = this.e;
        int size = ekgbVar.size();
        int i2 = 0;
        while (i2 < size) {
            int iK = ((cbdg) ekgbVar.get(i2)).k() + 1;
            i2++;
            if (iK < i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cayy
    public final boolean d(int i) {
        ekgb ekgbVar = this.e;
        if (i < ekgbVar.size()) {
            return ((cbdg) ekgbVar.get(i)).k() + 1 < ((caxl) this.f.a()).d;
        }
        throw new IllegalArgumentException("position " + i + " is out of range [0:" + ekgbVar.size() + "]");
    }
}
