package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxfq extends bxhb {
    final cpbn a;

    public bxfq(cpbn cpbnVar, Uri uri, int i, int i2, boolean z) {
        this(cpbnVar, uri, i, i2, z, null);
    }

    @Override // defpackage.bxhb, defpackage.bxgf, defpackage.bxgl
    public final bxgk g(Context context) {
        Uri uri = this.k;
        return "s".equals(uri == null ? null : cpbr.t(uri)) ? new bxfr(context, this.a, this) : (uri == null || !(cqmz.p(uri) || cpbr.y(context, uri))) ? new bxgw(context, this) : new bxfp(context, this.a, this);
    }

    public bxfq(cpbn cpbnVar, Uri uri, int i, int i2, boolean z, byte[] bArr) {
        super(uri, i, i2, true, z, 0);
        this.a = cpbnVar;
    }
}
