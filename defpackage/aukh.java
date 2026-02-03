package defpackage;

import android.util.LruCache;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aukh implements cqci {
    private final Set a;

    public aukh(Set set) {
        this.a = set;
    }

    public final void a() {
        ekqg ekqgVarListIterator = ((ekph) this.a).listIterator();
        while (ekqgVarListIterator.hasNext()) {
            ((LruCache) ekqgVarListIterator.next()).evictAll();
        }
    }

    @Override // defpackage.cqci
    public final void i(int i) {
        a();
    }
}
