package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edmh implements eora {
    final /* synthetic */ edmj a;

    public edmh(edmj edmjVar) {
        this.a = edmjVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        edmj edmjVar = this.a;
        edmjVar.i.d(exwf.OBAKE_MDI_DELETE_PERSON_PHOTO_ME);
        edmjVar.d();
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((ekrd) ((ekrd) ((ekrd) edmj.a.j()).g(th)).h("com/google/android/libraries/user/profile/photopicker/common/model/profile/MdiPhotoRepository$5", "onFailure", (char) 323, "MdiPhotoRepository.java")).q("Unable to remove profile photo.");
        edmj edmjVar = this.a;
        edmjVar.i.b(exwf.OBAKE_MDI_DELETE_PERSON_PHOTO_ME, th);
        edmjVar.a(th);
    }
}
