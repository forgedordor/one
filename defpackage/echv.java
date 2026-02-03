package defpackage;

import android.net.Uri;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class echv implements echu {
    @Override // defpackage.echu
    public final InputStream a(Uri uri, InputStream inputStream) {
        return new InflaterInputStream(inputStream);
    }

    @Override // defpackage.echu
    public final OutputStream b(Uri uri, OutputStream outputStream) {
        return new DeflaterOutputStream(outputStream);
    }

    @Override // defpackage.echu
    public final String c() {
        return "compress";
    }

    @Override // defpackage.echu
    public final /* synthetic */ OutputStream d(OutputStream outputStream) {
        return echt.a(this, outputStream);
    }

    @Override // defpackage.echu
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.echu
    public final /* synthetic */ void f() {
    }
}
