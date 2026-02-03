package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kii {
    public static final kio a(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        int i = kjr.a;
        kjq kjqVarB = kjr.b(f);
        if (kjqVarB == null) {
            kjqVarB = new kjj(f);
        }
        return new kiq(f2, f, kjqVarB);
    }
}
