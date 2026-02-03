package defpackage;

import android.hardware.display.DisplayManager;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmdt extends fcyz implements fdat {
    int a;
    final /* synthetic */ cmdx b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmdt(cmdx cmdxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cmdxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmdt) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final fdos fdosVar = (fdos) this.c;
            final cmdx cmdxVar = this.b;
            fcsu fcsuVar = cmdxVar.a;
            cmdx.b(fdosVar.b(((cmdi) fcsuVar.b()).b(null)));
            final DisplayManager.DisplayListener displayListenerA = ((cmdi) fcsuVar.b()).a(new fdae() { // from class: cmdr
                @Override // defpackage.fdae
                public final Object invoke() throws IOException {
                    cmdx cmdxVar2 = cmdxVar;
                    eieh eiehVarA = ((eigp) cmdxVar2.c.b()).a("ScreenDetectionUiAdapter.displayListener");
                    try {
                        cmdx.b(fdosVar.b(((cmdi) cmdxVar2.a.b()).b(cmdxVar2.e)));
                        fczl.a(eiehVarA, null);
                        return fctx.a;
                    } finally {
                    }
                }
            });
            fdae fdaeVar = new fdae() { // from class: cmds
                @Override // defpackage.fdae
                public final Object invoke() throws IOException {
                    DisplayManager.DisplayListener displayListener = displayListenerA;
                    if (displayListener != null) {
                        ((cmdi) cmdxVar.a.b()).d(displayListener);
                    }
                    return fctx.a;
                }
            };
            this.a = 1;
            if (fdor.b(fdosVar, fdaeVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cmdt cmdtVar = new cmdt(this.b, fcxyVar);
        cmdtVar.c = obj;
        return cmdtVar;
    }
}
