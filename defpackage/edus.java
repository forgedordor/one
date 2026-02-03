package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class edus extends iy implements eyhy, eyhr {
    private eyhn o;
    private volatile eyhb p;
    private final Object q = new Object();
    public boolean n = false;

    public edus() {
        x(new edur(this));
    }

    public static final boolean D(Object obj) {
        if (obj instanceof eyhx) {
            return !(obj instanceof eyhr) || ((eyhr) obj).e();
        }
        return false;
    }

    @Override // defpackage.eyhy
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final eyhb ba() {
        if (this.p == null) {
            synchronized (this.q) {
                if (this.p == null) {
                    this.p = new eyhb(this);
                }
            }
        }
        return this.p;
    }

    public final Object C() {
        return eygs.a(getApplicationContext());
    }

    @Override // defpackage.abi, defpackage.luv
    public final lxk R() {
        return !D(C()) ? super.R() : eygu.a(this, super.R());
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhr
    public final boolean e() {
        return this.n;
    }

    @Override // defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof eyhx) {
            eyhn eyhnVarC = ba().c();
            this.o = eyhnVarC;
            if (eyhnVarC.b()) {
                this.o.a = T();
            }
        }
    }

    @Override // defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        eyhn eyhnVar = this.o;
        if (eyhnVar != null) {
            eyhnVar.a();
        }
    }
}
