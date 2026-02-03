package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecil implements ecjw {
    public static final TimeUnit a = TimeUnit.MILLISECONDS;
    public final Context b;
    public final eooz c;
    public final String d;
    public final Handler e;
    public final ejxr f;
    public final TimeUnit g;
    public final ejxr h;
    public final ekjo i = new ekml(ekno.a).b().a();
    public final Object j = new Object();

    public ecil(ecii eciiVar) {
        this.b = eciiVar.a;
        this.c = eciiVar.b;
        this.d = eciiVar.c;
        this.e = eciiVar.d;
        this.f = eciiVar.e;
        this.g = eciiVar.f;
        this.h = eciiVar.g;
    }

    public static Uri a(Uri uri) {
        int i = elcz.a;
        return uri.buildUpon().path(eldm.a.c(uri.getPath(), StandardCharsets.UTF_8).toString()).build();
    }

    public final void b(Uri uri) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        synchronized (this.j) {
            ekfwVar.j(this.i.c(uri));
        }
        ekgb ekgbVarG = ekfwVar.g();
        int i2 = ((ekoe) ekgbVarG).c;
        for (int i3 = 0; i3 < i2; i3++) {
            ((Runnable) ekgbVarG.get(i3)).run();
        }
    }
}
