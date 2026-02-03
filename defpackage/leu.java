package defpackage;

import android.view.ContentInfo;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class leu {
    public static lcw a(View view, lcw lcwVar) {
        ContentInfo contentInfoE = lcwVar.e();
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoE);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoE ? lcwVar : lcw.f(contentInfoPerformReceiveContent);
    }

    public static void b(View view, String[] strArr, ldo ldoVar) {
        if (ldoVar == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new lev(ldoVar));
        }
    }

    public static String[] c(View view) {
        return view.getReceiveContentMimeTypes();
    }
}
