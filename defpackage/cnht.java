package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnht {
    private static final cczi a = cdag.e(cdag.b, "tachygram_work_handler_retries", 6);
    private static final cczi b = cdag.f(cdag.b, "tachygram_work_handler_retry_delay_milliseconds", 10000);

    static caxz a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(((Integer) a.e()).intValue());
        caxzVarL.f(pza.a);
        caxzVarL.g(((Long) b.e()).longValue());
        caxzVarL.b(caze.BACKGROUND_SERVICE_FALLBACK_TO_FOREGROUND_SERVICE);
        return caxzVarL;
    }
}
