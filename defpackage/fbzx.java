package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbzx {
    final /* synthetic */ fbzy a;

    public fbzx(fbzy fbzyVar) {
        this.a = fbzyVar;
    }

    public final void a() {
        fbzy fbzyVar = this.a;
        if (fbzyVar.c.decrementAndGet() == 0) {
            fbzyVar.b();
        }
    }
}
