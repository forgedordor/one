package defpackage;

import android.content.Context;
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
public final class uys implements uwz {
    public final Context a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fdjx g;
    public final fcsu h;
    public final fcsu i;
    public final dzuc j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final dneq o;
    public final ekrg p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;

    public uys(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fdjx fdjxVar, fcsu fcsuVar6, dner dnerVar, fcsu fcsuVar7, dzuc dzucVar, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14) {
        context.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fdjxVar.getClass();
        dzucVar.getClass();
        fcsuVar8.getClass();
        fcsuVar10.getClass();
        fcsuVar12.getClass();
        fcsuVar13.getClass();
        fcsuVar14.getClass();
        this.a = context;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fdjxVar;
        this.h = fcsuVar6;
        this.i = fcsuVar7;
        this.j = dzucVar;
        this.k = fcsuVar8;
        this.l = fcsuVar9;
        this.q = fcsuVar10;
        this.r = fcsuVar11;
        this.s = fcsuVar12;
        this.m = fcsuVar13;
        this.n = fcsuVar14;
        this.o = dnerVar.a(new dnfv(31));
        this.p = ekrg.c("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeUiStateControllerImplV2");
    }

    private final void d() {
        Object objB = this.r.b();
        objB.getClass();
        final ejcj ejcjVar = (ejcj) fdct.b((Optional) objB);
        if (ejcjVar != null) {
            if (!((Boolean) crbf.bd.e()).booleanValue() && !((Boolean) crbf.ba.e()).booleanValue()) {
                ejcjVar = null;
            }
            if (ejcjVar != null) {
                fcsu fcsuVar = this.e;
                final dofb dofbVar = (dofb) fcsuVar.b();
                dofbVar.j(new fdae() { // from class: uyb
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        uys uysVar = this.a;
                        Future future = ((dofj) ((dofb) uysVar.e.b()).a.c()).m;
                        if (future != null && !future.isDone()) {
                            Optional optional = (Optional) uysVar.i.b();
                            final fdap fdapVar = new fdap() { // from class: uyg
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj) {
                                    val valVar = (val) obj;
                                    valVar.getClass();
                                    valVar.k();
                                    return fctx.a;
                                }
                            };
                            optional.ifPresent(new Consumer() { // from class: uyh
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
                        if (((ascv) uysVar.n.b()).a()) {
                            try {
                                if (((ascu) uysVar.m.b()).a()) {
                                    dofbVar2.a();
                                }
                                ejcjVar2.g();
                            } catch (Exception e) {
                                ekrw ekrwVarJ = uysVar.p.j();
                                ekrwVarJ.X(eksq.a, "BuglePenpal");
                                ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeUiStateControllerImplV2", "setOnScreenCloseAndStopCallback$lambda$32$lambda$28$lambda$27", 308, "MagicComposeUiStateControllerImplV2.kt")).q("Failed to close AICore client");
                            }
                        } else {
                            if (((ascu) uysVar.m.b()).a()) {
                                dofbVar2.a();
                            }
                            ejcjVar2.g();
                        }
                        return fctx.a;
                    }
                });
                ((dofb) fcsuVar.b()).i(new fdae() { // from class: uyc
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        uys uysVar = this.a;
                        Future future = ((dofj) ((dofb) uysVar.e.b()).a.c()).m;
                        if (future != null && !future.isDone()) {
                            Optional optional = (Optional) uysVar.i.b();
                            final fdap fdapVar = new fdap() { // from class: uxw
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj) {
                                    val valVar = (val) obj;
                                    valVar.getClass();
                                    valVar.k();
                                    return fctx.a;
                                }
                            };
                            optional.ifPresent(new Consumer() { // from class: uxx
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

    private final void e(final uwf uwfVar) {
        final dofb dofbVar = (dofb) this.e.b();
        dofbVar.g(new fdae() { // from class: uxy
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
        if (((Boolean) crbf.aX.e()).booleanValue()) {
            ((acgu) this.s.b()).a(40);
        }
        if (((aqab) this.q.b()).a() && !((Boolean) crbf.bd.e()).booleanValue() && ((strA = uwfVar.a()) == null || strA.length() == 0)) {
            fcsu fcsuVar = this.e;
            dofb dofbVar = (dofb) fcsuVar.b();
            dofbVar.a();
            dofbVar.f();
            dofbVar.g(new fdae() { // from class: uxr
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
            final fdap fdapVar = new fdap() { // from class: uxs
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    uzw uzwVar = (uzw) obj;
                    uzwVar.getClass();
                    uzwVar.f(null);
                    uzwVar.c();
                    return fctx.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: uxt
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
        dofb dofbVar2 = (dofb) this.e.b();
        e(uwfVar);
        d();
        dofbVar2.a();
        dofbVar2.f();
        dofbVar2.e(new fdae() { // from class: uxu
            @Override // defpackage.fdae
            public final Object invoke() {
                fcsu fcsuVar2 = this.a.l;
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
            arrayList.add(new dlff(str, str, new fdae() { // from class: uxv
                @Override // defpackage.fdae
                public final Object invoke() {
                    final uys uysVar = this.a;
                    final dofb dofbVar3 = (dofb) uysVar.e.b();
                    dofbVar3.a();
                    final String str2 = str;
                    final uwf uwfVar2 = uwfVar;
                    final String strA2 = uwfVar2.a();
                    if (strA2 != null && strA2.length() != 0) {
                        Object obj = ((uzn) uysVar.b.b()).a().get(str2);
                        if (obj == null) {
                            throw new IllegalArgumentException(a.a(str2, "Style '", "' wasn't registered."));
                        }
                        final epiv epivVar = (epiv) obj;
                        dofbVar3.h(new fdae() { // from class: uxq
                            @Override // defpackage.fdae
                            public final Object invoke() {
                                dofbVar3.a();
                                uysVar.c(strA2, epivVar, uwfVar2);
                                return fctx.a;
                            }
                        });
                        uysVar.c(strA2, epivVar, uwfVar2);
                    }
                    dofbVar3.q(new fdae() { // from class: uxz
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            uys uysVar2 = uysVar;
                            ((dakl) uysVar2.d.b()).p(R.string.feedback_confirmation);
                            fcsu fcsuVar2 = uysVar2.c;
                            if (((Optional) fcsuVar2.b()).isPresent()) {
                                ((uzw) ((Optional) fcsuVar2.b()).get()).k(str2);
                            }
                            return fctx.a;
                        }
                    });
                    dofbVar3.p(new fdae() { // from class: uya
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            uys uysVar2 = uysVar;
                            fcsu fcsuVar2 = uysVar2.c;
                            if (((Optional) fcsuVar2.b()).isPresent()) {
                                ((uzw) ((Optional) fcsuVar2.b()).get()).i(str2);
                            }
                            fcsu fcsuVar3 = uysVar2.l;
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
        if (((Boolean) crbf.aX.e()).booleanValue()) {
            ((acgu) this.s.b()).a(40);
        }
        dofb dofbVar = (dofb) this.e.b();
        e(uwfVar);
        d();
        dofbVar.a();
        dofbVar.m();
    }

    public final void c(String str, epiv epivVar, uwf uwfVar) {
        auvw.k(this.g, null, null, new uyr(this, str, epivVar, uwfVar, null), 3);
    }
}
