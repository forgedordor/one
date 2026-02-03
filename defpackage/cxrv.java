package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxrv {
    public static void a(String str) throws InterruptedException {
        try {
            new ProcessBuilder(new String[0]).command(str).start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
            ekrw ekrwVarE = cxsa.c.e();
            ekrwVarE.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarE).g(e)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl$ChangeLinkedFile", "exec", 6640, "DebugUtilsImpl.java")).t("Failed execute %s", str);
        }
    }
}
