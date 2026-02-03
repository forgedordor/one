package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class vfm extends fdbo implements fdap {
    public vfm(Object obj) {
        super(1, obj, vfn.class, "navigate", "navigate(Lcom/google/common/collect/ImmutableList;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ekgb ekgbVar = (ekgb) obj;
        ekgbVar.getClass();
        vfn vfnVar = (vfn) this.g;
        afzc afzcVar = vfnVar.a;
        alqm alqmVarG = ((ResolvedRecipient) fcva.X(ekgbVar)).g();
        alqmVarG.getClass();
        afzcVar.h(new agbi(alqmVarG, vfnVar.b.b(176582, null)));
        return fctx.a;
    }
}
