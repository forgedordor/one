package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvfb {
    private final Context a;
    private final bvfa b;
    private final aofc c;
    private final anty d;
    private boolean e = false;
    private final AtomicReference f = new AtomicReference();
    private final AtomicReference g = new AtomicReference();

    public bvfb(Context context, bvfa bvfaVar, aofc aofcVar, anty antyVar) {
        this.a = context;
        this.b = bvfaVar;
        this.c = aofcVar;
        this.d = antyVar;
    }

    final synchronized void a(ezol ezolVar, String str) {
        if (this.e) {
            return;
        }
        b(ezolVar, str);
        Context context = this.a;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse(bace.m(context));
        bvfa bvfaVar = this.b;
        contentResolver.registerContentObserver(uri, true, bvfaVar);
        ejwl.m(((cquc) this.f.getAndSet(this.c.d().a(new bvez()))) == null, "Already subscribed to self identity updates");
        AtomicReference atomicReference = this.g;
        anty antyVar = this.d;
        bvfaVar.getClass();
        ejwl.m(((cquc) atomicReference.getAndSet(antyVar.o(new bvey(bvfaVar), "DittoContentObserver.RecipientUpdate"))) == null, "Already subscribed to recipient updates");
        this.e = true;
    }

    final void b(ezol ezolVar, String str) {
        this.b.a(ezolVar, str);
    }

    final synchronized void c() {
        if (this.e) {
            cquc cqucVar = (cquc) this.f.getAndSet(null);
            cqucVar.getClass();
            cqucVar.a();
            cquc cqucVar2 = (cquc) this.g.getAndSet(null);
            cqucVar2.getClass();
            cqucVar2.a();
            Context context = this.a;
            context.getContentResolver().unregisterContentObserver(this.b);
            b(null, null);
            this.e = false;
        }
    }
}
