package com.google.android.libraries.social.licenses;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.abl;
import defpackage.ebua;
import defpackage.ebug;
import defpackage.iy;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class LicenseActivity extends iy {
    @Override // defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException, IOException {
        abl.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_activity);
        ebua ebuaVar = (ebua) getIntent().getParcelableExtra("license");
        if (k() != null) {
            k().setTitle(ebuaVar.a);
            k().setDisplayShowHomeEnabled(true);
            k().setDisplayHomeAsUpEnabled(true);
            k().setLogo(null);
        }
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        String strA = ebug.a(this, "third_party_licenses", ebuaVar.b, ebuaVar.c);
        if (strA == null) {
            finish();
        } else {
            textView.setText(strA);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        final ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        final int i = bundle.getInt("scroll_pos");
        if (i != 0) {
            scrollView.post(new Runnable() { // from class: ebub
                @Override // java.lang.Runnable
                public final void run() {
                    Layout layout = ((TextView) this.a.findViewById(R.id.license_activity_textview)).getLayout();
                    if (layout != null) {
                        scrollView.scrollTo(0, layout.getLineTop(layout.getLineForOffset(i)));
                    }
                }
            });
        }
    }

    @Override // defpackage.abi, defpackage.hl, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        Layout layout = ((TextView) findViewById(R.id.license_activity_textview)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }
}
