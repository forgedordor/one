package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.util.Rational;
import org.json.JSONException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class dbau extends fdbo implements fdap {
    public dbau(Object obj) {
        super(1, obj, dbaw.class, "onPlayerIsFullscreen", "onPlayerIsFullscreen(Z)V", 0);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, pxg] */
    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        dbaw dbawVar = (dbaw) this.g;
        ekrg ekrgVar = dbaw.a;
        if (!zBooleanValue) {
            Activity activity = dbawVar.c;
            if (activity.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
                pxf pxfVar = pxg.a;
                Rect rectA = pxf.b.invoke(pxf.c).a(activity).a();
                Rational rational = dbaw.b;
                rational.getClass();
                activity.enterPictureInPictureMode(dbawVar.a().setSourceRectHint(rectA.width() < rectA.height() ? new Rect(rectA.left, rectA.top, rectA.right, rectA.top + fdcu.b(rectA.width() / rational.floatValue())) : new Rect(rectA.left, rectA.top, rectA.left + fdcu.b(rectA.height() * rational.floatValue()), rectA.bottom)).build());
            } else {
                ((dbap) dbawVar.g.b()).c(true);
                ((ekrd) dbaw.a.h().h("com/google/android/apps/messaging/youtube/YouTubePlayerFragmentPeer", "tryEnterPictureInPictureMode", 128, "YouTubePlayerFragmentPeer.kt")).q("Device does not support picture-in-picture mode.");
            }
        }
        return fctx.a;
    }
}
