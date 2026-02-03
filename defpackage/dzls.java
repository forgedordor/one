package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzls {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final dqzf e;
    public final ejxr f;
    public final ejxr g;
    public final fcsu h;
    public final dzlc i;
    public final ejwi j;
    public final ejwi k;
    public final ejwi l;
    public final fcsu m;
    public final int n;

    public dzls(Context context, ejwi ejwiVar, String str, fcsu fcsuVar, dzlc dzlcVar, ejwi ejwiVar2, ejwi ejwiVar3, ejwi ejwiVar4, fcsu fcsuVar2) {
        this.a = context;
        this.h = fcsuVar;
        this.b = context.getPackageName();
        ActivityManager activityManager = dzjr.a;
        this.c = dzjr.c(context.getPackageName(), dzjr.b());
        if (ejwiVar.g()) {
        }
        this.g = null;
        this.d = str;
        PackageManager packageManager = context.getPackageManager();
        this.n = true == packageManager.hasSystemFeature("android.hardware.type.automotive") ? 5 : packageManager.hasSystemFeature("android.hardware.type.watch") ? 3 : packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        this.e = new dqzf(context);
        this.f = ejxx.a(new ejxr() { // from class: dzlp
            @Override // defpackage.ejxr
            public final Object get() {
                return Long.valueOf(this.a.e.a().getTotalSpace() / 1024);
            }
        });
        this.i = dzlcVar;
        this.j = ejwiVar2;
        this.k = ejwiVar3;
        this.l = ejwiVar4;
        this.m = fcsuVar2;
    }

    public static List a(List list, int i) {
        return list.size() > i ? list.subList(0, i) : list;
    }
}
