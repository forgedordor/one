package defpackage;

import com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.OnDeviceDatabaseUpgradeHandler;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbmi {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;

    public bbmi(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
        fcsuVar5.getClass();
        this.e = fcsuVar5;
        this.f = fcsuVar6;
        fcsuVar7.getClass();
        this.g = fcsuVar7;
    }

    public final /* synthetic */ bblg a(dqsy dqsyVar, dqrs dqrsVar, int i, int i2) {
        CustomUpgradeSteps customUpgradeSteps = (CustomUpgradeSteps) this.a.b();
        customUpgradeSteps.getClass();
        Map map = (Map) this.c.b();
        map.getClass();
        axif axifVar = (axif) this.e.b();
        axifVar.getClass();
        cnvy cnvyVar = (cnvy) this.f.b();
        cnvyVar.getClass();
        Map map2 = (Map) ((eyig) this.g).a;
        dqsyVar.getClass();
        dqrsVar.getClass();
        return new OnDeviceDatabaseUpgradeHandler(customUpgradeSteps, this.b, map, this.d, axifVar, cnvyVar, map2, dqsyVar, dqrsVar, i, i2);
    }
}
