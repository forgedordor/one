package defpackage;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfyh implements dfzi {
    final /* synthetic */ dfyj a;

    public dfyh(dfyj dfyjVar) {
        this.a = dfyjVar;
    }

    @Override // defpackage.dfzi
    public final void g(dezf dezfVar) {
        dfyj dfyjVar = this.a;
        dhip dhipVar = dfyjVar.l;
        dhja.d(dhipVar, "Handling registration failed", new Object[0]);
        dfyjVar.g(dezfVar);
        dfyx dfyxVar = dfyjVar.b;
        if (dezfVar == dezf.RECONFIGURATION_REQUIRED && !Objects.isNull(dfyxVar)) {
            dhja.d(dhipVar, "Stopping ImsRegistrationController. Reconfiguration is required.", new Object[0]);
            dfyxVar.j(dezfVar);
        }
        Iterator it = dfyjVar.t.iterator();
        while (it.hasNext()) {
            ((dfzi) it.next()).g(dezfVar);
        }
    }

    @Override // defpackage.dfzi
    public final void h() {
        dfyj dfyjVar = this.a;
        dhja.d(dfyjVar.l, "Handling registration successful", new Object[0]);
        dfyjVar.d.f();
        dfyjVar.h.onImsModuleStarted();
        Iterator it = dfyjVar.t.iterator();
        while (it.hasNext()) {
            ((dfzi) it.next()).h();
        }
    }

    @Override // defpackage.dfzi
    public final void i(dezf dezfVar) {
        dfyj dfyjVar = this.a;
        dhja.d(dfyjVar.l, "Handling registration terminated", new Object[0]);
        dfyjVar.d.g(dezfVar);
        if (((Boolean) dfyj.a.a()).booleanValue() || dfyjVar.j.get()) {
            dfyjVar.h(dezfVar);
        }
        Iterator it = dfyjVar.t.iterator();
        while (it.hasNext()) {
            ((dfzi) it.next()).i(dezfVar);
        }
    }
}
