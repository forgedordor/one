package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ref implements req {
    final /* synthetic */ InputStream a;

    public ref(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.req
    public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
        try {
            return imageHeaderParser.c(this.a);
        } finally {
            this.a.reset();
        }
    }
}
