package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caoq implements bzaa {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/conversations/CmsRestoreConversationsWorkerAdapter");
    public final cpmc b;
    public final bxjn c;
    public final autx d;
    public final caiy e;
    private final bylr f;
    private final apoy g;
    private final aurx h;
    private final eosc i;
    private final eosc j;
    private final eosc k;
    private final aqfi l;
    private final aqfp m;

    public caoq(cpmc cpmcVar, bylr bylrVar, bxjn bxjnVar, aurx aurxVar, autx autxVar, apoy apoyVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, aqfi aqfiVar, aqfp aqfpVar, caiy caiyVar) {
        this.b = cpmcVar;
        this.f = bylrVar;
        this.c = bxjnVar;
        this.h = aurxVar;
        this.d = autxVar;
        this.g = apoyVar;
        this.i = eoscVar;
        this.j = eoscVar2;
        this.k = eoscVar3;
        this.l = aqfiVar;
        this.m = aqfpVar;
        this.e = caiyVar;
    }

    @Override // defpackage.bzaa
    public final aumn a() {
        return aumn.CONVERSATIONS;
    }

    @Override // defpackage.bzaa
    public final bmra b() {
        return bmra.CONVERSATION;
    }

    @Override // defpackage.bzaa
    public final bykl c() {
        return this.f;
    }

    @Override // defpackage.bzaa
    public final eiju d(String str) {
        return i(str, this.m.a());
    }

    @Override // defpackage.bzaa
    public final eiju e(pzs pzsVar) {
        return (this.l.a() && ((Boolean) ((cczi) cpyl.T.get()).e()).booleanValue()) ? eijx.e(null) : eijx.g(new Callable() { // from class: caoi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.a.c.a();
                return null;
            }
        }, this.i);
    }

    @Override // defpackage.bzaa
    public final emec f() {
        return emec.RESTORE_CONVERSATION;
    }

    @Override // defpackage.bzaa
    public final /* synthetic */ String g(Object obj) {
        return ((eqjv) obj).c;
    }

    @Override // defpackage.bzaa
    public final String h() {
        return "Conversations";
    }

    public final eiju i(final String str, final boolean z) {
        if (this.m.a()) {
            caiy caiyVar = this.e;
            eiju eijuVarB = caiyVar.b(str, eqjv.class);
            if (eijuVarB == null) {
                eijuVarB = null;
            } else if (z) {
                eijuVarB = caiyVar.a(eijuVarB, new fdap() { // from class: caop
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        return this.a.i((String) obj, false);
                    }
                }, eqjv.class);
            }
            if (eijuVarB != null) {
                return eijuVarB;
            }
        }
        if (this.g.a()) {
            return this.h.m().i(new eooz() { // from class: caol
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    evvp evvpVar = (evvp) obj;
                    boolean zEquals = evvpVar.equals(evxc.c);
                    final caoq caoqVar = this.a;
                    String str2 = str;
                    boolean z2 = z;
                    if (zEquals) {
                        ekrw ekrwVarE = caoq.a.e();
                        ekrwVarE.X(eksq.a, "BugleCms");
                        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/conversations/CmsRestoreConversationsWorkerAdapter", "listCmsItems", 126, "CmsRestoreConversationsWorkerAdapter.java")).q("CmsRestoreConversationsWorkerAdapter: Cms Delta sync timestamp is not present.");
                        eiju eijuVarD = caoqVar.b.D(str2);
                        return !z2 ? eijuVarD : caoqVar.e.a(eijuVarD, new fdap() { // from class: caok
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj2) {
                                return caoqVar.i((String) obj2, false);
                            }
                        }, eqjv.class);
                    }
                    ekrw ekrwVarH = caoq.a.h();
                    ekrwVarH.X(eksq.a, "BugleCms");
                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/conversations/CmsRestoreConversationsWorkerAdapter", "listCmsItems", 112, "CmsRestoreConversationsWorkerAdapter.java")).t("CmsRestoreConversationsWorkerAdapter: Passing delta sync timestamp %s in ListConversations.", evxc.h(evvpVar));
                    eiju eijuVarE = caoqVar.b.E(str2, evvpVar);
                    return !z2 ? eijuVarE : caoqVar.e.a(eijuVarE, new fdap() { // from class: caoj
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            return caoqVar.i((String) obj2, false);
                        }
                    }, eqjv.class);
                }
            }, this.k).f(cpmb.class, new eooz() { // from class: caom
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    this.a.d.g();
                    return eork.h((cpmb) obj);
                }
            }, this.j);
        }
        eiju eijuVarF = this.b.D(str).f(cpmb.class, new eooz() { // from class: caon
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                this.a.d.g();
                return eork.h((cpmb) obj);
            }
        }, this.j);
        return z ? this.e.a(eijuVarF, new fdap() { // from class: caoo
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return this.a.i((String) obj, false);
            }
        }, eqjv.class) : eijuVarF;
    }
}
