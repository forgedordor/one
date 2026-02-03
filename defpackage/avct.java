package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avct {
    private final Context a;
    private final fcsu b;

    public avct(Context context, fcsu fcsuVar) {
        this.a = context;
        this.b = fcsuVar;
    }

    public static Uri a(Uri uri, String str, long j) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (uri.equals(ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI) || uri.equals(ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI)) {
            builderBuildUpon.appendQueryParameter("limit", (String) cqiz.b.e());
        }
        return builderBuildUpon.appendPath(str).appendQueryParameter("directory", String.valueOf(j)).build();
    }

    public static boolean e(String str) {
        return str != null && str.contains("@");
    }

    public final cqjc b(String str, cqjb cqjbVar) {
        return e(str) ? c(ContactsContract.CommonDataKinds.Email.ENTERPRISE_CONTENT_FILTER_URI, str, cqjbVar) : d(ContactsContract.CommonDataKinds.Phone.ENTERPRISE_CONTENT_FILTER_URI, str, cqjbVar);
    }

    public final cqjc c(Uri uri, String str, cqjb cqjbVar) {
        if (!((crma) this.b.b()).h()) {
            return new cqip(cqjbVar, null);
        }
        return new cqip(cqjbVar, new bacf(this.a, a(uri, str, cqjbVar.a()), avcr.a, null, null, "sort_key").a());
    }

    public final cqjc d(Uri uri, String str, cqjb cqjbVar) {
        if (!((crma) this.b.b()).h()) {
            return new cqip(cqjbVar, null);
        }
        return new cqip(cqjbVar, new bacf(this.a, a(uri, str, cqjbVar.a()), avcr.a, null, null, "sort_key").a());
    }
}
