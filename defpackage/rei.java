package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rei implements rep {
    final /* synthetic */ ByteBuffer a;
    final /* synthetic */ rig b;

    public rei(ByteBuffer byteBuffer, rig rigVar) {
        this.a = byteBuffer;
        this.b = rigVar;
    }

    @Override // defpackage.rep
    public final int a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.b(this.a, this.b);
        } finally {
            ruu.b(this.a);
        }
    }
}
