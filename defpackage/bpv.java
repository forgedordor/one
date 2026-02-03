package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bpv implements koi {
    final /* synthetic */ bpw a;

    public bpv(bpw bpwVar) {
        this.a = bpwVar;
    }

    @Override // defpackage.koi
    public final Object a(kog kogVar) {
        bpw bpwVar = this.a;
        lcg.d(bpwVar.b == null, "The result can only set once!");
        bpwVar.b = kogVar;
        return "FutureChain[" + bpwVar + "]";
    }
}
