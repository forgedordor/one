package defpackage;

import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unj implements uni {
    static {
        eksp.c("BugleReactions");
    }

    @Override // defpackage.uni
    public final unm a(baea baeaVar) {
        Optional optionalEmpty;
        cknj cknjVar = new cknj(baeaVar.r(), baeaVar.s().k() ? baeaVar.s() : baeaVar.t(), cknp.a(baeaVar.g));
        cklv cklvVar = baeaVar.r;
        if (cklvVar != null) {
            Iterator<E> it = cklvVar.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    optionalEmpty = Optional.empty();
                    break;
                }
                ckme ckmeVar = (ckme) it.next();
                Iterator<E> it2 = ckmeVar.d.iterator();
                while (it2.hasNext()) {
                    ckly cklyVar = ((ckmi) it2.next()).c;
                    if (cklyVar == null) {
                        cklyVar = ckly.a;
                    }
                    if (cklyVar.c) {
                        ckmb ckmbVar = ckmeVar.c;
                        if (ckmbVar == null) {
                            ckmbVar = ckmb.a;
                        }
                        optionalEmpty = Optional.of(ckmbVar);
                    }
                }
            }
        } else {
            optionalEmpty = Optional.empty();
        }
        return new unk(cknjVar, optionalEmpty);
    }
}
