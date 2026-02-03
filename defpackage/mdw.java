package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdw {
    public static final mdw a;
    private static final eknw c = new ekcc(new ejvr() { // from class: mdv
        @Override // defpackage.ejvr
        public final Object apply(Object obj) {
            mdw mdwVar = mdw.a;
            return Integer.valueOf(((mdu) obj).L);
        }
    }, ekno.a);
    public final ekgb b;

    static {
        int i = ekgb.d;
        a = new mdw(ekoe.a);
        mgb.O(0);
        mgb.O(1);
    }

    public mdw(List list) {
        this.b = ekgb.E(c, list);
    }
}
