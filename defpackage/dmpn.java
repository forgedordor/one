package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dmpn extends eg implements eyhy {
    private eyhn n;
    private volatile eyhb o;
    private final Object p = new Object();
    public boolean u = false;

    public dmpn() {
        x(new dmpm(this));
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
            this.n = eyhnVarC;
            if (eyhnVarC.b()) {
                this.n.a = T();
            }
        }
    }

    @Override // defpackage.eg, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        eyhn eyhnVar = this.n;
        if (eyhnVar != null) {
            eyhnVar.a();
        }
    }

    @Override // defpackage.eyhy
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
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
}
