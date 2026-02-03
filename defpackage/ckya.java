package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckya {
    private final Context a;
    private final Resources b;

    public ckya(Context context) {
        this.a = context;
        this.b = context.getResources();
    }

    public final String a(ckmc ckmcVar, ckmb ckmbVar, ckno cknoVar) {
        int iOrdinal = ckmcVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return String.format(craf.c(this.a), "\u200a%s\u200a", cknoVar.b(this.b, ckmbVar));
            }
            if (iOrdinal != 3) {
                throw new IllegalArgumentException("Can't build reaction fallback text for action=" + ckmcVar.a());
            }
        }
        return String.format(craf.c(this.a), "\u200a%s\u200a", cknoVar.a(this.b, ckmbVar));
    }
}
