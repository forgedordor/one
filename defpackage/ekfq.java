package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekfq extends ekgk {
    private final transient EnumMap a;

    public ekfq(EnumMap enumMap) {
        this.a = enumMap;
        ejwl.a(!enumMap.isEmpty());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }

    @Override // defpackage.ekgk
    public final ekqg a() {
        return new eklu(this.a.entrySet().iterator());
    }

    @Override // defpackage.ekgp, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.ekgp, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekfq) {
            obj = ((ekfq) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.ekgp, java.util.Map
    public final Object get(Object obj) {
        return this.a.get(obj);
    }

    @Override // defpackage.ekgp
    public final ekqg hr() {
        return ekjc.d(this.a.keySet().iterator());
    }

    @Override // defpackage.ekgp
    public final boolean hs() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.ekgk, defpackage.ekgp
    public Object writeReplace() {
        return new ekfp(this.a);
    }
}
