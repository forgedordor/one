package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class ffem extends fezf {
    ffgd c;
    long d;
    OutputStream e;
    boolean f;

    @Override // defpackage.fezf
    public long a() {
        return this.d;
    }

    @Override // defpackage.fezf
    public final feyt b() {
        return null;
    }

    final void f(fffa fffaVar, long j) {
        this.c = fffaVar.a();
        this.d = j;
        this.e = new ffel(this, j, fffaVar);
    }

    public fezb e(fezb fezbVar) {
        return fezbVar;
    }
}
