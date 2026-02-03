package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fcsk extends fbqi {
    public static final Logger f = Logger.getLogger(fcsk.class.getName());
    public final fbqa h;
    protected boolean i;
    protected fbnv k;
    public List g = new ArrayList(0);
    protected final fbqj j = new fcis();

    protected fcsk(fbqa fbqaVar) {
        this.h = fbqaVar;
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "<init>", "Created");
    }

    @Override // defpackage.fbqi
    public final Status a(fbqe fbqeVar) {
        Status statusWithDescription;
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "acceptResolvedAddresses", "Received resolution result: {0}", fbqeVar);
        try {
            this.i = true;
            List<fbop> list = fbqeVar.a;
            LinkedHashMap linkedHashMapJ = ekmi.j(list.size());
            for (fbop fbopVar : list) {
                fbmw fbmwVar = fbmw.a;
                fbmw fbmwVar2 = fbqeVar.b;
                Object obj = fbqeVar.c;
                List listSingletonList = Collections.singletonList(fbopVar);
                fbmu fbmuVar = new fbmu(fbmw.a);
                fbmuVar.b(e, true);
                linkedHashMapJ.put(new fcsj(fbopVar), new fbqe(listSingletonList, fbmuVar.a(), null));
            }
            if (linkedHashMapJ.isEmpty()) {
                statusWithDescription = Status.p.withDescription(a.E(fbqeVar, "NameResolver returned no usable address. "));
                b(statusWithDescription);
            } else {
                LinkedHashMap linkedHashMapJ2 = ekmi.j(this.g.size());
                for (fcsi fcsiVar : this.g) {
                    linkedHashMapJ2.put(fcsiVar.a, fcsiVar);
                }
                Status status = Status.b;
                ArrayList arrayList = new ArrayList(linkedHashMapJ.size());
                for (Map.Entry entry : linkedHashMapJ.entrySet()) {
                    fcsi fcsiVarE = (fcsi) linkedHashMapJ2.remove(entry.getKey());
                    if (fcsiVarE == null) {
                        fcsiVarE = e(entry.getKey());
                    }
                    arrayList.add(fcsiVarE);
                    if (entry.getValue() != null) {
                        Status statusA = fcsiVarE.b.a((fbqe) entry.getValue());
                        if (!statusA.f()) {
                            status = statusA;
                        }
                    }
                }
                this.g = arrayList;
                f();
                Iterator it = linkedHashMapJ2.values().iterator();
                while (it.hasNext()) {
                    ((fcsi) it.next()).b();
                }
                statusWithDescription = status;
            }
            return statusWithDescription;
        } finally {
            this.i = false;
        }
    }

    @Override // defpackage.fbqi
    public final void b(Status status) {
        if (this.k != fbnv.READY) {
            this.h.f(fbnv.TRANSIENT_FAILURE, new fbpz(fbqc.b(status)));
        }
    }

    @Override // defpackage.fbqi
    public final void d() {
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "shutdown", "Shutdown");
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((fcsi) it.next()).b();
        }
        this.g.clear();
    }

    protected fcsi e(Object obj) {
        throw null;
    }

    protected abstract void f();
}
