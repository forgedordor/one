package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbpq extends cqdf {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ Runnable c;
    final /* synthetic */ cbpr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbpq(cbpr cbprVar, int i, String str, Runnable runnable) {
        super("Bugle.Async.Compose.updateMessageTextStats.Duration");
        this.a = i;
        this.b = str;
        this.c = runnable;
        this.d = cbprVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.b(this.a, this.b);
        cqdq.f(this.c);
    }
}
