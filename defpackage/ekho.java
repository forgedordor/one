package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekho implements Serializable, ekob {
    public static final ekho a;
    private static final long serialVersionUID = 0;
    public final transient ekgb b;
    public final transient ekgb c;

    static {
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        a = new ekho(ekgbVar, ekgbVar);
    }

    public ekho(ekgb ekgbVar, ekgb ekgbVar2) {
        this.b = ekgbVar;
        this.c = ekgbVar2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.ekob
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ekgp b() {
        ekgb ekgbVar = this.b;
        if (ekgbVar.isEmpty()) {
            return ekoj.a;
        }
        eknz eknzVar = eknz.a;
        return new ekih(new ekoo(ekgbVar, ekny.a), this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ekob) {
            return b().equals(((ekob) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return ekmi.g(b());
    }

    Object writeReplace() {
        return new ekhn(b());
    }
}
