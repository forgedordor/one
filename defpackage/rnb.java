package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rnb implements rlq {
    private final Context a;

    public rnb(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ rlp a(Object obj, int i, int i2, rex rexVar) {
        Long l;
        Uri uri = (Uri) obj;
        if (!rfw.b(i, i2) || (l = (Long) rexVar.b(rpy.a)) == null || l.longValue() != -1) {
            return null;
        }
        ruq ruqVar = new ruq(uri);
        Context context = this.a;
        return new rlp(ruqVar, rfz.c(context, uri, new rfy(context.getContentResolver())));
    }

    @Override // defpackage.rlq
    public final /* synthetic */ boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return rfw.a(uri) && rfw.c(uri);
    }
}
