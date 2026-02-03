package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lzs implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ lzt b;

    public lzs(lzt lztVar, Object obj) {
        this.b = lztVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lzt lztVar = this.b;
        Object obj = this.a;
        if (lztVar.f()) {
            lztVar.b(obj);
        } else {
            lztVar.c(obj);
        }
        lztVar.f = 3;
    }
}
