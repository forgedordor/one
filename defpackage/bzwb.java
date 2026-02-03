package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzwb {
    public static final String a(String str, String str2, cpyj cpyjVar, boolean z) {
        str.getClass();
        str2.getClass();
        cpyjVar.getClass();
        if (!eotp.a("bugle.enable_foreground_service_for_media_backup", "bugle")) {
            return str + "_" + str2 + "_" + cpyjVar.c();
        }
        String str3 = true != z ? "BACKGROUND" : "FOREGROUND";
        return str + "_" + str2 + "_" + cpyjVar.c() + "_" + str3;
    }
}
