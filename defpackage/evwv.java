package defpackage;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evwv extends evwp implements Set, j$.util.Set, fdcn {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evwv(Collection collection) {
        super(collection);
        collection.getClass();
    }

    @Override // defpackage.evwp, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this, 1);
    }
}
