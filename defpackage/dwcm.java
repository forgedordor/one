package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;
import io.grpc.StatusException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwcm {
    public final Context a;
    public final dvxm b;
    public final dvyx c;
    public final dwdf d;
    public dvpz e;
    public final Map f;
    public cdpq g;

    public dwcm(Context context, cdpo cdpoVar, dvxm dvxmVar) {
        dwdf dwdfVar = new dwdf(context);
        this.f = new HashMap();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.d = dwdfVar;
        this.b = dvxmVar;
        this.c = dvyx.a(applicationContext);
    }

    public static final ListenableFuture g(eooz eoozVar) {
        try {
            return eoozVar.a(null);
        } catch (Exception e) {
            return eork.h(e);
        }
    }

    private final ListenableFuture i(final UUID uuid, final int i, final dwgk dwgkVar, final ListenableFuture listenableFuture, final dwpk dwpkVar, dvxf dvxfVar, final boolean z, final dwje dwjeVar, final dwju dwjuVar) {
        dvia.b();
        return c(dwjeVar, dwpkVar, new eooz() { // from class: dwbz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dwju dwjuVar2;
                ListenableFuture listenableFutureApply;
                final dwcm dwcmVar = this.a;
                final ListenableFuture listenableFutureA = listenableFuture;
                if (z) {
                    listenableFutureA = dwcmVar.a(listenableFutureA, dwpkVar);
                }
                final dwgk dwgkVar2 = dwgkVar;
                int i2 = i;
                final UUID uuid2 = uuid;
                if (i2 == 1) {
                    listenableFutureApply = new ejvr() { // from class: dwbr
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            return dwgkVar2.a((ezpp) obj2);
                        }
                    }.apply((ezpp) dwcy.a(dwcmVar.a, uuid2).build());
                } else {
                    dwje dwjeVar2 = dwjeVar;
                    if (i2 == 0 && dwjeVar2 != null) {
                        listenableFutureApply = dwcmVar.e(uuid2, new ejvr() { // from class: dwbr
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                return dwgkVar2.a((ezpp) obj2);
                            }
                        }, dwjeVar2);
                    } else {
                        if (i2 != 2 || dwjeVar2 == null || (dwjuVar2 = dwjuVar) == null) {
                            return eork.h(new RuntimeException(a.g(i2, "Invalid RequestType: ")));
                        }
                        ejvr ejvrVar = new ejvr() { // from class: dwbr
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                return dwgkVar2.a((ezpp) obj2);
                            }
                        };
                        ezpo ezpoVarB = dwcy.b(dwcmVar.a, eomt.c(dwjuVar2.c()), uuid2);
                        ezol ezolVarC = dweb.c(dwjeVar2.c().f());
                        ezpoVarB.copyOnWrite();
                        ezpp ezppVar = (ezpp) ezpoVarB.instance;
                        ezpp ezppVar2 = ezpp.a;
                        ezolVarC.getClass();
                        ezppVar.h = ezolVarC;
                        ezppVar.b |= 2;
                        listenableFutureApply = ejvrVar.apply((ezpp) ezpoVarB.build());
                    }
                }
                final SettableFuture settableFutureCreate = SettableFuture.create();
                eooz eoozVar = new eooz() { // from class: dwbs
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        UUID uuid3 = uuid2;
                        dvhv.e("Backend", "request(requestId=" + String.valueOf(uuid3) + "): " + obj2.getClass().getSimpleName());
                        dvhv.a("Backend", a.H(obj2, uuid3, "request(requestId=", "): "));
                        settableFutureCreate.set(Long.valueOf(SystemClock.elapsedRealtime()));
                        return dwgkVar2.b(eooq.f(listenableFutureA, new ejvr() { // from class: dwce
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                return ((dwcn) obj3).a;
                            }
                        }, eoqg.a), obj2);
                    }
                };
                eoqg eoqgVar = eoqg.a;
                final ListenableFuture listenableFutureF = eooq.f(eooq.g(listenableFutureApply, eoozVar, eoqgVar), new ejvr() { // from class: dwbt
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        UUID uuid3 = uuid2;
                        dvhv.e("Backend", "response(requestId=" + String.valueOf(uuid3) + "): " + obj2.getClass().getSimpleName());
                        dvhv.a("Backend", a.H(obj2, uuid3, "response(requestId=", "): "));
                        return dwgkVar2.c(obj2);
                    }
                }, eoqgVar);
                return eork.b(listenableFutureF).b(new eooy() { // from class: dwbu
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        dwgk dwgkVar3 = dwgkVar2;
                        dwcm dwcmVar2 = dwcmVar;
                        ListenableFuture listenableFuture2 = listenableFutureF;
                        UUID uuid3 = uuid2;
                        SettableFuture settableFuture = settableFutureCreate;
                        long micros = settableFuture.isDone() ? TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - ((Long) settableFuture.q()).longValue()) : 0L;
                        try {
                            dwgkVar3.e(uuid3, eork.q(listenableFuture2), dwcmVar2.c, micros);
                            return listenableFuture2;
                        } catch (Exception e) {
                            dwgkVar3.d(uuid3, dwda.b().a(dwcmVar2.a, e.getCause()), Status.c(e.getCause()), dwcmVar2.c, micros);
                            return listenableFuture2;
                        }
                    }
                }, eoqgVar);
            }
        }, i, dvxfVar, z);
    }

    public final ListenableFuture a(final ListenableFuture listenableFuture, final dwpk dwpkVar) {
        return eork.n(new eooy() { // from class: dwcb
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final String strE;
                dwcm dwcmVar = this.a;
                ListenableFuture listenableFuture2 = listenableFuture;
                dwpk dwpkVar2 = dwpkVar;
                if (dwpkVar2.b() != dwpj.EMAIL) {
                    return listenableFuture2;
                }
                try {
                    cdpq cdpqVar = dwcmVar.g;
                    Account account = new Account(dwpkVar2.d(), "com.google");
                    try {
                        Context context = cdpqVar.a;
                        Bundle bundle = new Bundle();
                        int i = dbmj.a;
                        strE = dbmq.e(context, account, "oauth2:https://www.googleapis.com/auth/tachyon", bundle);
                    } catch (UserRecoverableAuthException e) {
                        cdpt.a.n("UserRecoverableAuthException in getOAuthToken.".concat(e.toString()));
                        strE = null;
                    }
                    if (TextUtils.isEmpty(strE)) {
                        throw new fbtf(Status.j.withDescription("Failed to generate OAuthToken"));
                    }
                    dwcmVar.f.put(dwpkVar2.d(), strE);
                    return eooq.f(listenableFuture2, new ejvr() { // from class: dwbx
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            dwco.a();
                            ejas ejasVar = new ejas(strE, null);
                            int i2 = ejav.b;
                            ejau ejauVar = new ejau();
                            ejauVar.a = ejasVar;
                            return new dwcn(((dwcn) obj).a.i(new fbtx(new ejav(ejauVar))));
                        }
                    }, eoqg.a);
                } catch (Exception e2) {
                    dbmi dbmiVar = new dbmi(e2);
                    if (e2 instanceof IOException) {
                        throw new fbtf(Status.o.d(dbmiVar));
                    }
                    throw new fbtf(Status.j.d(dbmiVar));
                }
            }
        }, eoqg.a);
    }

    public final ListenableFuture b(UUID uuid, dwgk dwgkVar, ListenableFuture listenableFuture, dwje dwjeVar, dvxf dvxfVar, boolean z) {
        return i(uuid, 0, dwgkVar, listenableFuture, dwjeVar.c().f(), dvxfVar, z, dwjeVar, null);
    }

    public final ListenableFuture c(final dwje dwjeVar, final dwpk dwpkVar, final eooz eoozVar, int i, dvxf dvxfVar, boolean z) {
        if (this.e == null) {
            return eork.h(new RuntimeException("tachyonRegistrationHandler is null"));
        }
        if (this.g == null) {
            return eork.h(new RuntimeException("oAuthTokenProvider is null"));
        }
        final ListenableFuture listenableFutureF = f(g(eoozVar), dwpkVar, felx.REGISTRATION_NOT_FOUND);
        if (z) {
            eorg eorgVarB = eork.b(listenableFutureF);
            eooy eooyVar = new eooy() { // from class: dwca
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    dwcm dwcmVar = this.a;
                    try {
                        eork.q(listenableFutureF);
                    } catch (Throwable th) {
                        if (Status.c(th).getCode() == Status.j.getCode()) {
                            dwpk dwpkVar2 = dwpkVar;
                            if (dwpkVar2.b() == dwpj.EMAIL) {
                                try {
                                    String str = (String) dwcmVar.f.remove(dwpkVar2.d());
                                    if (!TextUtils.isEmpty(str)) {
                                        try {
                                            Context context = dwcmVar.g.a;
                                            int i2 = dbmj.a;
                                            dbmq.f(context, str);
                                        } catch (Exception e) {
                                            cdpt.a.o("Exception in clearOAuthToken.", e);
                                        }
                                        return eork.i(true);
                                    }
                                } catch (Exception e2) {
                                    dwje dwjeVar2 = dwjeVar;
                                    dvhv.c("Backend", "Failed to clear OAuth token with Exception: ".concat(e2.toString()));
                                    dwhp dwhpVarR = dwhq.r();
                                    dwhpVarR.g(10024);
                                    dwhpVarR.n(dwpkVar2);
                                    if (dwjeVar2 != null) {
                                        dwhpVarR.o(dwjeVar2.d().E());
                                    }
                                    dwcmVar.c.b(dwhpVarR.a());
                                }
                            }
                        }
                    }
                    return eork.i(false);
                }
            };
            eoqg eoqgVar = eoqg.a;
            final ListenableFuture listenableFutureB = eorgVarB.b(eooyVar, eoqgVar);
            listenableFutureF = eork.b(listenableFutureB).b(new eooy() { // from class: dwbp
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    return ((Boolean) eork.q(listenableFutureB)).booleanValue() ? dwcm.g(eoozVar) : listenableFutureF;
                }
            }, eoqgVar);
        }
        if (i == 0 && dwjeVar != null) {
            eorg eorgVarB2 = eork.b(listenableFutureF);
            eooy eooyVar2 = new eooy() { // from class: dwcc
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    try {
                        eork.q(listenableFutureF);
                    } catch (Throwable th) {
                        if (Status.c(th).getCode() == Status.j.getCode()) {
                            return this.a.e.c(dwjeVar, true);
                        }
                    }
                    return eork.i(null);
                }
            };
            eoqg eoqgVar2 = eoqg.a;
            final ListenableFuture listenableFutureB2 = eorgVarB2.b(eooyVar2, eoqgVar2);
            final ListenableFuture listenableFutureA = eork.b(listenableFutureB2).a(new Callable() { // from class: dwcd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    try {
                        if (((dwju) eork.q(listenableFutureB2)) != null) {
                            return true;
                        }
                    } catch (Exception unused) {
                        dvhv.c("Backend", "Consume exception thrown during register refresh");
                    }
                    return false;
                }
            }, eoqgVar2);
            listenableFutureF = eork.b(listenableFutureA).b(new eooy() { // from class: dwbq
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    return ((Boolean) eork.q(listenableFutureA)).booleanValue() ? dwcm.g(eoozVar) : listenableFutureF;
                }
            }, eoqgVar2);
        } else if (i != 1 && i != 2) {
            return eork.h(new RuntimeException("Invalid RequestType: 0"));
        }
        if (((dvxd) ((dvxb) dvxfVar).a).a == 0) {
            return listenableFutureF;
        }
        final dwcj dwcjVar = new dwcj(this, dvxfVar, eoozVar);
        return eork.b(listenableFutureF).b(new eooy() { // from class: dwbn
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                ListenableFuture listenableFuture = listenableFutureF;
                try {
                    eork.q(listenableFuture);
                    return listenableFuture;
                } catch (Throwable th) {
                    dwcm dwcmVar = this.a;
                    Status statusC = Status.c(th);
                    if (!dvxm.a(statusC)) {
                        dvhv.a("RetryManager", "Non retryable error, Retry Category:CLIENT_BLOCKING_RPC Status:".concat(String.valueOf(String.valueOf(statusC))));
                        return listenableFuture;
                    }
                    dvxm dvxmVar = dwcmVar.b;
                    dwcj dwcjVar2 = dwcjVar;
                    SettableFuture settableFutureCreate = SettableFuture.create();
                    eork.r(listenableFuture, new dvxl(dvxmVar, dwcjVar2, settableFutureCreate), eoqg.a);
                    return settableFutureCreate;
                }
            }
        }, eoqg.a);
    }

    public final ListenableFuture d(UUID uuid, dwgk dwgkVar, ListenableFuture listenableFuture, dwpk dwpkVar, dvxf dvxfVar, boolean z) {
        return i(uuid, 1, dwgkVar, listenableFuture, dwpkVar, dvxfVar, z, null, null);
    }

    public final ListenableFuture e(final UUID uuid, final ejvr ejvrVar, final dwje dwjeVar) {
        eooy eooyVar = new eooy() { // from class: dwci
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return this.a.e.c(dwjeVar, false);
            }
        };
        eoqg eoqgVar = eoqg.a;
        final ListenableFuture listenableFutureN = eork.n(eooyVar, eoqgVar);
        return eork.d(listenableFutureN).b(new eooy() { // from class: dwbo
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                dwju dwjuVar = (dwju) eork.q(listenableFutureN);
                if (dwjuVar == null) {
                    return eork.h(new StatusException(Status.j));
                }
                dwje dwjeVar2 = dwjeVar;
                UUID uuid2 = uuid;
                ejvr ejvrVar2 = ejvrVar;
                ezpo ezpoVarB = dwcy.b(this.a.a, eomt.c(dwjuVar.c()), uuid2);
                ezol ezolVarC = dweb.c(dwjeVar2.c().f());
                ezpoVarB.copyOnWrite();
                ezpp ezppVar = (ezpp) ezpoVarB.instance;
                ezpp ezppVar2 = ezpp.a;
                ezolVarC.getClass();
                ezppVar.h = ezolVarC;
                ezppVar.b |= 2;
                return (ListenableFuture) ejvrVar2.apply((ezpp) ezpoVarB.build());
            }
        }, eoqgVar);
    }

    public final ListenableFuture f(final ListenableFuture listenableFuture, final dwpk dwpkVar, final felx felxVar) {
        return eork.b(listenableFuture).b(new eooy() { // from class: dwby
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                ListenableFuture listenableFuture2 = listenableFuture;
                try {
                    eork.q(listenableFuture2);
                    return listenableFuture2;
                } catch (Throwable th) {
                    if (dwda.b().c(th) == felxVar) {
                        dwpk dwpkVar2 = dwpkVar;
                        dwcm dwcmVar = this.a;
                        dvhv.f("Backend", "Registration was not found. This was likely deleted from a Tachyon Janitor job or Unregistered previously.");
                        dwcmVar.e.d(dwpkVar2);
                    }
                    return listenableFuture2;
                }
            }
        }, eoqg.a);
    }

    protected final void finalize() {
        dwdf dwdfVar = this.d;
        if (dwdfVar.c != null) {
            dwdfVar.a.unregisterReceiver(dwdfVar.b);
            try {
                fbnd fbndVar = dwdfVar.c;
                if (fbndVar instanceof fbqm) {
                    ((fbqm) fbndVar).d();
                }
            } catch (Exception e) {
                dvhv.d("StubFactory", "Failed to shutdown", e);
            }
        }
    }

    public final ListenableFuture h(UUID uuid, dwgk dwgkVar, ListenableFuture listenableFuture, dwje dwjeVar, dwju dwjuVar, dvxf dvxfVar) {
        return i(uuid, 2, dwgkVar, listenableFuture, dwjeVar.c().f(), dvxfVar, true, dwjeVar, dwjuVar);
    }
}
