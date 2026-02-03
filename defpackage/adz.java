package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class adz extends adx {
    @Override // defpackage.adx
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
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
        Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
        type.getClass();
        return type;
    }
}
