package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyza extends abs {
    final /* synthetic */ cyzb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyza(cyzb cyzbVar) {
        super(true);
        this.a = cyzbVar;
    }

    @Override // defpackage.abs
    public final void b() {
        cyzb cyzbVar = this.a;
        cyzbVar.f.H();
        czgf czgfVarA = cyzbVar.f.H();
        czmk czmkVar = czgfVarA.Y;
        if (czmkVar != null) {
            if (czmkVar.H().w()) {
                return;
            }
            Runnable runnable = czgfVarA.ac;
            if (runnable != null) {
                runnable.run();
                return;
            }
        }
        if (!((Boolean) cyzf.b.e()).booleanValue()) {
            cyzbVar.b();
        }
        cyzbVar.g.h(false);
        cyzbVar.a.c().d();
    }
}
