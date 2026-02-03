package defpackage;

import android.media.MediaFormat;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cgp implements cei {
    public static cgo m() {
        cdt cdtVar = new cdt();
        cdtVar.g(-1);
        cdtVar.c = 1;
        cdtVar.a = 2130708361;
        cdtVar.b = cgq.a;
        return cdtVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    @Override // defpackage.cei
    public final MediaFormat f() {
        Size sizeJ = j();
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(h(), sizeJ.getWidth(), sizeJ.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", c());
        mediaFormatCreateVideoFormat.setInteger("bitrate", a());
        mediaFormatCreateVideoFormat.setInteger("frame-rate", d());
        if (d() != b()) {
            mediaFormatCreateVideoFormat.setInteger("capture-rate", b());
            mediaFormatCreateVideoFormat.setInteger("operating-rate", b());
            mediaFormatCreateVideoFormat.setInteger("priority", 0);
        }
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", e());
        if (g() != -1) {
            mediaFormatCreateVideoFormat.setInteger("profile", g());
        }
        cgq cgqVarL = l();
        if (cgqVarL.b() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", cgqVarL.b());
        }
        if (cgqVarL.c() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", cgqVarL.c());
        }
        if (cgqVarL.a() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", cgqVarL.a());
        }
        return mediaFormatCreateVideoFormat;
    }

    public abstract int g();

    @Override // defpackage.cei
    public abstract String h();

    @Override // defpackage.cei
    public abstract int i();

    public abstract Size j();

    public abstract cgo k();

    public abstract cgq l();
}
