package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rrd implements rrh {
    private final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;

    @Override // defpackage.rrh
    public final rhy a(rhy rhyVar, rex rexVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) rhyVar.c()).compress(this.a, 100, byteArrayOutputStream);
        rhyVar.e();
        return new rqb(byteArrayOutputStream.toByteArray());
    }
}
