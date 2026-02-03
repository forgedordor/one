package com.google.android.apps.messaging.ui.conversation.message.statuschangelist;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import defpackage.cwmy;
import defpackage.im;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MessageStatusListActivity extends cwmy {
    @Override // defpackage.cukf, defpackage.cukc, defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.message_status_list_activity);
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
