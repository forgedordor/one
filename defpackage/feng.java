package defpackage;

import java.text.DateFormat;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feng {
    private final Map a = new WeakHashMap();
    private final DateFormat b;

    public feng(DateFormat dateFormat) {
        this.b = dateFormat;
    }

    public final DateFormat a() {
        Map map = this.a;
        DateFormat dateFormat = (DateFormat) map.get(Thread.currentThread());
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this.b.clone();
        map.put(Thread.currentThread(), dateFormat2);
        return dateFormat2;
    }
}
