package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aec extends adx {
    @Override // defpackage.adx
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
        type.getClass();
        return type;
    }

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
}
