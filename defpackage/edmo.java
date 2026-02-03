package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edmo implements eora {
    final /* synthetic */ edhi a;
    final /* synthetic */ edmp b;

    public edmo(edmp edmpVar, edhi edhiVar) {
        this.a = edhiVar;
        this.b = edmpVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        etvm etvmVar = (etvm) obj;
        eure eureVarA = this.a.a();
        ejud ejudVar = ejud.a;
        boolean z = etvmVar.c;
        boolean z2 = etvmVar.b;
        etvj etvjVarB = etvj.b(etvmVar.e);
        if (etvjVarB == null) {
            etvjVarB = etvj.MESSAGE_UNDEFINED;
        }
        etvj etvjVar = etvjVarB;
        if (etvjVar == null) {
            throw new NullPointerException("Null infoMessage");
        }
        int iA = etvl.a(etvmVar.d);
        if (iA == 0) {
            iA = 1;
        }
        this.b.a(edhm.i(new edlz(z, ejudVar, z2, etvmVar.f, iA, etvjVar), ekgb.r(eureVarA)));
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        edmp edmpVar = this.b;
        edhe edheVarA = edmpVar.b.a(th);
        eure eureVarC = this.a.c(th);
        ((ekrd) ((ekrd) ((ekrd) edmp.a.j()).g(th)).h("com/google/android/libraries/user/profile/photopicker/common/model/profile/ProfileStateRepository$1", "onFailure", 'a', "ProfileStateRepository.java")).q("Unable to read current profile state.");
        edmpVar.a(edhm.f(edheVarA, ekgb.r(eureVarC)));
    }
}
