package com.google.android.apps.messaging.voiceactions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import defpackage.cdil;
import defpackage.cdim;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BugleSearchActionVerificationClientActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        final Intent intent2 = new Intent(this, (Class<?>) BugleSearchActionVerificationClientService.class);
        intent2.putExtra("SearchActionVerificationClientExtraIntent", intent);
        cdim.a(new cdil() { // from class: daox
            @Override // defpackage.cdil
            public final void a() {
                this.a.startForegroundService(intent2);
            }
        });
        if (intent.getBooleanExtra("EXPECT_EXTERNAL_APP_UI", false)) {
            return;
        }
        finish();
    }
}
