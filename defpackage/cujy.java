package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.ui.ditto.DittoActivity;
import j$.util.Optional;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cujy extends cujz {
    public cujy(cpiz cpizVar, dakl daklVar, srw srwVar, Optional optional, cmwe cmweVar, crny crnyVar, cjsd cjsdVar, fcsu fcsuVar) {
        super(cpizVar, daklVar, srwVar, optional, cmweVar, crnyVar, cjsdVar, fcsuVar);
    }

    @Override // defpackage.cujz, defpackage.aijh
    public final void A(Context context, efwo efwoVar) throws IOException {
        Intent intent;
        if (abxb.b()) {
            intent = aiiw.c(context, DittoActivity.class, "android.intent.action.VIEW").a();
            efyp.c(intent, efwoVar);
        } else {
            intent = new Intent(context, (Class<?>) DittoActivity.class);
        }
        eiid.o(context, intent);
    }

    @Override // defpackage.cujz, defpackage.aijh
    public final void z(Context context) throws IOException {
        eiid.o(context, new Intent(context, (Class<?>) DittoActivity.class));
    }
}
