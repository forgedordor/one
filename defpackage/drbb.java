package defpackage;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drbb implements Closeable {
    public static final ekrg a = ekrg.c("com/google/android/libraries/geller/gellersync/GellerOnePlatformClient");
    public final fbqm b;
    public final evrj c;
    public final Boolean d;

    public drbb(fbqm fbqmVar, evrj evrjVar, Boolean bool) {
        this.b = fbqmVar;
        this.c = evrjVar;
        this.d = bool;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((ekrd) ((ekrd) a.d()).h("com/google/android/libraries/geller/gellersync/GellerOnePlatformClient", "close", 61, "GellerOnePlatformClient.java")).q("Shutting down managed channel.");
        try {
            fbqm fbqmVar = this.b;
            fbqmVar.d();
            fbqmVar.f(TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ((ekrd) ((ekrd) ((ekrd) a.j()).g(e)).h("com/google/android/libraries/geller/gellersync/GellerOnePlatformClient", "close", 'C', "GellerOnePlatformClient.java")).q("Failed to shut down managed channel");
        }
    }
}
