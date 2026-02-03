package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ejzn<K, V> implements Serializable, ejye {
    private static final long serialVersionUID = 1;
    public final ekak a;

    public ejzn(ekak ekakVar) {
        this.a = ekakVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use ManualSerializationProxy");
    }

    @Override // defpackage.ejye
    public final Object b(Object obj) {
        obj.getClass();
        ekak ekakVar = this.a;
        int iA = ekakVar.a(obj);
        return ekakVar.b(iA).f(obj, iA);
    }

    @Override // defpackage.ejye
    public final void c(Object obj) {
        this.a.remove(obj);
    }

    @Override // defpackage.ejye
    public final void d(Object obj, Object obj2) {
        this.a.put(obj, obj2);
    }

    Object writeReplace() {
        return new ejzo(this.a);
    }
}
