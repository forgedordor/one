package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abbf implements lun, abbb {
    public static final cqce a = cqce.g("Bugle", "BugleSensorObserver");
    public final eygg b;
    public boolean c = false;
    private final fcsu d;
    private final eosc e;
    private final fcsu f;
    private final fcsu g;
    private final Context h;

    public abbf(Context context, eygg eyggVar, fcsu fcsuVar, eosc eoscVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.h = context;
        this.b = eyggVar;
        this.d = fcsuVar;
        this.e = eoscVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
    }

    @Override // defpackage.lun
    public final void c(lvj lvjVar) {
        if (this.c) {
            eygg eyggVar = this.b;
            abbc abbcVar = (abbc) eyggVar.b();
            ListenableFuture listenableFuture = abbcVar.j;
            if (listenableFuture != null) {
                listenableFuture.cancel(true);
            }
            abbcVar.h.unregisterListener(abbcVar);
            ((abbc) eyggVar.b()).i.remove(this);
        }
    }

    @Override // defpackage.lun
    public final void d(lvj lvjVar) {
        final cczv cczvVar = abal.a;
        cczvVar.getClass();
        Callable callable = new Callable() { // from class: abbd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (Boolean) cczvVar.e();
            }
        };
        eosc eoscVar = this.e;
        eork.r(eoscVar.submit(callable), auwc.a(new abbe(this)), eoscVar);
    }

    @Override // defpackage.abbb
    public final void g() {
        if (((Boolean) ackx.a.e()).booleanValue()) {
            acif acifVar = (acif) this.g.b();
            Context context = this.h;
            acik acikVar = new acik();
            acikVar.b(elie.BUGLE_ADVANCED_FEEDBACK_SOURCE_SHAKE_GESTURE);
            acifVar.b(context, acikVar.a());
            return;
        }
        ((ajhd) this.f.b()).ao(2);
        eg egVar = (eg) dakl.d(this.h);
        if (egVar == null) {
            abbm.a.r("No associated activity with the context, skip taking bug report");
            return;
        }
        if (egVar.isFinishing()) {
            abbm.a.r("Activity is finishing, can not show a dialog now");
            return;
        }
        fr frVarA = egVar.a();
        if (frVarA.ag()) {
            abbm.a.r("Fragment manager has state saved, can not show a dialog now");
            return;
        }
        abbn abbnVar = new abbn();
        eyhj.e(abbnVar);
        abbnVar.t(frVarA, "com.google.android.apps.messaging.TakeBugReportDialogFragment");
    }

    @Override // defpackage.lun
    public final /* synthetic */ void f(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void fh(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gG(lvj lvjVar) {
    }
}
