package defpackage;

import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erfb {
    public static final erfb a = (erfb) ergg.a(new ergf() { // from class: erez
        @Override // defpackage.ergf
        public final Object a() {
            erfb erfbVar = new erfb();
            erfbVar.f(new ereg(eren.class, erfv.class, new ereh() { // from class: erfa
                @Override // defpackage.ereh
                public final erga a(eqsg eqsgVar) {
                    return ((eren) eqsgVar).a;
                }
            }));
            return erfbVar;
        }
    });
    public final AtomicReference b = new AtomicReference(new erge(new ergb()));

    public final eqsg a(erga ergaVar, eqsy eqsyVar) throws GeneralSecurityException {
        erge ergeVar = (erge) this.b.get();
        ergc ergcVar = new ergc(ergaVar.getClass(), ((erfv) ergaVar).b);
        Map map = ergeVar.b;
        if (map.containsKey(ergcVar)) {
            return ((eref) map.get(ergcVar)).a(ergaVar, eqsyVar);
        }
        throw new GeneralSecurityException(a.b(ergcVar, "No Key Parser for requested key type ", " available"));
    }

    public final eqst b(erga ergaVar) throws GeneralSecurityException {
        erge ergeVar = (erge) this.b.get();
        ergc ergcVar = new ergc(ergaVar.getClass(), ((erfw) ergaVar).a);
        Map map = ergeVar.d;
        if (map.containsKey(ergcVar)) {
            return ((erff) map.get(ergcVar)).a(ergaVar);
        }
        throw new GeneralSecurityException(a.b(ergcVar, "No Parameters Parser for requested key type ", " available"));
    }

    public final erga c(eqsg eqsgVar, Class cls, eqsy eqsyVar) throws GeneralSecurityException {
        erge ergeVar = (erge) this.b.get();
        ergd ergdVar = new ergd(eqsgVar.getClass(), cls);
        Map map = ergeVar.a;
        if (map.containsKey(ergdVar)) {
            return ((erei) map.get(ergdVar)).a(eqsgVar, eqsyVar);
        }
        throw new GeneralSecurityException(a.b(ergdVar, "No Key serializer for ", " available"));
    }

    public final erga d(eqst eqstVar, Class cls) throws GeneralSecurityException {
        erge ergeVar = (erge) this.b.get();
        ergd ergdVar = new ergd(eqstVar.getClass(), cls);
        Map map = ergeVar.c;
        if (map.containsKey(ergdVar)) {
            return ((erfi) map.get(ergdVar)).a(eqstVar);
        }
        throw new GeneralSecurityException(a.b(ergdVar, "No Key Format serializer for ", " available"));
    }

    public final synchronized void e(eref erefVar) {
        AtomicReference atomicReference = this.b;
        ergb ergbVar = new ergb((erge) atomicReference.get());
        ergc ergcVar = new ergc(erefVar.c, erefVar.b);
        Map map = ergbVar.b;
        if (map.containsKey(ergcVar)) {
            eref erefVar2 = (eref) map.get(ergcVar);
            if (!erefVar2.equals(erefVar) || !erefVar.equals(erefVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(ergcVar.toString()));
            }
        } else {
            map.put(ergcVar, erefVar);
        }
        atomicReference.set(new erge(ergbVar));
    }

    public final synchronized void f(erei ereiVar) {
        AtomicReference atomicReference = this.b;
        ergb ergbVar = new ergb((erge) atomicReference.get());
        ergd ergdVar = new ergd(ereiVar.b, ereiVar.c);
        Map map = ergbVar.a;
        if (map.containsKey(ergdVar)) {
            erei ereiVar2 = (erei) map.get(ergdVar);
            if (!ereiVar2.equals(ereiVar) || !ereiVar.equals(ereiVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(ergdVar.toString()));
            }
        } else {
            map.put(ergdVar, ereiVar);
        }
        atomicReference.set(new erge(ergbVar));
    }

    public final synchronized void g(erff erffVar) {
        AtomicReference atomicReference = this.b;
        ergb ergbVar = new ergb((erge) atomicReference.get());
        ergc ergcVar = new ergc(erffVar.c, erffVar.b);
        Map map = ergbVar.d;
        if (map.containsKey(ergcVar)) {
            erff erffVar2 = (erff) map.get(ergcVar);
            if (!erffVar2.equals(erffVar) || !erffVar.equals(erffVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(ergcVar.toString()));
            }
        } else {
            map.put(ergcVar, erffVar);
        }
        atomicReference.set(new erge(ergbVar));
    }

    public final synchronized void h(erfi erfiVar) {
        AtomicReference atomicReference = this.b;
        ergb ergbVar = new ergb((erge) atomicReference.get());
        ergd ergdVar = new ergd(erfiVar.b, erfiVar.c);
        Map map = ergbVar.c;
        if (map.containsKey(ergdVar)) {
            erfi erfiVar2 = (erfi) map.get(ergdVar);
            if (!erfiVar2.equals(erfiVar) || !erfiVar.equals(erfiVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(ergdVar.toString()));
            }
        } else {
            map.put(ergdVar, erfiVar);
        }
        atomicReference.set(new erge(ergbVar));
    }
}
