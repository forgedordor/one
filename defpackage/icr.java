package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class icr implements jbf {
    public boolean A;
    public fdae B;
    public boolean C;
    private fdjx a;
    private boolean b;
    private boolean c;
    public int t;
    public icr v;
    public icr w;
    public jez x;
    public jer y;
    public boolean z;
    public icr s = this;
    public int u = -1;

    @Override // defpackage.jbf
    public final icr D() {
        return this.s;
    }

    public final fdjx E() {
        fdjx fdjxVar = this.a;
        if (fdjxVar != null) {
            return fdjxVar;
        }
        fdjx fdjxVarB = fdjy.b(((AndroidComposeView) jbg.f(this)).j.plus(new fdlt((fdlr) ((AndroidComposeView) jbg.f(this)).j.get(fdlr.c))));
        this.a = fdjxVarB;
        return fdjxVarB;
    }

    public void F() {
        if (this.C) {
            itw.d("node attached multiple times");
        }
        if (this.y == null) {
            itw.d("attach invoked on a node without a coordinator");
        }
        this.C = true;
        this.b = true;
    }

    public void G() {
        if (!this.C) {
            itw.d("Cannot detach a node that is not attached");
        }
        if (this.b) {
            itw.d("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.c) {
            itw.d("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.C = false;
        fdjx fdjxVar = this.a;
        if (fdjxVar != null) {
            fdjy.e(fdjxVar, new ict());
            this.a = null;
        }
    }

    public void H() {
        if (!this.C) {
            itw.d("reset() called on an unattached node");
        }
        dT();
    }

    public void I() {
        if (!this.C) {
            itw.d("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.b) {
            itw.d("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.b = false;
        dU();
        this.c = true;
    }

    public void J() {
        if (!this.C) {
            itw.d("node detached multiple times");
        }
        if (this.y == null) {
            itw.d("detach invoked on a node without a coordinator");
        }
        if (!this.c) {
            itw.d("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.c = false;
        fdae fdaeVar = this.B;
        if (fdaeVar != null) {
            fdaeVar.invoke();
        }
        s();
    }

    public void K(icr icrVar) {
        this.s = icrVar;
    }

    public void L(jer jerVar) {
        this.y = jerVar;
    }

    public boolean dN() {
        return true;
    }

    public /* synthetic */ void dL() {
    }

    public /* synthetic */ void dM() {
    }

    public void dT() {
    }

    public void dU() {
    }

    public void s() {
    }
}
