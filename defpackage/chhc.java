package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chhc {
    public static final chha a(chgt chgtVar, Throwable th) {
        chgtVar.getClass();
        enxi enxiVar = th instanceof cmph ? enxi.CHAT_API_SERIALIZATION_ERROR : enxi.CHAT_API_GENERIC_TRANSPORT_ERROR;
        enxt enxtVar = (enxt) enxu.a.createBuilder();
        enxtVar.getClass();
        enxv enxvVar = (enxv) enxw.a.createBuilder();
        enxvVar.getClass();
        enye.d(2, enxvVar);
        enye.b(enxiVar, enxvVar);
        enxb.b(enye.a(enxvVar), enxtVar);
        return new chha(chgt.a(chgtVar, null, null, null, new chwo(false, enxb.a(enxtVar), null), 32767), th);
    }
}
