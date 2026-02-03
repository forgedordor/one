package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.os.Bundle;
import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dryz {
    private static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/webdebugbridge/util/WebDebugBridgeUtil");

    public static dryn a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("result");
        if (string == null) {
            ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/inputmethod/webdebugbridge/util/WebDebugBridgeUtil", "getResponseFromBundle", 79, "WebDebugBridgeUtil.java")).q("There's no result in the WDB response.");
            return null;
        }
        try {
            return (dryn) evsn.parseFrom(dryn.a, eldz.e.k(string), evrr.a());
        } catch (evtj unused) {
            ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/inputmethod/webdebugbridge/util/WebDebugBridgeUtil", "getResponseFromBundle", 86, "WebDebugBridgeUtil.java")).q("The result in the WDB response is not a valid proto.");
            return null;
        }
    }

    public static Bundle b(Context context, String str, dryj dryjVar) throws Exception {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(str);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/inputmethod/webdebugbridge/util/WebDebugBridgeUtil", "sendRequestForBundle", 55, "WebDebugBridgeUtil.java")).q("Fail to get content provider client.");
                return null;
            }
            Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("9003", dryjVar != null ? Base64.encodeToString(dryjVar.toByteArray(), 3) : null, null);
            if (bundleCall == null) {
                ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/inputmethod/webdebugbridge/util/WebDebugBridgeUtil", "sendRequestForBundle", 66, "WebDebugBridgeUtil.java")).q("The response bundle is null.");
            }
            contentProviderClientAcquireUnstableContentProviderClient.close();
            return bundleCall;
        } catch (Throwable th) {
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
