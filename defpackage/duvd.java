package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duvd implements duut {
    public final Executor a;
    public final ejwi b;
    public final ejxr c;
    final dutv d;
    final dutv e;

    public duvd(Context context, ejwi ejwiVar, Executor executor, ejwi ejwiVar2, ejxr ejxrVar) {
        this.a = executor;
        this.b = ejwiVar2;
        this.c = ejxrVar;
        this.d = dutv.a(executor);
        this.e = new dutv(executor, new duvc(ejwiVar, context));
    }

    private final ListenableFuture c(final String str) {
        return eika.k(this.e.c(str), new eooz() { // from class: duuz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                duvd duvdVar = this.a;
                return (zBooleanValue ? duvdVar.e : duvdVar.d).d(str);
            }
        }, this.a);
    }

    @Override // defpackage.duut
    public final ListenableFuture a(final duur duurVar) {
        Uri uri = ((duum) duurVar).a;
        durt.c("%s: download for Uri = %s", "DownloaderImp", uri.toString());
        int i = elcz.a;
        elcv elcvVarF = elcx.a.f();
        elcvVarF.l(uri.toString());
        elcvVarF.l("|");
        final duaa duaaVar = new duaa(2, elcvVarF.r().toString());
        return eika.k(c(duaaVar.a), new eooz() { // from class: duuv
            /* JADX WARN: Type inference failed for: r3v3, types: [duve, java.lang.Object] */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ejwi ejwiVar = (ejwi) obj;
                if (ejwiVar.g()) {
                    return (ListenableFuture) ejwiVar.c();
                }
                final duur duurVar2 = duurVar;
                final duvd duvdVar = this.a;
                duum duumVar = (duum) duurVar2;
                ejwi ejwiVar2 = duumVar.d;
                if (ejwiVar2.g()) {
                    ejwi ejwiVar3 = duvdVar.b;
                    if (ejwiVar3.g()) {
                        ejwiVar3.c().g(duumVar.a, (bxov) ejwiVar2.c());
                    } else {
                        durt.n("%s: download request included DownloadListener, but DownloadMonitor is not present! DownloadListener will only be invoked for complete/failure.", "DownloaderImp");
                    }
                }
                duab duabVar = duaaVar;
                final eosa eosaVar = new eosa(new Callable() { // from class: duuw
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return null;
                    }
                });
                eooz eoozVar = new eooz() { // from class: duux
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        duum duumVar2 = (duum) duurVar2;
                        Uri uri2 = duumVar2.a;
                        dtzm dtzmVarH = dtzn.h();
                        dtzmVarH.g(uri2);
                        dtzmVarH.e(duumVar2.c);
                        dtzmVarH.i(duumVar2.b);
                        dtzmVarH.f(duumVar2.f);
                        dtzmVarH.h(duumVar2.e);
                        dtzmVarH.d(duumVar2.g);
                        try {
                            return ((dtzo) duvdVar.c.get()).b(dtzmVarH.j());
                        } catch (RuntimeException e) {
                            dtov dtovVarA = dtox.a();
                            dtovVarA.a = dtow.UNKNOWN_ERROR;
                            dtovVarA.c = e;
                            return eork.h(dtovVarA.a());
                        }
                    }
                };
                Executor executor = duvdVar.a;
                final ListenableFuture listenableFutureK = eika.k(eosaVar, eoozVar, executor);
                eika.l(listenableFutureK, new duvb(duvdVar, duurVar2, duabVar), eoqg.a);
                return eika.k(duvdVar.d.b(((duaa) duabVar).a, listenableFutureK), new eooz() { // from class: duuy
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        eosaVar.run();
                        return listenableFutureK;
                    }
                }, executor);
            }
        }, this.a);
    }

    @Override // defpackage.duut
    public final void b(final String str) {
        durt.c("%s: CancelForegroundDownload for Uri = %s", "DownloaderImp", str);
        eika.k(c(str), new eooz() { // from class: duuu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ejwi ejwiVar = (ejwi) obj;
                if (ejwiVar.g()) {
                    durt.l("%s: CancelForegroundDownload future found for key = %s, cancelling...", "DownloaderImp", str);
                    ((ListenableFuture) ejwiVar.c()).cancel(false);
                }
                return eorv.a;
            }
        }, this.a);
    }
}
