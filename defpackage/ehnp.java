package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ehnp extends ecdo implements eifl {
    protected final eics c = new eics(this);

    @Override // defpackage.ecdo, defpackage.ea
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.c();
        try {
            View viewM = super.M(layoutInflater, viewGroup, bundle);
            eidc.q();
            return viewM;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public boolean aM(MenuItem menuItem) {
        eifp eifpVarJ = this.c.j();
        try {
            boolean zAM = super.aM(menuItem);
            eifpVarJ.close();
            return zAM;
        } catch (Throwable th) {
            try {
                eifpVarJ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void aR(int i, int i2) {
        this.c.h(i, i2);
        eidc.q();
    }

    @Override // defpackage.ea
    public final void aS(int i, int i2) {
        eidc.j();
        if (i != 0 || i2 != 0) {
            this.c.e(eiik.b(), true);
        }
        eidc.q();
    }

    public final void aV(Object obj) {
        this.c.l();
        super.D().k = obj;
    }

    protected final void aW(int i, int i2, Intent intent) {
        super.af(i, i2, intent);
    }

    protected final void aX(Bundle bundle) {
        super.h(bundle);
    }

    protected final void aY() {
        super.ai();
    }

    protected final void aZ() {
        super.i();
    }

    @Override // defpackage.ecdo, defpackage.ea
    public final void ae(Bundle bundle) {
        this.c.c();
        try {
            super.ae(bundle);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public void af(int i, int i2, Intent intent) {
        eifp eifpVarF = this.c.f();
        try {
            super.af(i, i2, intent);
            eifpVarF.close();
        } catch (Throwable th) {
            try {
                eifpVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public void ai() {
        eifp eifpVarB = this.c.b();
        try {
            super.ai();
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public void am() {
        this.c.c();
        try {
            super.am();
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public void ao() {
        eifp eifpVarB = this.c.b();
        try {
            super.ao();
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public void ap(View view, Bundle bundle) {
        this.c.c();
        try {
            super.ap(view, bundle);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected final void bc() {
        super.j();
    }

    protected final void be() {
        super.am();
    }

    public eiik bf() {
        throw null;
    }

    public void bh(eiik eiikVar, boolean z) {
        throw null;
    }

    public void bi(eiik eiikVar) {
        throw null;
    }

    protected final void bj() {
        super.ao();
    }

    protected final void bk(Bundle bundle) {
        super.k(bundle);
    }

    protected final void bl() {
        super.l();
    }

    protected final void bm() {
        super.m();
    }

    protected final void bn(View view, Bundle bundle) {
        super.ap(view, bundle);
    }

    protected final void bo(MenuItem menuItem) {
        super.aM(menuItem);
    }

    @Override // defpackage.ea
    public void g(Context context) {
        super.g(context);
        lvj lvjVar = this.E;
        if (lvjVar instanceof eifl) {
            eics eicsVar = this.c;
            if (eicsVar.a == null) {
                eicsVar.e(((eifl) lvjVar).bf(), true);
            }
        }
        this.c.d();
    }

    @Override // defpackage.ecdo, defpackage.ea
    public void h(Bundle bundle) {
        this.c.c();
        try {
            super.h(bundle);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public void i() {
        eifp eifpVarB = this.c.b();
        try {
            super.i();
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public void k(Bundle bundle) {
        this.c.c();
        try {
            super.k(bundle);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public void l() {
        this.c.c();
        try {
            super.l();
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public void m() {
        this.c.c();
        try {
            super.m();
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.M(layoutInflater, viewGroup, bundle);
    }

    public final void t(Object obj) {
        this.c.l();
        super.D().i = obj;
    }
}
