package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejzk<K, V> extends ejzo<K, V> implements ejyq<K, V> {
    private static final long serialVersionUID = 1;
    transient ejyq a;

    public ejzk(ekak ekakVar) {
        super(ekakVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.a = e().b(this.k);
    }

    private Object readResolve() {
        return this.a;
    }

    @Override // defpackage.ejyq
    public final Object a(Object obj) {
        throw null;
    }

    @Override // defpackage.ejvr
    public final V apply(K k) {
        return (V) ((ejzm) this.a).e(k);
    }
}
