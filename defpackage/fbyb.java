package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbyb extends fboq {
    public ScheduledExecutorService a;
    public boolean b = false;
    private final fchf c;

    public fbyb() {
        fchf fchfVar = new fchf("inprocess:", new fbxz(this), (fcgy) null);
        this.c = fchfVar;
        fchfVar.v = false;
        fchfVar.w = false;
        fchfVar.x = false;
        if (fbzb.b) {
            return;
        }
        fchfVar.r = false;
    }

    @Override // defpackage.fboq
    protected final fbqo b() {
        return this.c;
    }
}
