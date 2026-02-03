package defpackage;

import j$.util.Collection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekhj extends ekhk implements Collection, ekni {
    private static final long serialVersionUID = 912559;
    private transient ekgb a;
    private transient ekhx b;

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.ekni
    @Deprecated
    public final int a(Object obj, int i) {
        throw null;
    }

    @Override // defpackage.ekfn
    public final int c(Object[] objArr, int i) {
        ekqg ekqgVarListIterator = j().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            eknh eknhVar = (eknh) ekqgVarListIterator.next();
            Arrays.fill(objArr, i, eknhVar.a() + i, eknhVar.b());
            i += eknhVar.a();
        }
        return i;
    }

    @Override // defpackage.ekfn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return b(obj) > 0;
    }

    @Override // defpackage.ekni
    @Deprecated
    public final int d(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return eknn.a(this, obj);
    }

    @Override // defpackage.ekfn
    public final ekgb g() {
        ekgb ekgbVar = this.a;
        if (ekgbVar != null) {
            return ekgbVar;
        }
        ekgb ekgbVarG = super.g();
        this.a = ekgbVarG;
        return ekgbVarG;
    }

    @Override // defpackage.ekni
    @Deprecated
    public final boolean h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return ekpg.a(j());
    }

    @Override // defpackage.ekni
    public /* bridge */ /* synthetic */ Set i() {
        throw null;
    }

    @Override // defpackage.ekfn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final ekqg listIterator() {
        return new ekhf(j().listIterator());
    }

    public abstract ekhx n();

    @Override // defpackage.ekni
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final ekhx j() {
        ekhx ekhhVar = this.b;
        if (ekhhVar == null) {
            ekhhVar = isEmpty() ? ekon.a : new ekhh(this);
            this.b = ekhhVar;
        }
        return ekhhVar;
    }

    public abstract eknh p(int i);

    @Override // java.util.AbstractCollection
    public final String toString() {
        return j().toString();
    }

    @Override // defpackage.ekfn
    public abstract Object writeReplace();
}
