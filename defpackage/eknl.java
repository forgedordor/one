package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eknl extends ekpe {
    public abstract ekni a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof eknh) {
            eknh eknhVar = (eknh) obj;
            if (eknhVar.a() > 0 && a().b(eknhVar.b()) == eknhVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof eknh)) {
            return false;
        }
        eknh eknhVar = (eknh) obj;
        Object objB = eknhVar.b();
        int iA = eknhVar.a();
        if (iA != 0) {
            return a().h(objB, iA);
        }
        return false;
    }
}
