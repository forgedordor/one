package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aek extends adx {
    @Override // defpackage.adx
    public final /* synthetic */ Intent a(Context context, Object obj) {
        adv advVar = (adv) obj;
        advVar.getClass();
        if (aee.c()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(aee.b(advVar.a));
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            return intent;
        }
        if (aee.a(context) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(aee.b(advVar.a));
            if (intent2.getType() != null) {
                return intent2;
            }
            intent2.setType("*/*");
            intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            return intent2;
        }
        ResolveInfo resolveInfoA = aee.a(context);
        if (resolveInfoA == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = resolveInfoA.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(aee.b(advVar.a));
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
        return intent3;
    }

    @Override // defpackage.adx
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        return data == null ? (Uri) fcva.P(aea.a(intent)) : data;
    }

    @Override // defpackage.adx
    public final /* bridge */ /* synthetic */ adw c(Context context, Object obj) {
        ((adv) obj).getClass();
        return null;
    }
}
