package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aiic extends aiih {
    public fcsu n;

    protected int C() {
        return R.layout.base_toolbar_settings_activity_gm3;
    }

    protected abstract Integer G();

    @Override // defpackage.cukn, defpackage.cukf, defpackage.cukc
    public cuhe fa() {
        return cuhe.n;
    }

    @Override // defpackage.cukn, defpackage.cukf, defpackage.cukc, defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected void onCreate(Bundle bundle) {
        View viewFindViewById;
        super.onCreate(bundle);
        boolean zA = ((asgn) this.n.b()).a();
        if (zA) {
            abl.a(this);
        }
        setContentView(C());
        ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
        if (!zA) {
            getWindow().setStatusBarColor(0);
            viewGroup.setSystemUiVisibility(1792);
        }
        viewGroup.setOnApplyWindowInsetsListener(new dajf(new daje() { // from class: aihz
            @Override // defpackage.daje
            public final void a(View view, WindowInsets windowInsets) {
                view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), 0);
            }
        }));
        im imVarK = k();
        if (imVarK != null) {
            imVarK.setDisplayHomeAsUpEnabled(true);
        }
        Toolbar toolbar = (Toolbar) viewGroup.findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.t(new View.OnClickListener() { // from class: aiia
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.c().d();
                }
            });
        }
        Integer numG = G();
        if (numG == null) {
            if (!afic.a(this, false) || (viewFindViewById = viewGroup.findViewById(R.id.fragment_container)) == null) {
                return;
            }
            dakl.n(this, viewFindViewById);
            return;
        }
        View viewFindViewById2 = findViewById(numG.intValue());
        viewFindViewById2.setOnApplyWindowInsetsListener(new dajf(new daje() { // from class: aiib
            @Override // defpackage.daje
            public final void a(View view, WindowInsets windowInsets) {
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
            }
        }));
        if (afic.a(this, false)) {
            dakl.n(this, viewFindViewById2);
        }
    }
}
