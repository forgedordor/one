package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxew extends bxev {
    public bxew(Uri uri, int i, int i2) {
        super(null, uri, null, i, i2, -1, -1, false);
    }

    @Override // defpackage.bxhb
    public final bxgk d(Context context, int i) {
        bxge bxhaVar = c() ? new bxha(context, this) : new bxhe(context, this);
        bxhaVar.f = i;
        return bxhaVar;
    }
}
