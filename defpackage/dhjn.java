package defpackage;

import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhjn implements ebla {
    private static final Set a = ekhx.v("ACK", "BYE", "INVITE", "OPTIONS", "REGISTER", "SUBSCRIBE", new String[0]);
    private final fcsu b;

    public dhjn(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    private static final String b(ebqq ebqqVar) {
        return ejwk.b(ebqqVar.a.i());
    }

    @Override // defpackage.ebla
    public final void a(ebqq ebqqVar) {
        ebmk ebmkVar = new ebmk();
        ebnr ebnrVarB = ebqqVar.b();
        String strB = b(ebqqVar);
        ebpc ebpcVar = ebqqVar.a;
        int iY = ebpcVar.t() ? ((ebqs) ebqqVar).y() : -1;
        if (a.contains(strB)) {
            if (ebpcVar.s() || iY == 200) {
                if (ebnrVarB != null) {
                    ebmkVar = ebnrVarB.e;
                }
                ebmk ebmkVar2 = ebmkVar;
                boolean z = false;
                if (ebpcVar.s() && b(ebqqVar).equals("REGISTER")) {
                    z = true;
                }
                dfzw dfzwVar = (dfzw) ((dfzz) this.b).b();
                Optional optional = dfzwVar.a;
                String str = dfzwVar.b;
                ewfe ewfeVar = dfzwVar.c;
                ebmr ebmrVar = dfzwVar.d;
                int i = dfzwVar.e;
                String str2 = dfzwVar.f;
                String str3 = ebmrVar.d;
                String str4 = ewfeVar.c;
                try {
                    ebkr ebkrVar = dhjv.a;
                    ebqqVar.u(new ebnr(ebkr.f((String) optional.orElse(null), z, str, str4), str3, i, Optional.of(str2), ebmkVar2));
                    ebmj ebmjVarA = ebmkVar2.a("mobility");
                    if (ebmjVarA != null) {
                        ebmjVarA.e = "mobile";
                        return;
                    }
                    ebmj ebmjVar = new ebmj("mobility", "mobile");
                    ebmjVar.b();
                    ebmkVar2.e(ebmjVar);
                } catch (ebml e) {
                    throw new IllegalArgumentException("ContactHeader could not be created", e);
                }
            }
        }
    }
}
