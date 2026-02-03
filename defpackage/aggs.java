package defpackage;

import android.content.Context;
import android.content.Intent;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aggs implements afyw {
    private final Context a;

    public aggs(Context context) {
        this.a = context;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) throws IOException {
        eiid.o(this.a, new Intent("android.settings.WIRELESS_SETTINGS"));
        return fctx.a;
    }
}
