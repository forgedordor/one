package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egtj implements egrw {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/contrib/work/impl/TikTokInternalAccountWorker");
    public final Executor b;
    public volatile egsf c;
    private final Context d;
    private final efyt e;
    private final Map f;
    private final Executor g;
    private final ejvr h;
    private final String i;

    /* compiled from: PG */
    public interface a {
        egsq gj();
    }

    public egtj(Context context, efyt efytVar, Map map, Executor executor, Executor executor2, ejvr ejvrVar, String str) {
        this.d = context;
        this.e = efytVar;
        this.f = map;
        this.b = executor;
        this.g = executor2;
        this.h = ejvrVar;
        this.i = str;
    }

    @Override // defpackage.egsp
    public final ListenableFuture a(final WorkerParameters workerParameters) {
        return eika.k(d(eguk.b(workerParameters)), new eooz() { // from class: egti
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((egrw) obj).a(workerParameters);
            }
        }, this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.egrw, defpackage.egsp
    public final ListenableFuture b(final WorkerParameters workerParameters) {
        ListenableFuture listenableFutureE;
        eiex eiexVarB = eiez.b();
        efwp.a(eiexVarB, eguk.b(workerParameters));
        final eieu eieuVarJ = eiiy.j("AccountWorkerFactory startWork()", ((eiez) eiexVarB).f());
        try {
            if (workerParameters.c.contains("tiktok_account_work")) {
                final efwo efwoVarB = eguk.b(workerParameters);
                listenableFutureE = eika.e(((a) ehlh.a(this.d, a.class, efwoVarB)).gj().b(new eooy() { // from class: egte
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        final egtj egtjVar = this.a;
                        final WorkerParameters workerParameters2 = workerParameters;
                        ListenableFuture listenableFutureK = eika.k(egtjVar.d(efwoVarB), new eooz() { // from class: egth
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                egrw egrwVar = (egrw) obj;
                                egrwVar.c(egtjVar.c);
                                return egrwVar.b(workerParameters2);
                            }
                        }, egtjVar.b);
                        eieuVarJ.b(listenableFutureK);
                        return listenableFutureK;
                    }
                }), egsw.class, new ejvr() { // from class: egtf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ((ekrd) ((ekrd) ((ekrd) egtj.a.j()).g((egsw) obj)).h("com/google/apps/tiktok/contrib/work/impl/TikTokInternalAccountWorker", "startWork", 127, "TikTokInternalAccountWorker.java")).q("Account Worker did not pass Account requirements and will be skipped.");
                        return new qam();
                    }
                }, this.g);
            } else {
                listenableFutureE = eork.h(new egsw());
            }
            eieuVarJ.close();
            return listenableFutureE;
        } catch (Throwable th) {
            try {
                eieuVarJ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.egsp
    public final void c(egsf egsfVar) {
        this.c = egsfVar;
    }

    public final ListenableFuture d(efwo efwoVar) {
        Map map = this.f;
        String str = this.i;
        ListenableFuture listenableFutureF = map.containsKey(str) ? this.e.f(efwoVar, (ekgb) map.get(str)) : this.e.a(efwoVar);
        eooz eoozVar = new eooz() { // from class: egtg
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return eork.h(new egsw((egdj) obj));
            }
        };
        Executor executor = this.b;
        return eika.j(eika.f(listenableFutureF, egdj.class, eoozVar, executor), this.h, executor);
    }
}
