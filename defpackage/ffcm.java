package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffcm implements ffax {
    public static final List a = fezr.o("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List b = fezr.o("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    private final ffam c;
    private final ffba d;
    private final ffcl e;
    private volatile ffct f;
    private final feyz g;
    private volatile boolean h;

    public ffcm(feyy feyyVar, ffam ffamVar, ffba ffbaVar, ffcl ffclVar) {
        this.c = ffamVar;
        this.d = ffbaVar;
        this.e = ffclVar;
        List list = feyyVar.s;
        feyz feyzVar = feyz.e;
        this.g = list.contains(feyzVar) ? feyzVar : feyz.d;
    }

    @Override // defpackage.ffax
    public final long a(fezh fezhVar) {
        if (ffay.b(fezhVar)) {
            return fezr.i(fezhVar);
        }
        return 0L;
    }

    @Override // defpackage.ffax
    public final fezg b(boolean z) throws NumberFormatException, IOException {
        ffct ffctVar = this.f;
        if (ffctVar == null) {
            throw new IOException("stream wasn't created");
        }
        feyz feyzVar = this.g;
        feyn feynVarA = ffctVar.a();
        feyzVar.getClass();
        feyl feylVar = new feyl();
        int iA = feynVarA.a();
        ffbf ffbfVarA = null;
        for (int i = 0; i < iA; i++) {
            String strC = feynVarA.c(i);
            String strD = feynVarA.d(i);
            if (fdbq.f(strC, ":status")) {
                ffbfVarA = ffbe.a("HTTP/1.1 ".concat(String.valueOf(strD)));
            } else if (!b.contains(strC)) {
                feylVar.c(strC, strD);
            }
        }
        if (ffbfVarA == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        fezg fezgVar = new fezg();
        fezgVar.d(feyzVar);
        fezgVar.b = ffbfVarA.b;
        fezgVar.c = ffbfVarA.c;
        fezgVar.c(feylVar.b());
        if (z && fezgVar.b == 100) {
            return null;
        }
        return fezgVar;
    }

    @Override // defpackage.ffax
    public final ffam c() {
        return this.c;
    }

    @Override // defpackage.ffax
    public final fffz d(fezb fezbVar, long j) {
        ffct ffctVar = this.f;
        ffctVar.getClass();
        return ffctVar.b();
    }

    @Override // defpackage.ffax
    public final ffgb e(fezh fezhVar) {
        ffct ffctVar = this.f;
        ffctVar.getClass();
        return ffctVar.g;
    }

    @Override // defpackage.ffax
    public final void f() {
        this.h = true;
        ffct ffctVar = this.f;
        if (ffctVar != null) {
            ffctVar.l(9);
        }
    }

    @Override // defpackage.ffax
    public final void g() {
        ffct ffctVar = this.f;
        ffctVar.getClass();
        ffctVar.b().close();
    }

    @Override // defpackage.ffax
    public final void h() {
        this.e.d();
    }

    @Override // defpackage.ffax
    public final void i(fezb fezbVar) throws IOException {
        int i;
        ffct ffctVar;
        boolean z;
        if (this.f == null) {
            boolean z2 = fezbVar.d != null;
            feyn feynVar = fezbVar.c;
            ArrayList arrayList = new ArrayList(feynVar.a() + 4);
            arrayList.add(new ffbr(ffbr.c, fezbVar.b));
            feyq feyqVar = fezbVar.a;
            arrayList.add(new ffbr(ffbr.d, ffbc.a(feyqVar)));
            String strA = fezbVar.a("Host");
            if (strA != null) {
                arrayList.add(new ffbr(ffbr.f, strA));
            }
            arrayList.add(new ffbr(ffbr.e, feyqVar.b));
            int iA = feynVar.a();
            for (int i2 = 0; i2 < iA; i2++) {
                String strC = feynVar.c(i2);
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = strC.toLowerCase(locale);
                lowerCase.getClass();
                if (!a.contains(lowerCase) || (fdbq.f(lowerCase, "te") && fdbq.f(feynVar.d(i2), "trailers"))) {
                    arrayList.add(new ffbr(lowerCase, feynVar.d(i2)));
                }
            }
            ffcl ffclVar = this.e;
            boolean z3 = !z2;
            synchronized (ffclVar.u) {
                synchronized (ffclVar) {
                    if (ffclVar.f > 1073741823) {
                        ffclVar.l(8);
                    }
                    if (ffclVar.g) {
                        throw new ffbo();
                    }
                    i = ffclVar.f;
                    ffclVar.f = i + 2;
                    ffctVar = new ffct(i, ffclVar, z3, false, null);
                    z = !z2 || ffclVar.s >= ffclVar.t || ffctVar.e >= ffctVar.f;
                    if (ffctVar.i()) {
                        ffclVar.c.put(Integer.valueOf(i), ffctVar);
                    }
                }
                ffclVar.u.f(z3, i, arrayList);
            }
            if (z) {
                ffclVar.u.d();
            }
            this.f = ffctVar;
            if (this.h) {
                ffct ffctVar2 = this.f;
                ffctVar2.getClass();
                ffctVar2.l(9);
                throw new IOException("Canceled");
            }
            ffct ffctVar3 = this.f;
            ffctVar3.getClass();
            ffba ffbaVar = this.d;
            ffctVar3.i.n(ffbaVar.e, TimeUnit.MILLISECONDS);
            ffct ffctVar4 = this.f;
            ffctVar4.getClass();
            ffctVar4.j.n(ffbaVar.f, TimeUnit.MILLISECONDS);
        }
    }
}
