package defpackage;

import android.content.Context;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wfk {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/imagecompression/DirectSendImageCompressionUiAdapter");
    public final Context b;
    public final fdjx c;
    public final fcsu d;
    public final ahax e;
    public final fcsu f;
    private final eygg g;
    private final wre h;
    private final aqht i;

    public wfk(Context context, fdjx fdjxVar, fdjx fdjxVar2, fcsu fcsuVar, ahax ahaxVar, fcsu fcsuVar2, eygg eyggVar, wre wreVar, aqht aqhtVar) {
        context.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fcsuVar.getClass();
        ahaxVar.getClass();
        fcsuVar2.getClass();
        eyggVar.getClass();
        wreVar.getClass();
        this.b = context;
        this.c = fdjxVar;
        this.d = fcsuVar;
        this.e = ahaxVar;
        this.f = fcsuVar2;
        this.g = eyggVar;
        this.h = wreVar;
        this.i = aqhtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.wfd
            if (r0 == 0) goto L13
            r0 = r5
            wfd r0 = (defpackage.wfd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wfd r0 = new wfd
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fcsu r5 = r4.f
            java.lang.Object r5 = r5.b()
            cmfo r5 = (defpackage.cmfo) r5
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 == r1) goto L4e
        L42:
            cqsz r5 = (defpackage.cqsz) r5
            boolean r5 = r5.e
            if (r5 == 0) goto L4b
            wfm r5 = defpackage.wfm.a
            return r5
        L4b:
            wfm r5 = defpackage.wfm.b
            return r5
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wfk.a(fcxy):java.lang.Object");
    }

    public final void b() {
        if (!this.i.a()) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/imagecompression/DirectSendImageCompressionUiAdapter", "cancelAllAttachmentPostProcessing", 172, "DirectSendImageCompressionUiAdapter.kt")).q("Skipping cancelAllAttachmentPostProcessing");
            return;
        }
        wre wreVar = this.h;
        List<vvs> list = ((vvw) wreVar.a.c()).b;
        ekrg ekrgVar = a;
        ekrw ekrwVarG = ekrgVar.g();
        ekrz ekrzVar = eksq.a;
        ekrwVarG.X(ekrzVar, "BugleComposeRow2");
        ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/imagecompression/DirectSendImageCompressionUiAdapter", "cancelAllAttachmentPostProcessing", 178, "DirectSendImageCompressionUiAdapter.kt")).t("Cancelling attachment post processing after image compression settings change for %s", list);
        final ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        for (vvs vvsVarA : list) {
            if ((vvsVarA instanceof vvr) && fdbq.f(vvt.b(vvsVarA), doid.a)) {
                ekrw ekrwVarE2 = ekrgVar.e();
                ekrwVarE2.X(ekrzVar, "BugleComposeRow2");
                ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/imagecompression/DirectSendImageCompressionUiAdapter", "cancelAllAttachmentPostProcessing", 188, "DirectSendImageCompressionUiAdapter.kt")).t("Cancelling post processing for %s", vvsVarA);
                vvsVarA = ((woh) this.g.b()).a((vvr) vvsVarA);
            }
            arrayList.add(vvsVarA);
        }
        List list2 = wreVar.a(new fdap() { // from class: wes
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                vvw vvwVar = (vvw) obj;
                vvwVar.getClass();
                return vvw.c(vvwVar, null, arrayList, null, false, null, null, false, 0, null, 2045);
            }
        }).b;
        if (!fdbq.f(list2, list)) {
            ekrw ekrwVarJ = ekrgVar.j();
            ekrwVarJ.X(ekrzVar, "BugleComposeRow2");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/imagecompression/DirectSendImageCompressionUiAdapter", "cancelAllAttachmentPostProcessing", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "DirectSendImageCompressionUiAdapter.kt")).t("Attachments changed while cancelling attachment post processing, expected: %s", list);
        }
        ekrw ekrwVarH = ekrgVar.h();
        ekrwVarH.X(ekrzVar, "BugleComposeRow2");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/imagecompression/DirectSendImageCompressionUiAdapter", "cancelAllAttachmentPostProcessing", 209, "DirectSendImageCompressionUiAdapter.kt")).D("Cancelled attachment post processing and updated attachments to %s from %s", arrayList, list2);
    }

    public final Object c(wfm wfmVar, wfm wfmVar2) {
        ((ains) this.d.b()).e("Bugle.DirectSend.FastImageSending.OptionSelected.Count", wfn.a(wfmVar, wfmVar2) - 1);
        return fctx.a;
    }
}
