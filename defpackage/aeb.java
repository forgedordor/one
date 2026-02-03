package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aeb extends adx {
    @Override // defpackage.adx
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        return intent != null ? aea.a(intent) : fcvo.a;
    }

    @Override // defpackage.adx
    public final /* bridge */ /* synthetic */ adw c(Context context, Object obj) {
        ((String) obj).getClass();
        return null;
    }

    @Override // defpackage.adx
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String str) {
        str.getClass();
        Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        intentPutExtra.getClass();
        return intentPutExtra;
    }
}
