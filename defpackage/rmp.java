package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rmp implements rlr, rmr {
    private final ContentResolver a;

    public rmp(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override // defpackage.rmr
    public final rfg a(Uri uri) {
        return new rfc(this.a, uri);
    }

    @Override // defpackage.rlr
    public final rlq b(rlz rlzVar) {
        return new rmt(this);
    }
}
