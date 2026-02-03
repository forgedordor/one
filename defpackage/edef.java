package defpackage;

import android.content.Context;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edef extends rsp {
    @Override // defpackage.rsp
    public final void d(Context context, raw rawVar, rbn rbnVar) {
        rlo rloVar = new rlo(2000L);
        eddw eddwVar = new eddw(context, new edgb(context, "oauth2:https://www.googleapis.com/auth/photos.image.readonly"));
        rbnVar.g(edeb.class, ByteBuffer.class, new edee(eddwVar, rloVar));
        rbnVar.g(edeb.class, InputStream.class, new eded(eddwVar, rloVar));
    }
}
