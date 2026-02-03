package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvgt {
    private final Context a;
    private final bvgs b;
    private final aofc c;
    private final anty d;
    private final egxv e;
    private boolean f = false;
    private final AtomicReference g = new AtomicReference();
    private final AtomicReference h = new AtomicReference();

    public bvgt(Context context, bvgs bvgsVar, aofc aofcVar, anty antyVar, egxv egxvVar) {
        this.a = context;
        this.b = bvgsVar;
        this.c = aofcVar;
        this.d = antyVar;
        this.e = egxvVar;
    }

    final synchronized void a(ezol ezolVar, String str) {
        if (this.f) {
            return;
        }
        b(ezolVar, str);
        egxv egxvVar = this.e;
        Uri uri = Uri.parse(bace.m(this.a));
        bvgs bvgsVar = this.b;
        egxvVar.d(uri, true, bvgsVar);
        ejwl.m(((cquc) this.g.getAndSet(this.c.d().a(new bvgr()))) == null, "Already subscribed to self identity updates");
        ejwl.m(((cquc) this.h.getAndSet(this.d.o(new bvgq(bvgsVar), "NewDittoContentObserver.RecipientUpdate"))) == null, "Already subscribed to recipient updates");
        this.f = true;
    }

    final void b(ezol ezolVar, String str) {
        this.b.b(ezolVar, str);
    }

    final synchronized void c() {
        if (this.f) {
            cquc cqucVar = (cquc) this.g.getAndSet(null);
            cqucVar.getClass();
            cqucVar.a();
            cquc cqucVar2 = (cquc) this.h.getAndSet(null);
            cqucVar2.getClass();
            cqucVar2.a();
            this.e.e(this.b);
            b(null, null);
            this.f = false;
        }
    }
}
