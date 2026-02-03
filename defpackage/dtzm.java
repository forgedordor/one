package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dtzm {
    public abstract dtzn a();

    public abstract ejwi b();

    public abstract String c();

    public abstract void d(evqe evqeVar);

    public abstract void e(dtzl dtzlVar);

    public abstract void f(ekgb ekgbVar);

    public abstract void g(Uri uri);

    public abstract void h(int i);

    public abstract void i(String str);

    public final dtzn j() {
        if (c().startsWith("inlinefile")) {
            ejwl.b(b().g(), "InlineDownloadParams must be set when using inlinefile: scheme");
            e(dtzl.a);
        }
        return a();
    }
}
