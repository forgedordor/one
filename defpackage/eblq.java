package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Collection;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eblq implements ebrg {
    public final /* synthetic */ eblt a;

    public eblq(eblt ebltVar) {
        this.a = ebltVar;
    }

    @Override // defpackage.ebrg
    public final void a(String str) {
        eblt ebltVar = this.a;
        dhip dhipVar = ebltVar.a;
        dhja.d(dhipVar, "Transaction aborted for context id: %s", str);
        eblm eblmVarF = ebltVar.f(str);
        if (eblmVarF == null) {
            dhja.r(dhipVar, "onAbort: No transaction context found for context id: %s", str);
        } else {
            eblmVarF.d(ebll.ABORTED);
        }
    }

    @Override // defpackage.ebrg
    public final void b(ebpc ebpcVar) {
        String strU = ebpcVar.s() ? ebpcVar.u(2) : (ebpcVar.t() && ((ebpe) ebpcVar).A()) ? ebpcVar.v("ACK", 2) : null;
        eblt ebltVar = this.a;
        dhip dhipVar = ebltVar.a;
        dhja.d(dhipVar, "onOutgoingMessage for context id: %s", strU);
        if (ebpcVar.r()) {
            return;
        }
        String strI = ebpcVar.i();
        if (strU == null) {
            dhja.r(dhipVar, "Unable to add outgoing context for null context id", new Object[0]);
            return;
        }
        if (strI == null) {
            dhja.r(dhipVar, "Unable to add outgoing context for null method for context id: %s", strU);
            return;
        }
        Set set = ebltVar.d;
        synchronized (set) {
            if (set.add(strU)) {
                int i = ((ebmc) ebltVar.b).a * 50;
                dhja.l(dhipVar, "Adding transaction context and starting timer with: %d for context id %s, method: %s", Integer.valueOf(i), strU, strI);
                ebltVar.f.schedule(new ebls(ebltVar, strU, dhipVar), i);
            }
        }
    }

    @Override // defpackage.ebrg
    public final void c(ebpc ebpcVar) {
        String strJ;
        Object[] objArr = {ebpcVar.u(1)};
        eblt ebltVar = this.a;
        dhip dhipVar = ebltVar.a;
        dhja.d(dhipVar, "onReceiveMessage for context id: %s", objArr);
        if (ebltVar.i(ebpcVar)) {
            if (ebltVar.h(ebpcVar)) {
                return;
            }
            String strU = ebpcVar.u(1);
            if (strU == null) {
                dhja.r(dhipVar, "Unable to add incoming context for null context id", new Object[0]);
            } else {
                Set set = ebltVar.e;
                synchronized (set) {
                    if (set.add(strU)) {
                        int i = ((ebmc) ebltVar.b).a * 50;
                        dhja.l(dhipVar, "Adding transaction context and starting timer with: %d for context id %s, method %s", Integer.valueOf(i), strU, ebpcVar.i());
                        ebltVar.f.schedule(new eblr(ebltVar, strU, dhipVar), i);
                    }
                }
            }
        }
        eblt ebltVar2 = this.a;
        boolean z = ebpcVar.t() && ((ebpe) ebpcVar).z();
        boolean z2 = ebpcVar.s() && "ACK".equals(((ebpd) ebpcVar).i());
        if (z || z2) {
            String strU2 = ebpcVar.u(2);
            Set set2 = ebltVar2.d;
            synchronized (set2) {
                set2.remove(strU2);
            }
        }
        eblt ebltVar3 = this.a;
        dhja.d(ebltVar3.a, "Receiving message", new Object[0]);
        if (ebpcVar.r()) {
            ebltVar3.h.a(ebpcVar);
            return;
        }
        dfcg dfcgVar = ebltVar3.g;
        Optional optionalEmpty = (ebpcVar.s() || (strJ = eblm.j(new ebqs((ebpe) ebpcVar).a)) == null) ? Optional.empty() : Optional.ofNullable(ebltVar3.f(strJ)).map(new Function() { // from class: eblp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eblm) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        Optional optional = optionalEmpty;
        ebqv ebqvVar = ebltVar3.c;
        if (ebpcVar.s()) {
            ebqr ebqrVar = new ebqr((ebpd) ebpcVar);
            dfcgVar.c(ebqrVar, Optional.empty(), 2, 5, ebqvVar);
            Collection collection = dfcgVar.b;
            synchronized (collection) {
                collection.add(ebqrVar);
            }
        } else {
            dfcgVar.c(new ebqs((ebpe) ebpcVar), optional, 2, 5, ebqvVar);
        }
        if (ebpcVar.t()) {
            ebltVar3.h.a(ebpcVar);
            ebltVar3.g(ebpcVar);
        } else if (ebpcVar.s()) {
            if ("ACK".equals(ebpcVar.i())) {
                ebltVar3.g(ebpcVar);
            }
            ebltVar3.h.a(ebpcVar);
        }
    }

    @Override // defpackage.ebrg
    public final void d() {
        eblt ebltVar = this.a;
        dhip dhipVar = ebltVar.a;
        dhja.d(dhipVar, "onTeardown", new Object[0]);
        ebltVar.f.cancel();
        Set<String> set = ebltVar.d;
        synchronized (set) {
            for (String str : set) {
                dhja.d(dhipVar, "Transaction lost due to transport error for context id: %s", str);
                eblm eblmVarF = ebltVar.f(str);
                if (eblmVarF == null) {
                    dhja.r(dhipVar, "onTransactionLostDueToTransportError: No transaction context found for context id: %s", str);
                } else {
                    dhja.d(dhipVar, "Cancelling transaction with context id: %s", str);
                    eblmVarF.d(ebll.TRANSPORT_ERROR);
                }
            }
            set.clear();
        }
    }
}
