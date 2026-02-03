package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ekgd extends ekhe implements ekjo {
    private static final long serialVersionUID = 0;
    public transient ekgd b;

    public ekgd(ekgp ekgpVar, int i) {
        super(ekgpVar, i);
    }

    public static ekgd e(ekmj ekmjVar) {
        if (ekmjVar.A()) {
            return ekdy.a;
        }
        if (ekmjVar instanceof ekgd) {
            ekgd ekgdVar = (ekgd) ekmjVar;
            if (!ekgdVar.E()) {
                return ekgdVar;
            }
        }
        Set<Map.Entry> setEntrySet = ekmjVar.w().entrySet();
        if (setEntrySet.isEmpty()) {
            return ekdy.a;
        }
        ekgi ekgiVar = new ekgi(setEntrySet.size());
        int size = 0;
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            ekgb ekgbVarN = ekgb.n((Collection) entry.getValue());
            if (!ekgbVarN.isEmpty()) {
                ekgiVar.i(key, ekgbVarN);
                size += ekgbVarN.size();
            }
        }
        return new ekgd(ekgiVar.c(), size);
    }

    public static ekgd f(Object obj, Object obj2) {
        ekgc ekgcVar = new ekgc();
        ekgcVar.b(obj, obj2);
        return ekgcVar.a();
    }

    @Deprecated
    public static final ekgb n() {
        throw new UnsupportedOperationException();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.g(i, "Invalid key count "));
        }
        ekgi ekgiVar = new ekgi();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            object.getClass();
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(a.g(i4, "Invalid value count "));
            }
            int i5 = ekgb.d;
            ekfw ekfwVar = new ekfw();
            for (int i6 = 0; i6 < i4; i6++) {
                Object object2 = objectInputStream.readObject();
                object2.getClass();
                ekfwVar.h(object2);
            }
            ekgiVar.i(object, ekfwVar.g());
            i2 += i4;
        }
        try {
            ekhc.a.b(this, ekgiVar.c());
            ekhc.b.a(this, i2);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        ekos.c(this, objectOutputStream);
    }

    @Override // defpackage.ekjo
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ekgb c(Object obj) {
        ekgb ekgbVar = (ekgb) this.map.get(obj);
        if (ekgbVar != null) {
            return ekgbVar;
        }
        int i = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.ekhe, defpackage.ekmj
    @Deprecated
    public final /* bridge */ /* synthetic */ Collection d(Object obj) {
        return n();
    }

    @Override // defpackage.ekjo
    @Deprecated
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ List d(Object obj) {
        return n();
    }
}
