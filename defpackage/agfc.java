package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agfc implements afyw {
    private final Context a;

    public agfc(Context context) {
        this.a = context;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) throws IOException {
        Intent intent = new Intent();
        Context context = this.a;
        Intent intentPutExtra = intent.setComponent(new ComponentName(context, "com.google.android.apps.messaging.ui.appsettings.RcsSettingsActivity")).putExtra("sub_id", -1);
        intentPutExtra.getClass();
        eiid.o(context, intentPutExtra);
        return fctx.a;
    }
}
