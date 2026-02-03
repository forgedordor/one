package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.home.SpamFolderActivity;
import com.google.android.apps.messaging.ui.appsettings.PerSubscriptionSettingsActivity;
import com.google.android.apps.messaging.ui.ditto.DittoActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agjn implements cgdc {
    @Override // defpackage.cgdc
    public final Optional a(Context context, int i, String str) {
        kxg kxgVar = new kxg(context);
        kxgVar.d(new Intent(context, (Class<?>) PerSubscriptionSettingsActivity.class).putExtra("sub_id", i).putExtra("per_sub_setting_title", str));
        ClipData clipData = ebsn.a;
        PendingIntent pendingIntentA = kxgVar.a(0, 201326592);
        pendingIntentA.getClass();
        return Optional.of(pendingIntentA);
    }

    @Override // defpackage.cgdc
    public final Intent b(Optional optional) {
        Intent intent = new Intent("android.intent.action.DIAL");
        if (optional.isPresent()) {
            alqm alqmVar = (alqm) optional.get();
            cczv cczvVar = alvx.a;
            intent.setData(Uri.parse(String.format("tel:%s", alqmVar.p(((Boolean) new alvp().get()).booleanValue()))));
        }
        return intent;
    }

    @Override // defpackage.cgdc
    public final Optional c(Context context) {
        Intent intentA = aiiw.c(context, DittoActivity.class, "android.intent.action.VIEW").a();
        intentA.putExtra("started_from_notification", true);
        return Optional.ofNullable(ebsn.a(context, -1, intentA, crag.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS)));
    }

    @Override // defpackage.cgdc
    public final Optional d(Context context) {
        Intent intent = new Intent(context, (Class<?>) SpamFolderActivity.class);
        intent.putExtra("spam_folder_opened_source", 2);
        kxg kxgVar = new kxg(context);
        kxgVar.e(intent);
        ClipData clipData = ebsn.a;
        PendingIntent pendingIntentA = kxgVar.a(0, 201326592);
        pendingIntentA.getClass();
        return Optional.of(pendingIntentA);
    }
}
