package defpackage;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class cukp extends ecdl implements eyhy {
    private eyhn sq;
    private volatile eyhb sr;
    private final Object ss = new Object();

    public cukp() {
        x(new cuko(this));
    }

    protected void B() {
        throw null;
    }

    protected eyhb E() {
        return new eyhb(this);
    }

    @Override // defpackage.abi, defpackage.luv
    public final lxk R() {
        return eygu.a(this, super.R());
    }

    @Override // defpackage.eyhy
    /* renamed from: ad, reason: merged with bridge method [inline-methods] */
    public final eyhb ba() {
        if (this.sr == null) {
            synchronized (this.ss) {
                if (this.sr == null) {
                    this.sr = E();
                }
            }
        }
        return this.sr;
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof eyhx) {
            eyhn eyhnVarC = ba().c();
            this.sq = eyhnVarC;
            if (eyhnVarC.b()) {
                this.sq.a = T();
            }
        }
    }

    @Override // defpackage.ecdl, defpackage.iy, defpackage.eg, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        eyhn eyhnVar = this.sq;
        if (eyhnVar != null) {
            eyhnVar.a();
        }
    }
}
