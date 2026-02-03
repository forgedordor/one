package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efyp {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/account/api/controller/AccountIntents");

    static boolean a(Intent intent) {
        return intent.hasExtra("$tiktok$for_requirement_activity");
    }

    static void b(Intent intent) {
        intent.putExtra("$tiktok$for_requirement_activity", true);
    }

    public static void c(Intent intent, efwo efwoVar) {
        ejwl.a(efwoVar.a() != -1);
        intent.putExtra("account_id", efwoVar.a());
        intent.putExtra("$tiktok$account_id_owned", true);
    }

    public static boolean d(Intent intent) {
        return intent.hasExtra("account_id");
    }
}
