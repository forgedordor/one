package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ekib<K, V> extends ekhe<K, V> implements ekot<K, V> {
    private static final long serialVersionUID = 0;
    private transient ekib a;
    private transient ekhx b;
    private final transient ekhx<V> emptySet;

    public ekib(ekgp ekgpVar, int i) {
        super(ekgpVar, i);
        this.emptySet = n(null);
    }

    private static ekhx n(Comparator comparator) {
        return comparator == null ? ekon.a : ekik.G(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
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
            ekhv ekhvVar = comparator == null ? new ekhv() : new ekii(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = objectInputStream.readObject();
                object2.getClass();
                ekhvVar.c(object2);
            }
            ekhx ekhxVarG = ekhvVar.g();
            if (ekhxVarG.size() != i4) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key ".concat(object.toString()));
            }
            ekgiVar.i(object, ekhxVarG);
            i2 += i4;
        }
        try {
            ekhc.a.b(this, ekgiVar.c());
            ekhc.b.a(this, i2);
            ekia.a.b(this, n(comparator));
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        ekhx<V> ekhxVar = this.emptySet;
        objectOutputStream.writeObject(ekhxVar instanceof ekik ? ((ekik) ekhxVar).a : null);
        ekos.c(this, objectOutputStream);
    }

    @Override // defpackage.ekhe
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ekfn c(Object obj) {
        throw null;
    }

    @Override // defpackage.ekhe, defpackage.ekbr, defpackage.ekmj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ekhx u() {
        ekhx ekhxVar = this.b;
        if (ekhxVar != null) {
            return ekhxVar;
        }
        ekhz ekhzVar = new ekhz(this);
        this.b = ekhzVar;
        return ekhzVar;
    }

    @Override // defpackage.ekhe, defpackage.ekmj
    @Deprecated
    public final /* bridge */ /* synthetic */ Collection d(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ekot
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ekhx c(Object obj) {
        return (ekhx) ejwg.c((ekhx) this.map.get(obj), this.emptySet);
    }

    public final ekib f() {
        ekib ekibVar = this.a;
        if (ekibVar != null) {
            return ekibVar;
        }
        ekhy ekhyVar = new ekhy();
        ekqg ekqgVarListIterator = u().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            ekhyVar.b(entry.getValue(), entry.getKey());
        }
        ekib ekibVarA = ekhyVar.a();
        ekibVarA.a = this;
        this.a = ekibVarA;
        return ekibVarA;
    }
}
