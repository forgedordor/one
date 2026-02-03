package com.google.android.gms.duokit;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.dcur;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DuoKitContainerActivity extends Activity {
    public static void a(Context context, boolean z, ArrayList arrayList) {
        Intent intentAddFlags = new Intent(true != z ? "com.google.android.gms.duokit.action.LAUNCH_DUO" : "com.google.android.gms.duokit.action.REGISTER_DUO").setClassName(context, DuoKitContainerActivity.class.getName()).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        if (!arrayList.isEmpty()) {
            intentAddFlags.putStringArrayListExtra("com.google.android.apps.tachyon.extra.CALLEES", arrayList);
        }
        context.startActivity(intentAddFlags);
    }

    private final void b() {
        String str = getIntent().hasExtra("com.google.android.apps.tachyon.extra.REFERRER") ? String.format("%s-%s-%s", "duokit", getPackageName(), getIntent().getStringExtra("com.google.android.apps.tachyon.extra.REFERRER")) : String.format("%s-%s", "duokit", getPackageName());
        try {
            startActivityForResult(new Intent("android.intent.action.VIEW").setData(Uri.parse(String.format("market://details?id=%s&allow_update=1&referrer=%s", "com.google.android.apps.tachyon", str))).putExtra("overlay", true).putExtra("callerId", getPackageName()).putExtra("referrer", str).putExtra("allow_update", true).setPackage("com.android.vending"), 0);
        } catch (ActivityNotFoundException e) {
            Log.w("DuoKitContainerActivity", "Cannot launch AlleyOop activity", e);
            dcur.a(this);
        }
        finish();
    }

    private final void c() {
        d(new Intent("android.intent.action.MAIN").setPackage("com.google.android.apps.tachyon"));
    }

    private final void d(Intent intent) {
        e(intent, 0);
    }

    private final void e(Intent intent, int i) {
        intent.putExtra("com.google.android.gms.duokit.extra.DUOKIT_VERSION", "0.0.1");
        if (getIntent().getStringExtra("com.google.android.apps.tachyon.extra.REFERRER") != null) {
            intent.putExtra("com.google.android.apps.tachyon.extra.REFERRER", getIntent().getStringExtra("com.google.android.apps.tachyon.extra.REFERRER"));
        }
        try {
            startActivityForResult(intent, i);
        } catch (ActivityNotFoundException e) {
            Log.e("DuoKitContainerActivity", "No activity found to handle intent", e);
            Toast.makeText(this, R.string.no_activity_found_error, 0).show();
        }
        if (i == 0) {
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (Log.isLoggable("DuoKitContainerActivity", 4)) {
            Log.i("DuoKitContainerActivity", a.s(i2, i, "onActivityResult with requestCode: ", ", resultCode: "));
        }
        if (i == 100) {
            if (i2 != 0) {
                finish();
            } else {
                Log.w("DuoKitContainerActivity", "Start group request failed, try to launch Duo");
                c();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getAction()
            java.lang.String r0 = "DuoKitContainerActivity"
            if (r8 != 0) goto L18
            java.lang.String r8 = "null action"
            android.util.Log.e(r0, r8)
            r7.finish()
            return
        L18:
            int r1 = r8.hashCode()
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r1) {
                case -1769882372: goto L4d;
                case -1611836229: goto L43;
                case -704052074: goto L39;
                case 179439980: goto L2f;
                case 1616149577: goto L25;
                default: goto L24;
            }
        L24:
            goto L57
        L25:
            java.lang.String r1 = "com.google.android.gms.duokit.action.DUO_CALL"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L57
            r8 = r4
            goto L58
        L2f:
            java.lang.String r1 = "com.google.android.gms.duokit.action.REGISTER_DUO"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L57
            r8 = r5
            goto L58
        L39:
            java.lang.String r1 = "com.google.android.gms.duokit.action.DUO_START_GROUP_FLOW"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L57
            r8 = r3
            goto L58
        L43:
            java.lang.String r1 = "com.google.android.gms.duokit.action.INSTALL_DUO_VIA_ALLEYOOP"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L57
            r8 = r2
            goto L58
        L4d:
            java.lang.String r1 = "com.google.android.gms.duokit.action.LAUNCH_DUO"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L57
            r8 = r6
            goto L58
        L57:
            r8 = -1
        L58:
            if (r8 == 0) goto Ldf
            if (r8 == r6) goto Ldb
            java.lang.String r1 = "com.google.android.apps.tachyon"
            if (r8 == r5) goto Lb5
            if (r8 == r4) goto L8c
            if (r8 == r3) goto L6d
            java.lang.String r8 = "Container activity called without an action! Not launching any activity."
            android.util.Log.e(r0, r8)
            r7.finish()
            return
        L6d:
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r0 = "com.google.android.apps.tachyon.action.CALL_GROUP_MEMBERS"
            r8.<init>(r0)
            android.content.Intent r8 = r8.setPackage(r1)
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r1 = "members"
            java.util.ArrayList r0 = r0.getStringArrayListExtra(r1)
            android.content.Intent r8 = r8.putStringArrayListExtra(r1, r0)
            r0 = 100
            r7.e(r8, r0)
            return
        L8c:
            android.content.Intent r8 = r7.getIntent()
            android.net.Uri r8 = r8.getData()
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r3 = "com.google.android.apps.tachyon.extra.IS_AUDIO_ONLY"
            boolean r0 = r0.getBooleanExtra(r3, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r4 = "com.google.android.apps.tachyon.action.CALL"
            r2.<init>(r4)
            android.content.Intent r1 = r2.setPackage(r1)
            android.content.Intent r8 = r1.setData(r8)
            android.content.Intent r8 = r8.putExtra(r3, r0)
            r7.d(r8)
            return
        Lb5:
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r0 = "com.google.android.apps.tachyon.action.REGISTER"
            r8.<init>(r0)
            android.content.Intent r8 = r8.setPackage(r1)
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r1 = "com.google.android.apps.tachyon.extra.CALLEES"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto Ld7
            android.content.Intent r0 = r7.getIntent()
            java.util.ArrayList r0 = r0.getStringArrayListExtra(r1)
            r8.putExtra(r1, r0)
        Ld7:
            r7.d(r8)
            return
        Ldb:
            r7.c()
            return
        Ldf:
            r7.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.duokit.DuoKitContainerActivity.onCreate(android.os.Bundle):void");
    }
}
