package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byau {
    public static final cqce a = cqce.g("BugleUsageStatistics", "IcingIndexRebuildLogger");
    public final fcsu b;
    public final fcsu c;
    private final eosc d;

    public byau(fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = eoscVar;
    }

    public final void a(final int i, final String str) {
        eijx.f(new Runnable() { // from class: byat
            @Override // java.lang.Runnable
            public final void run() {
                byau byauVar = this.a;
                if (!((ajhd) byauVar.b.b()).Y()) {
                    byau.a.m("Clearcut loggings are disabled.");
                    return;
                }
                String str2 = str;
                ellg ellgVar = (ellg) ellh.a.createBuilder();
                ellf ellfVar = ellf.ICING_INDEX_REBUILD;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                ellhVar.j = ellfVar.f11do;
                ellhVar.b |= 1;
                emax emaxVar = (emax) emba.a.createBuilder();
                emaxVar.copyOnWrite();
                emba embaVar = (emba) emaxVar.instance;
                str2.getClass();
                embaVar.b |= 4;
                embaVar.e = str2;
                emaxVar.copyOnWrite();
                emba embaVar2 = (emba) emaxVar.instance;
                int i2 = i;
                embaVar2.c = 2;
                embaVar2.b |= 1;
                emaxVar.copyOnWrite();
                emba embaVar3 = (emba) emaxVar.instance;
                embaVar3.d = i2 - 1;
                embaVar3.b |= 2;
                emba embaVar4 = (emba) emaxVar.build();
                ellgVar.copyOnWrite();
                ellh ellhVar2 = (ellh) ellgVar.instance;
                embaVar4.getClass();
                ellhVar2.ap = embaVar4;
                ellhVar2.d |= 4096;
                ((aill) byauVar.c.b()).j(ellgVar);
            }
        }, this.d).k(auvh.b(), eoqg.a);
    }
}
