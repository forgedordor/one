package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cztj implements adi {
    final /* synthetic */ czte a;

    public cztj(czte czteVar) {
        this.a = czteVar;
    }

    @Override // defpackage.adi
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        czte czteVar = this.a;
        czteVar.r = (ecww) obj;
        czteVar.j();
        czteVar.c().removeTextChangedListener(czteVar.s);
        czteVar.c().addTextChangedListener(czteVar.e());
        czteVar.l();
    }
}
