package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wmm implements fdap {
    final /* synthetic */ auwm a;
    final /* synthetic */ wmp b;
    final /* synthetic */ boolean c;

    public wmm(auwm auwmVar, wmp wmpVar, boolean z) {
        this.a = auwmVar;
        this.b = wmpVar;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [aaef, java.lang.Object] */
    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ahat ahatVar = (ahat) obj;
        ahatVar.getClass();
        wmj wmjVar = new wmj(ahatVar);
        auwm auwmVar = this.a;
        auwmVar.a(wmjVar);
        return this.b.e.get().c(new aaee(new wmk(auwmVar, ahatVar), new wml(auwmVar, ahatVar), this.c));
    }
}
