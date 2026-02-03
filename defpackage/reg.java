package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class reg implements req {
    final /* synthetic */ ByteBuffer a;

    public reg(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.req
    public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.d(this.a);
        } finally {
            ruu.b(this.a);
        }
    }
}
