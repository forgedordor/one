package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbeb implements fbdy {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;
    public static final eaci d;
    public static final eaci e;
    public static final eaci f;
    public static final eaci g;
    public static final eaci h;
    public static final eaci i;
    public static final eaci j;
    public static final eaci k;

    static {
        eadc eadcVar = fbdt.a;
        a = eacj.f("SuperpacksFlags__additional_download_labels", new eabn() { // from class: fbdz
            @Override // defpackage.eabn
            public final Object a(Object obj) {
                return (sfj) evsn.parseFrom(sfj.a, (byte[]) obj);
            }
        }, "Cg8KB3JlbGVhc2USBHByb2Q", "com.google.android.libraries.abuse.hades.moirai", eadcVar);
        b = eacj.e("SuperpacksFlags__always_download_on_startup", false, "com.google.android.libraries.abuse.hades.moirai", eadcVar);
        c = eacj.e("SuperpacksFlags__download_requires_charging", false, "com.google.android.libraries.abuse.hades.moirai", eadcVar);
        d = eacj.e("SuperpacksFlags__download_requires_wifi", false, "com.google.android.libraries.abuse.hades.moirai", eadcVar);
        e = eacj.e("SuperpacksFlags__enable_default_client_role", true, "com.google.android.libraries.abuse.hades.moirai", eadcVar);
        f = eacj.e("SuperpacksFlags__enable_flexible_downloads", false, "com.google.android.libraries.abuse.hades.moirai", eadcVar);
        g = eacj.e("SuperpacksFlags__enable_persephone_downloads", false, "com.google.android.libraries.abuse.hades.moirai", eadcVar);
        h = eacj.d("SuperpacksFlags__persephone_api_key", "AIzaSyBVISctL4wnC5nctQ1nGYDRD6zybQjKCL8", "com.google.android.libraries.abuse.hades.moirai", eadcVar);
        i = eacj.d("SuperpacksFlags__persephone_host_url", "ondevicesafety-pa.googleapis.com", "com.google.android.libraries.abuse.hades.moirai", eadcVar);
        j = eacj.c("SuperpacksFlags__protection_download_period", 7L, "com.google.android.libraries.abuse.hades.moirai", eadcVar);
        k = eacj.f("SuperpacksFlags__protection_download_policy", new eabn() { // from class: fbea
            @Override // defpackage.eabn
            public final Object a(Object obj) {
                return (dhvj) evsn.parseFrom(dhvj.a, (byte[]) obj);
            }
        }, "CgYIAhAAGAASDgoECID1JBIGCAIQABgA", "com.google.android.libraries.abuse.hades.moirai", eadcVar);
    }

    @Override // defpackage.fbdy
    public final long a(Context context) {
        return ((Long) j.gX(context)).longValue();
    }

    @Override // defpackage.fbdy
    public final sfj b(Context context) {
        return (sfj) a.gX(context);
    }

    @Override // defpackage.fbdy
    public final dhvj c(Context context) {
        return (dhvj) k.gX(context);
    }

    @Override // defpackage.fbdy
    public final String d(Context context) {
        return (String) h.gX(context);
    }

    @Override // defpackage.fbdy
    public final String e(Context context) {
        return (String) i.gX(context);
    }

    @Override // defpackage.fbdy
    public final boolean f(Context context) {
        return ((Boolean) b.gX(context)).booleanValue();
    }

    @Override // defpackage.fbdy
    public final boolean g(Context context) {
        return ((Boolean) c.gX(context)).booleanValue();
    }

    @Override // defpackage.fbdy
    public final boolean h(Context context) {
        return ((Boolean) d.gX(context)).booleanValue();
    }

    @Override // defpackage.fbdy
    public final boolean i(Context context) {
        return ((Boolean) e.gX(context)).booleanValue();
    }

    @Override // defpackage.fbdy
    public final boolean j(Context context) {
        return ((Boolean) f.gX(context)).booleanValue();
    }

    @Override // defpackage.fbdy
    public final boolean k(Context context) {
        return ((Boolean) g.gX(context)).booleanValue();
    }
}
