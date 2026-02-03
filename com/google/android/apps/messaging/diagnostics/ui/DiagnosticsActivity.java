package com.google.android.apps.messaging.diagnostics.ui;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.abcn;
import defpackage.cuhe;
import defpackage.im;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DiagnosticsActivity extends abcn {
    @Override // defpackage.cukn, defpackage.cukf, defpackage.cukc
    public final cuhe fa() {
        return cuhe.g;
    }

    @Override // defpackage.cukn, defpackage.cukf, defpackage.cukc, defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.diagnostics_activity);
        im imVarK = k();
        if (imVarK != null) {
            imVarK.setDisplayHomeAsUpEnabled(true);
            imVarK.setTitle(R.string.diagnostics_activity_title);
        }
        Toolbar toolbarFb = fb();
        if (toolbarFb != null) {
            toolbarFb.t(new View.OnClickListener() { // from class: abca
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.c().d();
                }
            });
        }
    }
}
