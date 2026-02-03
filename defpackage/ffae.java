package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffae {
    public final ffaj a;
    public final ffaf b;
    public final ffax c;
    public boolean d;
    public final ffam e;

    public ffae(ffaj ffajVar, ffaf ffafVar, ffax ffaxVar) {
        this.a = ffajVar;
        this.b = ffafVar;
        this.c = ffaxVar;
        this.e = ffaxVar.c();
    }

    public final fezg a(boolean z) throws IOException {
        try {
            fezg fezgVarB = this.c.b(z);
            if (fezgVarB != null) {
                fezgVarB.l = this;
            }
            return fezgVarB;
        } catch (IOException e) {
            d(e);
            throw e;
        }
    }

    public final void b() {
        this.c.c().e();
    }

    public final void c() {
        this.a.d(this, true, false, null);
    }

    public final void d(IOException iOException) {
        this.d = true;
        this.b.a(iOException);
        this.c.c().g(this.a, iOException);
    }

    public final IOException e(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        return this.a.d(this, z2, z, iOException);
    }
}
