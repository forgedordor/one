package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fh extends adx {
    @Override // defpackage.adx
    public final /* synthetic */ Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        adt adtVar = (adt) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = adtVar.b;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                adtVar = new adt(adtVar.a, null, adtVar.c, adtVar.d);
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", adtVar);
        if (fr.ad(2)) {
            intent.toString();
            Log.v("FragmentManager", "CreateIntent created the following intent: ".concat(intent.toString()));
        }
        return intent;
    }

    @Override // defpackage.adx
    public final /* synthetic */ Object b(int i, Intent intent) {
        return new adh(i, intent);
    }
}
