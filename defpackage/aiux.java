package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiux implements efal {
    public final fcsu a;
    public aill b;
    public final fcsu c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public aiux(fcsu fcsuVar, fcsu fcsuVar2) {
        this.c = fcsuVar;
        this.a = fcsuVar2;
    }

    @Override // defpackage.efal
    public final void a(ewee eweeVar, int i) {
        int iIntValue;
        double d;
        ewec ewecVar = (ewec) eweg.a.createBuilder();
        ewecVar.copyOnWrite();
        eweg ewegVar = (eweg) ewecVar.instance;
        ewegVar.c = eweeVar.h;
        ewegVar.b |= 1;
        ewecVar.copyOnWrite();
        eweg ewegVar2 = (eweg) ewecVar.instance;
        ewegVar2.d = i - 1;
        ewegVar2.b |= 2;
        eweg ewegVar3 = (eweg) ewecVar.build();
        if (this.d.get()) {
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            ellf ellfVar = ellf.JIBE_SERVICE_CONNECTION;
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            ellhVar.j = ellfVar.f11do;
            ellhVar.b |= 1;
            ellgVar.copyOnWrite();
            ellh ellhVar2 = (ellh) ellgVar.instance;
            ewegVar3.getClass();
            ellhVar2.aF = ewegVar3;
            ellhVar2.e |= 256;
            aill aillVar = this.b;
            ewee eweeVarB = ewee.b(ewegVar3.c);
            if (eweeVarB == null) {
                eweeVarB = ewee.UNKNOWN_SERVICE;
            }
            switch (eweeVarB.ordinal()) {
                case 1:
                    iIntValue = ((Integer) dfoo.a().a.a.a()).intValue();
                    d = iIntValue;
                    break;
                case 2:
                    iIntValue = ((Integer) dfoo.a().a.b.a()).intValue();
                    d = iIntValue;
                    break;
                case 3:
                    iIntValue = ((Integer) dfoo.a().a.c.a()).intValue();
                    d = iIntValue;
                    break;
                case 4:
                    iIntValue = ((Integer) dfoo.a().a.d.a()).intValue();
                    d = iIntValue;
                    break;
                case 5:
                    iIntValue = ((Integer) dfoo.a().a.e.a()).intValue();
                    d = iIntValue;
                    break;
                case 6:
                    iIntValue = ((Integer) dfoo.a().a.f.a()).intValue();
                    d = iIntValue;
                    break;
                default:
                    d = 0.0d;
                    break;
            }
            aillVar.p(ellgVar, d);
        }
    }
}
