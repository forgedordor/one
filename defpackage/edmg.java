package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edmg implements eora {
    final /* synthetic */ edmj a;

    public edmg(edmj edmjVar) {
        this.a = edmjVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        edmj edmjVar = this.a;
        edmjVar.i.d(exwf.OBAKE_MDI_UPDATE_PERSON_PHOTO_ME);
        edmjVar.d();
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((ekrd) ((ekrd) ((ekrd) edmj.a.j()).g(th)).h("com/google/android/libraries/user/profile/photopicker/common/model/profile/MdiPhotoRepository$4", "onFailure", (char) 297, "MdiPhotoRepository.java")).q("Unable to write profile photo.");
        edmj edmjVar = this.a;
        edmjVar.i.b(exwf.OBAKE_MDI_UPDATE_PERSON_PHOTO_ME, th);
        edmjVar.a(th);
    }
}
