package defpackage;

import android.accounts.Account;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egfc {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/account/data/google/GmsAccounts");
    public final dbmr b;
    public final eosc c;
    public final eosc d;
    public final dyyv e;
    public final dbnr f;
    public final fcsu g;

    public egfc(dbmr dbmrVar, eosc eoscVar, eosc eoscVar2, dyyv dyyvVar, dbnr dbnrVar, fcsu fcsuVar) {
        dbmrVar.getClass();
        eoscVar.getClass();
        eoscVar2.getClass();
        dyyvVar.getClass();
        this.b = dbmrVar;
        this.c = eoscVar;
        this.d = eoscVar2;
        this.e = dyyvVar;
        this.f = dbnrVar;
        this.g = fcsuVar;
    }

    public final ListenableFuture a(final String str) throws IOException {
        eieu eieuVarA = eiiy.a("GmsAccounts.getAccountId");
        try {
            eooy eooyVarC = eiid.c(new eooy() { // from class: egek
                @Override // defpackage.eooy
                public final ListenableFuture a() throws IOException {
                    egfc egfcVar = this.a;
                    String str2 = str;
                    eieu eieuVarA2 = eiiy.a("Fast GoogleAuthUtilWrapper.getAccountId");
                    try {
                        ListenableFuture listenableFutureA = drgi.a(egfcVar.b.b(str2));
                        eieuVarA2.b(listenableFutureA);
                        fczl.a(eieuVarA2, null);
                        return listenableFutureA;
                    } finally {
                    }
                }
            });
            eosc eoscVar = this.c;
            ListenableFuture listenableFutureG = eooh.g(eork.n(eooyVarC, eoscVar), dbmi.class, eiid.d(new eooz() { // from class: egeq
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) throws IOException {
                    dbmi dbmiVar = (dbmi) obj;
                    dbmiVar.getClass();
                    ((ekrd) ((ekrd) egfc.a.h()).g(dbmiVar).h("com/google/apps/tiktok/account/data/google/GmsAccounts", "getAccountId$lambda$23$lambda$22", 374, "GmsAccounts.kt")).q("Fast Auth.getAccountId() Failed");
                    eieu eieuVarA2 = eiiy.a("GoogleAuthUtilWrapper.getToken");
                    final egfc egfcVar = this.a;
                    final String str2 = str;
                    try {
                        ListenableFuture listenableFutureA = drgi.a(egfcVar.b.g(new Account(str2, "com.google")));
                        eieuVarA2.b(listenableFutureA);
                        fczl.a(eieuVarA2, null);
                        return eooq.f(eooq.g(eoqt.t(listenableFutureA), eiid.d(new eooz() { // from class: eger
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) throws IOException {
                                ((String) obj2).getClass();
                                egfc egfcVar2 = egfcVar;
                                String str3 = str2;
                                eieu eieuVarA3 = eiiy.a("GoogleAuthUtilWrapper.getAccountId");
                                try {
                                    ListenableFuture listenableFutureA2 = drgi.a(egfcVar2.b.b(str3));
                                    eieuVarA3.b(listenableFutureA2);
                                    fczl.a(eieuVarA3, null);
                                    return listenableFutureA2;
                                } finally {
                                }
                            }
                        }), egfcVar.c), eiid.a(new ejvr() { // from class: eges
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                String str3 = (String) obj2;
                                ((ekrd) egfc.a.i().h("com/google/apps/tiktok/account/data/google/GmsAccounts", "getAccountId$lambda$23$lambda$22$lambda$21", 403, "GmsAccounts.kt")).q("Found case where getToken fixed the getAccountId failure");
                                return str3;
                            }
                        }), eoqg.a);
                    } finally {
                    }
                }
            }), eoscVar);
            eieuVarA.b(listenableFutureG);
            fczl.a(eieuVarA, null);
            return listenableFutureG;
        } finally {
        }
    }
}
