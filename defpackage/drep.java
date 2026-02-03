package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drep {
    private static final ekrg a = ekrg.c("com/google/android/libraries/geller/portable/GellerUtil");

    /* JADX WARN: Type inference failed for: r7v3, types: [evuh, java.lang.Object] */
    public static evuh a(byte[] bArr, evuh evuhVar) {
        if (bArr == null) {
            ((ekrd) ((ekrd) a.i()).h("com/google/android/libraries/geller/portable/GellerUtil", "processNativeResult", 67, "GellerUtil.java")).q("Native result is null.");
            return evuhVar;
        }
        try {
            return evuhVar.getParserForType().l(bArr, evrr.a());
        } catch (evtj e) {
            ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/android/libraries/geller/portable/GellerUtil", "processNativeResult", '@', "GellerUtil.java")).q("Invalid native result.");
            return evuhVar;
        }
    }
}
