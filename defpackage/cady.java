package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class cady {
    public static ekrz a(caei caeiVar) {
        if (cpyl.a() || ((Boolean) ((cczi) cpyl.Y.get()).e()).booleanValue()) {
            caee caeeVarB = caee.b(caeiVar.h);
            if (caeeVarB == null) {
                caeeVarB = caee.UNSPECIFIED_FLOW;
            }
            if (caeeVarB == caee.BNR_OPT_OUT) {
                return bzmz.J;
            }
        }
        if (cpyl.a()) {
            caee caeeVarB2 = caee.b(caeiVar.h);
            if (caeeVarB2 == null) {
                caeeVarB2 = caee.UNSPECIFIED_FLOW;
            }
            if (caeeVarB2 == caee.BNR_AND_MD_OPT_OUT) {
                return bzmz.K;
            }
        }
        return bzmz.I;
    }
}
