package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyn implements lun {
    public acwj a;
    private final eosd b;
    private final cogw c;
    private eiju d;

    public acyn(eosd eosdVar, cogw cogwVar) {
        this.b = eosdVar;
        this.c = cogwVar;
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        eiju eijuVar = this.d;
        if (eijuVar != null) {
            eijuVar.cancel(true);
        }
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        this.d = eiju.g(ejua.a(new Runnable() { // from class: acym
            @Override // java.lang.Runnable
            public final void run() {
                acwj acwjVar = this.a.a;
                acwjVar.v(0, acwjVar.a(), new adai(new ekph(adar.TIMESTAMP), true));
            }
        }, 1L, TimeUnit.MINUTES, this.c, this.b));
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void d(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void fh(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }
}
