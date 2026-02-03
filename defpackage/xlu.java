package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xlu implements dqfz {
    final /* synthetic */ dqgm a;
    final /* synthetic */ xmd b;
    private final /* synthetic */ dqfz c;

    public xlu(dqgm dqgmVar, xmd xmdVar) {
        this.a = dqgmVar;
        this.b = xmdVar;
        this.c = dqgmVar.c;
    }

    @Override // defpackage.dqfz
    public final void a(boolean z, boolean z2, dqbw dqbwVar) {
        this.a.c.a(z, z2, dqbwVar);
        if (z || !z2) {
            return;
        }
        this.b.c();
    }

    @Override // defpackage.dqfz
    public final void b() {
        this.c.b();
    }

    @Override // defpackage.dqfz
    public final void c() {
        this.c.c();
    }

    @Override // defpackage.dqfz
    public final void d(dqbw dqbwVar) {
        this.a.c.d(dqbwVar);
        this.b.c();
    }
}
