package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ednu extends iy implements eyhy, eyhr {
    private eyhn n;
    private volatile eyhb o;
    private final Object p = new Object();
    public boolean E = false;

    public ednu() {
        x(new ednt(this));
    }

    public static final boolean H(Object obj) {
        if (obj instanceof eyhx) {
            return !(obj instanceof eyhr) || ((eyhr) obj).e();
        }
        return false;
    }

    @Override // defpackage.eyhy
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final eyhb ba() {
        if (this.o == null) {
            synchronized (this.p) {
                if (this.o == null) {
                    this.o = new eyhb(this);
                }
            }
        }
        return this.o;
    }

    public final Object G() {
        return eygs.a(getApplicationContext());
    }

    @Override // defpackage.abi, defpackage.luv
    public final lxk R() {
        return !H(G()) ? super.R() : eygu.a(this, super.R());
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhr
    public final boolean e() {
        return this.E;
    }

    @Override // defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof eyhx) {
            eyhn eyhnVarC = ba().c();
            this.n = eyhnVarC;
            if (eyhnVarC.b()) {
                this.n.a = T();
            }
        }
    }

    @Override // defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        eyhn eyhnVar = this.n;
        if (eyhnVar != null) {
            eyhnVar.a();
        }
    }
}
