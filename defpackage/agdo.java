package defpackage;

import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agdo {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/navigation/targets/MediaViewerHelper");

    public static final aggc a(adh adhVar) {
        adhVar.getClass();
        int i = adhVar.a;
        if (i != -1) {
            ((ekrd) a.e().h("com/google/android/apps/messaging/navigation/targets/MediaViewerHelper", "convertActivityResultToTypedUri", 26, "MediaViewerHelper.kt")).r("Skipping MediaViewer activity result because of resultCode %s", i);
            return null;
        }
        Intent intent = adhVar.b;
        if (intent == null) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/navigation/targets/MediaViewerHelper", "convertActivityResultToTypedUri", 33, "MediaViewerHelper.kt")).q("Skipping MediaViewer activity result because of null intent");
            return null;
        }
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
        if (uri == null) {
            ((ekrd) a.j().h("com/google/android/apps/messaging/navigation/targets/MediaViewerHelper", "convertActivityResultToTypedUri", 39, "MediaViewerHelper.kt")).q("Skipping MediaViewer activity result because of null uri");
            return null;
        }
        String type = intent.getType();
        if (type != null) {
            return new aggc(type, uri);
        }
        ((ekrd) a.j().h("com/google/android/apps/messaging/navigation/targets/MediaViewerHelper", "convertActivityResultToTypedUri", 44, "MediaViewerHelper.kt")).q("Skipping MediaViewer activity result because of null type");
        return null;
    }
}
