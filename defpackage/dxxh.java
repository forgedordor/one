package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxxh implements dxgk {
    private static final eksp b = eksp.c("GnpSdk");
    public final eigp a;

    public dxxh(eigp eigpVar) {
        this.a = eigpVar;
    }

    @Override // defpackage.dxgk
    public final eifp a(String str) {
        return this.a.c(str, "com/google/android/libraries/notifications/platform/tiktok/trace/TikTokTrace", "beginRootTrace", 35);
    }

    @Override // defpackage.dxgk
    public final void b() {
        try {
            eiiy.e();
        } catch (IllegalStateException e) {
            ((eksl) ((eksl) ((eksl) b.i()).g(e)).h("com/google/android/libraries/notifications/platform/tiktok/trace/TikTokTrace", "checkTrace", 'T', "TikTokTrace.java")).q("Missing trace");
        }
    }
}
