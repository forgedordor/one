package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxpr {
    /* JADX WARN: Type inference failed for: r1v6, types: [dxvw, java.lang.Object] */
    public static final dxvw a(ejwi ejwiVar, ejwi ejwiVar2, dxha dxhaVar, fcsu fcsuVar) {
        dxhaVar.getClass();
        if (dxhaVar.a()) {
            if (!((Boolean) fcsuVar.b()).booleanValue()) {
                throw new IllegalStateException("GnpRegistrationDataProvider must be provided for non-unified FCM registrations");
            }
        } else {
            if (!dxhaVar.b()) {
                throw new IllegalStateException("Unsupported targetType for RegistrationDataProviderHelper");
            }
            ejwiVar = ejwiVar2;
        }
        return ((ejwt) ejwiVar).a;
    }
}
