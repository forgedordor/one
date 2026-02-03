package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbxt implements Runnable {
    final /* synthetic */ fbxv a;

    public fbxt(fbxv fbxvVar) {
        this.a = fbxvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fbxv fbxvVar = this.a;
        fchl fchlVar = fbxvVar.b;
        fbmw fbmwVar = fbxvVar.h;
        fchlVar.e();
        fbxvVar.h = fbmwVar;
        fbxvVar.b.b();
    }
}
