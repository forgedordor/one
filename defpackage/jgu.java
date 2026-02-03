package defpackage;

import android.content.ClipData;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgu {
    private final jgv a;

    public jgu(jgv jgvVar) {
        this.a = jgvVar;
    }

    public final Object a() {
        ClipData primaryClip = this.a.a.getPrimaryClip();
        if (primaryClip != null) {
            return new jlf(primaryClip);
        }
        return null;
    }

    public final Object b(jlf jlfVar) {
        this.a.a(jlfVar);
        return fctx.a;
    }
}
