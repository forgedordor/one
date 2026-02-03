package defpackage;

import android.app.Activity;
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
public class ecdv extends eefb {
    protected final eccl aq = new eccl();

    @Override // defpackage.ea
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aq.g(bundle);
        return super.M(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.ea
    public final void aC(boolean z) {
        this.aq.h(z);
        super.aC(z);
    }

    @Override // defpackage.ea
    public final boolean aL(MenuItem menuItem) {
        return this.aq.L();
    }

    @Override // defpackage.ea
    public boolean aM(MenuItem menuItem) {
        return this.aq.O();
    }

    @Override // defpackage.ea
    public final void aT() {
        if (this.aq.P()) {
            av(true);
        }
    }

    @Override // defpackage.ea
    public final void aU() {
        this.aq.Q();
    }

    @Override // defpackage.ea
    public void ae(Bundle bundle) {
        this.aq.a(bundle);
        super.ae(bundle);
    }

    @Override // defpackage.ea
    public void af(int i, int i2, Intent intent) {
        this.aq.J();
        super.af(i, i2, intent);
    }

    @Override // defpackage.ea
    public void ag(Activity activity) {
        this.aq.j();
        super.ag(activity);
    }

    @Override // defpackage.ea
    public final void ah(Menu menu, MenuInflater menuInflater) {
        if (this.aq.N()) {
            av(true);
        }
    }

    @Override // defpackage.ea
    public void ai() {
        this.aq.d();
        super.ai();
    }

    @Override // defpackage.ea
    public void am() {
        this.aq.f();
        super.am();
    }

    @Override // defpackage.ea
    public void ao() {
        ecdu.a(I());
        this.aq.z();
        super.ao();
    }

    @Override // defpackage.ea
    public void ap(View view, Bundle bundle) {
        this.aq.k(bundle);
    }

    @Override // defpackage.dn, defpackage.ea
    public void h(Bundle bundle) {
        this.aq.x(bundle);
        super.h(bundle);
    }

    @Override // defpackage.dn, defpackage.ea
    public void i() {
        this.aq.b();
        super.i();
    }

    @Override // defpackage.dn, defpackage.ea
    public void j() {
        this.aq.c();
        super.j();
    }

    @Override // defpackage.dn, defpackage.ea
    public void k(Bundle bundle) {
        this.aq.A(bundle);
        super.k(bundle);
    }

    @Override // defpackage.dn, defpackage.ea
    public void l() {
        ecdu.a(I());
        this.aq.B();
        super.l();
    }

    @Override // defpackage.dn, defpackage.ea
    public void m() {
        this.aq.C();
        super.m();
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.aq.K();
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.ea, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.aq.M();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.aq.y();
        super.onLowMemory();
    }
}
