package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Looper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqvd {
    public final egpm a;
    public final eosc b;
    public final cqwe c;
    public final AtomicReference d = new AtomicReference(null);

    public cqvd(egpm egpmVar, eosc eoscVar, cqwe cqweVar) {
        this.a = egpmVar;
        this.b = eoscVar;
        this.c = cqweVar;
    }

    public final eiju a(cqun cqunVar) {
        return b(cqunVar, null);
    }

    public final eiju b(final cqun cqunVar, final cvjt cvjtVar) {
        return eijs.d(new eopn() { // from class: cqvb
            @Override // defpackage.eopn
            public final Object a(eopt eoptVar) {
                cqvd cqvdVar = this.a;
                cqwe cqweVar = cqvdVar.c;
                fcsu fcsuVar = cqweVar.a;
                MediaPlayer mediaPlayerA = cqwh.a();
                Context context = (Context) fcsuVar.b();
                context.getClass();
                eosc eoscVar = (eosc) cqweVar.b.b();
                eoscVar.getClass();
                AudioManager audioManager = (AudioManager) cqweVar.c.b();
                audioManager.getClass();
                cqwd cqwdVar = new cqwd(context, eoscVar, audioManager, mediaPlayerA, cqunVar);
                eoptVar.a(cqwdVar, cqvdVar.b);
                return cqwdVar;
            }
        }, Looper.myLooper() != null ? eoqg.a : new Executor() { // from class: cqva
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                if (!this.a.a.post(runnable)) {
                    throw new ejyc("Could not execute on TiktokHandler");
                }
            }
        }).g(new eopl() { // from class: cqvc
            @Override // defpackage.eopl
            public final eopy a(eopt eoptVar, Object obj) {
                final cqwd cqwdVar = (cqwd) obj;
                cqwdVar.getClass();
                cqwd cqwdVar2 = (cqwd) this.a.d.getAndSet(cqwdVar);
                final cvjt cvjtVar2 = cvjtVar;
                return new eopy(cqwdVar2 != null ? cqwdVar2.a("New playback request").i(new eooz() { // from class: cquz
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return cqwdVar.d(cvjtVar2);
                    }
                }, eoqg.a) : cqwdVar.d(cvjtVar2));
            }
        }, this.b).h();
    }
}
