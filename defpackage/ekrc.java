package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekrc extends ekrn implements ekrw {
    protected ekrc(Level level) {
        super(level);
    }

    @Override // defpackage.ekrn
    protected final ekwn b() {
        return ekwl.a;
    }

    @Override // defpackage.ekrn
    protected final boolean c(ekrr ekrrVar) {
        ekte ekteVarI = i();
        int iB = ekteVarI.b();
        int i = 0;
        while (true) {
            if (i >= iB) {
                break;
            }
            if (ekteVarI.c(i).a != "eye3tag") {
                i++;
            } else if (ekteVarI.d(ekrl.a) == null) {
                ekrz ekrzVar = ekrl.i;
                if (ekteVarI.d(ekrzVar) == null) {
                    n(ekrzVar, eksk.SMALL);
                }
            }
        }
        return super.c(ekrrVar);
    }
}
