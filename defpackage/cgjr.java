package defpackage;

import android.net.Uri;
import android.provider.Settings;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cgjr {
    public static cgjq l(String str, String str2, cgjs cgjsVar) {
        cggp cggpVar = new cggp();
        if (str == null) {
            throw new NullPointerException("Null channelId");
        }
        cggpVar.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null channelName");
        }
        cggpVar.b = str2;
        cggpVar.k = 5;
        cggpVar.i = Optional.of(cgjsVar);
        cggpVar.d = Optional.of(false);
        cggpVar.e = Optional.of(true);
        cggpVar.f = Optional.of(true);
        cggpVar.h = Optional.of(0);
        cggpVar.g = Optional.empty();
        cggpVar.j = Optional.empty();
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        if (uri == null) {
            throw new NullPointerException("Null soundUri");
        }
        cggpVar.c = uri;
        return cggpVar;
    }

    public abstract Uri a();

    public abstract Optional b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    public abstract Optional h();

    public abstract String i();

    public abstract String j();

    public abstract int k();
}
