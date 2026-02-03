package defpackage;

import android.net.Uri;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wig implements dnib {
    final /* synthetic */ wiq a;

    public wig(wiq wiqVar) {
        this.a = wiqVar;
    }

    public final vvs a(dltd dltdVar, vvl vvlVar, boolean z) {
        if (dltdVar instanceof dltn) {
            if (vvlVar == null) {
                vvlVar = vuc.a();
            }
            return new vvn(vvlVar, (dltn) dltdVar);
        }
        if (dltdVar instanceof doav) {
            if (vvlVar == null) {
                vvlVar = vuc.a();
            }
            return new vvm(vvlVar, (doav) dltdVar);
        }
        if (vvlVar == null) {
            vvlVar = vuc.a();
        }
        return new vvr(dltdVar, new vvq(vvlVar, (Uri) null, z ? ejxm.c(this.a.m) : null, (fdkf) null, 54));
    }

    @Override // defpackage.dnhq
    public final Object b(dltd dltdVar, dnhn dnhnVar, fcxy fcxyVar) {
        vvl vvlVarJ;
        if (dnhnVar == null || (vvlVarJ = ((vth) this.a.o.b()).h(dnhnVar)) == null) {
            vvlVarJ = ((vth) this.a.o.b()).j(dltdVar.fo(), vvt.c(dltdVar));
        }
        vvl vvlVar = vvlVarJ;
        wiq wiqVar = this.a;
        return fdin.a(eicg.a(wiqVar.c), new wib(null, dltdVar, wiqVar, this, vvlVar), fcxyVar);
    }

    @Override // defpackage.dnib
    public final fdvc c() {
        fdap fdapVar = new fdap() { // from class: why
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                vvw vvwVar = (vvw) obj;
                vvwVar.getClass();
                return vvwVar.b;
            }
        };
        wiq wiqVar = this.a;
        return auyf.c(wiqVar.f.a, wiqVar.e, fdapVar);
    }

    @Override // defpackage.dnhq
    public final void d() {
        wiq wiqVar = this.a;
        auvw.k(wiqVar.e, null, null, new wie(wiqVar, null), 3);
    }

    @Override // defpackage.dnhq
    public final void e(final dltd dltdVar) {
        Object next;
        dltdVar.getClass();
        wiq wiqVar = this.a;
        Iterator it = ((vvw) wiqVar.f.a.c()).b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (dlth.a((vvs) next, dltdVar)) {
                    break;
                }
            }
        }
        vvs vvsVar = (vvs) next;
        if (vvsVar != null) {
            ((vth) wiqVar.o.b()).g(vvsVar.a(), 3);
        } else {
            ekrw ekrwVarJ = wiq.a.j();
            ekrwVarJ.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$hugoDraftAttachmentsController$1", "removeAttachment", 479, "DraftAttachmentController.kt")).t("Cannot log onRemoveStart because cannot find DraftAttachment for %s", dltdVar);
        }
        wiqVar.h(new fdap() { // from class: wia
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                vvs vvsVar2 = (vvs) obj;
                vvsVar2.getClass();
                return Boolean.valueOf(dlth.a(vvsVar2, dltdVar));
            }
        });
    }

    @Override // defpackage.dnhq
    public final void f(dltd dltdVar) {
        if (!crbf.e() && (dltdVar instanceof dnvg)) {
            ekrw ekrwVarH = wiq.a.h();
            ekrwVarH.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$hugoDraftAttachmentsController$1", "send", 513, "DraftAttachmentController.kt")).q("Not direct sending custom sticker");
        } else {
            ekrw ekrwVarE = wiq.a.e();
            ekrwVarE.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$hugoDraftAttachmentsController$1", "send", 516, "DraftAttachmentController.kt")).t("Launching direct send %s", dltdVar);
            wiq wiqVar = this.a;
            auvw.k(wiqVar.d, null, null, new wif(dltdVar, wiqVar, this, null), 3);
        }
    }

    public final void g(final String str, final Boolean bool) {
        this.a.f.c(new fdap() { // from class: whz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                vvw vvwVar = (vvw) obj;
                vvwVar.getClass();
                String str2 = vvwVar.a;
                Boolean bool2 = bool;
                String str3 = str;
                if (fdbq.f(str2, str3) && (bool2 == null || fdbq.f(Boolean.valueOf(vvwVar.h), bool2))) {
                    return vvwVar;
                }
                return vvw.c(vvwVar, str3, null, null, false, null, null, bool2 != null ? bool2.booleanValue() : vvwVar.h, 2, null, 1662);
            }
        });
    }

    @Override // defpackage.dnhq
    public final boolean h() {
        return ((wlk) this.a.p.c()).c;
    }
}
