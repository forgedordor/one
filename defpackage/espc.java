package defpackage;

import android.accounts.Account;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class espc implements esol {
    private static final Duration c = Duration.ofMinutes(5);
    private static final Duration d = Duration.ofHours(1);
    private static final ejwc e = new ejwc(" ");
    private final esos f;
    private final diep g;
    private final eosc h = new eoqh();
    public final Map a = new HashMap();
    public final Map b = new HashMap();

    public espc(esos esosVar, diep diepVar) {
        this.f = esosVar;
        this.g = diepVar;
    }

    private static final String f(Set set) {
        return "oauth2:".concat(e.b(set));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.esol
    public final eson a(esoi esoiVar, Set set) throws esom {
        ListenableFuture listenableFuture;
        eosa eosaVar;
        final espd espdVar = new espd(new Account(esoiVar.a(), "com.google"), f(set));
        Map map = this.b;
        synchronized (map) {
            listenableFuture = (ListenableFuture) map.get(espdVar);
            if (listenableFuture == null) {
                eosaVar = new eosa(new Callable() { // from class: esoz
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        eson esonVarD;
                        espc espcVar = this.a;
                        espb espbVar = espdVar;
                        synchronized (espcVar.a) {
                            espcVar.e(espcVar.c(espbVar));
                            esonVarD = espcVar.d(espbVar);
                        }
                        return esonVarD;
                    }
                });
                eosaVar.b(new Runnable() { // from class: espa
                    @Override // java.lang.Runnable
                    public final void run() {
                        Map map2 = this.a.b;
                        espb espbVar = espdVar;
                        synchronized (map2) {
                            map2.remove(espbVar);
                        }
                    }
                }, this.h);
                map.put(espdVar, eosaVar);
                listenableFuture = eosaVar;
            } else {
                eosaVar = null;
            }
        }
        if (eosaVar != null) {
            eosaVar.run();
        }
        try {
            return (eson) listenableFuture.get();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof esom) {
                throw ((esom) cause);
            }
            throw new esom("Failed to refresh token", cause);
        }
    }

    @Override // defpackage.esol
    public final eson b(esoi esoiVar, Set set) throws esom {
        eson esonVarC;
        try {
            espd espdVar = new espd(new Account(esoiVar.a(), "com.google"), f(set));
            synchronized (this.a) {
                esonVarC = c(espdVar);
            }
            return esonVarC;
        } catch (esom e2) {
            throw e2;
        } catch (Throwable th) {
            throw new esom("Failed to get auth token", th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eson c(defpackage.espb r5) {
        /*
            r4 = this;
            java.util.Map r0 = r4.a
            java.lang.Object r0 = r0.get(r5)
            eson r0 = (defpackage.eson) r0
            if (r0 == 0) goto L3f
            j$.time.Instant r1 = r0.c
            if (r1 == 0) goto L21
            diep r2 = r4.g
            j$.time.Instant r2 = r2.f()
            j$.time.Duration r1 = j$.time.Duration.between(r2, r1)
            j$.time.Duration r2 = defpackage.espc.c
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3b
            goto L3c
        L21:
            j$.time.Instant r1 = r0.b
            diep r2 = r4.g
            j$.time.Instant r2 = r2.f()
            j$.time.Duration r1 = j$.time.Duration.between(r1, r2)
            j$.time.Duration r2 = defpackage.espc.d
            j$.time.Duration r3 = defpackage.espc.c
            j$.time.Duration r2 = r2.minus(r3)
            int r1 = r1.compareTo(r2)
            if (r1 >= 0) goto L3c
        L3b:
            return r0
        L3c:
            r4.e(r0)
        L3f:
            eson r5 = r4.d(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.espc.c(espb):eson");
    }

    public final eson d(espb espbVar) {
        espd espdVar = (espd) espbVar;
        esos esosVar = this.f;
        Account account = espdVar.a;
        String str = espdVar.b;
        Map map = this.a;
        eson esonVarA = esosVar.a(account, str);
        map.put(espbVar, esonVarA);
        return esonVarA;
    }

    public final void e(eson esonVar) {
        this.f.b(esonVar.a);
    }
}
