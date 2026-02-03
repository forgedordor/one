package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wct implements dpyu {
    final /* synthetic */ fdci a;
    final /* synthetic */ fduf b;
    final /* synthetic */ wcu c;

    public wct(fdci fdciVar, fduf fdufVar, wcu wcuVar) {
        this.a = fdciVar;
        this.b = fdufVar;
        this.c = wcuVar;
    }

    @Override // defpackage.dpyu
    public final Object m(dpyt dpytVar) {
        if (fdbq.f(dpytVar, dpyk.a)) {
            if (!fdbq.f(dpytVar, this.a.a)) {
                ((ekrd) wcu.a.e().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendInputsUiAdapter$createHugoStateCollector$1", "onStateChanged", 87, "DirectSendInputsUiAdapter.kt")).q("Compose Row input state is now closed");
            }
            this.b.f(dpyw.a);
        } else {
            if (dpytVar instanceof dpyl) {
                dpzi dpziVar = ((dpyl) dpytVar).a;
                djdk djdkVarA = wcu.a(dpziVar);
                Object obj = this.a.a;
                dpyl dpylVar = obj instanceof dpyl ? (dpyl) obj : null;
                if (!fdbq.f(dpylVar != null ? wcu.a(dpylVar.a) : null, djdkVarA)) {
                    ((ekrd) wcu.a.e().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendInputsUiAdapter$createHugoStateCollector$1", "onStateChanged", 99, "DirectSendInputsUiAdapter.kt")).t("Compose Row now showing input %s without keyboard", djdkVarA);
                }
                this.b.f(dpziVar);
            } else if (dpytVar instanceof dpym) {
                dpzi dpziVar2 = ((dpym) dpytVar).a;
                djdk djdkVarA2 = wcu.a(dpziVar2);
                Object obj2 = this.a.a;
                dpym dpymVar = obj2 instanceof dpym ? (dpym) obj2 : null;
                if (!fdbq.f(dpymVar != null ? wcu.a(dpymVar.a) : null, djdkVarA2)) {
                    ((ekrd) wcu.a.e().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendInputsUiAdapter$createHugoStateCollector$1", "onStateChanged", 110, "DirectSendInputsUiAdapter.kt")).t("Compose Row now showing input %s over keyboard", djdkVarA2);
                }
                this.b.f(dpziVar2);
            } else {
                if (!(dpytVar instanceof dpys)) {
                    throw new fctg();
                }
                Object obj3 = this.a.a;
                dpys dpysVar = obj3 instanceof dpys ? (dpys) obj3 : null;
                Object obj4 = dpysVar != null ? dpysVar.a : null;
                if (((dpys) dpytVar).a instanceof dplg) {
                    if (obj4 == null || !(obj4 instanceof dplg)) {
                        ((ekrd) wcu.a.e().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendInputsUiAdapter$createHugoStateCollector$1", "onStateChanged", 121, "DirectSendInputsUiAdapter.kt")).q("Compose Row keyboard is closing");
                    }
                    this.b.f(dpyw.a);
                } else {
                    if (obj4 == null || (obj4 instanceof dplg)) {
                        ((ekrd) wcu.a.e().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendInputsUiAdapter$createHugoStateCollector$1", "onStateChanged", 127, "DirectSendInputsUiAdapter.kt")).q("Compose Row now showing keyboard without input");
                    }
                    this.b.f(new dpzd(dnii.a(this.c.c.a)));
                }
            }
        }
        return fctx.a;
    }
}
