package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhcp implements fexl {
    final /* synthetic */ fhbn a;
    final /* synthetic */ fhct b;

    public fhcp(fhct fhctVar, fhbn fhbnVar) {
        this.a = fhbnVar;
        this.b = fhctVar;
    }

    private final void c(Throwable th) {
        try {
            this.a.onFailure(this.b, th);
        } catch (Throwable th2) {
            fhef.m(th2);
            th2.printStackTrace();
        }
    }

    @Override // defpackage.fexl
    public final void a(IOException iOException) {
        c(iOException);
    }

    @Override // defpackage.fexl
    public final void b(fezh fezhVar) {
        fhdv fhdvVar;
        try {
            fhct fhctVar = this.b;
            fezk fezkVar = fezhVar.g;
            fezg fezgVar = new fezg(fezhVar);
            fezgVar.f = new fhcs(fezkVar.b(), fezkVar.a());
            fezh fezhVarA = fezgVar.a();
            int i = fezhVarA.d;
            if (i < 200 || i >= 300) {
                try {
                    fhef.k(fezkVar);
                    if (fezhVarA.a()) {
                        throw new IllegalArgumentException("rawResponse should not be successful response");
                    }
                    fhdvVar = new fhdv(fezhVarA, null);
                } finally {
                    fezkVar.close();
                }
            } else if (i == 204 || i == 205) {
                fezkVar.close();
                fhdvVar = fhdv.b(null, fezhVarA);
            } else {
                fhcr fhcrVar = new fhcr(fezkVar);
                try {
                    fhdvVar = fhdv.b(fhctVar.a.a(fhcrVar), fezhVarA);
                } catch (RuntimeException e) {
                    IOException iOException = fhcrVar.a;
                    if (iOException == null) {
                        throw e;
                    }
                    throw iOException;
                }
            }
            try {
                this.a.onResponse(this.b, fhdvVar);
            } catch (Throwable th) {
                fhef.m(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            fhef.m(th2);
            c(th2);
        }
    }
}
