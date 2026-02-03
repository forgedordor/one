package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xow extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ xoy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xow(xoy xoyVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = xoyVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        xow xowVar = new xow(this.d, (fcxy) obj4);
        xowVar.a = (ResolvedRecipient) obj;
        xowVar.b = (Optional) obj2;
        xowVar.c = (ajlk) obj3;
        return xowVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r9 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        xoy xoyVar = this.d;
        if (!(xoyVar.g instanceof RbmConversationId) || !(obj3 instanceof akmy)) {
            ((ekrd) xoy.a.g().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 95, "RbmToolstoneUiAdapterImpl.kt")).q("RBM toolstone disabled because we are not in an RBM conversation.");
            return false;
        }
        if (!((Boolean) asqt.b.e()).booleanValue()) {
            ((ekrd) xoy.a.g().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 100, "RbmToolstoneUiAdapterImpl.kt")).q("RBM toolstone disabled by phenotype.");
            return false;
        }
        if (r9.z()) {
            ((ekrd) xoy.a.g().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 105, "RbmToolstoneUiAdapterImpl.kt")).q("RBM toolstone not shown because of non-qualifying recipient.");
            return false;
        }
        if (((akmy) obj3).D() != asqe.SHOW) {
            ((ekrd) xoy.a.g().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 110, "RbmToolstoneUiAdapterImpl.kt")).q("RBM toolstone is not in SHOW state.");
            return false;
        }
        String strN = r9.g().n();
        if (strN == null) {
            strN = "";
        }
        String strC = alwh.c(strN);
        strC.getClass();
        if (strC.length() != 0 && asqt.a().contains(strC)) {
            Optional optional = (Optional) obj2;
            if (optional.isPresent()) {
                anvx anvxVar = (anvx) optional.get();
                String strName = anvxVar.a().name();
                String strB = anvxVar.b();
                evtg evtgVar = ((ewto) asqt.m.e()).b;
                evtgVar.getClass();
                if (evtgVar.contains(strName)) {
                    ((ekrd) xoy.a.g().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 131, "RbmToolstoneUiAdapterImpl.kt")).t("RBM toolstone not shown due to agent use case: %s.", strName);
                    return false;
                }
                Object objE = asqt.i.e();
                objE.getClass();
                if (!asqt.b((String) objE).contains(strB) && !((ewto) xoyVar.j.b()).b.contains(strB)) {
                    return true;
                }
                ((ekrd) xoy.a.g().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 141, "RbmToolstoneUiAdapterImpl.kt")).t("RBM toolstone not shown due to business ID being in toolstone bypass allowlist: %s.", strB);
                return false;
            }
        }
        ((ekrd) xoy.a.g().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 123, "RbmToolstoneUiAdapterImpl.kt")).q("RBM toolstone not shown because of non-qualifying business domain.");
        return false;
    }
}
