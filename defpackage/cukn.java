package defpackage;

import android.R;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ActionMode;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cukn extends cukt {
    public Toolbar H;
    public fcsu I;
    public fcsu J;
    public eg K;

    private final void D(int i, int i2, int i3) {
        fb().y(ColorStateList.valueOf(i));
        fb().f().setTint(i2);
        getWindow().setStatusBarColor(i3);
    }

    @Override // defpackage.cukf
    public final void W() {
        if (ab()) {
            D(cpds.a(this, R.attr.colorControlNormal), eehg.d(this, com.google.android.apps.messaging.R.attr.colorOnActionBar, "BugleToolbarActivity"), getColor(com.google.android.apps.messaging.R.color.color_primary_background_alpha96));
        }
        super.W();
    }

    @Override // defpackage.cukf
    public final void X(Exception exc) {
        cqca.h("Bugle", exc, "Bad custom theme detected");
        setTheme(com.google.android.apps.messaging.R.style.FallbackAppCompatToolbarTheme);
        if (this.y) {
            cukm.b(this);
        }
        this.z = true;
    }

    @Override // defpackage.cukf
    public final void ac(ActionMode.Callback callback, View view) {
        if (ab()) {
            int iD = eehg.d(this, com.google.android.apps.messaging.R.attr.colorPrimaryBrandIcon, "BugleToolbarActivity");
            D(iD, iD, eehg.d(this, com.google.android.apps.messaging.R.attr.colorPrimaryBackground, "BugleToolbarActivity"));
        }
        super.ac(callback, view);
    }

    @Override // defpackage.cukf, defpackage.cukc
    public cuhe fa() {
        return cuhe.o;
    }

    protected Toolbar fb() {
        View viewFindViewById = findViewById(com.google.android.apps.messaging.R.id.toolbar);
        if (viewFindViewById != null) {
            try {
                return (Toolbar) viewFindViewById;
            } catch (ClassCastException unused) {
                cqaz.c(String.valueOf(String.valueOf(getClass())).concat(" has a toolbar layout element that is not of type Toolbar"));
                return null;
            }
        }
        Toolbar toolbar = this.H;
        if (toolbar != null) {
            return toolbar;
        }
        return null;
    }

    @Override // defpackage.iy
    public void n(Toolbar toolbar) {
        super.n(toolbar);
        this.H = toolbar;
    }

    @Override // defpackage.cukf, defpackage.cukc, defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = this.K.getIntent();
        if (intent == null || !intent.getBooleanExtra("via_report_issue_notification", false)) {
            return;
        }
        ((ajgb) this.J.b()).a(((clgq) this.I.b()).f(intent, "report_issue_event_key", 4));
    }

    @Override // defpackage.cukf, defpackage.iy, defpackage.abi, android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        Toolbar toolbarFb = fb();
        this.H = toolbarFb;
        n(toolbarFb);
    }
}
