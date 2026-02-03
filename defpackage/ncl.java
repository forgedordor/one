package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncl extends Exception {
    public final String a;
    public final boolean b;
    public final nci c;
    public final String d;

    public ncl(mau mauVar, Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + mauVar.toString(), th, mauVar.o, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i));
    }

    public ncl(String str, Throwable th, String str2, boolean z, nci nciVar, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = nciVar;
        this.d = str3;
    }
}
