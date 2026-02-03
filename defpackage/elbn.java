package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class elbn extends elbc {
    @Override // defpackage.elbb
    protected final long a() {
        return new elba((elbb) f()).size();
    }

    @Override // defpackage.elbc, defpackage.elbb, defpackage.elca
    public final /* bridge */ /* synthetic */ Iterable b(Object obj) {
        throw null;
    }

    @Override // defpackage.elbg, defpackage.elbo
    public final Set d() {
        return f().d();
    }

    @Override // defpackage.elbg, defpackage.elbo
    public final Set e(Object obj) {
        return f().e(obj);
    }

    public abstract elbg f();

    @Override // defpackage.elbo
    public final void g() {
    }
}
