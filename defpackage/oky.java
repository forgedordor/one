package defpackage;

import android.os.Bundle;
import defpackage.ojx;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class oky<D extends ojx> {
    public boolean a;
    private olb b;

    public abstract ojx a();

    public boolean b() {
        return true;
    }

    public void d(List list, final okg okgVar) {
        fdep fdepVar = new fdep((fdeq) fdey.i(fdey.j(fcva.ax(list), new fdap() { // from class: okw
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                oip oipVar = (oip) obj;
                oipVar.getClass();
                ojx ojxVar = oipVar.a;
                if (true != (ojxVar instanceof ojx)) {
                    ojxVar = null;
                }
                if (ojxVar == null) {
                    return null;
                }
                okg okgVar2 = okgVar;
                oky okyVar = this.a;
                ojx ojxVarC = okyVar.c(ojxVar, oipVar.a(), okgVar2);
                if (ojxVarC == null) {
                    return null;
                }
                return fdbq.f(ojxVarC, ojxVar) ? oipVar : okyVar.f().a(ojxVarC, ojxVarC.d(oipVar.a()));
            }
        })));
        while (fdepVar.hasNext()) {
            f().e((oip) fdepVar.next());
        }
    }

    public Bundle e() {
        return null;
    }

    public final olb f() {
        olb olbVar = this.b;
        if (olbVar != null) {
            return olbVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void g(olb olbVar) {
        this.b = olbVar;
        this.a = true;
    }

    public void h(oip oipVar) {
        oipVar.getClass();
        ojx ojxVar = oipVar.a;
        if (true != (ojxVar instanceof ojx)) {
            ojxVar = null;
        }
        if (ojxVar == null) {
            return;
        }
        c(ojxVar, null, oki.a(new fdap() { // from class: okv
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                okh okhVar = (okh) obj;
                okhVar.getClass();
                okhVar.b = true;
                return fctx.a;
            }
        }));
        f().f(oipVar);
    }

    public void j(oip oipVar, boolean z) {
        List list = (List) f().g.c();
        if (!list.contains(oipVar)) {
            throw new IllegalStateException(a.i(list, oipVar, "popBackStack was called with ", " which does not exist in back stack "));
        }
        ListIterator listIterator = list.listIterator(list.size());
        oip oipVar2 = null;
        while (b()) {
            oipVar2 = (oip) listIterator.previous();
            if (fdbq.f(oipVar2, oipVar)) {
                break;
            }
        }
        if (oipVar2 != null) {
            f().d(oipVar2, z);
        }
    }

    public void i(Bundle bundle) {
    }

    public ojx c(ojx ojxVar, Bundle bundle, okg okgVar) {
        return ojxVar;
    }
}
