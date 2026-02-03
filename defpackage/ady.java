package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ady extends adx {
    private final String a;

    public ady(String str) {
        this.a = str;
    }

    @Override // defpackage.adx
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        String str = (String) obj;
        str.getClass();
        Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.a).putExtra("android.intent.extra.TITLE", str);
        intentPutExtra.getClass();
        return intentPutExtra;
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

    @Override // defpackage.adx
    public final /* bridge */ /* synthetic */ adw c(Context context, Object obj) {
        ((String) obj).getClass();
        return null;
    }

    @fcsv
    public ady() {
        this("*/*");
    }
}
