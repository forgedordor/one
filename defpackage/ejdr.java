package defpackage;

import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejdr implements fdpm {
    final /* synthetic */ ejdt a;

    public ejdr(ejdt ejdtVar) {
        this.a = ejdtVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        Uri uri = (Uri) obj;
        if (uri != null) {
            Intent intent = new Intent();
            intent.putExtra("resultKey", uri);
            this.a.a(-1, intent);
        }
        return fctx.a;
    }
}
