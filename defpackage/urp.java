package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class urp implements eeva {
    final /* synthetic */ uro a;

    public urp(uro uroVar) {
        this.a = uroVar;
    }

    @Override // defpackage.eeuz
    public final void b(eeve eeveVar) {
        int i = eeveVar.e;
        if (i == 0) {
            uro uroVar = this.a;
            uroVar.c = new urt();
            urt urtVar = uroVar.c;
            urtVar.aj = uroVar;
            uroVar.e(urtVar);
            return;
        }
        if (i != 1) {
            throw new AssertionError(a.g(i, "Info & Options tab attempted to select invalid tab position"));
        }
        uro uroVar2 = this.a;
        uroVar2.d = new uru();
        uru uruVar = uroVar2.d;
        uruVar.aj = uroVar2;
        uroVar2.e(uruVar);
    }

    @Override // defpackage.eeuz
    public final void c() {
    }

    @Override // defpackage.eeuz
    public final void a(eeve eeveVar) {
    }
}
