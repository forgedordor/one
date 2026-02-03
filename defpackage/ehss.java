package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ehss extends ecdp implements eyhy {
    private eyhn p;
    private volatile eyhb q;
    private final Object r = new Object();
    public boolean n = false;

    public ehss() {
        x(new ehsr(this));
    }

    @Override // defpackage.abi, defpackage.luv
    public final lxk R() {
        return eygu.a(this, super.R());
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    protected eyhb j() {
        throw null;
    }

    @Override // defpackage.eyhy
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final eyhb ba() {
        if (this.q == null) {
            synchronized (this.r) {
                if (this.q == null) {
                    this.q = j();
                }
            }
        }
        return this.q;
    }

    @Override // defpackage.ecdp, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof eyhx) {
            eyhn eyhnVarC = ba().c();
            this.p = eyhnVarC;
            if (eyhnVarC.b()) {
                this.p.a = T();
            }
        }
    }

    @Override // defpackage.ecdp, defpackage.eg, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        eyhn eyhnVar = this.p;
        if (eyhnVar != null) {
            eyhnVar.a();
        }
    }
}
