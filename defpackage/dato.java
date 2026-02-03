package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dato implements egzv<List<? extends egbe>> {
    final /* synthetic */ daua a;
    final /* synthetic */ efwo b;

    public dato(daua dauaVar, efwo efwoVar) {
        this.a = dauaVar;
        this.b = efwoVar;
    }

    @Override // defpackage.egzv
    public final void a(Throwable th) {
        ekrw ekrwVarI = daua.a.i();
        ekrwVarI.X(eksq.a, "BugleWelcome");
        ((ekrd) ((ekrd) ekrwVarI).g(th).h("com/google/android/apps/messaging/welcome/v1/SignedInWelcomeFragmentPeer$onAccountChangedCallback$1", "onError", 98, "SignedInWelcomeFragmentPeer.kt")).q("Error fetching accounts info");
    }

    @Override // defpackage.egzv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Object next;
        List list = (List) obj;
        list.getClass();
        dava davaVar = (dava) this.a.e.b();
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
