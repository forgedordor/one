package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbdg {
    static final cczi a = cdag.h(cdag.b, "enable_participants_table_operation_logging", false);
    public final fcsu b;
    public final eosc c;

    public bbdg(fcsu fcsuVar, eosc eoscVar) {
        this.b = fcsuVar;
        this.c = eoscVar;
    }

    public final void a(final int i, final int i2) {
        eiju eijuVarB = a.b();
        eooz eoozVar = new eooz() { // from class: bbde
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return eijx.e(null);
                }
                final int i3 = i2;
                final int i4 = i;
                final bbdg bbdgVar = this.a;
                return eijx.f(new Runnable() { // from class: bbdf
                    @Override // java.lang.Runnable
                    public final void run() {
                        aill aillVar = (aill) bbdgVar.b.b();
                        ellg ellgVar = (ellg) ellh.a.createBuilder();
                        elqs elqsVar = (elqs) elqt.a.createBuilder();
                        elqsVar.copyOnWrite();
                        elqt elqtVar = (elqt) elqsVar.instance;
                        elqtVar.c = i4 - 1;
                        elqtVar.b |= 1;
                        elqsVar.copyOnWrite();
                        elqt elqtVar2 = (elqt) elqsVar.instance;
                        elqtVar2.d = i3 - 1;
                        elqtVar2.b |= 2;
                        ellgVar.copyOnWrite();
                        ellh ellhVar = (ellh) ellgVar.instance;
                        elqt elqtVar3 = (elqt) elqsVar.build();
                        elqtVar3.getClass();
                        ellhVar.H = elqtVar3;
                        ellhVar.b |= Integer.MIN_VALUE;
                        ellf ellfVar = ellf.BUGLE_PARTICIPANTS_TABLE;
                        ellgVar.copyOnWrite();
                        ellh ellhVar2 = (ellh) ellgVar.instance;
                        ellhVar2.j = ellfVar.f11do;
                        ellhVar2.b |= 1;
                        aillVar.k(ellgVar, emxt.BUGLE_PARTICIPANTS_TABLE);
                    }
                }, bbdgVar.c);
            }
        };
        eoqg eoqgVar = eoqg.a;
        eijuVarB.i(eoozVar, eoqgVar).k(auvh.b(), eoqgVar);
    }
}
