package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dn extends ea implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler ag;
    private boolean am;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    public Dialog d;
    private final Runnable ah = new di(this);
    private final DialogInterface.OnCancelListener ai = new dj(this);
    public final DialogInterface.OnDismissListener a = new dk(this);
    private int aj = 0;
    public int b = 0;
    private boolean ak = true;
    public boolean c = true;
    private int al = -1;
    private final lvz an = new dl(this);
    public boolean e = false;

    private final void aV(boolean z, boolean z2, boolean z3) {
        if (this.ap) {
            return;
        }
        this.ap = true;
        this.aq = false;
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.d.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.ag.getLooper()) {
                    onDismiss(this.d);
                } else {
                    this.ag.post(this.ah);
                }
            }
        }
        this.ao = true;
        if (this.al < 0) {
            cg cgVar = new cg(J());
            cgVar.A();
            cgVar.o(this);
            if (z3) {
                cgVar.c();
                return;
            } else if (z) {
                cgVar.k();
                return;
            } else {
                cgVar.j();
                return;
            }
        }
        if (z3) {
            fr frVarJ = J();
            int i = this.al;
            if (i < 0) {
                throw new IllegalArgumentException(a.g(i, "Bad id: "));
            }
            frVarJ.ai(null, i, 1);
        } else {
            fr frVarJ2 = J();
            int i2 = this.al;
            if (i2 < 0) {
                throw new IllegalArgumentException(a.g(i2, "Bad id: "));
            }
            frVarJ2.M(new fn(frVarJ2, null, i2), z);
        }
        this.al = -1;
    }

    public final void dismissAllowingStateLoss() {
        aV(true, false, false);
    }

    public final void f() {
        aV(false, false, true);
    }

    @Override // defpackage.ea
    public void g(Context context) {
        super.g(context);
        this.ab.g(this.an);
        if (this.aq) {
            return;
        }
        this.ap = false;
    }

    public Dialog gK(Bundle bundle) {
        if (fr.ad(3)) {
            toString();
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment ".concat(toString()));
        }
        return new abk(A(), this.b);
    }

    public final Dialog gV() {
        Dialog dialog = this.d;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException(a.h(this, "DialogFragment ", " does not have a Dialog."));
    }

    public final Dialog getDialog() {
        return this.d;
    }

    public final boolean getShowsDialog() {
        return this.c;
    }

    @Override // defpackage.ea
    public final ek gk() {
        return new dm(this, new dr(this));
    }

    @Override // defpackage.ea
    public LayoutInflater go(Bundle bundle) {
        LayoutInflater layoutInflaterAO = aO();
        if (this.c && !this.am) {
            if (!this.e) {
                try {
                    this.am = true;
                    Dialog dialogGK = gK(bundle);
                    this.d = dialogGK;
                    if (this.c) {
                        r(dialogGK, this.aj);
                        Context contextZ = z();
                        if (contextZ instanceof Activity) {
                            this.d.setOwnerActivity((Activity) contextZ);
                        }
                        this.d.setCancelable(this.ak);
                        this.d.setOnCancelListener(this.ai);
                        this.d.setOnDismissListener(this.a);
                        this.e = true;
                    } else {
                        this.d = null;
                    }
                } finally {
                    this.am = false;
                }
            }
            if (fr.ad(2)) {
                Log.d("FragmentManager", a.h(this, "get layout inflater for DialogFragment ", " from dialog context"));
            }
            Dialog dialog = this.d;
            if (dialog != null) {
                return layoutInflaterAO.cloneInContext(dialog.getContext());
            }
        } else if (fr.ad(2)) {
            toString();
            String strConcat = "getting layout inflater for DialogFragment ".concat(toString());
            if (!this.c) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(strConcat));
                return layoutInflaterAO;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(strConcat));
        }
        return layoutInflaterAO;
    }

    @Override // defpackage.ea
    public void h(Bundle bundle) {
        super.h(bundle);
        this.ag = new Handler();
        this.c = this.G == 0;
        if (bundle != null) {
            this.aj = bundle.getInt("android:style", 0);
            this.b = bundle.getInt("android:theme", 0);
            this.ak = bundle.getBoolean("android:cancelable", true);
            this.c = bundle.getBoolean("android:showsDialog", this.c);
            this.al = bundle.getInt("android:backStackId", -1);
        }
    }

    public void hh() {
        aV(false, false, false);
    }

    @Override // defpackage.ea
    public void i() {
        super.i();
        Dialog dialog = this.d;
        if (dialog != null) {
            this.ao = true;
            dialog.setOnDismissListener(null);
            this.d.dismiss();
            if (!this.ap) {
                onDismiss(this.d);
            }
            this.d = null;
            this.e = false;
        }
    }

    @Override // defpackage.ea
    public void j() {
        super.j();
        if (!this.aq && !this.ap) {
            this.ap = true;
        }
        this.ab.k(this.an);
    }

    @Override // defpackage.ea
    public void k(Bundle bundle) {
        Dialog dialog = this.d;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.aj;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        if (!this.ak) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.c) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i3 = this.al;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.ea
    public void l() {
        super.l();
        Dialog dialog = this.d;
        if (dialog != null) {
            this.ao = false;
            dialog.show();
            View decorView = this.d.getWindow().getDecorView();
            lxr.b(decorView, this);
            lxs.b(decorView, this);
            pje.b(decorView, this);
        }
    }

    @Override // defpackage.ea
    public void m() {
        super.m();
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.ea
    public final void n(Bundle bundle) {
        Bundle bundle2;
        super.n(bundle);
        if (this.d == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.d.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.ea
    public final void o(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.o(layoutInflater, viewGroup, bundle);
        if (this.Q != null || this.d == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.d.onRestoreInstanceState(bundle2);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.ao) {
            return;
        }
        if (fr.ad(3)) {
            toString();
            Log.d("FragmentManager", "onDismiss called for DialogFragment ".concat(toString()));
        }
        aV(true, true, false);
    }

    public final void p(boolean z) {
        this.ak = z;
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public final void q(int i, int i2) {
        if (fr.ad(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i + ", " + i2);
        }
        this.aj = i;
        this.b = i2;
    }

    public void r(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public final void s(fr frVar, String str) {
        this.ap = false;
        this.aq = true;
        cg cgVar = new cg(frVar);
        cgVar.A();
        cgVar.u(this, str);
        cgVar.j();
    }

    public final void t(fr frVar, String str) {
        this.ap = false;
        this.aq = true;
        cg cgVar = new cg(frVar);
        cgVar.A();
        cgVar.u(this, str);
        cgVar.c();
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
