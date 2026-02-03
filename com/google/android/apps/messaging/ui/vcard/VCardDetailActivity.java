package com.google.android.apps.messaging.ui.vcard;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import defpackage.cqaz;
import defpackage.cukf;
import defpackage.ea;
import defpackage.im;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VCardDetailActivity extends cukf {
    @Override // defpackage.ecdl, defpackage.eg
    public final void h(ea eaVar) {
        super.h(eaVar);
        if (eaVar instanceof VCardDetailFragment) {
            Uri uri = (Uri) getIntent().getParcelableExtra("vcard_uri");
            uri.getClass();
            cqaz.k(!r3.a.g());
            ((VCardDetailFragment) eaVar).c = uri;
        }
    }

    @Override // defpackage.cukf, defpackage.cukc, defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.vcard_detail_activity);
        im imVarK = k();
        if (imVarK != null) {
            imVarK.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override // defpackage.cukf, defpackage.ecdl, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        c().d();
        return true;
    }
}
