package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eafm {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public final ejxr c;
    public final ejxr d;
    public final ejxr e;
    public final ejxr f;
    public final Uri g;
    public volatile eaau h;
    public final Uri i;
    public volatile eaax j;
    private final Context k;
    private final ejxr l;

    public eafm(Context context, final ejxr ejxrVar, ejxr ejxrVar2, ejxr ejxrVar3) {
        this.k = context;
        this.d = ejxrVar;
        this.c = ejxrVar3;
        this.e = ejxrVar2;
        Pattern pattern = ecfb.a;
        ecfa ecfaVar = new ecfa(context);
        ecfaVar.f("phenotype_storage_info");
        ecfaVar.g("storage-info.pb");
        this.g = ecfaVar.a();
        ecfa ecfaVar2 = new ecfa(context);
        ecfaVar2.f("phenotype_storage_info");
        ecfaVar2.g("device-encrypted-storage-info.pb");
        int i = dqyw.a;
        ecfaVar2.d();
        this.i = ecfaVar2.a();
        this.f = ejxx.a(new ejxr() { // from class: eafj
            @Override // defpackage.ejxr
            public final Object get() {
                final eafm eafmVar = this.a;
                eosd eosdVar = (eosd) eafmVar.d.get();
                eosdVar.getClass();
                eaaa eaaaVar = (eaaa) eafmVar.c.get();
                eaaaVar.getClass();
                final ListenableFuture listenableFutureF = eooq.f(eooh.f(eoqt.t(eaaaVar.e()), eaab.class, new ejvr() { // from class: eaff
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        eaab eaabVar = (eaab) obj;
                        if (eaabVar.a != 29514) {
                            throw eaabVar;
                        }
                        eaba eabaVar = (eaba) eabb.a.createBuilder();
                        eaat eaatVar = (eaat) eaau.b.createBuilder();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        eaatVar.copyOnWrite();
                        eaau eaauVar = (eaau) eaatVar.instance;
                        eaauVar.c |= 8;
                        eaauVar.g = jCurrentTimeMillis;
                        eabaVar.copyOnWrite();
                        eabb eabbVar = (eabb) eabaVar.instance;
                        eaau eaauVar2 = (eaau) eaatVar.build();
                        eaauVar2.getClass();
                        eabbVar.c = eaauVar2;
                        eabbVar.b |= 1;
                        return (eabb) eabaVar.build();
                    }
                }, eosdVar), new ejvr() { // from class: eafg
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        eabb eabbVar = (eabb) obj;
                        ecfo ecfoVar = new ecfo();
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                        eafm eafmVar2 = eafmVar;
                        try {
                            try {
                                synchronized (eafm.a) {
                                    ecev ecevVar = (ecev) eafmVar2.e.get();
                                    Uri uri = eafmVar2.g;
                                    eaau eaauVar = eabbVar.c;
                                    if (eaauVar == null) {
                                        eaauVar = eaau.b;
                                    }
                                    echl echlVar = new echl(eaauVar);
                                    echlVar.a = new ecfo[]{ecfoVar};
                                    ecevVar.c(uri, echlVar);
                                    eaau eaauVar2 = eabbVar.c;
                                    if (eaauVar2 == null) {
                                        eaauVar2 = eaau.b;
                                    }
                                    eafmVar2.h = eaauVar2;
                                }
                                synchronized (eafm.b) {
                                    ecev ecevVar2 = (ecev) eafmVar2.e.get();
                                    Uri uri2 = eafmVar2.i;
                                    eaax eaaxVar = eabbVar.d;
                                    if (eaaxVar == null) {
                                        eaaxVar = eaax.b;
                                    }
                                    echl echlVar2 = new echl(eaaxVar);
                                    echlVar2.a = new ecfo[]{ecfoVar};
                                    ecevVar2.c(uri2, echlVar2);
                                    eaax eaaxVar2 = eabbVar.d;
                                    if (eaaxVar2 == null) {
                                        eaaxVar2 = eaax.b;
                                    }
                                    eafmVar2.j = eaaxVar2;
                                }
                                StrictMode.setThreadPolicy(threadPolicy);
                                return null;
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th;
                        }
                    }
                }, eosdVar);
                listenableFutureF.b(new Runnable() { // from class: eafh
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            eork.q(listenableFutureF);
                        } catch (Exception e) {
                            if (Log.isLoggable("StorageInfoHandler", 3)) {
                                Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e);
                            }
                        }
                    }
                }, eosdVar);
                return listenableFutureF;
            }
        });
        this.l = ejxx.a(new ejxr() { // from class: eafk
            @Override // defpackage.ejxr
            public final Object get() {
                eosd eosdVar = (eosd) ejxrVar.get();
                eosdVar.getClass();
                return eosdVar.schedule(new Callable() { // from class: eafl
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return null;
                    }
                }, 10000L, TimeUnit.MILLISECONDS);
            }
        });
    }

    private final eaau d() {
        eaau eaauVar;
        eaau eaauVar2 = this.h;
        if (eaauVar2 != null) {
            return eaauVar2;
        }
        synchronized (a) {
            eaauVar = this.h;
            if (eaauVar == null) {
                eaauVar = eaau.b;
                if (dqyw.h(this.k)) {
                    echg echgVarB = echg.b(eaauVar);
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        eaau eaauVar3 = (eaau) ((ecev) this.e.get()).c(this.g, echgVarB);
                        StrictMode.setThreadPolicy(threadPolicy);
                        eaauVar = eaauVar3;
                    } catch (IOException unused) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th;
                    }
                    this.h = eaauVar;
                }
            }
        }
        return eaauVar;
    }

    private final ListenableFuture e(boolean z) {
        eosd eosdVar = (eosd) this.d.get();
        eosdVar.getClass();
        return eooq.g(eoqt.t(z ? eork.j((ListenableFuture) this.l.get()) : eorv.a), new eooz() { // from class: eafi
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return eork.j((ListenableFuture) this.a.f.get());
            }
        }, eosdVar);
    }

    public final eaet a(boolean z) {
        boolean z2;
        ekgb ekgbVarN;
        evqs evqsVar;
        String str;
        ekgb ekgbVarN2;
        ekgb ekgbVarN3;
        int i;
        boolean z3;
        boolean z4;
        String str2 = "";
        if (z) {
            eaax eaaxVar = this.j;
            if (eaaxVar == null) {
                synchronized (b) {
                    eaaxVar = this.j;
                    if (eaaxVar == null) {
                        eaaxVar = eaax.b;
                        echg echgVarB = echg.b(eaaxVar);
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                        try {
                            eaax eaaxVar2 = (eaax) ((ecev) this.e.get()).c(this.i, echgVarB);
                            StrictMode.setThreadPolicy(threadPolicy);
                            eaaxVar = eaaxVar2;
                        } catch (IOException unused) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th;
                        }
                        this.j = eaaxVar;
                    }
                }
            }
            z2 = eaaxVar.e;
            ekgbVarN = ekgb.n(new evsz(eaaxVar.i, eaax.a));
            evqsVar = eaaxVar.d;
            str = eaaxVar.f;
            ekgbVarN2 = ekgb.n(eaaxVar.g);
            ekgbVarN3 = ekgb.n(eaaxVar.h);
            if ((eaaxVar.c & 8) != 0) {
                eaaz eaazVar = eaaxVar.j;
                if (eaazVar == null) {
                    eaazVar = eaaz.a;
                }
                if (eaazVar.c == Build.VERSION.SDK_INT) {
                    eaaz eaazVar2 = eaaxVar.j;
                    if (eaazVar2 == null) {
                        eaazVar2 = eaaz.a;
                    }
                    str2 = eaazVar2.b;
                }
            }
            i = eaaxVar.c & 1;
            z3 = eaaxVar.l;
            z4 = eaaxVar.k;
        } else {
            eaau eaauVarD = d();
            z2 = eaauVarD.e;
            ekgbVarN = ekgb.n(new evsz(eaauVarD.j, eaau.a));
            evqsVar = eaauVarD.d;
            str = eaauVarD.f;
            ekgbVarN2 = ekgb.n(eaauVarD.h);
            ekgbVarN3 = ekgb.n(eaauVarD.i);
            if ((eaauVarD.c & 16) != 0) {
                eaaz eaazVar3 = eaauVarD.k;
                if (eaazVar3 == null) {
                    eaazVar3 = eaaz.a;
                }
                if (eaazVar3.c == Build.VERSION.SDK_INT) {
                    eaaz eaazVar4 = eaauVarD.k;
                    if (eaazVar4 == null) {
                        eaazVar4 = eaaz.a;
                    }
                    str2 = eaazVar4.b;
                }
            }
            i = eaauVarD.c & 1;
            z3 = eaauVarD.m;
            z4 = eaauVarD.l;
        }
        return new eaet(z2, ekgbVarN, evqsVar, str, str2, ekgbVarN2, ekgbVarN3, 1 == i, z3, z4);
    }

    public final ListenableFuture b() {
        return e(false);
    }

    public final void c() {
        if (!dqyw.g(this.k) && d().g + TimeUnit.HOURS.toMillis(24L) < System.currentTimeMillis()) {
            e(true);
        } else {
            ListenableFuture listenableFuture = eorv.a;
        }
    }
}
