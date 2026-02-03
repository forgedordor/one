package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyql {
    public static ThreadFactory a() {
        eosw eoswVar = new eosw();
        eoswVar.d("OneGoogle #%d");
        eoswVar.c(false);
        eoswVar.e(5);
        eoswVar.a = new ThreadFactory() { // from class: dyqk
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable);
            }
        };
        return eosw.b(eoswVar);
    }
}
