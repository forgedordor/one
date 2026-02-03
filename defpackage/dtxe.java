package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtxe extends ejtf {
    @Override // defpackage.ejtf
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        String str = (String) obj;
        ekrd ekrdVar = (ekrd) ((ekrd) ((ekrd) dtxf.a.i()).g(th)).h("com/google/android/libraries/mdi/download/debug/common/debuginfo/MddDebugInfoFragmentActionProviderImpl$1", "onFailure", 46, "MddDebugInfoFragmentActionProviderImpl.java");
        if (str == null) {
            str = "UNKNOWN";
        }
        ekrdVar.t("MDD Debug Action: %s failed", str);
    }

    @Override // defpackage.ejtf
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        String str = (String) obj;
        if (str == null) {
            ((ekrd) ((ekrd) dtxf.a.j()).h("com/google/android/libraries/mdi/download/debug/common/debuginfo/MddDebugInfoFragmentActionProviderImpl$1", "onSuccess", 35, "MddDebugInfoFragmentActionProviderImpl.java")).q("MDD Debug Action completed, but no action was given. No additional operation will be performed");
        } else {
            ((ekrd) ((ekrd) dtxf.a.e()).h("com/google/android/libraries/mdi/download/debug/common/debuginfo/MddDebugInfoFragmentActionProviderImpl$1", "onSuccess", 40, "MddDebugInfoFragmentActionProviderImpl.java")).t("MDD Debug Action succeeded: %s", str);
        }
    }
}
