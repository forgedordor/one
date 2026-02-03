package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtxv extends ejtf {
    final /* synthetic */ dtxx a;

    public dtxv(dtxx dtxxVar) {
        this.a = dtxxVar;
    }

    @Override // defpackage.ejtf
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        String str = (String) obj;
        if (str == null) {
            str = "UNKNOWN";
        }
        ((ekrd) ((ekrd) ((ekrd) dtxx.a.i()).g(th)).h("com/google/android/libraries/mdi/download/debug/common/filegroups/MddDebugListFragmentActionProviderImpl$1", "onFailure", 53, "MddDebugListFragmentActionProviderImpl.java")).t("MDD Debug Action: %s failed", str);
        if (str.hashCode() == -1167398896 && str.equals("MDD.DEBUG.UPDATE_ACTION")) {
            dtxx dtxxVar = this.a;
            dtxs dtxsVar = dtxxVar.h;
            if (dtxsVar != null) {
                dtxsVar.a("Unable to get file groups, check log for details\n(You may need to force refresh tracked file groups)");
            }
            dtxxVar.c();
        }
    }

    @Override // defpackage.ejtf
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        String str = (String) obj;
        if (str == null) {
            str = "UNKNOWN";
        }
        ((ekrd) ((ekrd) dtxx.a.e()).h("com/google/android/libraries/mdi/download/debug/common/filegroups/MddDebugListFragmentActionProviderImpl$1", "onSuccess", 35, "MddDebugListFragmentActionProviderImpl.java")).t("MDD Debug Action: %s succeeded", str);
        if (str.hashCode() == -1167398896 && str.equals("MDD.DEBUG.UPDATE_ACTION")) {
            this.a.c();
        }
    }
}
