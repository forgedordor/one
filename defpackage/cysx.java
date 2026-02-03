package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.ui.gaia.GaiaDittoActivity;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cysx {
    public static final void a(Context context, efwo efwoVar, boolean z) throws IOException {
        Intent intentA = aiiw.c(context, GaiaDittoActivity.class, "android.intent.action.VIEW").a();
        intentA.getClass();
        efyp.c(intentA, efwoVar);
        intentA.putExtra("turnOnGaiaPairing", z);
        eiid.o(context, intentA);
    }
}
