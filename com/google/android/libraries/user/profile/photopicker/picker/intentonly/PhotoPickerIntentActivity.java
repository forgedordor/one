package com.google.android.libraries.user.profile.photopicker.picker.intentonly;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import com.google.android.apps.messaging.R;
import defpackage.dsuy;
import defpackage.dsva;
import defpackage.dsvb;
import defpackage.dswb;
import defpackage.dtaa;
import defpackage.dzyn;
import defpackage.eddo;
import defpackage.eddq;
import defpackage.edtt;
import defpackage.edtu;
import defpackage.edtv;
import defpackage.eduq;
import defpackage.eduu;
import defpackage.edux;
import defpackage.eduy;
import defpackage.eduz;
import defpackage.edvb;
import defpackage.ejud;
import defpackage.ejvr;
import defpackage.ejwi;
import defpackage.ejwl;
import defpackage.ekeh;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.eygj;
import defpackage.eygk;
import defpackage.fbgv;
import defpackage.fcsu;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PhotoPickerIntentActivity extends edvb implements eygk, edux {
    private static final ekrg x = ekrg.c("com/google/android/libraries/user/profile/photopicker/picker/intentonly/PhotoPickerIntentActivity");
    public eduq o;
    public fcsu p;
    public dswb q;
    public dsva r;
    public eduy s;
    public eddo t;
    public edtv u;
    public dsvb v;
    public eygj w;

    @Override // defpackage.edux
    public final eduu E() {
        return (eduu) this.p.b();
    }

    @Override // defpackage.eygk
    public final eygj ab() {
        return this.w;
    }

    @Override // defpackage.eg, defpackage.abi, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) throws IOException {
        Uri uri;
        super.onActivityResult(i, i2, intent);
        ekrg ekrgVar = x;
        ((ekrd) ((ekrd) ekrgVar.e()).h("com/google/android/libraries/user/profile/photopicker/picker/intentonly/PhotoPickerIntentActivity", "onActivityResult", 151, "PhotoPickerIntentActivity.java")).r("onActivityResult with requestCode: %d", i);
        if (i2 == -1 && i == 10000 && intent != null) {
            ((ekrd) ((ekrd) ekrgVar.e()).h("com/google/android/libraries/user/profile/photopicker/picker/intentonly/PhotoPickerIntentActivity", "onActivityResult", 158, "PhotoPickerIntentActivity.java")).q("onActivityResult for REQUEST_IMAGE_EDIT");
            Uri data = intent.getData();
            Intent intent2 = getIntent();
            if (intent2 == null || intent2.getExtras() == null) {
                setResult(0);
                finish();
                uri = null;
            } else {
                uri = (Uri) intent2.getExtras().getParcelable("output");
            }
            if (data == null || uri == null) {
                return;
            }
            try {
                Bitmap bitmapA = this.t.a(data);
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                FileOutputStream fileOutputStream = new FileOutputStream(uri.getPath());
                try {
                    bitmapA.compress(compressFormat, 100, fileOutputStream);
                    fileOutputStream.close();
                    Intent intent3 = new Intent();
                    intent3.setData(uri);
                    setResult(-1, intent3);
                    ((ekrd) ((ekrd) ekrgVar.e()).h("com/google/android/libraries/user/profile/photopicker/picker/intentonly/PhotoPickerIntentActivity", "onActivityResult", 168, "PhotoPickerIntentActivity.java")).q("onActivityResult - finish the activity for the Photo Picker Intent variant here.");
                    this.s.a();
                    finish();
                } finally {
                }
            } catch (IOException unused) {
                ((ekrd) ((ekrd) x.e()).h("com/google/android/libraries/user/profile/photopicker/picker/intentonly/PhotoPickerIntentActivity", "onActivityResult", 173, "PhotoPickerIntentActivity.java")).r("onActivityResult with requestCode: %d", 10000);
            }
        }
    }

    @Override // defpackage.edvb, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (getIntent().getBooleanExtra("com.google.profile.photopicker.SET_PHENOTYPE_CONTEXT", false)) {
            dzyn.f(this);
        }
        eddq.a(this);
        eduz.a(this);
        super.onCreate(bundle);
        ejwl.b(this.o.a(), "invalid intent params");
        dsuy dsuyVarA = this.q.b.a(89757);
        dsuyVarA.g(this.v);
        dsuyVarA.g(dtaa.b());
        dsuyVarA.f(this.r);
        dsuyVarA.d(this);
        boolean booleanExtra = getIntent().getBooleanExtra("skip_google_photos", false);
        if (!fbgv.n()) {
            if (booleanExtra) {
                ((eduu) this.p.b()).j();
                return;
            } else {
                ((eduu) this.p.b()).g();
                fbgv.v();
                return;
            }
        }
        this.u.b(edtt.GOOGLE_PHOTOS, !booleanExtra);
        if (this.u.a().size() == 1 && edtt.DEVICE_PHOTOS.equals(((edtu) this.u.a().get(0)).e())) {
            ((eduu) this.p.b()).j();
        } else {
            Iterator it = ekeh.d(this.u.a()).h().iterator();
            int iOrdinal = ((edtt) (it.hasNext() ? ejwi.j(it.next()) : ejud.a).b(new ejvr() { // from class: edvc
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return ((edtu) obj).e();
                }
            }).e(edtt.DEVICE_PHOTOS)).ordinal();
            if (iOrdinal == 0) {
                ((eduu) this.p.b()).f();
            } else if (iOrdinal == 1) {
                ((eduu) this.p.b()).h();
            } else if (iOrdinal == 2) {
                ((eduu) this.p.b()).g();
            } else if (iOrdinal == 3) {
                ((eduu) this.p.b()).i();
            }
        }
        fbgv.v();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.photo_picker_common_menu, menu);
        return true;
    }
}
