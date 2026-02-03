package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vaf {
    public static final ensv a(Throwable th) {
        return th instanceof agrm ? ensv.MAGIC_COMPOSE_FILTERED_BY_SAFETY_BLOCKLIST : ((th instanceof agrb) || (th instanceof agra)) ? ensv.MAGIC_COMPOSE_COULD_NOT_GENERATE_RESULTS : th instanceof agrk ? ensv.MAGIC_COMPOSE_NETWORK_UNAVAILABLE_STATUS : th instanceof agrp ? ensv.MAGIC_COMPOSE_SEVER_ERROR_STATUS : th instanceof agro ? ensv.MAGIC_COMPOSE_RATE_LIMITED_STATUS : th instanceof agrc ? ensv.MAGIC_COMPOSE_DEADLINE_EXCEEDED_STATUS : th instanceof agrs ? ensv.MAGIC_COMPOSE_UNAUTHORIZED_STATUS : th instanceof agrt ? ensv.MAGIC_COMPOSE_UNKNOWN_STATUS : th instanceof agrq ? ensv.MAGIC_COMPOSE_SERVER_THROTTLED : th instanceof agrf ? ensv.MAGIC_COMPOSE_FEATURE_DOWNLOADING : ensv.MAGIC_COMPOSE_ERROR_SUB_TYPE_UNSPECIFIED;
    }

    public static final int b(Throwable th) {
        if (th instanceof agrl) {
            return 2;
        }
        return ((th instanceof agrr) || (th instanceof agrf)) ? 3 : 1;
    }
}
