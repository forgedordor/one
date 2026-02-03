package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wii extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ wiq c;
    final /* synthetic */ fdap d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wii(wiq wiqVar, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = wiqVar;
        this.d = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wii) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            final fdci fdciVar = new fdci();
            wiq wiqVar = this.c;
            final fdap fdapVar = this.d;
            wiqVar.f.c(new fdap() { // from class: wih
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) {
                    vvw vvwVar = (vvw) obj3;
                    List list = vvwVar.b;
                    Iterator it = list.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        }
                        if (((Boolean) fdapVar.invoke(it.next())).booleanValue()) {
                            break;
                        }
                        i++;
                    }
                    if (i == -1) {
                        return vvwVar;
                    }
                    fdci fdciVar2 = fdciVar;
                    List listAq = fcva.aq(list);
                    fdciVar2.a = new fcvv(i, listAq.remove(i));
                    return vvw.c(vvwVar, null, listAq, null, false, null, null, false, 0, null, 2045);
                }
            });
            if (fdciVar.a == null) {
                ekrw ekrwVarJ = wiq.a.j();
                ekrwVarJ.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$removeAttachment$1", "invokeSuspend", 322, "DraftAttachmentController.kt")).q("removeAttachment removed nothing");
                return fctx.a;
            }
            ekrw ekrwVarH = wiq.a.h();
            ekrwVarH.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$removeAttachment$1", "invokeSuspend", 318, "DraftAttachmentController.kt")).t("removeAttachment removed: %s", fdciVar.a);
            vvs vvsVar = (vvs) ((fcvv) fdciVar.a).b;
            this.a = fdciVar;
            this.b = 1;
            if (wiqVar.d(vvsVar, this) == fcylVar) {
                return fcylVar;
            }
            obj2 = fdciVar;
        }
        vth vthVar = (vth) this.c.o.b();
        fcvv fcvvVar = (fcvv) ((fdci) obj2).a;
        vthVar.f((vvs) fcvvVar.b, fcvvVar.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wii(this.c, this.d, fcxyVar);
    }
}
