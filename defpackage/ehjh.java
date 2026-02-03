package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehjh implements ehgf {
    private final AtomicReference a;

    public ehjh(Map map, ehhr ehhrVar) {
        this.a = new AtomicReference(new ehjg(map, ehhrVar, false));
    }

    @Override // defpackage.ehgf
    public final ehds a(String str, fdap fdapVar) {
        ehjg ehjgVar;
        ehjg ehjgVar2 = null;
        while (true) {
            AtomicReference atomicReference = this.a;
            ehjgVar = (ehjg) atomicReference.get();
            ehjgVar.getClass();
            if (ehjgVar.b) {
                break;
            }
            if (ehjgVar2 == null) {
                ehjgVar2 = new ehjg(ehjgVar.c, ehjgVar.a, true);
            } else {
                ekgp ekgpVar = ehjgVar.c;
                ekgpVar.getClass();
                ehjgVar2.c = ekgpVar;
                ehhr ehhrVar = ehjgVar.a;
                ehhrVar.getClass();
                ehjgVar2.a = ehhrVar;
            }
            if (ehjf.a(atomicReference, ehjgVar, ehjgVar2)) {
                fdapVar.invoke(ehjgVar.a);
                ehjgVar = ehjgVar2;
                break;
            }
        }
        return (ehds) fcwa.e(ehjgVar.c, str);
    }

    @Override // defpackage.ehgf
    public final ehhr b() {
        return ((ehjg) this.a.get()).a;
    }

    @Override // defpackage.ehgf
    public final void c() {
        throw new UnsupportedOperationException("Can't change observed values");
    }

    @Override // defpackage.ehgf
    public final boolean d() {
        return false;
    }

    @Override // defpackage.ehgf
    public final boolean e(Map map, ehhr ehhrVar) {
        AtomicReference atomicReference;
        ehjg ehjgVar;
        ehjg ehjgVar2 = null;
        do {
            atomicReference = this.a;
            ehjgVar = (ehjg) atomicReference.get();
            if (ehjgVar.b) {
                return false;
            }
            if (ehjgVar2 == null) {
                ehjgVar2 = new ehjg(map, ehhrVar, false);
            }
        } while (!ehjf.a(atomicReference, ehjgVar, ehjgVar2));
        return true;
    }
}
