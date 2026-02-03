package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzvc {
    public static final boolean a(aumq aumqVar) {
        if (!cpyl.a() || !((Boolean) ((cczi) cpyl.z.get()).e()).booleanValue()) {
            return false;
        }
        auml aumlVarB = auml.b(aumqVar.l);
        if (aumlVarB == null) {
            aumlVarB = auml.UNSPECIFIED_STATUS;
        }
        return aumlVarB != auml.ENABLED;
    }
}
