package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eanu {
    public volatile boolean a;
    private volatile String b;
    private volatile Locale c;

    public final synchronized String a() {
        ejwl.m(c(), "ApiConfig must be initialized.");
        this.b.getClass();
        return this.b;
    }

    public final synchronized Locale b() {
        ejwl.m(c(), "ApiConfig must be initialized.");
        return Locale.getDefault();
    }

    public final synchronized boolean c() {
        return this.b != null;
    }

    public final synchronized void d() {
        ejwl.b(true, "API Key must not be empty.");
        this.b = "AIzaSyCVl7z2EZZ1S1mbhW_beZ1cELoLreBMECM";
        this.c = null;
        this.a = false;
    }

    public final synchronized void e() {
        d();
        this.a = true;
    }
}
