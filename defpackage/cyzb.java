package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraActivity;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraContentItem;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyzb extends cyzc implements czjf {
    public final CameraActivity a;
    public final crma b;
    public final fcsu c;
    public final srw d;
    public final tlt e;
    public czez f;
    public abs g;
    public final czie h;
    private final cogw j;

    public cyzb(CameraActivity cameraActivity, cogw cogwVar, fcsu fcsuVar, crma crmaVar, Optional optional, tlt tltVar, srw srwVar) {
        this.a = cameraActivity;
        this.j = cogwVar;
        this.c = fcsuVar;
        this.b = crmaVar;
        this.h = (czie) optional.get();
        this.e = tltVar;
        this.d = srwVar;
    }

    private static dmca d(emrt emrtVar, dmbu dmbuVar) {
        int iA = emrn.a(emrtVar.d);
        if (iA == 0) {
            iA = 1;
        }
        int i = iA - 1;
        int i2 = i != 1 ? i != 2 ? 1 : 2 : 3;
        int iA2 = emrq.a(emrtVar.e);
        if (iA2 == 0) {
            iA2 = 1;
        }
        int i3 = iA2 - 1;
        return new dmbx(dmbuVar, i2, i3 != 1 ? i3 != 2 ? 1 : 3 : 2, emrtVar.f, null, null);
    }

    public final void a() {
        this.a.finish();
    }

    public final void b() {
        Intent intent = new Intent();
        CameraActivity cameraActivity = this.a;
        cameraActivity.setResult(-1, intent.putExtra("attachment_queue_state_extra_key", ((cyvb) cameraActivity).n));
    }

    @Override // defpackage.czjf
    public final void c(Uri uri, String str, int i, int i2, long j, emrt emrtVar) {
        Intent intent = new Intent();
        CameraActivity cameraActivity = this.a;
        if (cameraActivity.getIntent().getBooleanExtra("IS_USING_C2O_CAMERA_GALLERY", false)) {
            intent.putExtra("camera_gallery_item", new CameraContentItem(uri, str, i, i2, j, elha.FULLSCREEN_CAMERA, TimeUnit.MILLISECONDS.toSeconds(this.j.f().toEpochMilli()), emrtVar));
            if (!((Boolean) cyzf.b.e()).booleanValue()) {
                intent.putExtra("attachment_queue_state_extra_key", ((cyvb) cameraActivity).n);
            }
        } else {
            int iA = emrs.a(emrtVar.c);
            if (iA == 0) {
                iA = 1;
            }
            if (iA == 2) {
                dogz dogzVar = dogz.a;
                String string = uri.toString();
                Instant instantF = this.j.f();
                dmca dmcaVarD = d(emrtVar, dmbu.b);
                string.getClass();
                instantF.getClass();
                intent.putExtra("camera_gallery_item", new dojr(dogzVar, string, null, null, i, i2, 0L, instantF, dmcaVarD, 8));
            } else if (iA == 3) {
                doix doixVar = doix.a;
                String string2 = uri.toString();
                Instant instantF2 = this.j.f();
                dmca dmcaVarD2 = d(emrtVar, dmbu.b);
                Duration durationOfMillis = Duration.ofMillis(j);
                string2.getClass();
                instantF2.getClass();
                durationOfMillis.getClass();
                intent.putExtra("camera_gallery_item", new doju(doixVar, string2, null, null, i, i2, 0L, instantF2, dmcaVarD2, durationOfMillis, 8));
            }
        }
        cameraActivity.setResult(-1, intent);
        a();
    }
}
