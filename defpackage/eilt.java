package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eilt {
    private static final ejwc a = ejwc.d('.');
    private static final ekrg b = ekrg.c("com/google/apps/tiktok/tracing/contrib/xuikit/TikTokXUiKitTracer");
    private final eigp c;

    public eilt(eigp eigpVar) {
        this.c = eigpVar;
    }

    public static final eieh c() {
        if (!(eidc.c() instanceof eicp)) {
            return null;
        }
        ((ekrd) ((ekrd) b.j()).h("com/google/apps/tiktok/tracing/contrib/xuikit/TikTokXUiKitTracer", "maybeCleanUpErrorTrace", 68, "TikTokXUiKitTracer.java")).q("Temporarily overriding an ErrorTrace");
        return eidc.a(null);
    }

    private static String d(String str, String[] strArr) {
        if (strArr.length == 0) {
            return str;
        }
        return str + "." + a.f(strArr);
    }

    public final Object a(ejxr ejxrVar, String str, String... strArr) {
        if (eidc.v()) {
            return ejxrVar.get();
        }
        eieh eiehVarD = this.c.d("com/google/apps/tiktok/tracing/contrib/xuikit/TikTokXUiKitTracer", "ensureTraceNoError", 97, d(str, strArr));
        try {
            Object obj = ejxrVar.get();
            eiehVarD.close();
            return obj;
        } catch (Throwable th) {
            try {
                eiehVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(Runnable runnable, String... strArr) {
        if (eidc.v()) {
            runnable.run();
            return;
        }
        eieh eiehVarD = this.c.d("com/google/apps/tiktok/tracing/contrib/xuikit/TikTokXUiKitTracer", "ensureTraceNoError", 81, d("ProfileSuggestionsAdapterImpl#toSuggestionUiData", strArr));
        try {
            runnable.run();
            eiehVarD.close();
        } catch (Throwable th) {
            try {
                eiehVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
