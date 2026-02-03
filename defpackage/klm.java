package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class klm extends icr implements ViewTreeObserver.OnGlobalFocusChangeListener, igp {
    public View a;
    private ViewTreeObserver b;
    private final fdap c = new klk(this);
    private final fdap d = new kll(this);

    private final FocusTargetNode a() {
        if (!this.s.C) {
            itw.d("visitLocalDescendants called on an unattached node");
        }
        icr icrVar = this.s;
        if ((icrVar.u & 1024) != 0) {
            boolean z = false;
            for (icr icrVar2 = icrVar.w; icrVar2 != null; icrVar2 = icrVar2.w) {
                if ((icrVar2.t & 1024) != 0) {
                    icr icrVarA = icrVar2;
                    hum humVar = null;
                    while (icrVarA != null) {
                        if (icrVarA instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) icrVarA;
                            if (z) {
                                return focusTargetNode;
                            }
                            z = true;
                        } else if ((icrVarA.t & 1024) != 0 && (icrVarA instanceof jbi)) {
                            int i = 0;
                            for (icr icrVar3 = ((jbi) icrVarA).E; icrVar3 != null; icrVar3 = icrVar3.w) {
                                if ((icrVar3.t & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        icrVarA = icrVar3;
                                    } else {
                                        if (humVar == null) {
                                            humVar = new hum(new icr[16]);
                                        }
                                        if (icrVarA != null) {
                                            humVar.n(icrVarA);
                                        }
                                        humVar.n(icrVar3);
                                        icrVarA = null;
                                    }
                                }
                            }
                            if (i != 1) {
                            }
                        }
                        icrVarA = jbg.a(humVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // defpackage.icr
    public final void dU() {
        ViewTreeObserver viewTreeObserver = jbh.a(this).getViewTreeObserver();
        this.b = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (jbg.d(this).k == null) {
            return;
        }
        View viewB = klj.b(this);
        ige igeVar = ((AndroidComposeView) jbg.f(this)).i;
        jfh jfhVarF = jbg.f(this);
        boolean z = (view == null || fdbq.f(view, jfhVarF) || !klj.c(viewB, view)) ? false : true;
        boolean z2 = (view2 == null || fdbq.f(view2, jfhVarF) || !klj.c(viewB, view2)) ? false : true;
        if (z && z2) {
            this.a = view2;
            return;
        }
        if (z2) {
            this.a = view2;
            FocusTargetNode focusTargetNodeA = a();
            if (focusTargetNodeA.f().a()) {
                return;
            }
            ihe.a(focusTargetNodeA);
            return;
        }
        if (!z) {
            this.a = null;
            return;
        }
        this.a = null;
        if (a().f().b()) {
            igeVar.g(false, false, 8);
        }
    }

    @Override // defpackage.icr
    public final void s() {
        ViewTreeObserver viewTreeObserver = this.b;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.b = null;
        jbh.a(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.a = null;
    }

    @Override // defpackage.igp
    public final void v(igl iglVar) {
        iglVar.a(false);
        iglVar.b(this.c);
        iglVar.c(this.d);
    }
}
