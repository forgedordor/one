package defpackage;

import android.net.Uri;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efva {
    public static final Uri a;
    public static final Uri b;

    static {
        Uri uri = Uri.parse("content://com.google.android.setupwizard.deviceorigin");
        a = uri;
        uri.buildUpon().appendPath("list").build();
        b = uri.buildUpon().appendPath(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE).build();
    }
}
