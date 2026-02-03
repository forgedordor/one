package defpackage;

import android.graphics.ImageDecoder;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rqe implements rez {
    private final rqf a;

    public rqe(rqf rqfVar) {
        this.a = rqfVar;
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ rhy a(Object obj, int i, int i2, rex rexVar) {
        return rqf.a(ImageDecoder.createSource(ruu.a((InputStream) obj)), i, i2, rexVar);
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ boolean b(Object obj, rex rexVar) {
        rqf rqfVar = this.a;
        rig rigVar = rqfVar.b;
        return rqf.b(rer.d(rqfVar.a, (InputStream) obj, rigVar));
    }
}
