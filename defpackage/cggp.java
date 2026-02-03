package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cggp extends cgjq {
    public String a;
    public String b;
    public Uri c;
    public Optional d = Optional.empty();
    public Optional e = Optional.empty();
    public Optional f = Optional.empty();
    public Optional g = Optional.empty();
    public Optional h = Optional.empty();
    public Optional i = Optional.empty();
    public Optional j = Optional.empty();
    public int k;

    @Override // defpackage.cgjq
    public final cgjr a() {
        String str;
        int i;
        Uri uri;
        String str2 = this.a;
        if (str2 != null && (str = this.b) != null && (i = this.k) != 0 && (uri = this.c) != null) {
            return new cggq(str2, str, i, uri, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" channelId");
        }
        if (this.b == null) {
            sb.append(" channelName");
        }
        if (this.k == 0) {
            sb.append(" importance");
        }
        if (this.c == null) {
            sb.append(" soundUri");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
