package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afou extends fcyz implements fdat {
    final /* synthetic */ afpe a;
    final /* synthetic */ fdap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afou(afpe afpeVar, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = afpeVar;
        this.b = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afou) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final fdci fdciVar = new fdci();
        final fdap fdapVar = this.b;
        fdap fdapVar2 = new fdap() { // from class: afot
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                Object next;
                vvw vvwVar = (vvw) obj2;
                List list = vvwVar.b;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    fdap fdapVar3 = fdapVar;
                    next = it.next();
                    if (((Boolean) fdapVar3.invoke(next)).booleanValue()) {
                        break;
                    }
                }
                vvs vvsVar = (vvs) next;
                fdciVar.a = vvsVar;
                return vvsVar == null ? vvwVar : vvw.c(vvwVar, null, fcva.ag(list, vvsVar), null, false, null, null, false, 0, null, 2045);
            }
        };
        afpe afpeVar = this.a;
        afpeVar.d.b(fdapVar2);
        vvs vvsVar = (vvs) fdciVar.a;
        ((ekrd) ((ekrd) (vvsVar != null ? afpe.a.g() : afpe.a.h())).h("com/google/android/apps/messaging/multishare/editmessage/bottomcontent/composerow/attachments/DraftAttachmentUiAdapterImpl$removeAttachment$1", "invokeSuspend", 113, "DraftAttachmentUiAdapterImpl.kt")).t("removeAttachment removed: %s", vvsVar);
        Object obj2 = vvsVar instanceof vvr ? ((vvr) vvsVar).a : vvsVar instanceof vvn ? ((vvn) vvsVar).b : null;
        if (obj2 instanceof dlto) {
            ((ekrd) afpe.a.g().h("com/google/android/apps/messaging/multishare/editmessage/bottomcontent/composerow/attachments/DraftAttachmentUiAdapterImpl$removeAttachment$1", "invokeSuspend", 126, "DraftAttachmentUiAdapterImpl.kt")).t("Removing from vCardFlowCache for %s", obj2);
            afpeVar.f.remove(((dlto) obj2).b);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new afou(this.a, this.b, fcxyVar);
    }
}
