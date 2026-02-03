package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.penpal.settings.GeminiSettingsActivity;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aggw implements afyw {
    private final Context a;

    public aggw(Context context) {
        this.a = context;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) throws IOException {
        Context context = this.a;
        eiid.o(context, new Intent(context, (Class<?>) GeminiSettingsActivity.class));
        return fctx.a;
    }
}
