package defpackage;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqka {
    public final Set b = new CopyOnWriteArraySet();
    public final Set a = new css();

    public final void a(Collection collection) {
        Set set = this.b;
        set.clear();
        set.addAll(collection);
    }
}
