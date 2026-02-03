package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rem implements reo {
    final /* synthetic */ InputStream a;
    final /* synthetic */ rig b;

    public rem(InputStream inputStream, rig rigVar) {
        this.a = inputStream;
        this.b = rigVar;
    }

    @Override // defpackage.reo
    public final boolean a(ImageHeaderParser imageHeaderParser) throws IOException {
        try {
            return imageHeaderParser.e(this.a, this.b);
        } finally {
            this.a.reset();
        }
    }
}
