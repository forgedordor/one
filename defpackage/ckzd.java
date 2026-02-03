package defpackage;

import android.content.Intent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckzd {
    public static final cqce a = cqce.g("Bugle", "BootAndPackageReplacedReceiver");
    public static final eksp b = eksp.c("BugleNotifications");
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final Optional k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public final fcsu p;
    public final fcsu q;
    public final fcsu r;
    public final fcsu s;
    public final fcsu t;

    public ckzd(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, Optional optional, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17) {
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
        this.h = fcsuVar6;
        this.i = fcsuVar7;
        this.j = fcsuVar8;
        this.k = optional;
        this.l = fcsuVar9;
        this.m = fcsuVar10;
        this.n = fcsuVar11;
        this.o = fcsuVar12;
        this.p = fcsuVar13;
        this.q = fcsuVar14;
        this.r = fcsuVar15;
        this.s = fcsuVar16;
        this.t = fcsuVar17;
    }

    public static boolean a(Intent intent) {
        return "android.intent.action.BOOT_COMPLETED".equals(intent.getAction());
    }
}
