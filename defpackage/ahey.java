package defpackage;

import j$.util.Optional;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahey {
    private final fcsu a;

    public ahey(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public final Iterable a(Iterable iterable) {
        Optional optionalL = ((dggz) this.a.b()).l();
        Iterable iterable2 = iterable;
        if (!optionalL.isEmpty()) {
            iterable2 = iterable;
            if (((Boolean) dfog.o().a.S.a()).booleanValue()) {
                HashSet hashSetE = ekpg.e(iterable);
                dgiq dgiqVar = (dgiq) optionalL.get();
                if (hashSetE.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im") && !dgiqVar.r().mChatAuth) {
                    hashSetE.remove("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im");
                }
                if (hashSetE.contains(dhbr.a()) && hashSetE.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp") && !dgiqVar.r().mGroupChatAuth) {
                    hashSetE.remove(dhbr.a());
                }
                boolean zContains = hashSetE.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
                iterable2 = hashSetE;
                if (zContains) {
                    iterable2 = hashSetE;
                    if (!dgiqVar.r().mFtAuth) {
                        hashSetE.remove("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
                        iterable2 = hashSetE;
                    }
                }
            }
        }
        return iterable2;
    }
}
