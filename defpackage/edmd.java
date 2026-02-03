package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edmd implements eora {
    final /* synthetic */ edmj a;

    public edmd(edmj edmjVar) {
        this.a = edmjVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        edmj edmjVar = this.a;
        edmi edmiVar = edmjVar.i;
        edmiVar.c.add(0, ((edhi) edmiVar.b.remove(edmiVar.a)).a());
        edmjVar.c(edhm.i((edml) obj, edmjVar.i.a()));
        edmjVar.g.set(false);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((ekrd) ((ekrd) ((ekrd) edmj.a.j()).g(th)).h("com/google/android/libraries/user/profile/photopicker/common/model/profile/MdiPhotoRepository$1", "onFailure", (char) 198, "MdiPhotoRepository.java")).q("Unable to read current profile photo.");
        this.a.a(th);
    }
}
