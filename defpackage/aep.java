package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aep extends adx {
    @Override // defpackage.adx
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        adt adtVar = (adt) obj;
        adtVar.getClass();
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", adtVar);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // defpackage.adx
    public final /* synthetic */ Object b(int i, Intent intent) {
        return new adh(i, intent);
    }
}
