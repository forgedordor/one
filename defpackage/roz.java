package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class roz implements rpb {
    private final rfr a;
    private final rig b;
    private final List c;

    public roz(InputStream inputStream, List list, rig rigVar) {
        rvi.f(rigVar);
        this.b = rigVar;
        rvi.f(list);
        this.c = list;
        this.a = new rfr(inputStream, rigVar);
    }

    @Override // defpackage.rpb
    public final int a() {
        return rer.a(this.c, this.a.a(), this.b);
    }

    @Override // defpackage.rpb
    public final Bitmap b(BitmapFactory.Options options) {
        return row.a(this.a.a(), options, this);
    }

    @Override // defpackage.rpb
    public final ImageHeaderParser.ImageType c() {
        return rer.d(this.c, this.a.a(), this.b);
    }

    @Override // defpackage.rpb
    public final void d() {
        this.a.a.a();
    }

    @Override // defpackage.rpb
    public final boolean e() {
        InputStream inputStreamA = this.a.a();
        inputStreamA.mark(5242880);
        return rer.f(this.c, new rem(inputStreamA, this.b));
    }
}
