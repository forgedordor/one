package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccwh {
    public static final Uri a;
    private final alrj b;

    static {
        Uri uriBuild = new Uri.Builder().scheme("android.resource").authority("com.google.android.apps.messaging").path("2131231197").build();
        uriBuild.getClass();
        a = uriBuild;
    }

    public ccwh(alrj alrjVar) {
        alrjVar.getClass();
        this.b = alrjVar;
    }

    public final boolean a(String str, String str2) {
        if (str == null) {
            return false;
        }
        return ccwg.a(this.b.p(str), str2 != null ? Uri.parse(str2) : null);
    }
}
