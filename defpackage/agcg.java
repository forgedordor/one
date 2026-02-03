package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.android.vcard.VCardConfig;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agcg implements afyw {
    private final Activity a;
    private final eksp b = eksp.c("BugleConversation");

    public agcg(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        return b();
    }

    public final Object b() {
        Iterator it = fcva.g("android.settings.WIRELESS_SETTINGS", "android.settings.WIFI_SETTINGS", "android.settings.SETTINGS").iterator();
        while (it.hasNext()) {
            Intent intent = new Intent((String) it.next());
            intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            try {
                this.a.startActivity(intent);
                return fctx.a;
            } catch (ActivityNotFoundException unused) {
            }
        }
        ((eksl) this.b.j()).q("Failed to find settings activity to start for connectivity.");
        return fctx.a;
    }
}
