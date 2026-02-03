package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekhu extends ekbv implements Serializable {
    public static final ekhu a;
    public static final ekhu b;
    public final transient ekgb c;

    static {
        int i = ekgb.d;
        a = new ekhu(ekoe.a);
        b = new ekhu(ekgb.r(eknz.a));
    }

    public ekhu(ekgb ekgbVar) {
        this.c = ekgbVar;
    }

    public static ekhu a(Iterable iterable) {
        ekhs ekhsVar = new ekhs();
        ekhsVar.c(iterable);
        return ekhsVar.a();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.ekoc
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ekhx d() {
        ekgb ekgbVar = this.c;
        if (ekgbVar.isEmpty()) {
            return ekon.a;
        }
        eknz eknzVar = eknz.a;
        return new ekoo(ekgbVar, ekny.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final eknz c() {
        ekgb ekgbVar = this.c;
        if (ekgbVar.isEmpty()) {
            throw new NoSuchElementException();
        }
        return new eknz(((eknz) ekgbVar.get(0)).b, ((eknz) ekgbVar.get(ekgbVar.size() - 1)).c);
    }

    Object writeReplace() {
        return new ekht(this.c);
    }
}
