package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekbh extends ekbe implements Set {
    final /* synthetic */ ekbi f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekbh(ekbi ekbiVar, Object obj, Set set) {
        super(ekbiVar, obj, set, null);
        this.f = ekbiVar;
    }

    @Override // defpackage.ekbe, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zM = ekpg.m((Set) this.b, collection);
        if (zM) {
            int size2 = this.b.size();
            this.f.b += size2 - size;
            c();
        }
        return zM;
    }
}
