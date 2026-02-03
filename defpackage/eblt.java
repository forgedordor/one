package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Timer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eblt extends ebln {
    public final dhip a;
    public final ebmp b;
    public final ebqv c;
    public final Set d = new HashSet();
    public final Set e = new HashSet();
    public final Timer f = new Timer();
    public final dfcg g;
    public ebld h;
    private final ekhx i;
    private final Map j;
    private final ebrg k;

    public eblt(ebqv ebqvVar, dhip dhipVar, dfcg dfcgVar, ebmp ebmpVar, Collection collection) {
        eblq eblqVar = new eblq(this);
        this.k = eblqVar;
        this.c = ebqvVar;
        this.a = dhipVar;
        this.b = ebmpVar;
        this.g = dfcgVar;
        ebqvVar.k(eblqVar);
        this.j = DesugarCollections.synchronizedMap(new HashMap());
        this.i = ekhx.o(collection);
    }

    @Override // defpackage.ebln
    public final eblm a(ebqq ebqqVar, eblu ebluVar) {
        eblm eblmVar;
        ebpc ebpcVar = ebqqVar.a;
        ebnn ebnnVar = ebpcVar.g;
        String strV = ebnnVar == null ? null : (ebpcVar.t() && "INVITE".equals(ebnnVar.e())) ? ebpcVar.v("ACK", 2) : eblm.j(ebpcVar);
        dhja.d(this.a, "Created a transaction context for transaction id: %s", strV);
        if (strV == null) {
            dhja.q("Transaction id is null.", new Object[0]);
            eblmVar = null;
        } else {
            eblmVar = new eblm(strV, ebqqVar, ebluVar);
        }
        if (eblmVar == null) {
            return null;
        }
        this.j.put(eblmVar.c, eblmVar);
        return eblmVar;
    }

    @Override // defpackage.ebln
    public final ebqv b() {
        return this.c;
    }

    @Override // defpackage.ebln
    public final void c() {
        try {
            ebqv ebqvVar = this.c;
            if (ebqvVar != null) {
                ebqvVar.l();
                dhja.d(this.a, "SIP transport was terminated", new Object[0]);
            }
        } catch (RuntimeException e) {
            dhja.j(e, this.a, "Can't close SIP transport properly", new Object[0]);
        }
    }

    @Override // defpackage.ebln
    public final void d(ebpc ebpcVar) throws ebmn {
        Optional optionalEmpty;
        try {
            ebqv ebqvVar = this.c;
            if (ebqvVar == null) {
                throw new ebmn("SipTransport is null");
            }
            ebqvVar.i(ebpcVar);
            dfcg dfcgVar = this.g;
            if (ebpcVar.s()) {
                dfcgVar.c(new ebqr((ebpd) ebpcVar), Optional.empty(), 1, 4, ebqvVar);
                return;
            }
            if (ebpcVar.t()) {
                ebqs ebqsVar = new ebqs((ebpe) ebpcVar);
                String strD = ebqsVar.d();
                if (strD != null) {
                    Collection collection = dfcgVar.b;
                    synchronized (collection) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                optionalEmpty = Optional.empty();
                                break;
                            }
                            ebqq ebqqVar = (ebqq) it.next();
                            if (strD.equals(ebqqVar.d()) && ebqqVar.a() == ebqsVar.a()) {
                                optionalEmpty = Optional.of(ebqqVar);
                                break;
                            }
                        }
                    }
                } else {
                    optionalEmpty = Optional.empty();
                }
                dfcgVar.c(ebqsVar, optionalEmpty, 1, 4, ebqvVar);
            }
        } catch (ebmn e) {
            dhja.g("Can't send message: %s", e.getMessage());
            throw e;
        }
    }

    @Override // defpackage.ebln
    public final void e(ebld ebldVar) {
        this.h = ebldVar;
    }

    public final eblm f(String str) {
        return (eblm) this.j.get(str);
    }

    public final void g(ebpc ebpcVar) {
        String strJ = eblm.j(ebpcVar);
        dhja.c("Getting transaction context for transaction id: %s", strJ);
        if (strJ == null) {
            dhja.g("Transaction id is null.", new Object[0]);
            return;
        }
        eblm eblmVarF = f(strJ);
        if (eblmVarF != null) {
            dhja.c("Transaction context found for transaction id: %s", strJ);
            if (ebpcVar.t()) {
                ebnn ebnnVar = ebpcVar.g;
                if (ebnnVar == null) {
                    dhja.g("CSeqHeader is null.", new Object[0]);
                } else {
                    ebqs ebqsVar = new ebqs((ebpe) ebpcVar);
                    if (ebqsVar.y() < 200) {
                        dhja.k("Provisional response received - resetting transaction timer", new Object[0]);
                        int iY = ebqsVar.y();
                        if (iY == 100 || iY == 180 || iY == 183) {
                            eblmVarF.e = System.currentTimeMillis();
                        }
                    } else if (eblmVarF.b == null) {
                        dhja.k("First response received", new Object[0]);
                        eblmVarF.e(ebqsVar);
                    } else if (ebnnVar.e().equals("INVITE")) {
                        dhja.k("Second response received - sending ACK again", new Object[0]);
                        ebqq ebqqVar = eblmVarF.a;
                        if (ebqqVar == null) {
                            dhja.g("Not sending SIP message as it's null.", new Object[0]);
                        } else {
                            try {
                                ebpd ebpdVar = (ebpd) ebqqVar.a;
                                ebpe ebpeVarZ = ebqsVar.z();
                                ebnr ebnrVar = (ebnr) ebpeVarZ.c().f();
                                ebma ebmaVarD = (ebpeVarZ.w() >= 300 || ebnrVar == null) ? ebkr.d(ebpdVar.w().c()) : ebkr.d(ebnrVar.a.b.c());
                                String strH = ebpeVarZ.h();
                                if (strH == null) {
                                    throw new ebml("Response Call Identifier is null.");
                                }
                                ebno ebnoVarB = ebql.b(strH);
                                ebnn ebnnVar2 = ebpeVarZ.g;
                                if (ebnnVar2 == null) {
                                    throw new ebml("Response CSeqHeader is null.");
                                }
                                ebnn ebnnVarA = ebql.a(ebnnVar2.b(), "ACK");
                                eboa eboaVar = ebpeVarZ.e;
                                ebos ebosVar = ebpeVarZ.f;
                                if (eboaVar == null || ebosVar == null) {
                                    throw new ebml("From or To headers are null.");
                                }
                                ebpd ebpdVarA = ebkx.a(ebmaVarD, "ACK", ebnoVarB, ebnnVarA, eboaVar, ebosVar, ebpdVar.g().a, ebql.h(75));
                                int i = ekgb.d;
                                ekfw ekfwVar = new ekfw();
                                Iterator it = ebpeVarZ.j("Record-Route").iterator();
                                while (it.hasNext()) {
                                    ebok ebokVar = (ebok) ((ebob) it.next());
                                    ebon ebonVar = new ebon(ebokVar.a);
                                    if (ebokVar.m()) {
                                        Iterator<ebmj> it2 = ebokVar.e.iterator();
                                        while (it2.hasNext()) {
                                            ebonVar.e.e((ebmj) it2.next().clone());
                                        }
                                    }
                                    ekfwVar.h(ebonVar);
                                }
                                Iterator<E> it3 = ekfwVar.g().a().iterator();
                                while (it3.hasNext()) {
                                    ebpdVarA.k((ebon) it3.next());
                                }
                                d(new ebqr(ebpdVarA).a);
                            } catch (Exception e) {
                                dhja.g("Can't send message: %s", e.getMessage());
                            }
                        }
                    }
                }
            } else if ("ACK".equals(ebpcVar.i())) {
                eblmVarF.e(new ebqr((ebpd) ebpcVar));
            }
        }
        Map map = this.j;
        synchronized (map) {
            dhja.c("Checking %d transactions for expiry", Integer.valueOf(map.size()));
            Iterator it4 = map.entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry entry = (Map.Entry) it4.next();
                eblm eblmVar = (eblm) entry.getValue();
                if (System.currentTimeMillis() - eblmVar.e >= eblmVar.f) {
                    dhja.c("Transaction: %s expired. Removing transaction...", entry.getKey());
                    it4.remove();
                }
            }
            dhja.c("Transactions after cleanup: %d", Integer.valueOf(map.size()));
        }
    }

    public final boolean h(ebpc ebpcVar) {
        if (!this.e.contains(ebpcVar.u(1))) {
            return false;
        }
        if (ebpcVar.t()) {
            ebpe ebpeVar = (ebpe) ebpcVar;
            ebnn ebnnVar = ebpeVar.g;
            if (ebpeVar.z() && ebnnVar != null && "INVITE".equals(ebnnVar.e())) {
                return false;
            }
        }
        return true;
    }

    public final boolean i(ebpc ebpcVar) {
        if (ebpcVar.u(1) == null) {
            dhja.d(this.a, "Not checking duplicate for msgs with null context id", new Object[0]);
            return false;
        }
        if (ebpcVar.r()) {
            dhja.d(this.a, "Not checking duplicate for keep alive msgs", new Object[0]);
            return false;
        }
        if (ebpcVar.s()) {
            ebpd ebpdVar = (ebpd) ebpcVar;
            if (this.i.contains(ebpdVar.i())) {
                dhja.d(this.a, "Not checking duplicate for %s", ebpdVar.i());
                return false;
            }
        }
        if (ebpcVar.t()) {
            ebqs ebqsVar = new ebqs((ebpe) ebpcVar);
            if (ebqsVar.y() >= 100 && ebqsVar.y() <= 199) {
                return false;
            }
        }
        return true;
    }
}
