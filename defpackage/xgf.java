package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class xgf implements fdpm, fdbl {
    final /* synthetic */ xgm a;

    public xgf(xgm xgmVar) {
        this.a = xgmVar;
    }

    @Override // defpackage.fdbl
    public final fcsy b() {
        return new fdbb(2, this.a, xgm.class, "onStateChanged", "onStateChanged(Lcom/google/android/libraries/compose/cameragallery/popupcamera/PopupCameraUiDataImpl;)V", 4);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fdpm) && (obj instanceof fdbl)) {
            return fdbq.f(b(), ((fdbl) obj).b());
        }
        return false;
    }

    @Override // defpackage.fdpm
    public final /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        dmhi dmhiVar = (dmhi) obj;
        ekrw ekrwVarE = xgm.a.e();
        ekrwVarE.X(eksq.a, "BugleSelfieGif");
        ekrd ekrdVar = (ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/cameragallery/SelfieGifUiAdapterImpl", "onStateChanged", 109, "SelfieGifUiAdapterImpl.kt");
        Class<?> cls = dmhiVar.getClass();
        int i = fdcj.a;
        ekrdVar.t("Selfie GIF popup state changed to %s", new fdbi(cls).c());
        boolean z = dmhiVar instanceof dmgv;
        xgm xgmVar = this.a;
        ahat ahatVar = null;
        if (z) {
            ahat ahatVar2 = xgmVar.h;
            if (ahatVar2 == null) {
                fdbq.c("popupController");
            } else {
                ahatVar = ahatVar2;
            }
            ahatVar.a();
            if (xgmVar.j) {
                ((acgu) xgmVar.g.b()).a(33);
                xgmVar.j = false;
            }
        } else {
            ahat ahatVar3 = xgmVar.h;
            if (ahatVar3 == null) {
                fdbq.c("popupController");
            } else {
                ahatVar = ahatVar3;
            }
            ahatVar.b(dmhiVar);
        }
        return fctx.a;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
