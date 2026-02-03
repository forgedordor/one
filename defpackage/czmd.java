package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.navigation.targets.DirectSendResult;
import com.google.android.apps.messaging.navigation.targets.EditedMedia;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czmd extends czmg {
    public final MediaViewerActivity a;
    public final fcsu b;
    public final fcsu c;
    public czmk d;
    public abs e;
    public boolean f = false;
    public boolean g = false;

    public czmd(MediaViewerActivity mediaViewerActivity, fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = mediaViewerActivity;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    public final Intent a(Uri uri, String str, boolean z, boolean z2, String str2) {
        Intent intentPutExtra = new Intent("android.intent.action.SEND").setType(str).putExtra("android.intent.extra.STREAM", uri);
        if (!this.f) {
            return intentPutExtra;
        }
        if (z2) {
            return intentPutExtra.putExtra("direct_send_result", z ? new DirectSendResult.Send(new EditedMedia(str, uri), str2) : new DirectSendResult.Send(null, str2));
        }
        return intentPutExtra.putExtra("direct_send_result", z ? new DirectSendResult.Add(new EditedMedia(str, uri), str2) : new DirectSendResult.Add(null, str2));
    }
}
