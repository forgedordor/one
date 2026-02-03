package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ef extends en implements kxy, kxz, gx, gy, lxq, ach, adr, pjb, fx, ldd {
    final /* synthetic */ eg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef(eg egVar) {
        super(egVar, egVar, new Handler());
        this.a = egVar;
    }

    @Override // defpackage.lvj
    public final lvc P() {
        return this.a.b;
    }

    @Override // defpackage.lxq
    public final lxp S() {
        return this.a.S();
    }

    @Override // defpackage.pjb
    public final pix U() {
        return this.a.U();
    }

    @Override // defpackage.en, defpackage.ek
    public final View a(int i) {
        return this.a.findViewById(i);
    }

    @Override // defpackage.en, defpackage.ek
    public final boolean b() {
        Window window = this.a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.ach
    public final ace c() {
        return this.a.c();
    }

    @Override // defpackage.adr
    public final adq d() {
        return this.a.h;
    }

    @Override // defpackage.en
    public final void f() {
        this.a.invalidateOptionsMenu();
    }

    @Override // defpackage.kxy
    public final void g(lbz lbzVar) {
        throw null;
    }

    @Override // defpackage.fx
    public final void h(ea eaVar) {
        this.a.h(eaVar);
    }

    @Override // defpackage.kxy
    public final void hg(lbz lbzVar) {
        this.a.hg(lbzVar);
    }
}
