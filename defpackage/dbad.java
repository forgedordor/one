package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dbad extends ecdl implements eyhy {
    private eyhn o;
    private volatile eyhb p;
    private final Object q = new Object();
    public boolean n = false;

    public dbad() {
        x(new dbac(this));
    }

    @Override // defpackage.eyhy
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final eyhb ba() {
        if (this.p == null) {
            synchronized (this.q) {
                if (this.p == null) {
                    this.p = C();
                }
            }
        }
        return this.p;
    }

    protected eyhb C() {
        throw null;
    }

    @Override // defpackage.abi, defpackage.luv
    public final lxk R() {
        return eygu.a(this, super.R());
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
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

    @Override // defpackage.ecdl, defpackage.iy, defpackage.eg, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        eyhn eyhnVar = this.o;
        if (eyhnVar != null) {
            eyhnVar.a();
        }
    }
}
