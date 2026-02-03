package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/message/cardstone/EmergencyQuestionnaireCardstoneUiAdapter");
    public final Context b;
    public final fdjx c;
    public final vwg d;
    public final fdat e;
    public final fdat f;
    public final ccxe g;
    private final fdjx h;
    private final ajlu i;
    private final ajlw j;
    private final ynm k;

    public zjj(Context context, fdjx fdjxVar, fdjx fdjxVar2, ajlu ajluVar, ajlw ajlwVar, vwg vwgVar, ccxe ccxeVar, ynm ynmVar, aquq aquqVar) {
        context.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        ajluVar.getClass();
        ajlwVar.getClass();
        vwgVar.getClass();
        ynmVar.getClass();
        aquqVar.getClass();
        this.b = context;
        this.h = fdjxVar;
        this.c = fdjxVar2;
        this.i = ajluVar;
        this.j = ajlwVar;
        this.d = vwgVar;
        this.g = ccxeVar;
        this.k = ynmVar;
        this.e = auxh.d(new zjf(this), fdjxVar);
        this.f = auxh.d(new zje(this), fdjxVar);
    }

    public final ziu a(String str, final MessageId messageId) {
        Context context = this.b;
        String string = context.getString(R.string.emergency_questionnaire_card_title);
        string.getClass();
        String string2 = context.getString(R.string.emergency_questionnaire_card_subtitle);
        string2.getClass();
        Set setB = str != null ? fcwm.b(str) : fcvq.a;
        List list = zjk.g;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        fcue fcueVar = new fcue((fcuh) list);
        while (fcueVar.hasNext()) {
            zjk zjkVar = (zjk) fcueVar.next();
            String strName = zjkVar.name();
            String string3 = context.getString(zjkVar.i);
            string3.getClass();
            arrayList.add(new dkbm(strName, zjkVar.h, string3));
        }
        return new ziu(null, new diyr(string, string2, fcva.b(new dkbn(setB, arrayList, new fdap() { // from class: zix
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str2 = (String) obj;
                str2.getClass();
                this.a.e.a(zjk.a(str2), messageId);
                return fctx.a;
            }
        }))), messageId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (defpackage.fdxs.c(r1, r2) == r3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(final java.lang.String r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof defpackage.zji
            if (r2 == 0) goto L17
            r2 = r1
            zji r2 = (defpackage.zji) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.c = r3
            goto L1c
        L17:
            zji r2 = new zji
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            fcyl r3 = defpackage.fcyl.a
            int r4 = r2.c
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3a
            if (r4 == r6) goto L36
            if (r4 != r5) goto L2e
            defpackage.fctl.b(r1)
            goto L7e
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            defpackage.fctl.b(r1)
            goto L63
        L3a:
            defpackage.fctl.b(r1)
            ajlu r7 = r0.i
            ajna r8 = defpackage.ajna.BEST_AVAILABLE
            ziz r9 = new ziz
            r1 = r18
            r9.<init>()
            int r1 = defpackage.ekgb.d
            ekgb r10 = defpackage.ekoe.a
            elny r14 = defpackage.elny.EMERGENCY_QUESTIONNAIRE
            r15 = 0
            r16 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            eiju r1 = r7.k(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.getClass()
            r2.c = r6
            java.lang.Object r1 = defpackage.fdxs.c(r1, r2)
            if (r1 == r3) goto L9d
        L63:
            ajlx r1 = (defpackage.ajlx) r1
            if (r1 == 0) goto L81
            ynm r4 = r0.k
            r4.c()
            ajlw r4 = r0.j
            eiju r1 = r4.b(r1)
            r1.getClass()
            r2.c = r5
            java.lang.Object r1 = defpackage.fdxs.c(r1, r2)
            if (r1 != r3) goto L7e
            goto L9d
        L7e:
            fctx r1 = defpackage.fctx.a
            return r1
        L81:
            ekrg r1 = defpackage.zjj.a
            ekrw r1 = r1.j()
            r2 = 233(0xe9, float:3.27E-43)
            java.lang.String r3 = "EmergencyQuestionnaireCardstoneUiAdapter.kt"
            java.lang.String r4 = "com/google/android/apps/messaging/conversation2/messagelist/message/cardstone/EmergencyQuestionnaireCardstoneUiAdapter"
            java.lang.String r5 = "sendMessage"
            ekrw r1 = r1.h(r4, r5, r2, r3)
            ekrd r1 = (defpackage.ekrd) r1
            java.lang.String r2 = "Failed to prepare content for sending emergency conversation option"
            r1.q(r2)
            fctx r1 = defpackage.fctx.a
            return r1
        L9d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zjj.b(java.lang.String, fcxy):java.lang.Object");
    }
}
