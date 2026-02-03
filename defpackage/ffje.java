package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffje implements ffld {
    private ffli e;
    private ffls f;
    private BigInteger g;
    private BigInteger h;

    public ffje(ffli ffliVar, ffls fflsVar, BigInteger bigInteger, BigInteger bigInteger2) {
        Hashtable hashtable;
        fflu ffluVar;
        if (ffliVar == null) {
            throw new NullPointerException("curve");
        }
        if (bigInteger == null) {
            throw new NullPointerException("n");
        }
        this.e = ffliVar;
        if (fflsVar == null) {
            throw new IllegalArgumentException("Point has null value");
        }
        if (!ffliVar.h(fflsVar.b)) {
            throw new IllegalArgumentException("Point must be on the same curve");
        }
        ffls fflsVarM = ffliVar.g(fflsVar).m();
        if (fflsVarM.q()) {
            throw new IllegalArgumentException("Point at infinity");
        }
        if (!fflsVarM.q()) {
            synchronized (fflsVarM) {
                hashtable = fflsVarM.f;
                if (hashtable == null) {
                    hashtable = new Hashtable(4);
                    fflsVarM.f = hashtable;
                }
            }
            synchronized (hashtable) {
                fflu ffluVar2 = (fflu) hashtable.get("bc_validity");
                ffluVar = true != (ffluVar2 instanceof fflu) ? null : ffluVar2;
                ffluVar = ffluVar == null ? new fflu() : ffluVar;
                if (!ffluVar.a) {
                    if (!ffluVar.b) {
                        if (fflsVarM.a()) {
                            ffluVar.b = true;
                        } else {
                            ffluVar.a();
                        }
                    }
                    if (!ffluVar.c) {
                        if (fflsVarM.b()) {
                            ffluVar.c = true;
                        } else {
                            ffluVar.a();
                        }
                    }
                }
                if (ffluVar != ffluVar2) {
                    hashtable.put("bc_validity", ffluVar);
                }
            }
            if (ffluVar.a) {
                throw new IllegalArgumentException("Point not on curve");
            }
        }
        this.f = fflsVarM;
        this.g = bigInteger;
        this.h = bigInteger2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ffje) {
            ffje ffjeVar = (ffje) obj;
            if (this.e.h(ffjeVar.e) && this.f.p(ffjeVar.f) && this.g.equals(ffjeVar.g) && this.h.equals(ffjeVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.e.hashCode() * 37) ^ this.f.hashCode()) * 37) ^ this.g.hashCode()) * 37) ^ this.h.hashCode();
    }
}
