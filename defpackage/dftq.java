package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dftq {
    public static final dfny a = dfnv.b("is_composing_without_cpim_wrapper");
    static final dfny b = dfnv.b("enable_instant_messaging_service_exception");
    public static final dhip c = new dhip("SendMessageProducerModule");

    public static dgzu a(dgwa dgwaVar) {
        dgzu dgzuVar = (dgzu) dgwaVar.a(dgzu.class);
        if (dgzuVar != null) {
            return dgzuVar;
        }
        dhja.h(c, "InstantMessagingService is null.", new Object[0]);
        throw new dftn();
    }
}
