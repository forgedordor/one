package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class roy implements rpb {
    private final ByteBuffer a;
    private final List b;
    private final rig c;

    public roy(ByteBuffer byteBuffer, List list, rig rigVar) {
        this.a = byteBuffer;
        this.b = list;
        this.c = rigVar;
    }

    @Override // defpackage.rpb
    public final int a() {
        ByteBuffer byteBufferB = ruu.b(this.a);
        if (byteBufferB == null) {
            return -1;
        }
        return rer.b(this.b, new rei(byteBufferB, this.c));
    }

    @Override // defpackage.rpb
    public final Bitmap b(BitmapFactory.Options options) {
        return row.a(new rus(ruu.b(this.a)), options, this);
    }

    @Override // defpackage.rpb
    public final ImageHeaderParser.ImageType c() {
        return rer.c(this.b, ruu.b(this.a));
    }

    @Override // defpackage.rpb
    public final boolean e() {
        ByteBuffer byteBufferB = ruu.b(this.a);
        if (byteBufferB == null) {
            return false;
        }
        return rer.f(this.b, new rel(byteBufferB, this.c));
    }

    @Override // defpackage.rpb
    public final void d() {
    }
}
