package defpackage;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amz implements bpu {
    final /* synthetic */ aqm a;
    final /* synthetic */ anm b;

    public amz(anm anmVar, aqm aqmVar) {
        this.b = anmVar;
        this.a = aqmVar;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        final bml bmlVar;
        if (!(th instanceof bjx)) {
            if (th instanceof CancellationException) {
                this.b.q("Unable to configure camera cancelled");
                return;
            }
            anm anmVar = this.b;
            if (anmVar.A == 10) {
                anmVar.L(10, new ayp(4, th));
            }
            Objects.toString(anmVar);
            bbs.d("Camera2CameraImpl", "Unable to configure camera ".concat(anmVar.toString()), th);
            if (anmVar.j == this.a) {
                anmVar.O();
                return;
            }
            return;
        }
        anm anmVar2 = this.b;
        bjz bjzVar = ((bjx) th).a;
        Iterator it = anmVar2.a.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                bmlVar = null;
                break;
            } else {
                bmlVar = (bml) it.next();
                if (bmlVar.f().contains(bjzVar)) {
                    break;
                }
            }
        }
        if (bmlVar != null) {
            final bmf bmfVar = bmlVar.f;
            ScheduledExecutorService scheduledExecutorServiceA = bpn.a();
            if (bmfVar != null) {
                anmVar2.r("Posting surface closed", new Throwable());
                scheduledExecutorServiceA.execute(new Runnable() { // from class: ame
                    @Override // java.lang.Runnable
                    public final void run() {
                        bmfVar.a(bmlVar);
                    }
                });
            }
        }
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int i = ((axw) this.b.p).e;
    }
}
