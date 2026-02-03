package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class azxq implements fdae {
    final /* synthetic */ azxr a;
    final /* synthetic */ File b;
    final /* synthetic */ azvv c;

    public azxq(azxr azxrVar, File file, azvv azvvVar) {
        this.a = azxrVar;
        this.b = file;
        this.c = azvvVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        azvv azvvVar = this.c;
        azxr azxrVar = this.a;
        azxp azxpVar = new azxp(azvvVar, azxrVar);
        final File file = this.b;
        file.getClass();
        lcg.b(file.exists(), new fdae() { // from class: aysu
            @Override // defpackage.fdae
            public final Object invoke() {
                return "File " + file.getPath() + " does not exist";
            }
        });
        aysy aysyVar = azxrVar.b;
        String parent = aysyVar.c().getAbsoluteFile().getCanonicalFile().getParent();
        final String parent2 = file.getCanonicalFile().getParent();
        lcg.b(fdbq.f(parent, parent2), new fdae() { // from class: aysv
            @Override // defpackage.fdae
            public final Object invoke() {
                return String.valueOf(parent2).concat(" is not located in the app database directory");
            }
        });
        try {
            dqru.t(true);
            ((dqrc) aysyVar.a.b()).c(file.getName());
            azxpVar.invoke();
            fcsu fcsuVar = aysyVar.a;
            ((dqrc) fcsuVar.b()).b();
            dqru.t(false);
            ((dqrc) fcsuVar.b()).a();
            return fctx.a;
        } catch (Throwable th) {
            fcsu fcsuVar2 = aysyVar.a;
            ((dqrc) fcsuVar2.b()).b();
            dqru.t(false);
            ((dqrc) fcsuVar2.b()).a();
            throw th;
        }
    }
}
