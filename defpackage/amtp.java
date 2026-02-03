package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amtp extends amuu {
    public String a;
    public amyb b;
    private Uri c;

    @Override // defpackage.amuu
    public final amuv a() {
        Uri uri;
        String str = this.a;
        if (str != null && (uri = this.c) != null) {
            return new amtq(str, uri, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" contentType");
        }
        if (this.c == null) {
            sb.append(" uri");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.amuu
    public final void b(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.c = uri;
    }
}
