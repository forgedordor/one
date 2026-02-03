package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cngx {
    public static final boolean a(eqeq eqeqVar) {
        ezol ezolVar = eqeqVar.f;
        if (ezolVar == null) {
            return false;
        }
        if (((Boolean) ((cczi) crbf.aw.get()).e()).booleanValue()) {
            felm felmVarB = felm.b(ezolVar.b);
            if (felmVarB == null) {
                felmVarB = felm.UNRECOGNIZED;
            }
            if (felmVarB == felm.PENPAL_CONVERSATION_ID) {
                return false;
            }
        }
        return true;
    }
}
