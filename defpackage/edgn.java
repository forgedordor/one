package defpackage;

import android.net.Uri;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edgn {
    public static final /* synthetic */ int a = 0;
    private static final eurq b;
    private static final eurc c;

    static {
        eurp eurpVar = (eurp) eurq.a.createBuilder();
        eurpVar.copyOnWrite();
        eurq eurqVar = (eurq) eurpVar.instance;
        eurqVar.c = 1;
        eurqVar.b |= 1;
        b = (eurq) eurpVar.build();
        eurb eurbVar = (eurb) eurc.a.createBuilder();
        eurbVar.copyOnWrite();
        eurc eurcVar = (eurc) eurbVar.instance;
        eurcVar.c = 2;
        eurcVar.b = 1 | eurcVar.b;
        c = (eurc) eurbVar.build();
    }

    public static eurc a(rhs rhsVar) {
        if (rhsVar != null) {
            for (Throwable th : rhsVar.a()) {
                if (th instanceof ree) {
                    ree reeVar = (ree) th;
                    eurb eurbVar = (eurb) eurc.a.createBuilder();
                    if (reeVar.getCause() instanceof SocketTimeoutException) {
                        eurbVar.copyOnWrite();
                        eurc eurcVar = (eurc) eurbVar.instance;
                        eurcVar.c = 4;
                        eurcVar.b |= 1;
                        eurq eurqVar = b;
                        eurbVar.copyOnWrite();
                        eurc eurcVar2 = (eurc) eurbVar.instance;
                        eurqVar.getClass();
                        eurcVar2.e = eurqVar;
                        eurcVar2.b |= 4;
                        return (eurc) eurbVar.build();
                    }
                    if (reeVar.getCause() instanceof UnknownHostException) {
                        eurbVar.copyOnWrite();
                        eurc eurcVar3 = (eurc) eurbVar.instance;
                        eurcVar3.c = 1;
                        eurcVar3.b |= 1;
                        eurq eurqVar2 = b;
                        eurbVar.copyOnWrite();
                        eurc eurcVar4 = (eurc) eurbVar.instance;
                        eurqVar2.getClass();
                        eurcVar4.e = eurqVar2;
                        eurcVar4.b |= 4;
                        return (eurc) eurbVar.build();
                    }
                    eurp eurpVar = (eurp) b.toBuilder();
                    int i = reeVar.a;
                    eurpVar.copyOnWrite();
                    eurq eurqVar3 = (eurq) eurpVar.instance;
                    eurqVar3.b |= 2;
                    eurqVar3.d = i;
                    eurbVar.copyOnWrite();
                    eurc eurcVar5 = (eurc) eurbVar.instance;
                    eurq eurqVar4 = (eurq) eurpVar.build();
                    eurqVar4.getClass();
                    eurcVar5.e = eurqVar4;
                    eurcVar5.b |= 4;
                    if (i == 403) {
                        eurbVar.copyOnWrite();
                        eurc eurcVar6 = (eurc) eurbVar.instance;
                        eurcVar6.c = 16;
                        eurcVar6.b |= 1;
                    } else if (i == 404) {
                        eurbVar.copyOnWrite();
                        eurc eurcVar7 = (eurc) eurbVar.instance;
                        eurcVar7.c = 5;
                        eurcVar7.b |= 1;
                    } else if (i == 500) {
                        eurbVar.copyOnWrite();
                        eurc eurcVar8 = (eurc) eurbVar.instance;
                        eurcVar8.c = 13;
                        eurcVar8.b |= 1;
                    }
                    return (eurc) eurbVar.build();
                }
            }
        }
        return c;
    }

    public static int b(Object obj) {
        if (obj instanceof Uri) {
            return 3;
        }
        return obj instanceof edeb ? 2 : 1;
    }
}
