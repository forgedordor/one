package defpackage;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxhb extends bxgf {
    public final Uri k;
    public final boolean l;
    public final Throwable m;

    public bxhb(Uri uri, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, int i5, boolean z4) {
        super(i, i2, ImageView.ScaleType.CENTER_CROP, i3, i4, z2, z3, i5, z4);
        this.k = uri;
        this.l = z;
        if (!cqbe.c()) {
            this.m = null;
            return;
        }
        this.m = new Throwable("src:" + i3 + "x" + i4 + " des:" + i + "x" + i2 + " of " + e());
    }

    public Uri a() {
        return this.k;
    }

    public bxgk d(Context context, int i) {
        Uri uriA = a();
        bxge bxhaVar = (uriA == null || cqmz.q(uriA)) ? new bxha(context, this) : new bxgw(context, this);
        bxhaVar.f = i;
        return bxhaVar;
    }

    @Override // defpackage.bxgf
    public final String e() {
        Uri uriA = a();
        if (uriA == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('|');
        sb.append(this.c);
        sb.append('|');
        sb.append(this.h);
        sb.append('|');
        sb.append(this.i);
        sb.append('|');
        sb.append(this.g);
        sb.append('|');
        sb.append(this.j);
        return uriA + '|' + this.l + '|' + sb.toString();
    }

    @Override // defpackage.bxgf, defpackage.bxgl
    public bxgk g(Context context) {
        return d(context, 0);
    }

    public bxhb(Uri uri, int i, int i2, boolean z, boolean z2, int i3) {
        this(uri, i, i2, -1, -1, false, z, z2, i3, false);
    }
}
