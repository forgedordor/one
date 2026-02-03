package defpackage;

import android.util.LruCache;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecox implements ecpl {
    public final ecpl a;
    private final LruCache b = new ecow(this);

    public ecox(ecpl ecplVar) {
        this.a = ecplVar;
    }

    @Override // defpackage.ecpl
    public final long a(Set set) {
        Long l = (Long) this.b.get(set);
        l.getClass();
        return l.longValue();
    }
}
