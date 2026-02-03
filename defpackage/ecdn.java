package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ecdn extends dn {
    protected final eccl ag = new eccl();

    @Override // defpackage.ea
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ag.g(bundle);
        return super.M(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.ea
    public final void aC(boolean z) {
        this.ag.h(z);
        super.aC(z);
    }

    @Override // defpackage.ea
    public final boolean aL(MenuItem menuItem) {
        return this.ag.L();
    }

    @Override // defpackage.ea
    public boolean aM(MenuItem menuItem) {
        return this.ag.O();
    }

    @Override // defpackage.ea
    public final void aT() {
        if (this.ag.P()) {
            av(true);
        }
    }

    @Override // defpackage.ea
    public final void aU() {
        this.ag.Q();
    }

    @Override // defpackage.ea
    public void ae(Bundle bundle) {
        this.ag.a(bundle);
        super.ae(bundle);
    }

    @Override // defpackage.ea
    public void af(int i, int i2, Intent intent) {
        super.af(i, i2, intent);
        this.ag.J();
    }

    @Override // defpackage.ea
    public void ag(Activity activity) {
        this.ag.j();
        super.ag(activity);
    }

    @Override // defpackage.ea
    public final void ah(Menu menu, MenuInflater menuInflater) {
        if (this.ag.N()) {
            av(true);
        }
    }

    @Override // defpackage.ea
    public void ai() {
        this.ag.d();
        super.ai();
    }

    @Override // defpackage.ea
    public void am() {
        this.ag.f();
        super.am();
    }

    @Override // defpackage.ea
    public void ao() {
        ecdu.a(I());
        this.ag.z();
        super.ao();
    }

    @Override // defpackage.ea
    public void ap(View view, Bundle bundle) {
        this.ag.k(bundle);
    }

    @Override // defpackage.dn, defpackage.ea
    public void h(Bundle bundle) {
        this.ag.x(bundle);
        super.h(bundle);
    }

    @Override // defpackage.dn
    public void hh() {
        this.ag.e();
        super.hh();
    }

    @Override // defpackage.dn, defpackage.ea
    public void i() {
        this.ag.b();
        super.i();
    }

    @Override // defpackage.dn, defpackage.ea
    public void j() {
        this.ag.c();
        super.j();
    }

    @Override // defpackage.dn, defpackage.ea
    public void k(Bundle bundle) {
        this.ag.A(bundle);
        super.k(bundle);
    }

    @Override // defpackage.dn, defpackage.ea
    public void l() {
        ecdu.a(I());
        this.ag.B();
        super.l();
    }

    @Override // defpackage.dn, defpackage.ea
    public void m() {
        this.ag.C();
        super.m();
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.ag.K();
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.ea, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.ag.M();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.ag.e();
        super.onDismiss(dialogInterface);
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.ag.y();
        super.onLowMemory();
    }
}
