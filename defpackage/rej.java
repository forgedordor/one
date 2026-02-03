package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rej implements rep {
    final /* synthetic */ InputStream a;
    final /* synthetic */ rig b;

    public rej(InputStream inputStream, rig rigVar) {
        this.a = inputStream;
        this.b = rigVar;
    }

    @Override // defpackage.rep
    public final int a(ImageHeaderParser imageHeaderParser) throws IOException {
        try {
            return imageHeaderParser.a(this.a, this.b);
        } finally {
            this.a.reset();
        }
    }
}
