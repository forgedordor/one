package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebld {
    final /* synthetic */ eblf a;

    public ebld(eblf eblfVar) {
        this.a = eblfVar;
    }

    public final void a(ebpc ebpcVar) {
        eblf eblfVar = this.a;
        if (ebpcVar.r()) {
            int i = ebpcVar.l;
            ebkw ebkwVar = eblfVar.b;
            if (ebkwVar == null) {
                dhja.q("Keep alive listener is null", new Object[0]);
                return;
            } else if (i == 3) {
                ebkwVar.e();
                return;
            } else {
                ebkwVar.f();
                return;
            }
        }
        try {
            if (ebpcVar.s()) {
                ebqr ebqrVar = new ebqr((ebpd) ebpcVar);
                dhja.w(25, 3, "SIP request received with method=%s and callid=%s", ebqrVar.z(), ebqrVar.d());
                if (((Boolean) dfbu.h.a()).booleanValue()) {
                    dhja.c("\n%s", ebqrVar.n());
                }
                dhip dhipVarA = eblfVar.a();
                CopyOnWriteArrayList copyOnWriteArrayList = eblfVar.a;
                dhja.l(dhipVarA, "Notifying %d SIP listener(s) about %s request for %s", Integer.valueOf(copyOnWriteArrayList.size()), ebqrVar.z(), ebqrVar.d());
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((ebkz) it.next()).f(ebqrVar);
                }
                return;
            }
            ebqs ebqsVar = new ebqs((ebpe) ebpcVar);
            dhja.w(25, 3, "SIP response received with code=%s and callid=%s", Integer.valueOf(ebqsVar.y()), ebqsVar.d());
            if (((Boolean) dfbu.h.a()).booleanValue()) {
                dhja.c("\n%s", ebqsVar.n());
            }
            dhip dhipVarA2 = eblfVar.a();
            CopyOnWriteArrayList copyOnWriteArrayList2 = eblfVar.a;
            dhja.l(dhipVarA2, "Notifying %d SIP listener(s) about %d %s response for %s (CallId=%s)", Integer.valueOf(copyOnWriteArrayList2.size()), Integer.valueOf(ebqsVar.y()), ebqsVar.A(), ebqsVar.z().i(), ebqsVar.d());
            Iterator it2 = copyOnWriteArrayList2.iterator();
            while (it2.hasNext()) {
                ((ebkz) it2.next()).g(ebqsVar);
            }
        } catch (Exception e) {
            dhja.g("Can't process incoming message: %s", e.getMessage());
        }
    }
}
