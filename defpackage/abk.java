package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abk extends Dialog implements lvj, ach, pjb {
    private lvn a;
    public final ace b;
    private final pja c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abk(Context context, int i) {
        super(context, i);
        context.getClass();
        this.c = piz.a(this);
        this.b = new ace(new Runnable() { // from class: abj
            @Override // java.lang.Runnable
            public final void run() {
                abk.i(this.a);
            }
        });
    }

    private final lvn a() {
        lvn lvnVar = this.a;
        if (lvnVar != null) {
            return lvnVar;
        }
        lvn lvnVar2 = new lvn(this);
        this.a = lvnVar2;
        return lvnVar2;
    }

    public static final void i(abk abkVar) {
        super.onBackPressed();
    }

    @Override // defpackage.lvj
    public final lvc P() {
        return a();
    }

    @Override // defpackage.pjb
    public final pix U() {
        return this.c.a;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        h();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.ach
    public final ace c() {
        return this.b;
    }

    public final void h() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        lxr.b(decorView, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        acl.a(decorView2, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        pje.b(decorView3, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.b.d();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            ace aceVar = this.b;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            aceVar.e(onBackInvokedDispatcher);
        }
        this.c.b(bundle);
        a().e(lva.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.c.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        a().e(lva.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        a().e(lva.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        h();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        h();
        super.setContentView(view);
    }

    public /* synthetic */ abk(Context context) {
        this(context, 0);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        h();
        super.setContentView(view, layoutParams);
    }
}
