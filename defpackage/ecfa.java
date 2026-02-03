package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecfa {
    public String a;
    public final ekfw b;
    private final Context c;
    private String d = "files";
    private String e = "common";
    private Account f = ecfb.b;
    private String g = "";

    public ecfa(Context context) {
        int i = ekgb.d;
        this.b = new ekfw();
        ecgq.a(context != null, "Context cannot be null", new Object[0]);
        this.c = context;
        this.a = context.getPackageName();
    }

    public final Uri a() {
        return new Uri.Builder().scheme("android").authority(this.a).path("/" + this.d + "/" + this.e + "/" + ecew.b(this.f) + "/" + this.g).encodedFragment(ecgp.a(this.b.g())).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecfa.b(java.lang.String):void");
    }

    public final void c(Account account) {
        ecew.b(account);
        this.f = account;
    }

    public final void d() {
        e("directboot-files");
    }

    public final void e(String str) {
        Set set = ecfb.d;
        ecgq.a(set.contains(str), "The only supported locations are %s: %s", set, str);
        this.d = str;
    }

    public final void f(String str) {
        ecgq.a(ecfb.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        ecgq.a(!ecfb.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.e = str;
    }

    public final void g(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = ecfb.a;
        this.g = str;
    }
}
