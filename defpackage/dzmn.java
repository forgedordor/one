package defpackage;

import android.content.Context;
import android.os.Debug;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzmn implements dzlo, dzix {
    private final Context a;
    private final eosd b;
    private final fcsu c;
    private final fcsu d;
    private final Random e;
    private final fcsu f;
    private final dzjd g;

    public dzmn(Context context, eosd eosdVar, ejwi<Boolean> ejwiVar, fcsu<dzmp> fcsuVar, fcsu<dzmp> fcsuVar2, Random random, fcsu<ejwi<dzmh>> fcsuVar3, dzjd dzjdVar) {
        this.a = context;
        this.b = eosdVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = random;
        this.f = fcsuVar3;
        this.g = dzjdVar;
    }

    public static /* synthetic */ ListenableFuture a(dzmn dzmnVar, dzmp dzmpVar) {
        Debug.startMethodTracingSampling(dzmpVar.c, dzmpVar.h, dzmpVar.i);
        return dzmnVar.b.schedule(new Runnable() { // from class: dzml
            @Override // java.lang.Runnable
            public final void run() {
                Debug.stopMethodTracing();
            }
        }, dzmnVar.e(dzmpVar.f, dzmpVar.g), TimeUnit.MILLISECONDS);
    }

    private final int e(int i, int i2) {
        return i2 == 0 ? i : this.e.nextInt(i2) + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(final dzmp dzmpVar) {
        if (dzmpVar.b) {
            ejwi ejwiVar = (ejwi) this.f.b();
            if (!ejwiVar.g() || ((dzmh) ejwiVar.c()).c()) {
                eork.k(new eooy() { // from class: dzmk
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        return dzmn.a(this.a, dzmpVar);
                    }
                }, e(dzmpVar.d, dzmpVar.e), TimeUnit.MILLISECONDS, this.b);
            }
        }
    }

    @Override // defpackage.dzix
    public void j(dzfh dzfhVar) {
        this.g.b(this);
        this.b.execute(new Runnable() { // from class: dzmm
            @Override // java.lang.Runnable
            public final void run() {
                dzmn dzmnVar = this.a;
                dqyw.c(dzmnVar.a, new Runnable() { // from class: dzmi
                    @Override // java.lang.Runnable
                    public final void run() {
                        dzmn dzmnVar2 = this.a;
                        dzmnVar2.f((dzmp) dzmnVar2.c.b());
                    }
                });
            }
        });
    }

    @Override // defpackage.dzlo
    public void n() {
        Boolean bool = Boolean.FALSE;
        bool.getClass();
        if (bool.booleanValue()) {
            dqyw.c(this.a, new Runnable() { // from class: dzmj
                @Override // java.lang.Runnable
                public final void run() {
                    dzmn dzmnVar = this.a;
                    dzmnVar.f((dzmp) dzmnVar.d.b());
                }
            });
        }
        this.g.a(this);
    }

    @Override // defpackage.dzix
    public /* synthetic */ void i(dzfh dzfhVar) {
    }
}
