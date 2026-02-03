package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bpf implements Runnable {
    final /* synthetic */ bpg a;

    public bpf(bpg bpgVar) {
        this.a = bpgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bpg bpgVar = this.a;
        bph bphVar = bpgVar.c;
        if (bphVar.a.getAndSet(null) != null) {
            bpgVar.a.removeCallbacks(bphVar);
        }
    }
}
