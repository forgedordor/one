package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kps {
    private final kir a;
    private final String b;
    private final String c;

    public kps(kir kirVar, String str, String str2) {
        this.a = kirVar;
        this.b = str;
        this.c = str2;
    }

    public final kqp a() {
        kir kirVar = this.a;
        if (kirVar != null) {
            return new kqr(kirVar.a);
        }
        String str = this.b;
        if (str != null) {
            return kqv.a(str);
        }
        Log.e("CCL", "DimensionDescription: Null value & symbol for " + this.c + ". Using WrapContent.");
        return kqv.a("wrap");
    }

    public final boolean b() {
        return this.a == null && this.b == null;
    }
}
