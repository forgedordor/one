package defpackage;

import android.content.Context;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcpy {
    public final Context a;
    public final dcqg b;
    public final Handler c;

    public dcpy(Context context) {
        this.a = context;
        this.b = dcqg.a(context);
        this.c = new ddmy(context.getMainLooper());
    }
}
