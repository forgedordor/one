package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekmt extends eklz {
    final /* synthetic */ ekmu a;

    public ekmt(ekmu ekmuVar) {
        this.a = ekmuVar;
    }

    @Override // defpackage.eklz
    public final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        final ekmj ekmjVar = this.a.a;
        Set setX = ekmjVar.x();
        ekmjVar.getClass();
        return ekmi.i(setX, new ejvr() { // from class: ekms
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return new ekjd((ekjn) ekmjVar, obj);
            }
        });
    }

    @Override // defpackage.eklz, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        ekmu ekmuVar = this.a;
        ekmuVar.a.x().remove(entry.getKey());
        return true;
    }
}
