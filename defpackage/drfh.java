package defpackage;

import android.content.Context;
import android.support.rastermill.FrameSequenceDrawable;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drfh extends rsp {
    @Override // defpackage.rsp
    public final void d(Context context, raw rawVar, rbn rbnVar) {
        List listB = rbnVar.b();
        rii riiVar = rawVar.a;
        rig rigVar = rawVar.d;
        rbnVar.i(InputStream.class, FrameSequenceDrawable.class, new drfi(listB, riiVar, rigVar));
        rbnVar.i(ByteBuffer.class, FrameSequenceDrawable.class, new drfg(rbnVar.b(), riiVar, rigVar));
    }
}
