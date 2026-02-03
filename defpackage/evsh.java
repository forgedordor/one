package defpackage;

import defpackage.evsh;
import defpackage.evsi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class evsh<MessageType extends evsi<MessageType, BuilderType>, BuilderType extends evsh<MessageType, BuilderType>> extends evsf<MessageType, BuilderType> implements evsj<MessageType, BuilderType> {
    protected evsh(evsi evsiVar) {
        super(evsiVar);
    }

    private final evry f() {
        evry evryVar = ((evsi) this.instance).r;
        if (!evryVar.c) {
            return evryVar;
        }
        evry evryVarD = evryVar.clone();
        ((evsi) this.instance).r = evryVarD;
        return evryVarD;
    }

    private final void g(evsl evslVar) {
        if (evslVar.a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    @Override // defpackage.evsf, defpackage.evug
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final evsi buildPartial() {
        if (!((evsi) this.instance).isMutable()) {
            return (evsi) this.instance;
        }
        ((evsi) this.instance).r.f();
        return (evsi) super.buildPartial();
    }

    @Override // defpackage.evsj
    public final Object b(evrp evrpVar) {
        evsi evsiVar = (evsi) this.instance;
        evsl evslVarCheckIsLite = evsn.checkIsLite(evrpVar);
        evsiVar.d(evslVarCheckIsLite);
        Object objL = evsiVar.r.l(evslVarCheckIsLite.d);
        return objL == null ? evslVarCheckIsLite.b : evslVarCheckIsLite.c(objL);
    }

    @Override // defpackage.evsj
    public final boolean c(evrp evrpVar) {
        evsi evsiVar = (evsi) this.instance;
        evsl evslVarCheckIsLite = evsn.checkIsLite(evrpVar);
        evsiVar.d(evslVarCheckIsLite);
        return evsiVar.r.o(evslVarCheckIsLite.d);
    }

    @Override // defpackage.evsf
    protected final void copyOnWriteInternal() {
        super.copyOnWriteInternal();
        if (((evsi) this.instance).r != evry.a) {
            evsi evsiVar = (evsi) this.instance;
            evsiVar.r = evsiVar.r.clone();
        }
    }

    public final void d(evrp evrpVar) {
        evsl evslVarCheckIsLite = evsn.checkIsLite(evrpVar);
        g(evslVarCheckIsLite);
        copyOnWrite();
        evry evryVarF = f();
        evsk evskVar = evslVarCheckIsLite.d;
        evvf evvfVar = evryVarF.b;
        evvfVar.remove(evskVar);
        if (evvfVar.isEmpty()) {
            evryVarF.d = false;
        }
    }

    public final void e(evrp evrpVar, Object obj) {
        evsl evslVarCheckIsLite = evsn.checkIsLite(evrpVar);
        g(evslVarCheckIsLite);
        copyOnWrite();
        evry evryVarF = f();
        evsk evskVar = evslVarCheckIsLite.d;
        if (!evskVar.d) {
            obj = evslVarCheckIsLite.e(obj);
        } else if (evskVar.a() == evwi.ENUM) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(evslVarCheckIsLite.e(it.next()));
            }
            obj = arrayList;
        }
        evryVarF.n(evskVar, obj);
    }
}
