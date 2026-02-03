package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzbc extends dzat {
    static final ejvr a = new dzbc();

    @Override // defpackage.dzat
    public final void a(ddxa ddxaVar, dyyq dyyqVar) {
        if (!ddxaVar.j() || "null".equals(ddxaVar.h())) {
            return;
        }
        ((dyyi) dyyqVar).c = ddxaVar.h();
    }

    @Override // defpackage.dzat
    public final void b(ddxa ddxaVar, dyyq dyyqVar) {
        if (!ddxaVar.k() || "null".equals(ddxaVar.i())) {
            return;
        }
        ((dyyi) dyyqVar).b = ddxaVar.i();
    }

    @Override // defpackage.dzat
    public final void c(ddxa ddxaVar, dyyq dyyqVar) {
        int iGs = ddxaVar.gs("is_dasher");
        int i = 1;
        if (iGs == 1) {
            i = 3;
        } else if (iGs == 2) {
            i = 2;
        }
        ((dyyi) dyyqVar).g = i;
    }
}
