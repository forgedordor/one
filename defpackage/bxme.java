package defpackage;

import android.net.Uri;
import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxme {
    public static final Uri a = Uri.parse("content://com.google.android.apps.messaging.shared.datamodel.provider.sharedstorage.SharedStorageProvider");

    /* JADX WARN: Type inference failed for: r1v2, types: [evuh, java.lang.Object] */
    public static evuh a(String str, evuh evuhVar) {
        return evuhVar.getParserForType().l(Base64.decode(str, 0), evrr.a());
    }

    public static String b(evuh evuhVar) {
        return Base64.encodeToString(evuhVar.toByteArray(), 0);
    }
}
