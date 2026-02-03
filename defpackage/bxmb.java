package defpackage;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxmb {
    public static final cqce a = cqce.g("Bugle", "SharedStorageInteractor");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;

    public bxmb(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        this.c = fcsuVar2;
        this.b = fcsuVar;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
        this.h = fcsuVar7;
        crsu crsuVar = new crsu();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.UID_REMOVED");
        intentFilter.addDataScheme("package");
        context.registerReceiver(crsuVar, intentFilter);
    }
}
