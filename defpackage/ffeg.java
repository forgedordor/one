package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffeg extends ffem {
    final ffez a;
    long b;

    public ffeg(long j) {
        ffez ffezVar = new ffez();
        this.a = ffezVar;
        this.b = -1L;
        f(ffezVar, j);
    }

    @Override // defpackage.ffem, defpackage.fezf
    public final long a() {
        return this.b;
    }

    @Override // defpackage.fezf
    public final void c(fffa fffaVar) {
        ffez ffezVar = this.a;
        ffezVar.I(fffaVar.r(), 0L, ffezVar.b);
    }

    @Override // defpackage.ffem
    public final fezb e(fezb fezbVar) throws IOException {
        if (fezbVar.a("Content-Length") != null) {
            return fezbVar;
        }
        this.e.close();
        ffez ffezVar = this.a;
        this.b = ffezVar.b;
        feza fezaVar = new feza(fezbVar);
        fezaVar.f("Transfer-Encoding");
        fezaVar.c("Content-Length", Long.toString(ffezVar.b));
        return fezaVar.a();
    }
}
