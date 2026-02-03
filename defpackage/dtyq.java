package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dtyq extends iy implements eyhy {
    private eyhn o;
    private volatile eyhb p;
    private final Object q = new Object();
    public boolean n = false;

    public dtyq() {
        x(new dtyp(this));
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

    @Override // defpackage.abi, defpackage.luv
    public final lxk R() {
        return eygu.a(this, super.R());
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
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
