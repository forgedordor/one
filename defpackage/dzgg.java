package defpackage;

import android.content.Context;
import com.google.android.libraries.performance.primes.federatedlearning.PrimesExampleStoreDataTtlService;
import java.util.Random;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgg {
    private static final diep a = new dieu();
    private static final Random b = new Random();
    private static final eosc c;
    private static final Object d;
    private static ddjt e;

    static {
        eosw eoswVar = new eosw();
        eoswVar.d("PrimesBrellaExampleStore-%d");
        c = eosj.a(Executors.newSingleThreadExecutor(eosw.b(eoswVar)));
        d = new Object();
    }

    public static ddjt a(Context context) {
        ddjt ddjtVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (d) {
            if (e == null) {
                diep diepVar = a;
                Random random = b;
                eosc eoscVar = c;
                e = new ddjt(applicationContext, new ddjy(applicationContext, diepVar, random, eoscVar), eoscVar, PrimesExampleStoreDataTtlService.class);
            }
            ddjtVar = e;
        }
        return ddjtVar;
    }
}
