package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.StatFs;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dure {
    public final Context a;
    public final ejxr b;
    public final ecev c;
    public final duvt d;
    public final ejwi e;
    public final duru f;
    public final Executor g;
    public final dtpi h;
    final HashMap i = new HashMap();
    private final dutv j;

    public dure(Context context, ejxr ejxrVar, ecev ecevVar, duvt duvtVar, ejwi ejwiVar, duru duruVar, Executor executor, dtpi dtpiVar) {
        this.a = context;
        this.b = ejxrVar;
        this.c = ecevVar;
        this.d = duvtVar;
        this.e = ejwiVar;
        this.f = duruVar;
        this.g = executor;
        this.h = dtpiVar;
        this.j = dutv.a(executor);
    }

    public static void e(Context context, String str, long j, dtrk dtrkVar, dtpi dtpiVar) throws dtox {
        float fMin;
        if (dtpiVar.N()) {
            if (dutx.h(str, new ekph("inlinefile")) && j == 0) {
                return;
            }
            StatFs statFs = new StatFs(context.getFilesDir().getAbsolutePath());
            long blockCount = statFs.getBlockCount();
            long blockSize = statFs.getBlockSize();
            long availableBlocks = statFs.getAvailableBlocks();
            long blockSize2 = statFs.getBlockSize();
            float f = blockCount * blockSize;
            double dMin = Math.min(dtpiVar.a() * f, dtpiVar.b());
            if (dtrkVar != null) {
                int iA = dtrj.a(dtrkVar.c);
                if (iA == 0) {
                    iA = 1;
                }
                int i = iA - 1;
                if (i == 1) {
                    fMin = Math.min(f * dtpiVar.a(), dtpiVar.d());
                } else if (i == 2) {
                    fMin = Math.min(f * dtpiVar.a(), dtpiVar.c());
                }
                dMin = fMin;
            }
            Long.signum(availableBlocks);
            if ((availableBlocks * blockSize2) - j > dMin) {
                return;
            }
            dtov dtovVarA = dtox.a();
            dtovVarA.a = dtow.LOW_DISK_ERROR;
            throw dtovVarA.a();
        }
    }

    public final ListenableFuture a(final String str, final Uri uri, final durd durdVar, eooz eoozVar) {
        ListenableFuture listenableFutureB;
        final eosa eosaVar = new eosa(new Callable() { // from class: duqw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        });
        dvaq dvaqVarE = dvaq.e(eosaVar);
        Executor executor = this.g;
        final dvaq dvaqVarD = dvaqVarE.g(eoozVar, executor).g(new eooz() { // from class: duqx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return durdVar.a(uri);
            }
        }, executor).d(Exception.class, new eooz() { // from class: duqy
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dtox dtoxVarA;
                final Exception exc = (Exception) obj;
                if (exc instanceof dtox) {
                    dtoxVarA = (dtox) exc;
                } else {
                    dtov dtovVarA = dtox.a();
                    dtovVarA.c = exc;
                    dtovVarA.a = dtow.UNKNOWN_ERROR;
                    dtoxVarA = dtovVarA.a();
                }
                return eika.k(durdVar.b(dtoxVarA), new eooz() { // from class: duqu
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) throws Exception {
                        throw exc;
                    }
                }, this.a.g);
            }
        }, executor);
        if (this.h.F()) {
            listenableFutureB = this.j.b(str, dvaqVarD);
        } else {
            this.i.put(uri, dvaqVarD);
            listenableFutureB = eorv.a;
        }
        dvaq dvaqVarG = dvaq.e(listenableFutureB).g(new eooz() { // from class: duqz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eosaVar.run();
                return dvaqVarD;
            }
        }, executor);
        dvaqVarG.b(new Runnable() { // from class: dura
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c(str, uri);
            }
        }, executor);
        return dvaqVarG;
    }

    public final ListenableFuture b(String str, Uri uri) {
        return !this.h.F() ? eork.i(ejwi.i((ListenableFuture) this.i.get(uri))) : this.j.d(str);
    }

    public final ListenableFuture c(String str, Uri uri) {
        if (this.h.F()) {
            return this.j.e(str);
        }
        ListenableFuture listenableFuture = (ListenableFuture) this.i.remove(uri);
        return listenableFuture != null ? listenableFuture : eorv.a;
    }

    public final ListenableFuture d(final String str, final dtrw dtrwVar, final int i, final long j, final String str2, final Uri uri, final String str3, final long j2, final dtrk dtrkVar, final durd durdVar, final int i2, final List list, final evqe evqeVar) {
        return eika.k(b(str, uri), new eooz() { // from class: duqs
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ejwi ejwiVar = (ejwi) obj;
                if (ejwiVar.g()) {
                    return (ListenableFuture) ejwiVar.c();
                }
                final evqe evqeVar2 = evqeVar;
                final List list2 = list;
                final int i3 = i2;
                final dtrk dtrkVar2 = dtrkVar;
                final long j3 = j2;
                final String str4 = str3;
                final String str5 = str2;
                final long j4 = j;
                final int i4 = i;
                final dtrw dtrwVar2 = dtrwVar;
                durd durdVar2 = durdVar;
                final Uri uri2 = uri;
                String str6 = str;
                final dure dureVar = this.a;
                return dureVar.a(str6, uri2, durdVar2, new eooz() { // from class: durc
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        long jA;
                        int iA;
                        String str7 = str4;
                        dure dureVar2 = dureVar;
                        Uri uri3 = uri2;
                        long j5 = j3;
                        dtrk dtrkVar3 = dtrkVar2;
                        if (str7.startsWith("http") && dureVar2.h.B() && !str7.startsWith("https")) {
                            durt.h("%s: File url = %s is not secure", "MddFileDownloader", str7);
                            dtov dtovVarA = dtox.a();
                            dtovVarA.a = dtow.INSECURE_URL_ERROR;
                            return eork.h(dtovVarA.a());
                        }
                        try {
                            jA = dureVar2.c.a(uri3);
                        } catch (IOException unused) {
                            jA = 0;
                        }
                        try {
                            dure.e(dureVar2.a, str7, j5 - jA, dtrkVar3, dureVar2.h);
                            dtrw dtrwVar3 = dtrwVar2;
                            if (dureVar2.h.P()) {
                                int i5 = i4;
                                long j6 = j4;
                                String str8 = str5;
                                duvt duvtVar = dureVar2.d;
                                duru duruVar = dureVar2.f;
                                dtrn dtrnVar = (dtrn) dtro.a.createBuilder();
                                dtrnVar.copyOnWrite();
                                dtro dtroVar = (dtro) dtrnVar.instance;
                                dtrwVar3.getClass();
                                dtroVar.c = dtrwVar3;
                                dtroVar.b |= 1;
                                dtrnVar.copyOnWrite();
                                dtro dtroVar2 = (dtro) dtrnVar.instance;
                                dtroVar2.b |= 2;
                                dtroVar2.d = j6;
                                dtrnVar.copyOnWrite();
                                dtro dtroVar3 = (dtro) dtrnVar.instance;
                                str8.getClass();
                                dtroVar3.b |= 4;
                                dtroVar3.e = str8;
                                dtrnVar.copyOnWrite();
                                dtro dtroVar4 = (dtro) dtrnVar.instance;
                                dtroVar4.b |= 8;
                                dtroVar4.f = i5;
                                dtro dtroVar5 = (dtro) dtrnVar.build();
                                synchronized (duvtVar.b) {
                                    HashMap map = duvtVar.c;
                                    if (!map.containsKey(dtroVar5)) {
                                        duvs duvsVar = new duvs(duvtVar.a, duruVar, dtroVar5);
                                        final duag duagVar = duvtVar.e;
                                        map.put(dtroVar5, new ecgv(duvsVar, new ecgt() { // from class: duvq
                                            @Override // defpackage.ecgt
                                            public final long a() {
                                                return duagVar.a();
                                            }
                                        }, 10L, TimeUnit.SECONDS));
                                    }
                                    duvtVar.d.put(uri3, (ecgv) map.get(dtroVar5));
                                }
                            } else {
                                durt.n("%s: NetworkUsageMonitor is disabled", "MddFileDownloader");
                            }
                            ejwi ejwiVar2 = dureVar2.e;
                            if (ejwiVar2.g()) {
                                duvp duvpVar = (duvp) ejwiVar2.c();
                                String str9 = dtrwVar3.c;
                                synchronized (duvp.class) {
                                    duvpVar.b.put(uri3, str9);
                                }
                            }
                            dtzm dtzmVarH = dtzn.h();
                            dtzmVarH.g(uri3);
                            dtzmVarH.i(str7);
                            if (dtrkVar3 == null || (iA = dtrh.a(dtrkVar3.d)) == 0 || iA != 2) {
                                dtzmVarH.e(dtzl.b);
                            } else {
                                dtzmVarH.e(dtzl.c);
                            }
                            int i6 = i3;
                            if (i6 > 0) {
                                dtzmVarH.h(i6);
                            }
                            List<dtrm> list3 = list2;
                            int i7 = ekgb.d;
                            ekfw ekfwVar = new ekfw();
                            for (dtrm dtrmVar : list3) {
                                ekfwVar.h(Pair.create(dtrmVar.b, dtrmVar.c));
                            }
                            evqe evqeVar3 = evqeVar2;
                            dtzmVarH.f(ekfwVar.g());
                            dtzmVarH.d(evqeVar3);
                            return ((dtzo) dureVar2.b.get()).b(dtzmVarH.j());
                        } catch (dtox e) {
                            durt.h("%s: Not enough space to download file %s", "MddFileDownloader", str7);
                            return eork.h(e);
                        }
                    }
                });
            }
        }, this.g);
    }

    public final void f(final String str, final Uri uri) {
        eika.k(b(str, uri), new eooz() { // from class: duqt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ejwi ejwiVar = (ejwi) obj;
                if (!ejwiVar.g()) {
                    durt.n("%s: stopDownloading on non-existent download", "MddFileDownloader");
                    return eorv.a;
                }
                String str2 = str;
                Uri uri2 = uri;
                dure dureVar = this.a;
                durt.c("%s: Cancel download file %s", "MddFileDownloader", uri2);
                ((ListenableFuture) ejwiVar.c()).cancel(true);
                return dureVar.c(str2, uri2);
            }
        }, this.g);
    }
}
