package defpackage;

import android.net.Uri;
import com.android.vcard.VCardConstants;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duuo implements echr {
    public final AtomicLong a = new AtomicLong();
    final /* synthetic */ duup b;
    public final bxov c;
    private final Uri d;
    private long e;

    public duuo(duup duupVar, Uri uri, bxov bxovVar) {
        this.b = duupVar;
        this.d = uri;
        this.c = bxovVar;
        this.e = duupVar.c.a();
    }

    @Override // defpackage.echr
    public final void a(int i) {
        duup duupVar = this.b;
        duag duagVar = duupVar.c;
        long j = i;
        if (duagVar.a() - this.e < 1000) {
            AtomicLong atomicLong = this.a;
            atomicLong.getAndAdd(j);
            durt.m("%s: Received data for uri = %s, len = %d, Counter = %d", "DownloadProgressMonitor", this.d, Long.valueOf(j), Long.valueOf(atomicLong.get()));
            return;
        }
        synchronized (duup.class) {
            this.e = duagVar.a();
            AtomicLong atomicLong2 = this.a;
            atomicLong2.getAndAdd(j);
            Uri uri = this.d;
            durt.m("%s: Received data for uri = %s, len = %d, Counter = %d", "DownloadProgressMonitor", uri, Long.valueOf(j), Long.valueOf(atomicLong2.get()));
            if (duupVar.b.containsKey(uri)) {
                duupVar.a.execute(new Runnable() { // from class: duun
                    @Override // java.lang.Runnable
                    public final void run() {
                        duuo duuoVar = this.a;
                        final long j2 = duuoVar.a.get();
                        cqbd cqbdVarC = bxox.a.c();
                        cqbdVarC.I("Download progress, notifying callback");
                        bxov bxovVar = duuoVar.c;
                        final Uri uri2 = bxovVar.c;
                        cqbdVarC.M(VCardConstants.PROPERTY_URL, uri2.toString());
                        cqbdVarC.z("progress", j2);
                        final long j3 = bxovVar.e;
                        cqbdVarC.z("expected size", j3);
                        cqbdVarC.r();
                        bxor bxorVar = bxovVar.b;
                        try {
                            for (final bxqj bxqjVar : ((bxpo) bxorVar).b) {
                                ((bxpo) bxorVar).c(new Runnable() { // from class: bxpm
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        long j4 = j2;
                                        bxqj bxqjVar2 = bxqjVar;
                                        Uri uri3 = uri2;
                                        try {
                                            bxqjVar2.c(uri3.toString(), j4, j3);
                                        } catch (RuntimeException e) {
                                            bxpo.a.s("Error while calling #onProgress", e);
                                        }
                                    }
                                });
                            }
                        } catch (RuntimeException e) {
                            cqbd cqbdVarB = bxox.a.b();
                            cqbdVarB.I("Download callback onProgress error");
                            cqbdVarB.s(e);
                        }
                    }
                });
            }
        }
    }

    @Override // defpackage.echr, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }
}
