package defpackage;

import android.graphics.ImageDecoder;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rpc implements rez {
    private final rnq a = new rnq();

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ rhy a(Object obj, int i, int i2, rex rexVar) {
        return this.a.c(ImageDecoder.createSource(ruu.a((InputStream) obj)), i, i2, rexVar);
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ boolean b(Object obj, rex rexVar) {
        return true;
    }
}
