package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvoo implements Runnable {
    final /* synthetic */ dvop a;

    public dvoo(dvop dvopVar) {
        this.a = dvopVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dvop dvopVar = this.a;
        dvopVar.s();
        dvopVar.m.postDelayed(dvopVar.t, fbef.a.get().b());
    }
}
