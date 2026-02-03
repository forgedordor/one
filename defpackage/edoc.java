package defpackage;

import android.net.Uri;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edoc implements eora {
    final /* synthetic */ edod a;

    public edoc(edod edodVar) {
        this.a = edodVar;
    }

    @Override // defpackage.eora
    public final /* synthetic */ void b(Object obj) {
        edny ednyVar = new edny();
        ednyVar.c((Uri) obj);
        ednyVar.a = 4;
        eurd eurdVar = (eurd) edod.b.toBuilder();
        edod edodVar = this.a;
        long jA = edodVar.g.a(TimeUnit.MICROSECONDS);
        eurdVar.copyOnWrite();
        eure eureVar = (eure) eurdVar.instance;
        eureVar.b |= 1;
        eureVar.e = jA;
        ednyVar.b((eure) eurdVar.build());
        edodVar.h.j(ednyVar.a());
        edodVar.i.set(false);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((ekrd) ((ekrd) ((ekrd) edod.a.e()).g(th)).h("com/google/android/libraries/user/profile/photopicker/edit/viewmodel/EditViewModel$1", "onFailure", 'd', "EditViewModel.java")).q("Something went wrong with saving the bitmap");
        edny ednyVar = new edny();
        ednyVar.a = 5;
        eurd eurdVar = (eurd) edod.b.toBuilder();
        edod edodVar = this.a;
        ejxm ejxmVar = edodVar.g;
        ejxmVar.g();
        long jA = ejxmVar.a(TimeUnit.MICROSECONDS);
        eurdVar.copyOnWrite();
        eure eureVar = (eure) eurdVar.instance;
        eureVar.b |= 1;
        eureVar.e = jA;
        eurb eurbVar = (eurb) eurc.a.createBuilder();
        eurbVar.copyOnWrite();
        eurc eurcVar = (eurc) eurbVar.instance;
        eurcVar.c = 13;
        eurcVar.b |= 1;
        eurp eurpVar = (eurp) eurq.a.createBuilder();
        eurpVar.copyOnWrite();
        eurq eurqVar = (eurq) eurpVar.instance;
        eurqVar.c = 8;
        eurqVar.b |= 1;
        eurbVar.copyOnWrite();
        eurc eurcVar2 = (eurc) eurbVar.instance;
        eurq eurqVar2 = (eurq) eurpVar.build();
        eurqVar2.getClass();
        eurcVar2.e = eurqVar2;
        eurcVar2.b |= 4;
        eurdVar.copyOnWrite();
        eure eureVar2 = (eure) eurdVar.instance;
        eurc eurcVar3 = (eurc) eurbVar.build();
        eurcVar3.getClass();
        eureVar2.f = eurcVar3;
        eureVar2.b |= 2;
        ednyVar.b((eure) eurdVar.build());
        edodVar.h.j(ednyVar.a());
        edodVar.i.set(false);
    }
}
