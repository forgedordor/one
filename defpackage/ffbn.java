package defpackage;

import com.android.vcard.VCardBuilder;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffbn implements ffax {
    public final feyy a;
    public final ffam b;
    public final fffb c;
    public final fffa d;
    public int e;
    public final ffbg f;
    public feyn g;

    public ffbn(feyy feyyVar, ffam ffamVar, fffb fffbVar, fffa fffaVar) {
        this.a = feyyVar;
        this.b = ffamVar;
        this.c = fffbVar;
        this.d = fffaVar;
        this.f = new ffbg(fffbVar);
    }

    public static final void l(fffg fffgVar) {
        ffgd ffgdVar = fffgVar.a;
        fffgVar.a = ffgd.j;
        ffgdVar.k();
        ffgdVar.l();
    }

    private static final boolean m(fezh fezhVar) {
        return fdgn.j("chunked", fezh.b(fezhVar, "Transfer-Encoding"), true);
    }

    @Override // defpackage.ffax
    public final long a(fezh fezhVar) {
        if (!ffay.b(fezhVar)) {
            return 0L;
        }
        if (m(fezhVar)) {
            return -1L;
        }
        return fezr.i(fezhVar);
    }

    @Override // defpackage.ffax
    public final fezg b(boolean z) throws NumberFormatException, IOException {
        int i = this.e;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(a.g(i, "state: "));
        }
        try {
            ffbg ffbgVar = this.f;
            ffbf ffbfVarA = ffbe.a(ffbgVar.a());
            fezg fezgVar = new fezg();
            fezgVar.d(ffbfVarA.a);
            int i2 = ffbfVarA.b;
            fezgVar.b = i2;
            fezgVar.c = ffbfVarA.c;
            fezgVar.c(ffbgVar.b());
            if (z && i2 == 100) {
                return null;
            }
            if (i2 != 100 && (i2 < 102 || i2 >= 200)) {
                this.e = 4;
                return fezgVar;
            }
            this.e = 3;
            return fezgVar;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.a.a.i.e()), e);
        }
    }

    @Override // defpackage.ffax
    public final ffam c() {
        return this.b;
    }

    @Override // defpackage.ffax
    public final fffz d(fezb fezbVar, long j) {
        if (fdgn.j("chunked", fezbVar.a("Transfer-Encoding"), true)) {
            int i = this.e;
            if (i != 1) {
                throw new IllegalStateException(a.g(i, "state: "));
            }
            this.e = 2;
            return new ffbi(this);
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        int i2 = this.e;
        if (i2 != 1) {
            throw new IllegalStateException(a.g(i2, "state: "));
        }
        this.e = 2;
        return new ffbl(this);
    }

    @Override // defpackage.ffax
    public final ffgb e(fezh fezhVar) {
        if (!ffay.b(fezhVar)) {
            return j(0L);
        }
        if (m(fezhVar)) {
            fezb fezbVar = fezhVar.a;
            int i = this.e;
            if (i != 4) {
                throw new IllegalStateException(a.g(i, "state: "));
            }
            feyq feyqVar = fezbVar.a;
            this.e = 5;
            return new ffbj(this, feyqVar);
        }
        long jI = fezr.i(fezhVar);
        if (jI != -1) {
            return j(jI);
        }
        int i2 = this.e;
        if (i2 != 4) {
            throw new IllegalStateException(a.g(i2, "state: "));
        }
        this.e = 5;
        this.b.e();
        return new ffbm(this);
    }

    @Override // defpackage.ffax
    public final void f() {
        this.b.b();
    }

    @Override // defpackage.ffax
    public final void g() {
        this.d.flush();
    }

    @Override // defpackage.ffax
    public final void h() {
        this.d.flush();
    }

    @Override // defpackage.ffax
    public final void i(fezb fezbVar) {
        Proxy.Type type = this.b.a.b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(fezbVar.b);
        sb.append(' ');
        feyq feyqVar = fezbVar.a;
        if (feyqVar.h || type != Proxy.Type.HTTP) {
            sb.append(ffbc.a(feyqVar));
        } else {
            sb.append(feyqVar);
        }
        sb.append(" HTTP/1.1");
        k(fezbVar.c, sb.toString());
    }

    public final ffgb j(long j) {
        int i = this.e;
        if (i != 4) {
            throw new IllegalStateException(a.g(i, "state: "));
        }
        this.e = 5;
        return new ffbk(this, j);
    }

    public final void k(feyn feynVar, String str) {
        int i = this.e;
        if (i != 0) {
            throw new IllegalStateException(a.g(i, "state: "));
        }
        fffa fffaVar = this.d;
        fffaVar.ac(str);
        fffaVar.ac(VCardBuilder.VCARD_END_OF_LINE);
        int iA = feynVar.a();
        for (int i2 = 0; i2 < iA; i2++) {
            fffaVar.ac(feynVar.c(i2));
            fffaVar.ac(": ");
            fffaVar.ac(feynVar.d(i2));
            fffaVar.ac(VCardBuilder.VCARD_END_OF_LINE);
        }
        fffaVar.ac(VCardBuilder.VCARD_END_OF_LINE);
        this.e = 1;
    }
}
