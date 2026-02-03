package defpackage;

import android.content.Context;
import com.google.android.gms.phenotype.internal.IPhenotypeService;
import com.google.android.ims.util.common.RcsIntents;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccyw {
    public static final eksp a = eksp.c("BuglePhenotype");
    public final Context b;
    public final fcsu c;
    private final ejxr e;
    private final fcsu g;
    private final List f = new CopyOnWriteArrayList();
    public volatile boolean d = false;

    public ccyw(Context context, final eygg eyggVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.b = context;
        this.e = ejxx.a(new ejxr() { // from class: ccyu
            @Override // defpackage.ejxr
            public final Object get() {
                eksp ekspVar = ccyw.a;
                return new CopyOnWriteArraySet((Collection) eyggVar.b());
            }
        });
        this.c = fcsuVar;
        this.g = fcsuVar2;
    }

    public final void a() {
        eieu eieuVarK = eiiy.k("PhenotypeHelper#onCsLibPhenotypeChanged");
        try {
            dhkz.a();
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((dfno) it.next()).onCsLibPhenotypeUpdated();
            }
            Iterator it2 = ((Set) this.e.get()).iterator();
            while (it2.hasNext()) {
                ((dfno) it2.next()).onCsLibPhenotypeUpdated();
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(final Context context, final crsd crsdVar) {
        eieu eieuVarK = eiiy.k("PhenotypeHelper#registerCsLibPhenotype");
        try {
            ejvr ejvrVarA = eiid.a(new ejvr() { // from class: ccyv
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ccyw ccywVar = this.a;
                    ccywVar.d = true;
                    Context context2 = context;
                    context2.sendBroadcast(aiiw.c(context2, dfnp.class, RcsIntents.ACTION_CSLIB_FLAGS_UPDATED).a());
                    ccywVar.a();
                    return null;
                }
            });
            final crrz crrzVar = (crrz) ((cqbm) this.c.b()).a();
            final ccyt ccytVar = new ccyt(ejvrVarA);
            crrz.d.m("Unregistering legacy CSLib packages");
            ekgb ekgbVar = crrz.e;
            final ddzs ddzsVar = new ddzs() { // from class: crrv
                @Override // defpackage.ddzs
                public final void a(boolean z) {
                    crrzVar.c(context, ccytVar, crsdVar);
                }
            };
            cqbd cqbdVarA = crrp.a.a();
            cqbdVarA.A("Unregistering packages", ekgbVar);
            cqbdVarA.r();
            ArrayList arrayList = new ArrayList();
            ekqh it = ekgbVar.iterator();
            while (it.hasNext()) {
                final String str = (String) it.next();
                ddzn ddznVar = (ddzn) crrzVar.c.a();
                dciz dcizVar = new dciz();
                dcizVar.a = new dcir() { // from class: ddza
                    @Override // defpackage.dcir
                    public final void a(Object obj, Object obj2) {
                        int i = ddzn.a;
                        ((IPhenotypeService) ((ddzx) obj).w()).unRegister(new ddzm((defr) obj2), str);
                    }
                };
                defn defnVarJ = ddznVar.j(dcizVar.a());
                defnVarJ.s(new defb() { // from class: crrl
                    @Override // defpackage.defb
                    public final void a(defn defnVar) {
                        cqbd cqbdVarA2 = crrp.a.a();
                        cqbdVarA2.A("Unregister package", str);
                        cqbdVarA2.B("success", defnVar.m());
                        cqbdVarA2.r();
                    }
                });
                arrayList.add(defnVarJ);
            }
            degc.d(arrayList).s(new defb() { // from class: crrm
                @Override // defpackage.defb
                public final void a(defn defnVar) {
                    cqce cqceVar = crrp.a;
                    ddzsVar.a(defnVar.m());
                }
            });
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c(dfno dfnoVar) {
        this.f.add(dfnoVar);
    }

    public final void d(Context context) {
        final ccyp ccypVar = (ccyp) this.g.b();
        eieu eieuVarK = eiiy.k("PhenotypeHelper#registerPhenotype");
        try {
            final ejvr ejvrVarA = eiid.a(new ejvr() { // from class: ccyn
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    if (((defn) obj).m()) {
                        ccypVar.b();
                        return null;
                    }
                    ((eksl) ((eksl) ccyp.a.j()).h("com/google/android/apps/messaging/shared/experiments/BuglePhenotypeHelper", "registerPhenotype", 127, "BuglePhenotypeHelper.java")).q("Failure registering Phenotype client.");
                    return null;
                }
            });
            context.getClass();
            cswl cswlVarA = cswl.a(context);
            cswlVarA.getClass();
            int i = cswlVarA.b;
            dcfe dcfeVar = ddys.a;
            new ddzn(context).c(ccyy.a(context), i, ccyp.c, ccyp.a().toByteArray()).s(new defb() { // from class: ccyo
                @Override // defpackage.defb
                public final void a(defn defnVar) {
                    ejvrVarA.apply(defnVar);
                }
            });
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e() {
        ((ccyp) this.g.b()).b();
    }
}
