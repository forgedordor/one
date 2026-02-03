package com.google.android.libraries.social.licenses;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import defpackage.abl;
import defpackage.cg;
import defpackage.ebua;
import defpackage.ebue;
import defpackage.ebuf;
import defpackage.fr;
import defpackage.iy;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class LicenseMenuActivity extends iy implements ebue {
    @Override // defpackage.ebue
    public final void B(ebua ebuaVar) {
        Intent intent = new Intent(this, (Class<?>) LicenseActivity.class);
        intent.putExtra("license", ebuaVar);
        startActivity(intent);
    }

    @Override // defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        abl.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity);
        if (k() != null) {
            k().setDisplayHomeAsUpEnabled(true);
        }
        fr frVarA = a();
        if (frVarA.g(R.id.license_menu_fragment_container) instanceof ebuf) {
            return;
        }
        ebuf ebufVar = new ebuf();
        cg cgVar = new cg(frVarA);
        cgVar.s(R.id.license_menu_fragment_container, ebufVar);
        cgVar.c();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
