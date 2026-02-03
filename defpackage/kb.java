package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kb extends abk implements iz {
    private je a;
    private final ldb c;

    public kb(Context context, int i) {
        super(context, a(context, i));
        this.c = new ldb() { // from class: ka
            @Override // defpackage.ldb
            public final boolean i(KeyEvent keyEvent) {
                return this.a.f(keyEvent);
            }
        };
        je jeVarE = e();
        ((jz) jeVarE).I = a(context, i);
        jeVarE.q();
    }

    private static int a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    private final void b() {
        lxr.b(getWindow().getDecorView(), this);
        pje.b(getWindow().getDecorView(), this);
        acl.a(getWindow().getDecorView(), this);
    }

    @Override // defpackage.abk, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        e().d(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        e().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return ldc.a(this.c, getWindow().getDecorView(), this, keyEvent);
    }

    public final je e() {
        if (this.a == null) {
            int i = je.b;
            this.a = new jz(getContext(), getWindow(), this, this);
        }
        return this.a;
    }

    final boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        return e().c(i);
    }

    public final void g() {
        e().r(1);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        e().f();
    }

    @Override // defpackage.abk, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        e().e();
        super.onCreate(bundle);
        e().q();
    }

    @Override // defpackage.abk, android.app.Dialog
    protected final void onStop() {
        super.onStop();
        e().h();
    }

    @Override // defpackage.abk, android.app.Dialog
    public void setContentView(int i) {
        b();
        e().j(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        e().n(getContext().getString(i));
    }

    @Override // defpackage.abk, android.app.Dialog
    public void setContentView(View view) {
        b();
        e().k(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().n(charSequence);
    }

    @Override // defpackage.abk, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        e().l(view, layoutParams);
    }

    @Override // defpackage.iz
    public final void hd() {
    }

    @Override // defpackage.iz
    public final void m(nb nbVar) {
    }
}
