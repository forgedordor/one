package defpackage;

import org.chromium.net.CallbackException;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class comy {
    public static enof a(CronetException cronetException) {
        if (!(cronetException instanceof NetworkException)) {
            if (cronetException instanceof CallbackException) {
                ennz ennzVar = (ennz) enof.a.createBuilder();
                ennzVar.copyOnWrite();
                enof enofVar = (enof) ennzVar.instance;
                enofVar.d = 3;
                enofVar.b |= 4;
                return (enof) ennzVar.build();
            }
            if (cronetException instanceof fgco) {
                ennz ennzVar2 = (ennz) enof.a.createBuilder();
                ennzVar2.copyOnWrite();
                enof enofVar2 = (enof) ennzVar2.instance;
                enofVar2.d = 4;
                enofVar2.b |= 4;
                return (enof) ennzVar2.build();
            }
            ennz ennzVar3 = (ennz) enof.a.createBuilder();
            ennzVar3.copyOnWrite();
            enof enofVar3 = (enof) ennzVar3.instance;
            enofVar3.d = 0;
            enofVar3.b |= 4;
            return (enof) ennzVar3.build();
        }
        enoa enoaVar = (enoa) enod.a.createBuilder();
        NetworkException networkException = (NetworkException) cronetException;
        long cronetInternalErrorCode = networkException.getCronetInternalErrorCode();
        enoaVar.copyOnWrite();
        enod enodVar = (enod) enoaVar.instance;
        enodVar.b |= 2;
        enodVar.d = cronetInternalErrorCode;
        long errorCode = networkException.getErrorCode();
        enoaVar.copyOnWrite();
        enod enodVar2 = (enod) enoaVar.instance;
        enodVar2.b |= 1;
        enodVar2.c = errorCode;
        boolean z = cronetException instanceof QuicException;
        if (z) {
            enob enobVar = (enob) enoc.a.createBuilder();
            long quicDetailedErrorCode = ((QuicException) cronetException).getQuicDetailedErrorCode();
            enobVar.copyOnWrite();
            enoc enocVar = (enoc) enobVar.instance;
            enocVar.b |= 1;
            enocVar.c = quicDetailedErrorCode;
            enoaVar.copyOnWrite();
            enod enodVar3 = (enod) enoaVar.instance;
            enoc enocVar2 = (enoc) enobVar.build();
            enocVar2.getClass();
            enodVar3.e = enocVar2;
            enodVar3.b |= 4;
        }
        ennz ennzVar4 = (ennz) enof.a.createBuilder();
        int i = true == z ? 2 : 3;
        ennzVar4.copyOnWrite();
        enof enofVar4 = (enof) ennzVar4.instance;
        enofVar4.d = i - 1;
        enofVar4.b |= 4;
        ennzVar4.copyOnWrite();
        enof enofVar5 = (enof) ennzVar4.instance;
        enod enodVar4 = (enod) enoaVar.build();
        enodVar4.getClass();
        enofVar5.c = enodVar4;
        enofVar5.b |= 1;
        return (enof) ennzVar4.build();
    }
}
