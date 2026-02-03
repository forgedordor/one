package defpackage;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rqd implements rez {
    private final rqf a;

    public rqd(rqf rqfVar) {
        this.a = rqfVar;
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ rhy a(Object obj, int i, int i2, rex rexVar) {
        return rqf.a(ImageDecoder.createSource((ByteBuffer) obj), i, i2, rexVar);
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ boolean b(Object obj, rex rexVar) {
        return rqf.b(rer.c(this.a.a, (ByteBuffer) obj));
    }
}
