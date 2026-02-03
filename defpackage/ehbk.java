package defpackage;

import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehbk extends ehbl implements lun {
    public final lvj a;
    public ehcf b;
    private final ekcb c = new ekfd();
    private boolean d = true;
    private final ehbh e;
    private final Executor f;
    private final egpl g;
    private final egpl h;
    private final ehpg i;

    public ehbk(lvj lvjVar, ehpg ehpgVar, Executor executor) {
        this.a = lvjVar;
        this.i = ehpgVar;
        try {
            this.e = (ehbh) ehpgVar.b(R.id.first_lifecycle_owner_instance, lvjVar, new ehow() { // from class: ehbf
                @Override // defpackage.ehow
                public final Object a() {
                    return new ehbh();
                }
            });
            this.f = executor;
            egpl egplVar = new egpl(executor, true, false, false);
            this.g = egplVar;
            egplVar.c();
            this.h = new egpl(executor, false, false, false);
            lvjVar.P().c(this);
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Both an unqualified and a `@ViewLifecycle LocalSubscriptionMixin` have been injectedin this Fragment scope. Only one of the two LocalSubscriptionMixins may be used in a given Fragment - either the unqualified or `@ViewLifecycle`LocalSubscriptionMixin exclusively.", e);
        }
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        ecem.c();
        ehcf ehcfVar = this.b;
        ecem.c();
        ehcfVar.e.d();
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
        ecem.c();
        final ehcf ehcfVar = this.b;
        if (ehcfVar != null) {
            ecem.c();
            ehcfVar.d.execute(eiid.k(new Runnable() { // from class: ehcd
                @Override // java.lang.Runnable
                public final void run() {
                    ehcf ehcfVar2 = ehcfVar;
                    ehcfVar2.h = 3;
                    csr csrVar = new csr((css) ehcfVar2.g);
                    while (csrVar.hasNext()) {
                        ((ListenableFuture) csrVar.next()).cancel(false);
                    }
                    ehcfVar2.g = null;
                }
            }));
        }
        this.e.a = false;
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        ecem.c();
        if (this.d) {
            ejwl.l(this.b == null);
            ekcb ekcbVar = this.c;
            Set setEntrySet = ekcbVar.entrySet();
            ekfi ekfiVar = new ekfi(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
            ekfiVar.e(setEntrySet);
            this.b = new ehcf(ekfiVar.c(), this.f, this.g, this.h);
            if (this.e.a && this.d) {
                final ehcf ehcfVar = this.b;
                ecem.c();
                ehcfVar.d.execute(eiid.k(new Runnable() { // from class: ehcc
                    @Override // java.lang.Runnable
                    public final void run() {
                        ehcf ehcfVar2 = ehcfVar;
                        ekqg ekqgVarListIterator = ehcfVar2.b.values().listIterator();
                        while (ekqgVarListIterator.hasNext()) {
                            ehcfVar2.d((ehci) ekqgVarListIterator.next());
                        }
                    }
                }));
            } else {
                final ehcf ehcfVar2 = this.b;
                ecem.c();
                ehcfVar2.d.execute(eiid.k(new Runnable() { // from class: ehbx
                    @Override // java.lang.Runnable
                    public final void run() {
                        final ehcf ehcfVar3 = ehcfVar2;
                        ekqg ekqgVarListIterator = ehcfVar3.b.entrySet().listIterator();
                        while (ekqgVarListIterator.hasNext()) {
                            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                            final ehay ehayVar = (ehay) entry.getKey();
                            final ehci ehciVar = (ehci) entry.getValue();
                            ejwy ejwyVar = new ejwy() { // from class: ehbt
                                @Override // defpackage.ejwy
                                public final void a(Object obj) {
                                    ehcf.b(ehayVar, (ehcl) obj);
                                }
                            };
                            ejwy ejwyVar2 = new ejwy() { // from class: ehbu
                                @Override // defpackage.ejwy
                                public final void a(Object obj) {
                                    ehcfVar3.a(ehciVar, (ListenableFuture) obj);
                                }
                            };
                            ecem.c();
                            ehcg ehcgVar = ehciVar.a;
                            ehcgVar.getClass();
                            ejwi ejwiVarC = ehcgVar.c();
                            if (ejwiVarC.g()) {
                                ehciVar.a = ehciVar.a.e((ehcl) ejwiVarC.c());
                            }
                            ejwi ejwiVarD = ehciVar.a.d();
                            ejwi ejwiVarA = ehciVar.a.a();
                            if (ejwiVarD.g()) {
                                ejwyVar.a(ejwiVarD.c());
                            }
                            if (ejwiVarA.g()) {
                                ejwyVar2.a(ejwiVarA.c());
                            }
                        }
                    }
                }));
            }
            ekcbVar.clear();
            this.d = false;
        }
        ehcf ehcfVar3 = this.b;
        ecem.c();
        ehcfVar3.e.c();
    }

    @Override // defpackage.ehbl
    public final ehba i(int i, ehay ehayVar, final ejwi ejwiVar) {
        ecem.c();
        ejwl.l(this.b == null);
        ejwl.l(this.c.put(ehayVar, (ehci) this.i.c(i, this.a, new ehow() { // from class: ehbd
            @Override // defpackage.ehow
            public final Object a() {
                ejwi ejwiVar2 = ejwiVar;
                if (!ejwiVar2.g()) {
                    ejud ejudVar = ejud.a;
                    return new ehci(new ehat(ejudVar, ejudVar, ejudVar, ejudVar));
                }
                ejwi ejwiVarJ = ejwi.j(ejwiVar2.c());
                ejud ejudVar2 = ejud.a;
                return new ehci(new ehat(ejwiVarJ, ejudVar2, ejudVar2, ejudVar2));
            }
        }, new ehov() { // from class: ehbe
            /* JADX WARN: Type inference failed for: r0v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
            @Override // defpackage.ehov
            public final void a(Object obj) {
                ehci ehciVar = (ehci) obj;
                ecem.c();
                ehcg ehcgVar = ehciVar.a;
                ehcgVar.getClass();
                ejwi ejwiVarA = ehcgVar.a();
                if (ejwiVarA.g()) {
                    ejwiVarA.c().cancel(false);
                }
                ehciVar.a = null;
            }
        })) == null);
        return new ehbg(this, ehayVar);
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void d(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }
}
