package com.google.android.libraries.user.profile.photopicker.picker.intentonly.webview;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import defpackage.adj;
import defpackage.aeo;
import defpackage.drjk;
import defpackage.eddo;
import defpackage.eddy;
import defpackage.edvg;
import defpackage.edvh;
import defpackage.edvi;
import defpackage.edvj;
import defpackage.edvk;
import defpackage.ekrg;
import defpackage.etzq;
import defpackage.fcti;
import defpackage.fcwa;
import defpackage.fdbq;
import defpackage.kxl;
import defpackage.rti;
import defpackage.rtp;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PhotoPickerWebViewIntentActivity extends edvg {
    public static final ekrg o = ekrg.c("com/google/android/libraries/user/profile/photopicker/picker/intentonly/webview/PhotoPickerWebViewIntentActivity");
    private static final String y = edvh.a("style");
    private static final Map z = fcwa.g(new fcti("com.google.profile.photopicker.HIDE_PAST_PROFILE_PHOTOS", edvh.a("hppp")), new fcti("com.google.profile.photopicker.HIDE_HELP_CENTER", edvh.a("hhc")));
    private String B;
    public eddo p;
    public eddy q;
    public drjk r;
    public Uri s;
    public boolean u;
    public boolean v;
    private final adj A = v(new aeo(), new edvi(this));
    public String t = "UNKNOWN_PICTURE_CHANGE_SOURCE";
    public final rtp w = new edvj(this);
    public final rti x = new edvk(this);

    @Override // defpackage.edvg, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.progress_circle_view);
        String stringExtra = getIntent().getStringExtra("com.google.profile.photopicker.ACCOUNT");
        if (stringExtra == null) {
            throw new IllegalArgumentException("missing accountName");
        }
        this.B = stringExtra;
        Object objA = kxl.a(getIntent(), "output", Uri.class);
        if (objA == null) {
            throw new IllegalArgumentException("missing uri");
        }
        this.s = (Uri) objA;
        this.v = getIntent().getBooleanExtra("com.google.profile.photopicker.FULL_SIZE_PHOTO", false);
    }

    @Override // defpackage.eg, android.app.Activity
    protected final void onResume() {
        super.onResume();
        if (this.u) {
            return;
        }
        adj adjVar = this.A;
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.accountsettings.action.VIEW_SETTINGS");
        intent.setPackage("com.google.android.gms");
        String str = this.B;
        if (str == null) {
            fdbq.c("accountName");
            str = null;
        }
        intent.putExtra("extra.accountName", str);
        intent.putExtra("extra.screenId", etzq.OBAKE_PICTURE_PICKER_ONLY_SCREEN.rz);
        for (Map.Entry entry : z.entrySet()) {
            if (getIntent().getBooleanExtra((String) entry.getKey(), false)) {
                intent.putExtra((String) entry.getValue(), true);
            }
        }
        if (getIntent().getBooleanExtra("com.google.profile.photopicker.YOUTUBE_STYLE", false)) {
            intent.putExtra(y, "youtube");
        }
        adjVar.c(intent);
    }
}
