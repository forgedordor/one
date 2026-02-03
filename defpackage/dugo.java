package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dugo implements eora {
    final /* synthetic */ dtqy a;
    final /* synthetic */ dugr b;

    public dugo(dugr dugrVar, dtqy dtqyVar) {
        this.a = dtqyVar;
        this.b = dugrVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        durt.e(th, "%s: Unable to create symlink structure, cleaning up symlinks...", "FileGroupManager");
        try {
            dugr dugrVar = this.b;
            dutx.f(dugrVar.a, dugrVar.i, this.a, dugrVar.f);
        } catch (IOException e) {
            durt.e(e, "%s: Unable to clean up symlink structure after failure", "FileGroupManager");
        }
    }
}
