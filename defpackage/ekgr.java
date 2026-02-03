package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ekgr extends ekhx {
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    public abstract ekgp a();

    @Override // defpackage.ekhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.ekfn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = a().get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ekhx, java.util.Collection, java.util.Set
    public final int hashCode() {
        return a().hashCode();
    }

    @Override // defpackage.ekfn
    public final boolean l() {
        return a().hs();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a().size();
    }

    @Override // defpackage.ekhx, defpackage.ekfn
    public Object writeReplace() {
        return new ekgq(a());
    }
}
