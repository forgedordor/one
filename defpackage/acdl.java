package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdl implements egzv<List<? extends egbe>> {
    final /* synthetic */ acec a;
    final /* synthetic */ efwo b;

    public acdl(acec acecVar, efwo efwoVar) {
        this.a = acecVar;
        this.b = efwoVar;
    }

    @Override // defpackage.egzv
    public final void a(Throwable th) {
        ekrw ekrwVarI = acec.a.i();
        ekrwVarI.X(eksq.a, "BugleWelcome");
        ((ekrd) ((ekrd) ekrwVarI).g(th).h("com/google/android/apps/messaging/gaia/signoutaccount/SignOutAccountFragmentPeer$onAccountChangedCallback$1", "onError", 149, "SignOutAccountFragmentPeer.kt")).q("Error fetching accounts info");
    }

    @Override // defpackage.egzv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Object next;
        List list = (List) obj;
        list.getClass();
        dava davaVar = (dava) this.a.g.b();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            efwo efwoVar = this.b;
            next = it.next();
            if (fdbq.f(((egbe) next).a(), efwoVar)) {
                break;
            }
        }
        davaVar.b((egbe) next);
    }

    @Override // defpackage.egzv
    public final /* synthetic */ void hn() {
    }
}
