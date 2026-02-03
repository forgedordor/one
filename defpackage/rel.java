package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rel implements reo {
    final /* synthetic */ ByteBuffer a;
    final /* synthetic */ rig b;

    public rel(ByteBuffer byteBuffer, rig rigVar) {
        this.a = byteBuffer;
        this.b = rigVar;
    }

    @Override // defpackage.reo
    public final boolean a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.f(this.a, this.b);
        } finally {
            ruu.b(this.a);
        }
    }
}
