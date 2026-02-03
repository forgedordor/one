package defpackage;

import java.util.IdentityHashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcmh implements Runnable {
    final /* synthetic */ fcmi a;
    final /* synthetic */ fcmj b;
    final /* synthetic */ Object c;
    final /* synthetic */ fcmk d;

    public fcmh(fcmk fcmkVar, fcmi fcmiVar, fcmj fcmjVar, Object obj) {
        this.a = fcmiVar;
        this.b = fcmjVar;
        this.c = obj;
        this.d = fcmkVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.d) {
            if (this.a.b == 0) {
                try {
                    this.b.b(this.c);
                    fcmk fcmkVar = this.d;
                    IdentityHashMap identityHashMap = fcmkVar.a;
                    identityHashMap.remove(this.b);
                    if (identityHashMap.isEmpty()) {
                        fcmkVar.b.shutdown();
                        fcmkVar.b = null;
                    }
                } catch (Throwable th) {
                    fcmk fcmkVar2 = this.d;
                    IdentityHashMap identityHashMap2 = fcmkVar2.a;
                    identityHashMap2.remove(this.b);
                    if (identityHashMap2.isEmpty()) {
                        fcmkVar2.b.shutdown();
                        fcmkVar2.b = null;
                    }
                    throw th;
                }
            }
        }
    }
}
