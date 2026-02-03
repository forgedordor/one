package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekhh extends ekim {
    private static final long serialVersionUID = 0;
    final /* synthetic */ ekhj a;

    public ekhh(ekhj ekhjVar) {
        this.a = ekhjVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // defpackage.ekim
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return this.a.p(i);
    }

    @Override // defpackage.ekfn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof eknh) {
            eknh eknhVar = (eknh) obj;
            if (eknhVar.a() > 0 && this.a.b(eknhVar.b()) == eknhVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ekhx, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ekfn
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.i().size();
    }

    @Override // defpackage.ekim, defpackage.ekhx, defpackage.ekfn
    public Object writeReplace() {
        return new ekhi(this.a);
    }
}
