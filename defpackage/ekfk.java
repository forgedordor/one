package defpackage;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekfk extends ekgp implements Map, ekcb {
    private static final long serialVersionUID = 912559;

    public static ekfk b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        ekcw.a(obj, obj2);
        ekcw.a(obj3, obj4);
        ekcw.a(obj5, obj6);
        ekcw.a(obj7, obj8);
        ekcw.a(obj9, obj10);
        ekcw.a(obj11, obj12);
        return new ekod(new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12}, 6);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract ekfk a();

    @Override // defpackage.ekgp
    public final /* bridge */ /* synthetic */ ekfn c() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.ekgp, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ekhx values() {
        return a().keySet();
    }

    @Override // defpackage.ekgp
    public Object writeReplace() {
        return new ekfj(this);
    }
}
