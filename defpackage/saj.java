package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class saj implements sat {
    private sat a;
    private final rzg b;

    public saj(rzg rzgVar) {
        this.b = rzgVar;
    }

    public final synchronized sat a() {
        if (this.a == null) {
            rzh rzhVar = this.b.a;
            saq saqVar = new saq(rzhVar.b);
            ecap ecapVar = ((rzf) rzhVar).a;
            List listSingletonList = ecapVar != null ? Collections.singletonList(new ecao(ecapVar.a)) : null;
            if (listSingletonList != null) {
                rzu rzuVar = new rzu(listSingletonList);
                saqVar.a(new sao(rzt.a), new rzt(rzuVar));
                rzr rzrVar = new rzr(rzuVar);
                saqVar.a(new sao("GET /dumpapp".getBytes()), rzrVar);
                saqVar.a(new sao("POST /dumpapp".getBytes()), rzrVar);
            }
            this.a = saqVar;
        }
        return this.a;
    }
}
