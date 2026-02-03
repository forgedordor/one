package defpackage;

import com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vdl implements fdat {
    final /* synthetic */ vdr a;

    public vdl(vdr vdrVar) {
        this.a = vdrVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(1849434622);
            vdr vdrVar = this.a;
            Object objF = hmlVar.f();
            Object obj3 = hmk.a;
            if (objF == obj3) {
                ConversationViewModel conversationViewModelA = vdrVar.a();
                aalo aaloVar = conversationViewModelA.n;
                aald aaldVar = new aald(conversationViewModelA, null);
                hpl hplVar = new hpl(new zyd(), hsi.a);
                auvw.k(aaloVar.a, null, fdjz.d, new aaln(hplVar, aaldVar, null), 1);
                zye zyeVar = (zye) hplVar.a();
                if (zyeVar instanceof zyd) {
                    ((ekrd) aalm.a.j().h("com/google/android/apps/messaging/conversation2/viewmodel/RootSuspensionWatchdogLog", "onRootSuspend", 14, "RootSuspensionWatchdogLog.kt")).q("UiData is not ready immediately");
                } else if (zyeVar instanceof zyb) {
                    throw new RuntimeException("Failed to create root UI data", ((zyb) zyeVar).a);
                }
                hmlVar.y(hplVar);
                objF = hplVar;
            }
            hsf hsfVar = (hsf) objF;
            hmlVar.o();
            Optional optional = (Optional) vdrVar.k.b();
            hmlVar.v(1849434622);
            Object objF2 = hmlVar.f();
            if (objF2 == obj3) {
                final fdap fdapVar = new fdap() { // from class: vdg
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        return ((aidn) obj4).a();
                    }
                };
                Function function = new Function() { // from class: vdh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj4) {
                        return fdapVar.invoke(obj4);
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                hmlVar.y(function);
                objF2 = function;
            }
            Function functionM178m = aky$$ExternalSyntheticApiModelOutline0.m178m(objF2);
            hmlVar.o();
            aidm aidmVar = (aidm) optional.map(functionM178m).orElse(aidm.a);
            fcsu fcsuVar = vdrVar.c;
            hpu[] hpuVarArr = new hpu[7];
            hpt hptVar = djrx.a;
            Object objB = fcsuVar.b();
            objB.getClass();
            hpuVarArr[0] = hptVar.c(objB);
            hpuVarArr[1] = zgx.a.c(vdrVar.a().p);
            hpuVarArr[2] = zya.a.c(vdrVar.a().o);
            hpuVarArr[3] = auwg.a.c(((auwh) vdrVar.h.b()).a);
            hpt hptVar2 = aidp.a;
            aidmVar.getClass();
            hpuVarArr[4] = hptVar2.c(aidmVar);
            hpuVarArr[5] = dpjg.a.c((((aqgw) vdrVar.w.b()).a() || ((arma) vdrVar.x.b()).a()) ? (dpir) vdrVar.v.b() : null);
            hpuVarArr[6] = diik.a.c(vdrVar.a().q);
            hnj.b(hpuVarArr, hxe.d(-1653874800, new vdk(hsfVar, vdrVar), hmlVar), hmlVar, 56);
        }
        return fctx.a;
    }
}
