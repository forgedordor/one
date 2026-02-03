package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoContentProvider;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmpg {
    private final Context a;

    public cmpg(Context context) {
        this.a = context;
    }

    public final BusinessInfoData a(String str) {
        Context context = this.a;
        Uri uriBuildBusinessInfoUri = BusinessInfoContentProvider.BusinessInfoContentProviderInternal.buildBusinessInfoUri(str, context);
        Uri uriBuildBusinessInfoPropertiesUri = BusinessInfoContentProvider.BusinessInfoContentProviderInternal.buildBusinessInfoPropertiesUri(str, context);
        Cursor cursorC = cdzz.c(context.getContentResolver(), uriBuildBusinessInfoUri, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.DEFAULT_PROJECTION, null, null, null);
        try {
            cursorC = cdzz.c(context.getContentResolver(), uriBuildBusinessInfoPropertiesUri, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.DEFAULT_PROJECTION, null, null, null);
            try {
                BusinessInfoData businessInfoDataCreateFromCursors = BusinessInfoData.createFromCursors(cursorC, cursorC);
                if (cursorC != null) {
                    cursorC.close();
                }
                if (cursorC != null) {
                    cursorC.close();
                }
                return businessInfoDataCreateFromCursors;
            } finally {
                if (cursorC == null) {
                    throw th;
                }
                try {
                    cursorC.close();
                    throw th;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } catch (Throwable th2) {
            if (cursorC != null) {
                try {
                    cursorC.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        }
    }
}
