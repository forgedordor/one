package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqyj {
    public final Context a;
    public final egpm b;
    public final fcsu c;
    private final fcsu d;

    public cqyj(Context context, egpm egpmVar, fcsu fcsuVar, fcsu fcsuVar2) {
        context.getClass();
        egpmVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.a = context;
        this.b = egpmVar;
        this.d = fcsuVar;
        this.c = fcsuVar2;
    }

    public final String a(String str) {
        if (mbw.l(str)) {
            int i = 1;
            if (cqwf.a(str, true)) {
                if (fdbq.f(str, "video/avc")) {
                    i = 2;
                } else if (fdbq.f(str, "video/hevc")) {
                    i = 3;
                }
                ((ains) this.d.b()).e("Bugle.Media.Attachment.Resize.Video.TargetMimeType.Count", i - 1);
                return str;
            }
        }
        cczi ccziVar = bxmw.g;
        if (!mbw.l((String) ccziVar.e())) {
            return "video/avc";
        }
        Object objE = ccziVar.e();
        objE.getClass();
        return (String) objE;
    }
}
