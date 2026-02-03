package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaExtractor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlwu {
    public final Context a;
    public final fcyh b;
    public MediaExtractor c;
    public MediaCodec d;

    public dlwu(Context context, fcyh fcyhVar) {
        context.getClass();
        fcyhVar.getClass();
        this.a = context;
        this.b = fcyhVar;
    }

    public final boolean a() {
        return (this.c == null || this.d == null) ? false : true;
    }
}
