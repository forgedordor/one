package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecii {
    public Context a;
    public eooz b;
    public String c;
    public Handler d;
    public final ejxr e = new ejxw(10);
    public final TimeUnit f = TimeUnit.SECONDS;
    public final ejxr g = new ejxw(false);

    public final void a() {
        this.c = "com.google.android.gms.permission.INTERNAL_BROADCAST";
    }

    public final void b(Context context) {
        this.a = context.getApplicationContext();
    }
}
