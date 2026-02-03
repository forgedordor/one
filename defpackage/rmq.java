package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rmq implements rlr, rmr {
    private final ContentResolver a;

    public rmq(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override // defpackage.rmr
    public final rfg a(Uri uri) {
        return new rfo(this.a, uri);
    }

    @Override // defpackage.rlr
    public final rlq b(rlz rlzVar) {
        return new rmt(this);
    }
}
