package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nee {
    public static final /* synthetic */ int a = 0;
    private static final AtomicLong b = new AtomicLong();

    public nee() {
    }

    public static long a() {
        return b.getAndIncrement();
    }

    public nee(mht mhtVar) {
        Uri uri = mhtVar.a;
        Map map = Collections.EMPTY_MAP;
    }
}
