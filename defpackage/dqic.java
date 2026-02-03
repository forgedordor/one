package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqic implements dqfz {
    final /* synthetic */ dqfz a;
    final /* synthetic */ iqa b;
    final /* synthetic */ iac c;
    final /* synthetic */ dqix d;

    public dqic(dqfz dqfzVar, iqa iqaVar, iac iacVar, dqix dqixVar) {
        this.a = dqfzVar;
        this.b = iqaVar;
        this.c = iacVar;
        this.d = dqixVar;
    }

    @Override // defpackage.dqfz
    public final void a(boolean z, boolean z2, dqbw dqbwVar) {
        if (this.d instanceof dqiw) {
            this.b.a(0);
        }
        this.a.a(z, z2, dqbwVar);
    }

    @Override // defpackage.dqfz
    public final void b() {
        this.a.b();
        this.b.a(0);
        this.c.clear();
    }

    @Override // defpackage.dqfz
    public final void c() {
        if (this.d instanceof dqiw) {
            this.b.a(0);
        }
        this.a.c();
    }

    @Override // defpackage.dqfz
    public final void d(dqbw dqbwVar) {
        if (this.d instanceof dqiw) {
            this.b.a(0);
        }
        this.a.d(dqbwVar);
    }
}
