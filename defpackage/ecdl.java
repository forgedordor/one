package defpackage;

import android.app.Fragment;
import android.app.assist.AssistContent;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ecdl extends iy {
    protected final ecdt V = new ecdt();
    private int st;

    private final void B() {
        this.st--;
    }

    private final void C() {
        int i = this.st;
        this.st = i + 1;
        if (i == 0) {
            this.V.w();
        }
    }

    @Override // defpackage.iy, defpackage.hl, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.V.m() || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void finish() {
        this.V.a();
        super.finish();
    }

    @Override // android.app.Activity
    public final void finishAfterTransition() {
        this.V.b();
        super.finishAfterTransition();
    }

    @Override // defpackage.eg
    public void h(ea eaVar) {
        this.V.R();
    }

    @Override // defpackage.iy, defpackage.iz
    public final void hd() {
        int i = 0;
        while (true) {
            List list = this.V.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof ecds) {
                ((ecds) ecdjVar).a();
            }
            i++;
        }
    }

    @Override // defpackage.iy, defpackage.iz
    public final void m(nb nbVar) {
        if (nbVar == null) {
            return;
        }
        int i = 0;
        while (true) {
            List list = this.V.a;
            if (i >= list.size()) {
                return;
            }
            ecdj ecdjVar = (ecdj) list.get(i);
            if (ecdjVar instanceof ecdr) {
                ((ecdr) ecdjVar).a();
            }
            i++;
        }
    }

    @Override // android.app.Activity
    public final void onActivityReenter(int i, Intent intent) {
        this.V.n();
        super.onActivityReenter(i, intent);
    }

    @Override // defpackage.eg, defpackage.abi, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.V.J();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        this.V.c();
        super.onAttachedToWindow();
    }

    @Override // defpackage.abi, android.app.Activity
    public void onBackPressed() {
        if (this.V.l()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // defpackage.iy, defpackage.abi, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.V.K();
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public final boolean onContextItemSelected(MenuItem menuItem) {
        return this.V.L() || super.onContextItemSelected(menuItem);
    }

    @Override // defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.V.x(bundle);
        super.onCreate(bundle);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.V.M();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return this.V.N() || super.onCreateOptionsMenu(menu);
    }

    @Override // defpackage.iy, defpackage.eg, android.app.Activity
    protected void onDestroy() {
        this.V.d();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.V.e();
        super.onDetachedFromWindow();
    }

    @Override // android.app.Activity
    public void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        this.V.o(consumer);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.V.p() || super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.V.q() || super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.V.y();
        super.onLowMemory();
    }

    @Override // defpackage.abi, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.V.r();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.V.O() || super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.eg, android.app.Activity
    protected void onPause() {
        this.V.f();
        super.onPause();
    }

    @Override // android.app.Activity
    public void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, Consumer consumer) {
        this.V.s();
    }

    @Override // defpackage.iy, android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        this.V.g(bundle);
        super.onPostCreate(bundle);
    }

    @Override // defpackage.iy, defpackage.eg, android.app.Activity
    protected void onPostResume() {
        this.V.h();
        super.onPostResume();
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        return this.V.P() || super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public void onProvideAssistContent(AssistContent assistContent) {
        this.V.t();
        super.onProvideAssistContent(assistContent);
    }

    @Override // android.app.Activity
    public final void onProvideAssistData(Bundle bundle) {
        this.V.u();
        super.onProvideAssistData(bundle);
    }

    @Override // defpackage.eg, defpackage.abi, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.V.Q();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        this.V.i(bundle);
        super.onRestoreInstanceState(bundle);
    }

    @Override // defpackage.eg, android.app.Activity
    protected void onResume() {
        ecdu.a(a());
        this.V.z();
        super.onResume();
    }

    @Override // defpackage.abi, defpackage.hl, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.V.A(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.iy, defpackage.eg, android.app.Activity
    protected void onStart() {
        ecdu.a(a());
        this.V.B();
        super.onStart();
    }

    @Override // defpackage.iy, defpackage.eg, android.app.Activity
    protected void onStop() {
        this.V.C();
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onTopResumedActivityChanged(boolean z) {
        this.V.D(z);
        super.onTopResumedActivityChanged(z);
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        this.V.j();
        super.onUserInteraction();
    }

    @Override // defpackage.abi, android.app.Activity
    protected final void onUserLeaveHint() {
        this.V.k();
        super.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this.V.v();
        super.onWindowFocusChanged(z);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        C();
        super.startActivity(intent);
        B();
    }

    @Override // defpackage.abi, android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        C();
        super.startActivityForResult(intent, i);
        B();
    }

    @Override // android.app.Activity
    public final void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        C();
        super.startActivityFromFragment(fragment, intent, i, bundle);
        B();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        C();
        super.startActivity(intent, bundle);
        B();
    }

    @Override // defpackage.abi, android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        C();
        super.startActivityForResult(intent, i, bundle);
        B();
    }
}
