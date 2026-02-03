package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esok implements esrw {
    public static final fbnb a = new fbnb("com.google.frameworks.client.data.android.auth.AuthContextInterceptor", false);
    private static final fbrb b;
    private static final fbrb c;
    private final ejwi d;
    private final ekgp e;
    private ListenableFuture f;
    private esrw g;

    static {
        fbqx fbqxVar = fbrg.c;
        int i = fbrb.d;
        b = new fbqw("Authorization", fbqxVar);
        c = new fbqw("X-Auth-Time", fbrg.c);
    }

    public esok(ejwi ejwiVar, ekgp ekgpVar) {
        this.d = ejwiVar;
        this.e = ekgpVar;
    }

    @Override // defpackage.esrw
    public final estb a(esrs esrsVar) {
        esrw esrwVar = this.g;
        if (esrwVar != null) {
            return esrwVar.a(esrsVar);
        }
        try {
            eson esonVar = (eson) eork.q(this.f);
            fbrg fbrgVar = esrsVar.a;
            fbrb fbrbVar = b;
            ejwl.m(!fbrgVar.i(fbrbVar), "Already attached auth token");
            fbrgVar.h(fbrbVar, a.v(esonVar.a, "Bearer "));
            fbrgVar.h(c, esonVar.a());
            return estb.a;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (!(cause instanceof esom)) {
                return estb.b(Status.c(cause), new fbrg());
            }
            Status.Code code = Status.Code.UNAUTHENTICATED;
            List list = Status.a;
            return estb.b(code.a().d(cause.getCause()), new fbrg());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // defpackage.esrw
    public final estb b(final esrs esrsVar) {
        fbnc fbncVar = esrsVar.b;
        final esoi esoiVar = (esoi) fbncVar.h(esoi.a);
        esoiVar.getClass();
        String strB = esoiVar.b();
        ekgp ekgpVar = this.e;
        if (ekgpVar.containsKey(strB)) {
            esot esotVar = (esot) ekgpVar.get(esoiVar.b());
            ejwi ejwiVar = esotVar.c;
            esoy esoyVar = new esoy((esox) ((ejwt) esotVar.b).a);
            this.g = esoyVar;
            return esoyVar.b(esrsVar);
        }
        boolean z = false;
        if (!esoiVar.b().equals("incognito") && !esoiVar.b().equals("pseudonymous")) {
            z = true;
        }
        ejwl.m(z, "Used non-google account without enabling API Key fallback");
        fbnb fbnbVar = esml.a;
        final esol esolVarL = ((esmk) fbncVar.h(fbnbVar)).l();
        ejwi ejwiVar2 = this.d;
        final ?? C = ejwiVar2.g() ? ejwiVar2.c() : ((esoa) fbncVar.h(esoa.a)).b();
        eieu eieuVarK = eiiy.k("AuthContextInterceptor#tokenFuture");
        try {
            eosa eosaVar = new eosa(eiid.l(new Callable() { // from class: esoj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    boolean zBooleanValue = ((Boolean) esrsVar.b.h(esok.a)).booleanValue();
                    esol esolVar = esolVarL;
                    esoi esoiVar2 = esoiVar;
                    Set set = C;
                    return zBooleanValue ? esolVar.a(esoiVar2, set) : esolVar.b(esoiVar2, set);
                }
            }));
            eieuVarK.b(eosaVar);
            ((esmk) fbncVar.h(fbnbVar)).o().execute(eosaVar);
            this.f = eosaVar;
            estb estbVarC = estb.c(eosaVar);
            eieuVarK.close();
            return estbVarC;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.esrw
    public final /* synthetic */ estb c() {
        return estb.a;
    }

    @Override // defpackage.esrw
    public final /* synthetic */ estb e() {
        return estb.a;
    }

    @Override // defpackage.esrw
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.esrw
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.esrw
    public final /* synthetic */ void d(esrr esrrVar) {
    }
}
