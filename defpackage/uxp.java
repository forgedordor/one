package defpackage;

import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uxp implements uwz {
    public final ea a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final ekrg j;
    private final fcsu k;
    private final fcsu l;

    public uxp(ea eaVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10) {
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        this.a = eaVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
        this.k = fcsuVar7;
        this.l = fcsuVar8;
        this.h = fcsuVar9;
        this.i = fcsuVar10;
        this.j = ekrg.c("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeUiStateControllerImpl");
    }

    private final void c() {
        Object objB = this.l.b();
        objB.getClass();
        final ejcj ejcjVar = (ejcj) fdct.b((Optional) objB);
        if (ejcjVar != null) {
            if (!((Boolean) crbf.bd.e()).booleanValue() && !((Boolean) crbf.ba.e()).booleanValue()) {
                ejcjVar = null;
            }
            if (ejcjVar != null) {
                fcsu fcsuVar = this.g;
                final dofb dofbVar = (dofb) fcsuVar.b();
                dofbVar.j(new fdae() { // from class: uxi
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        uxp uxpVar = this.a;
                        Future future = ((dofj) ((dofb) uxpVar.g.b()).a.c()).m;
                        if (future != null && !future.isDone()) {
                            Optional optional = (Optional) uxpVar.d.b();
                            final fdap fdapVar = new fdap() { // from class: uxk
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj) {
                                    val valVar = (val) obj;
                                    valVar.getClass();
                                    valVar.k();
                                    return fctx.a;
                                }
                            };
                            optional.ifPresent(new Consumer() { // from class: uxl
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    fdapVar.invoke(obj);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }
                        ejcj ejcjVar2 = ejcjVar;
                        dofb dofbVar2 = dofbVar;
                        if (((ascv) uxpVar.i.b()).a()) {
                            try {
                                if (((ascu) uxpVar.h.b()).a()) {
                                    dofbVar2.a();
                                }
                                ejcjVar2.g();
                            } catch (Exception e) {
                                ekrw ekrwVarJ = uxpVar.j.j();
                                ekrwVarJ.X(eksq.a, "BuglePenpal");
                                ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeUiStateControllerImpl", "setOnScreenCloseAndStopCallback$lambda$26$lambda$22$lambda$21", 167, "MagicComposeUiStateControllerImpl.kt")).q("Failed to close AICore client");
                            }
                        } else {
                            if (((ascu) uxpVar.h.b()).a()) {
                                dofbVar2.a();
                            }
                            ejcjVar2.g();
                        }
                        return fctx.a;
                    }
                });
                ((dofb) fcsuVar.b()).i(new fdae() { // from class: uxj
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        uxp uxpVar = this.a;
                        Future future = ((dofj) ((dofb) uxpVar.g.b()).a.c()).m;
                        if (future != null && !future.isDone()) {
                            Optional optional = (Optional) uxpVar.d.b();
                            final fdap fdapVar = new fdap() { // from class: uxe
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj) {
                                    val valVar = (val) obj;
                                    valVar.getClass();
                                    valVar.k();
                                    return fctx.a;
                                }
                            };
                            optional.ifPresent(new Consumer() { // from class: uxf
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    fdapVar.invoke(obj);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }
                        return fctx.a;
                    }
                });
            }
        }
    }

    private final void d(final uwf uwfVar) {
        final dofb dofbVar = (dofb) this.g.b();
        dofbVar.g(new fdae() { // from class: uxc
            @Override // defpackage.fdae
            public final Object invoke() {
                dofbVar.a();
                uwfVar.b();
                return fctx.a;
            }
        });
    }

    @Override // defpackage.uwz
    public final void a(final uwf uwfVar) {
        String strA;
        if (((aqab) this.k.b()).a() && !((Boolean) crbf.bd.e()).booleanValue() && ((strA = uwfVar.a()) == null || strA.length() == 0)) {
            fcsu fcsuVar = this.g;
            dofb dofbVar = (dofb) fcsuVar.b();
            dofbVar.a();
            dofbVar.f();
            dofbVar.g(new fdae() { // from class: uxm
                @Override // defpackage.fdae
                public final Object invoke() {
                    uwfVar.b();
                    return fctx.a;
                }
            });
            Object objB = fcsuVar.b();
            objB.getClass();
            uvc.b((dofb) objB);
            Optional optional = (Optional) this.c.b();
            final fdap fdapVar = new fdap() { // from class: uxn
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    uzw uzwVar = (uzw) obj;
                    uzwVar.getClass();
                    uzwVar.f(null);
                    uzwVar.c();
                    return fctx.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: uxo
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    fdapVar.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        dofb dofbVar2 = (dofb) this.g.b();
        d(uwfVar);
        c();
        dofbVar2.a();
        dofbVar2.f();
        dofbVar2.e(new fdae() { // from class: uxb
            @Override // defpackage.fdae
            public final Object invoke() {
                fcsu fcsuVar2 = this.a.e;
                if (((Optional) fcsuVar2.b()).isPresent()) {
                    ((uvd) ((Optional) fcsuVar2.b()).get()).b();
                }
                return fctx.a;
            }
        });
        dofbVar2.c(crbf.b());
        LinkedHashMap linkedHashMapA = ((uzn) this.b.b()).a();
        Set<String> setKeySet = linkedHashMapA.keySet();
        setKeySet.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(setKeySet, 10));
        for (final String str : setKeySet) {
            str.getClass();
            arrayList.add(new dlff(str, str, new fdae() { // from class: uxd
                @Override // defpackage.fdae
                public final Object invoke() {
                    final uxp uxpVar = this.a;
                    ea eaVar = uxpVar.a;
                    if (!eaVar.aF()) {
                        return fctx.a;
                    }
                    final String str2 = str;
                    uwf uwfVar2 = uwfVar;
                    final dofb dofbVar3 = (dofb) uxpVar.g.b();
                    dofbVar3.a();
                    final String strA2 = uwfVar2.a();
                    if (strA2 != null && strA2.length() != 0) {
                        Object obj = ((uzn) uxpVar.b.b()).a().get(str2);
                        if (obj == null) {
                            throw new IllegalArgumentException(a.a(str2, "Style '", "' wasn't registered."));
                        }
                        final epiv epivVar = (epiv) obj;
                        dofbVar3.h(new fdae() { // from class: uxa
                            @Override // defpackage.fdae
                            public final Object invoke() {
                                dofbVar3.a();
                                einf.f(new uzo(strA2, epivVar), uxpVar.a);
                                return fctx.a;
                            }
                        });
                        einf.f(new uzo(strA2, epivVar), eaVar);
                    }
                    dofbVar3.q(new fdae() { // from class: uxg
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            uxp uxpVar2 = uxpVar;
                            ((dakl) uxpVar2.f.b()).p(R.string.feedback_confirmation);
                            fcsu fcsuVar2 = uxpVar2.c;
                            if (((Optional) fcsuVar2.b()).isPresent()) {
                                ((uzw) ((Optional) fcsuVar2.b()).get()).k(str2);
                            }
                            return fctx.a;
                        }
                    });
                    dofbVar3.p(new fdae() { // from class: uxh
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            uxp uxpVar2 = uxpVar;
                            fcsu fcsuVar2 = uxpVar2.c;
                            if (((Optional) fcsuVar2.b()).isPresent()) {
                                ((uzw) ((Optional) fcsuVar2.b()).get()).i(str2);
                            }
                            fcsu fcsuVar3 = uxpVar2.e;
                            if (((Optional) fcsuVar3.b()).isPresent()) {
                                ((uvd) ((Optional) fcsuVar3.b()).get()).a();
                            }
                            return fctx.a;
                        }
                    });
                    return fctx.a;
                }
            }));
        }
        dofbVar2.k(arrayList);
        Collection collectionValues = linkedHashMapA.values();
        collectionValues.getClass();
        dofbVar2.l(fcva.ao(collectionValues));
    }

    @Override // defpackage.uwz
    public final void b(uwf uwfVar) {
        dofb dofbVar = (dofb) this.g.b();
        d(uwfVar);
        c();
        dofbVar.a();
        dofbVar.m();
    }
}
