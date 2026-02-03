package defpackage;

import android.os.Bundle;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ehok implements eyhx {
    private static final ekrg a = ekrg.c("com/google/apps/tiktok/inject/processor/generateaccount/FragmentAccountComponentManager");
    private volatile Object b;
    private final Object c = new Object();
    private final ea d;
    private final boolean e;

    /* compiled from: PG */
    public interface a {
        ehna as();
    }

    /* compiled from: PG */
    public interface b {
        ahhq D();
    }

    /* compiled from: PG */
    public interface c {
        ehnb aL();
    }

    /* compiled from: PG */
    public interface d {
        ejwi eE();
    }

    /* compiled from: PG */
    public interface e {
        ejwi az();
    }

    public ehok(ea eaVar, boolean z) {
        this.d = eaVar;
        this.e = z;
    }

    public static final void b(ea eaVar, efwo efwoVar) {
        efwoVar.getClass();
        int iA = efwoVar.a();
        ejwl.n(iA >= 0, "AccountId is invalid: %s", iA);
        c(eaVar, iA);
    }

    public static void c(ea eaVar, int i) {
        eyhj.e(eaVar);
        eaVar.m.putInt("TIKTOK_FRAGMENT_ACCOUNT_ID", i);
    }

    protected void a(ea eaVar) {
        if (eaVar.m != null) {
            ejwl.b(!r2.getBoolean("TIKTOK_FRAGMENT_NO_ACCOUNT_ONLY"), "Account-scoped Fragment cannot be instantiated with an argument bundle marking it as no-Account only. If you are using NoAccountNavigation, you must switch to AccountNavigation to navigate to this fragment.");
        }
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        Object obj;
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    ea eaVar = this.d;
                    eaVar.X().getClass();
                    ejwl.p(eaVar.X() instanceof eyhx, "Sting Fragments must be attached to an @Sting Activity. Found: %s", eaVar.X().getClass());
                    a(eaVar);
                    Bundle bundle = eaVar.m;
                    efwo efwoVarB = null;
                    if (bundle != null && bundle.containsKey("TIKTOK_FRAGMENT_ACCOUNT_ID")) {
                        efwoVarB = efwo.b(bundle.getInt("TIKTOK_FRAGMENT_ACCOUNT_ID"));
                    }
                    efwo efwoVar = efwoVarB;
                    if (this.e && efwoVar == null) {
                        ehoj ehojVar = new ehoj("Exception while injecting account Fragment bindings because of missing AccountId in account Fragment's arguments");
                        if (!((Boolean) ((d) eygm.a(eaVar.z().getApplicationContext(), d.class)).eE().e(false)).booleanValue()) {
                            throw new ehoj("Account id is not set in the account Fragment. Possible causes:\n\t1. This account Fragment is @GenerateAccountFragment and was created without calling setBundledAccountId on itself after creation.\n\t2. This account Fragment's arguments were overridden without preserving the previous arguments.\n\t3. This account Fragment is declared in an XML but not as a navigation destination.\n\t4. This account Fragment is declared in an XML as a navigation destination, but the account navigation is not correctly setup with AccountNavigation (go/tiktok-navigation#navigating)");
                        }
                        ((ekrd) ((ekrd) ((ekrd) a.i()).g(ehojVar)).h("com/google/apps/tiktok/inject/processor/generateaccount/FragmentAccountComponentManager", "createComponent", (char) 141, "FragmentAccountComponentManager.java")).q("Fragment AccountId check failed.");
                    }
                    if (((c) eygm.a(eaVar.X(), c.class)).aL().a.g()) {
                        ejwi ejwiVarAz = ((e) eygm.a(eaVar.X(), e.class)).az();
                        if (efwoVar == null) {
                            efwoVar = (efwo) ejwiVarAz.f();
                            if (efwoVar != null && efwoVar.a() != -1) {
                                b(eaVar, efwoVar);
                            }
                        } else {
                            ejwl.m(ejwiVarAz.g(), "There is no propagated account id. Did you forget to add one of the account modules:\n\t\"//java/com/google/apps/tiktok/account:module\",\n\t\"//java/com/google/apps/tiktok/account/testing:module\",");
                            if (((efwo) ejwiVarAz.c()).a() != -1) {
                                ejwl.r(((efwo) ejwiVarAz.c()).equals(efwoVar), "The given account id does not match the propagated account id.\n\tPropagated AccountId: %s\n\tGiven AccountId: %s", ejwiVarAz.c(), efwoVar);
                            }
                        }
                    }
                    ehna ehnaVarAs = ((a) eygm.a(eaVar.X(), a.class)).as();
                    synchronized (ehnaVarAs.a) {
                        Map map = ehnaVarAs.b;
                        if (!map.containsKey(efwoVar)) {
                            map.put(efwoVar, ehnaVarAs.a(efwoVar));
                        }
                        obj = map.get(efwoVar);
                    }
                    ahhq ahhqVarD = ((b) eygm.a(obj, b.class)).D();
                    ahhqVarD.e = this.d;
                    eyij.a(ahhqVarD.e, ea.class);
                    ea eaVar2 = ahhqVarD.e;
                    ahhe ahheVar = ahhqVarD.d;
                    ahhh ahhhVar = ahhqVarD.c;
                    this.b = new ahhw(ahhqVarD.a, ahhqVarD.b, ahhhVar, ahheVar, eaVar2);
                }
            }
        }
        return this.b;
    }
}
