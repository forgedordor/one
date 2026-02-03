package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecnn implements ecnq {
    private final ecnv a;

    public ecnn(ecnv ecnvVar) {
        this.a = ecnvVar;
    }

    @Override // defpackage.ecnq
    public final void a(ecoa ecoaVar) throws InterruptedException {
        ecoaVar.g(this.a);
    }

    public ecnn(String str) {
        ecnw ecnwVar = new ecnw();
        ecnwVar.b(str);
        this.a = ecnwVar.a();
    }
}
