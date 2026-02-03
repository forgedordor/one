package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddkr {
    public static final ExecutorService a;
    public static final ExecutorService b;

    static {
        ddmw ddmwVar = ddmx.a;
        eosw eoswVar = new eosw();
        eoswVar.d("brella-inappjobsvcimpl-%d");
        a = ddmw.c(eosw.b(eoswVar));
        ddmw ddmwVar2 = ddmx.a;
        eosw eoswVar2 = new eosw();
        eoswVar2.d("brella-inappjobsvc-%d");
        b = ddmw.c(eosw.b(eoswVar2));
    }
}
