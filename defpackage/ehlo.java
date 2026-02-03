package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehlo {
    public final Context a;
    public final ebbw b;
    public final Map c;
    public final eosc d;
    public final eygg e;
    public final fcsu f;
    public final fcsu g;
    public final boolean h;
    public final Map i;
    private final Map j;

    public ehlo(Context context, ebbw ebbwVar, Map map, Map map2, eosc eoscVar, eygg eyggVar, fcsu fcsuVar, fcsu fcsuVar2) {
        context.getClass();
        eoscVar.getClass();
        eyggVar.getClass();
        fcsuVar.getClass();
        this.a = context;
        this.b = ebbwVar;
        this.j = map;
        this.c = map2;
        this.d = eoscVar;
        this.e = eyggVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        if (!fcva.as(((ekgp) map).keySet(), ((ekgp) map2).keySet()).isEmpty()) {
            Set setAs = fcva.as(((ekgp) map).keySet(), ((ekgp) map2).keySet());
            Objects.toString(setAs);
            throw new IllegalStateException("Don't provide both an unannotated and @AllProcessesStartupAfterPackageReplacedListener StartupAfterPackageReplacedListener provider for keys ".concat(setAs.toString()));
        }
        Boolean bool = false;
        bool.getClass();
        this.h = false;
        this.i = ebbwVar.a() ? fcwa.j(map, map2) : map2;
    }

    public static final int b(RandomAccessFile randomAccessFile) throws IOException {
        int i;
        try {
            i = randomAccessFile.readInt();
        } catch (EOFException unused) {
            i = -1;
        } catch (Throwable th) {
            randomAccessFile.seek(0L);
            throw th;
        }
        randomAccessFile.seek(0L);
        return i;
    }

    public final void a(final boolean z) throws IOException {
        eieu eieuVarH = eiiy.h("StartupAfterPackageReplaced");
        try {
            ListenableFuture listenableFutureI = eika.i(new eooy() { // from class: ehlk
                /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
                @Override // defpackage.eooy
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a() throws java.io.IOException {
                    /*
                        r7 = this;
                        ehlo r0 = r7.a
                        fcsu r1 = r0.g     // Catch: java.io.IOException -> La1
                        java.lang.Object r1 = r1.b()     // Catch: java.io.IOException -> La1
                        r1.getClass()     // Catch: java.io.IOException -> La1
                        android.content.pm.PackageInfo r1 = (android.content.pm.PackageInfo) r1     // Catch: java.io.IOException -> La1
                        int r2 = r1.versionCode     // Catch: java.io.IOException -> La1
                        android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch: java.io.IOException -> La1
                        if (r1 == 0) goto L99
                        java.lang.String r1 = r1.dataDir     // Catch: java.io.IOException -> La1
                        if (r1 == 0) goto L99
                        java.io.File r3 = new java.io.File     // Catch: java.io.IOException -> La1
                        java.lang.String r4 = "files"
                        r3.<init>(r1, r4)     // Catch: java.io.IOException -> La1
                        java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> La1
                        java.lang.String r4 = "tiktok"
                        r1.<init>(r3, r4)     // Catch: java.io.IOException -> La1
                        r1.mkdirs()     // Catch: java.io.IOException -> La1
                        java.io.File r3 = new java.io.File     // Catch: java.io.IOException -> La1
                        ebbw r4 = r0.b     // Catch: java.io.IOException -> La1
                        boolean r4 = r4.a()     // Catch: java.io.IOException -> La1
                        r5 = 0
                        if (r4 == 0) goto L38
                        java.lang.String r4 = defpackage.ehln.a(r5)     // Catch: java.io.IOException -> La1
                        goto L42
                    L38:
                        android.content.Context r4 = r0.a     // Catch: java.io.IOException -> La1
                        java.lang.String r4 = defpackage.ebbu.a(r4)     // Catch: java.io.IOException -> La1
                        java.lang.String r4 = defpackage.ehln.a(r4)     // Catch: java.io.IOException -> La1
                    L42:
                        r3.<init>(r1, r4)     // Catch: java.io.IOException -> La1
                        boolean r1 = r3.createNewFile()     // Catch: java.io.IOException -> La1
                        boolean r4 = r3.exists()     // Catch: java.io.IOException -> La1
                        if (r4 == 0) goto L91
                        boolean r4 = r3.isFile()     // Catch: java.io.IOException -> La1
                        if (r4 == 0) goto L91
                        java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> La1
                        java.lang.String r6 = "rw"
                        r4.<init>(r3, r6)     // Catch: java.io.IOException -> La1
                        if (r1 != 0) goto L6a
                        int r1 = defpackage.ehlo.b(r4)     // Catch: java.lang.Throwable -> L8c
                        if (r2 == r1) goto L65
                        goto L6a
                    L65:
                        r4.close()     // Catch: java.io.IOException -> La1
                        r1 = r5
                        goto L73
                    L6a:
                        r1 = -1
                        defpackage.ehln.b(r4, r1)     // Catch: java.lang.Throwable -> L8c
                        ehlm r1 = new ehlm     // Catch: java.lang.Throwable -> L8c
                        r1.<init>()     // Catch: java.lang.Throwable -> L8c
                    L73:
                        if (r1 != 0) goto L7a
                        com.google.common.util.concurrent.ListenableFuture r0 = defpackage.eork.i(r5)     // Catch: java.io.IOException -> La1
                        return r0
                    L7a:
                        eygg r2 = r0.e     // Catch: java.io.IOException -> La1
                        java.lang.Object r2 = r2.b()     // Catch: java.io.IOException -> La1
                        egoc r2 = (defpackage.egoc) r2     // Catch: java.io.IOException -> La1
                        eosc r3 = r0.d     // Catch: java.io.IOException -> La1
                        com.google.common.util.concurrent.ListenableFuture r1 = defpackage.eika.h(r1, r3)     // Catch: java.io.IOException -> La1
                        r2.h(r1)     // Catch: java.io.IOException -> La1
                        return r1
                    L8c:
                        r1 = move-exception
                        r4.close()     // Catch: java.io.IOException -> La1
                        throw r1     // Catch: java.io.IOException -> La1
                    L91:
                        java.io.IOException r1 = new java.io.IOException     // Catch: java.io.IOException -> La1
                        java.lang.String r2 = "Something went wrong creating file to store package version. Will not run package replaced listeners. Will try again on next startup."
                        r1.<init>(r2)     // Catch: java.io.IOException -> La1
                        throw r1     // Catch: java.io.IOException -> La1
                    L99:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> La1
                        java.lang.String r2 = "PackageInfo was invalid."
                        r1.<init>(r2)     // Catch: java.io.IOException -> La1
                        throw r1     // Catch: java.io.IOException -> La1
                    La1:
                        r1 = move-exception
                        boolean r2 = r2
                        java.lang.String r3 = "StartupAfterPkgReplaced"
                        if (r2 == 0) goto Lbe
                        android.content.Context r2 = r0.a
                        boolean r4 = defpackage.dqyw.h(r2)
                        if (r4 != 0) goto Lb5
                        java.lang.String r4 = "StartupAfterPackageReplaced failed, device was locked. Will reschedule."
                        android.util.Log.w(r3, r4, r1)
                    Lb5:
                        ehll r1 = new ehll
                        r1.<init>()
                        defpackage.dqyw.c(r2, r1)
                        goto Lc3
                    Lbe:
                        java.lang.String r0 = "StartupAfterPackageReplaced failed, will try again next startup: "
                        android.util.Log.e(r3, r0, r1)
                    Lc3:
                        com.google.common.util.concurrent.ListenableFuture r0 = defpackage.eorv.a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ehlk.a():com.google.common.util.concurrent.ListenableFuture");
                }
            }, this.d);
            egoc egocVar = (egoc) this.e.b();
            eieuVarH.b(listenableFutureI);
            egocVar.f(listenableFutureI, 30L, TimeUnit.SECONDS);
            fczl.a(eieuVarH, null);
        } finally {
        }
    }
}
