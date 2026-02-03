package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jch {
    public static final int a(jde jdeVar, itz itzVar) {
        jde jdeVarN = jdeVar.N();
        if (jdeVarN == null) {
            itw.d(a.h(jdeVar, "Child of ", " cannot be null when calculating alignment line"));
        }
        if (jdeVar.K().m().containsKey(itzVar)) {
            Integer num = (Integer) jdeVar.K().m().get(itzVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iEi = jdeVarN.ei(itzVar);
        if (iEi == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        jdeVarN.k = true;
        jdeVar.l = true;
        jdeVar.T();
        jdeVarN.k = false;
        jdeVar.l = false;
        return iEi + (itzVar instanceof ivg ? kjb.b(jdeVarN.I()) : kjb.a(jdeVarN.I()));
    }
}
