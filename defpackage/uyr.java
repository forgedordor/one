package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uyr extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ uys c;
    final /* synthetic */ String d;
    final /* synthetic */ epiv e;
    final /* synthetic */ uwf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyr(uys uysVar, String str, epiv epivVar, uwf uwfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = uysVar;
        this.d = str;
        this.e = epivVar;
        this.f = uwfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uyr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        doeb doebVarA;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.b != 0) {
                obj2 = this.a;
                fctl.b(obj);
            } else {
                fctl.b(obj);
                uys uysVar = this.c;
                Optional optional = (Optional) uysVar.c.b();
                final epiv epivVar = this.e;
                final fdap fdapVar = new fdap() { // from class: uyj
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        ((uzw) obj3).f(epivVar);
                        return fctx.a;
                    }
                };
                optional.ifPresent(new Consumer() { // from class: uyk
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj3) {
                        fdapVar.invoke(obj3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                dzub dzubVarD = uysVar.j.d();
                eiju eijuVarA = ((uzp) uysVar.f.b()).a(this.d, epivVar);
                ((dofb) uysVar.e.b()).o(eijuVarA);
                this.a = dzubVarD;
                this.b = 1;
                obj = fdxs.c(eijuVarA, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                obj2 = dzubVarD;
            }
            evtg evtgVar = ((epis) obj).b;
            evtgVar.getClass();
            List listAb = fcva.ab(evtgVar);
            uys uysVar2 = this.c;
            List<epir> listAm = fcva.am(listAb, (int) ((Number) uysVar2.k.b()).longValue());
            uysVar2.j.f((dzub) obj2, new dzfh("RequestMagicRewriteConv2"), null, dzua.SUCCESS);
            final uys uysVar3 = this.c;
            final uwf uwfVar = this.f;
            final ArrayList arrayList = new ArrayList();
            for (final epir epirVar : listAm) {
                ezgh ezghVar = (ezgh) ezgi.a.createBuilder();
                ezghVar.getClass();
                ezgf ezgfVar = (ezgf) ezgg.b.createBuilder();
                ezgfVar.getClass();
                ezat.b(ezan.SMARTER_REPLY, ezgfVar);
                ezau.c(ezat.a(ezgfVar), ezghVar);
                ezgj ezgjVar = (ezgj) ezgk.a.createBuilder();
                ezgjVar.getClass();
                String str = epirVar.b;
                str.getClass();
                ezav.b(str, ezgjVar);
                ezau.d(ezav.a(ezgjVar), ezghVar);
                arrayList.add(dlfk.e(((ztw) ((Optional) uysVar3.h.b()).get()).c(new SmartSuggestionItemSuggestionData(ezau.a(ezghVar))), new fdae() { // from class: uyd
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        epir epirVar2 = epirVar;
                        final epiv epivVarB = epiv.b(epirVar2.c);
                        if (epivVarB == null) {
                            epivVarB = epiv.UNRECOGNIZED;
                        }
                        uwf uwfVar2 = uwfVar;
                        uys uysVar4 = uysVar3;
                        epivVarB.getClass();
                        final String str2 = epirVar2.b;
                        str2.getClass();
                        Optional optional2 = (Optional) uysVar4.i.b();
                        final fdap fdapVar2 = new fdap() { // from class: uye
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj3) {
                                val valVar = (val) obj3;
                                valVar.getClass();
                                valVar.c();
                                valVar.h(epivVarB, str2);
                                return fctx.a;
                            }
                        };
                        optional2.ifPresent(new Consumer() { // from class: uyf
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj3) {
                                fdapVar2.invoke(obj3);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        auvw.k(uysVar4.g, null, null, new uyi(uysVar4, epivVarB, null), 3);
                        uwfVar2.c(str2);
                        uwfVar2.b();
                        return fctx.a;
                    }
                }));
            }
            if (!arrayList.isEmpty()) {
                Optional optional2 = (Optional) uysVar3.i.b();
                final epiv epivVar2 = this.e;
                final fdap fdapVar2 = new fdap() { // from class: uyp
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        ((val) obj3).d(epivVar2, arrayList.size());
                        return fctx.a;
                    }
                };
                optional2.ifPresent(new Consumer() { // from class: uyq
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj3) {
                        fdapVar2.invoke(obj3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            ((dofb) uysVar3.e.b()).n(arrayList);
            return fctx.a;
        } catch (CancellationException unused) {
            ekrw ekrwVarE = this.c.p.e();
            ekrwVarE.X(eksq.a, "BuglePenpal");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeUiStateControllerImplV2$magicRewriteToneOnClick$1", "invokeSuspend", 209, "MagicComposeUiStateControllerImplV2.kt")).t("Magic Rewrite request was cancelled for tone '%s'.", this.e.name());
            return fctx.a;
        } catch (Exception e) {
            uys uysVar4 = this.c;
            ekrw ekrwVarI = uysVar4.p.i();
            ekrz ekrzVar = eksq.a;
            ekrwVarI.X(ekrzVar, "BuglePenpal");
            ((ekrd) ((ekrd) ekrwVarI).g(e).h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeUiStateControllerImplV2$magicRewriteToneOnClick$1", "invokeSuspend", 215, "MagicComposeUiStateControllerImplV2.kt")).t("Error while processing Magic Rewrite response for tone '%s'.", this.e.name());
            Object objB = uysVar4.e.b();
            objB.getClass();
            dofb dofbVar = (dofb) objB;
            Object objE = crbf.ba.e();
            objE.getClass();
            boolean zBooleanValue = ((Boolean) objE).booleanValue();
            if ((e instanceof agrg) || (zBooleanValue && (e instanceof agrm))) {
                ekrw ekrwVarH = uvc.a.h();
                ekrwVarH.X(ekrzVar, "BuglePenpal");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeErrorUtils", "setMagicRewriteErrorUiData", 46, "MagicComposeErrorUtils.kt")).q("Showing results blocked error for Magic Rewrite");
                doebVarA = dodz.b;
            } else {
                Context context = uysVar4.a;
                ekrw ekrwVarH2 = uvc.a.h();
                ekrwVarH2.X(ekrzVar, "BuglePenpal");
                ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeErrorUtils", "setMagicRewriteErrorUiData", 50, "MagicComposeErrorUtils.kt")).q("Showing error for Magic Rewrite");
                doebVarA = uvc.a(context, dofbVar, e);
            }
            dofbVar.b(doebVarA);
            Optional optional3 = (Optional) uysVar4.i.b();
            final fdap fdapVar3 = new fdap() { // from class: uyl
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) {
                    ((val) obj3).b(e);
                    return fctx.a;
                }
            };
            optional3.ifPresent(new Consumer() { // from class: uym
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj3) {
                    fdapVar3.invoke(obj3);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            Optional optional4 = (Optional) uysVar4.c.b();
            final fdap fdapVar4 = new fdap() { // from class: uyn
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) {
                    ((uzw) obj3).b(e);
                    return fctx.a;
                }
            };
            optional4.ifPresent(new Consumer() { // from class: uyo
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj3) {
                    fdapVar4.invoke(obj3);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return fctx.a;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new uyr(this.c, this.d, this.e, this.f, fcxyVar);
    }
}
