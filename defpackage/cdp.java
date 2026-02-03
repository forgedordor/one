package defpackage;

import android.media.MediaFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cdp implements cei {
    public static cdo g() {
        cdr cdrVar = new cdr();
        cdrVar.h(-1);
        return cdrVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    @Override // defpackage.cei
    public final MediaFormat f() {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(h(), d(), c());
        mediaFormatCreateAudioFormat.setInteger("bitrate", a());
        if (e() != -1) {
            if (h().equals("audio/mp4a-latm")) {
                mediaFormatCreateAudioFormat.setInteger("aac-profile", e());
                return mediaFormatCreateAudioFormat;
            }
            mediaFormatCreateAudioFormat.setInteger("profile", e());
        }
        return mediaFormatCreateAudioFormat;
    }

    @Override // defpackage.cei
    public abstract String h();

    @Override // defpackage.cei
    public abstract int i();
}
