package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cukf extends cukr {
    public static final cqce o = cqce.g("Bugle", "BugleActionBarActivity");
    public fcsu A;
    public fcsu B;
    public fcsu C;
    public fcsu D;
    public eigp E;
    public fcsu F;
    public fcsu G;
    private ActionMode.Callback H;
    private long n;
    public cuke p;
    public ActionMode q;
    public Menu r;
    boolean y;
    boolean z;

    public boolean K() {
        return ((arfl) this.G.b()).a();
    }

    public boolean O() {
        return false;
    }

    public final ActionMode.Callback Q() {
        if (K()) {
            return this.H;
        }
        cuke cukeVar = this.p;
        if (cukeVar == null) {
            return null;
        }
        return cukeVar.c;
    }

    public final Optional V() {
        return Optional.ofNullable(K() ? this.q : this.p);
    }

    public void W() {
        if (!K()) {
            cuke cukeVar = this.p;
            if (cukeVar != null) {
                cukeVar.finish();
                this.p = null;
                Y();
                return;
            }
            return;
        }
        ActionMode actionMode = this.q;
        if (actionMode != null) {
            actionMode.finish();
            this.q = null;
            this.H = null;
            o();
        }
    }

    public void X(Exception exc) {
        o.n("Bad custom theme detected");
        setTheme(R.style.FallbackAppCompatTheme);
        if (this.y) {
            cukm.b(this);
        }
        this.z = true;
    }

    public final void Y() {
        Menu menu;
        im imVarK = k();
        if (imVarK == null || this.q != null) {
            return;
        }
        cuke cukeVar = this.p;
        if (cukeVar == null) {
            fw(imVarK);
            return;
        }
        cukf cukfVar = cukeVar.d;
        Menu menu2 = cukfVar.r;
        if (menu2 != null) {
            menu2.clear();
        }
        imVarK.setDisplayOptions(4);
        imVarK.setHomeActionContentDescription(cukfVar.getResources().getString(R.string.action_close));
        CharSequence charSequence = cukeVar.a;
        if (charSequence != null) {
            imVarK.setTitle(charSequence);
            imVarK.setDisplayShowTitleEnabled(true);
        } else {
            imVarK.setDisplayShowTitleEnabled(false);
        }
        imVarK.setDisplayShowCustomEnabled(false);
        ActionMode.Callback callback = cukeVar.c;
        if (callback != null && (menu = cukfVar.r) != null) {
            callback.onCreateActionMode(cukeVar, menu);
            callback.onPrepareActionMode(cukeVar, cukfVar.r);
        }
        imVarK.setBackgroundDrawable(new ColorDrawable(eehg.d(cukfVar, R.attr.colorPrimaryBackground, "BugleActionBarActivity")));
        imVarK.setHomeAsUpIndicator(R.drawable.tinted_quantum_ic_clear_24);
        cukfVar.aa(8);
        imVarK.show();
    }

    public final void Z() {
        eieu eieuVarK = eiiy.k("BugleActionBarActivity requestReceiveWapPushPermissionIfNeeded");
        try {
            if (((cmum) this.B.b()).a.get() && !((crma) this.C.b()).m()) {
                o.m("WAP Push SI enabled but no permission to receive. Requesting.");
                ((crmg) this.u.b()).h(new cukd(this));
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void aa(int i) {
        View viewFindViewById = findViewById(R.id.lockup);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(i);
        }
    }

    public final boolean ab() {
        return !K();
    }

    public void ac(ActionMode.Callback callback, View view) {
        if (K()) {
            this.q = startActionMode(callback);
            this.H = callback;
            Menu menu = this.r;
            if (menu != null) {
                menu.clear();
                return;
            }
            return;
        }
        cuke cukeVar = new cuke(this, callback);
        this.p = cukeVar;
        cukeVar.b = view;
        cukeVar.a = null;
        o();
        Y();
    }

    @Override // defpackage.cukc
    public cuhe fa() {
        return cuhe.c;
    }

    protected void fw(im imVar) {
        imVar.setHomeAsUpIndicator((Drawable) null);
        aa(0);
    }

    @Override // defpackage.iy
    public final im k() {
        try {
            return super.k();
        } catch (IllegalStateException e) {
            X(e);
            return super.k();
        }
    }

    @Override // defpackage.cukc, defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.y = false;
        super.onCreate(bundle);
        cqbd cqbdVarA = o.a();
        cqbdVarA.I(getLocalClassName());
        cqbdVarA.I(".onCreate");
        cqbdVarA.r();
        P().c((lvi) this.D.b());
    }

    @Override // defpackage.ecdl, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.r = menu;
        cuke cukeVar = this.p;
        return cukeVar != null && cukeVar.c.onCreateActionMode(cukeVar, menu);
    }

    @Override // defpackage.ecdl, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        cuke cukeVar = this.p;
        if (cukeVar != null && cukeVar.c.onActionItemClicked(cukeVar, menuItem)) {
            return true;
        }
        if (menuItem.getItemId() != 16908332 || this.p == null) {
            return super.onOptionsItemSelected(menuItem);
        }
        W();
        return true;
    }

    @Override // defpackage.cukc, defpackage.ecdl, defpackage.eg, android.app.Activity
    protected void onPause() {
        super.onPause();
        cqbd cqbdVarA = o.a();
        cqbdVarA.I(getLocalClassName());
        cqbdVarA.I(".onPause");
        cqbdVarA.r();
        ((cukm) this.F.b()).a(this.s.f().toEpochMilli() - this.n);
    }

    @Override // defpackage.ecdl, android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        this.r = menu;
        cuke cukeVar = this.p;
        if (cukeVar == null || !cukeVar.c.onPrepareActionMode(cukeVar, menu)) {
            return super.onPrepareOptionsMenu(menu);
        }
        return true;
    }

    @Override // defpackage.cukc, android.app.Activity
    protected void onRestart() {
        eieh eiehVarC = this.E.c("BugleActionBarActivity onRestart", "com/google/android/apps/messaging/ui/activity/BugleActionBarActivity", "onRestart", 145);
        try {
            cqbd cqbdVarA = o.a();
            cqbdVarA.I(getLocalClassName());
            cqbdVarA.I(".onRestart");
            cqbdVarA.r();
            super.onRestart();
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cukc, defpackage.ecdl, defpackage.eg, android.app.Activity
    protected void onResume() {
        this.y = true;
        super.onResume();
        cqbd cqbdVarA = o.a();
        cqbdVarA.I(getLocalClassName());
        cqbdVarA.I(".onResume");
        cqbdVarA.r();
        if (this.z) {
            cukm.b(this);
            return;
        }
        this.n = this.s.f().toEpochMilli();
        if (O()) {
            return;
        }
        Z();
    }

    @Override // defpackage.cukc, defpackage.ecdl, defpackage.iy, defpackage.eg, android.app.Activity
    protected void onStart() {
        super.onStart();
        cqbd cqbdVarA = o.a();
        cqbdVarA.I(getLocalClassName());
        cqbdVarA.I(".onStart");
        cqbdVarA.r();
    }

    @Override // defpackage.cukc, defpackage.ecdl, defpackage.iy, defpackage.eg, android.app.Activity
    protected void onStop() {
        super.onStop();
        cqbd cqbdVarA = o.a();
        cqbdVarA.I(getLocalClassName());
        cqbdVarA.I(".onStop");
        cqbdVarA.r();
    }

    @Override // defpackage.iy, defpackage.abi, android.app.Activity
    public void setContentView(int i) {
        try {
            super.setContentView(i);
        } catch (IllegalStateException e) {
            X(e);
        }
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        im imVarK = k();
        if (imVarK != null) {
            imVarK.setTitle(charSequence);
        }
    }
}
