package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bagw {
    public static final cqce a = cqce.g("BugleAction", "DraftMessageUtils");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final awhr h;
    public final eosc i;
    private final fcsu j;

    public bagw(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, awhr awhrVar, eosc eoscVar) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.j = fcsuVar4;
        this.e = fcsuVar5;
        this.f = fcsuVar6;
        this.g = fcsuVar7;
        this.h = awhrVar;
        this.i = eoscVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.String r3, int r4, java.util.List r5, java.lang.String r6) {
        /*
            r2 = this;
            fcsu r0 = r2.j
            java.lang.Object r0 = r0.b()
            cbpr r0 = (defpackage.cbpr) r0
            if (r3 == 0) goto Ld
            r0.b(r4, r3)
        Ld:
            cczv r3 = defpackage.cgwx.a
            java.lang.Object r3 = r3.e()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 0
            r1 = 1
            if (r3 == 0) goto L2f
            if (r5 == 0) goto L4b
            j$.util.stream.Stream r3 = j$.util.Collection.EL.stream(r5)
            bagt r5 = new bagt
            r5.<init>()
            boolean r3 = r3.noneMatch(r5)
            if (r3 == 0) goto L51
            goto L4b
        L2f:
            if (r5 == 0) goto L4b
            boolean r3 = r5.isEmpty()
            if (r3 != 0) goto L4b
            int r3 = r5.size()
            if (r3 <= r1) goto L3e
            goto L51
        L3e:
            java.lang.Object r3 = r5.get(r4)
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r3 = (com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData) r3
            boolean r3 = r3.bv()
            if (r3 != 0) goto L4b
            goto L51
        L4b:
            boolean r3 = r0.c()
            if (r3 == 0) goto L53
        L51:
            r3 = r1
            goto L54
        L53:
            r3 = r4
        L54:
            cqce r5 = defpackage.bagw.a
            cqbd r5 = r5.a()
            java.lang.String r0 = "msg"
            r5.I(r0)
            if (r1 == r3) goto L64
            java.lang.String r0 = "Sms"
            goto L66
        L64:
            java.lang.String r0 = "Mms"
        L66:
            r5.I(r0)
            java.lang.String r0 = "because"
            r5.I(r0)
            r5.I(r6)
            r5.r()
            if (r3 == 0) goto L77
            return r1
        L77:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bagw.a(java.lang.String, int, java.util.List, java.lang.String):int");
    }

    public final eiju b(final ConversationIdType conversationIdType, final ekgb ekgbVar, final String str, final String str2, final List list, final int i, final boolean z, final boolean z2) {
        return eijx.h(new eooy() { // from class: bagv
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final bagw bagwVar = this.a;
                bapl baplVar = (bapl) bagwVar.c.b();
                ConversationIdType conversationIdType2 = conversationIdType;
                bajf bajfVarA = baplVar.a(conversationIdType2);
                if (bajfVarA == null) {
                    cqaz.c("Trying to determine message protocol type for a non-existent conversation");
                    return eijx.e(-1);
                }
                int iE = bajfVarA.E();
                int iD = bajfVarA.d();
                if (iE == 2) {
                    bagw.a.m("msg Rcs because in Rcs group.");
                    return eijx.e(3);
                }
                if (z2) {
                    bagw.a.m("msg Rcs because it's with bot recipient(s).");
                    return eijx.e(3);
                }
                if (z) {
                    bagw.a.m("msg Mms because told explicitly.");
                    return eijx.e(1);
                }
                if (!TextUtils.isEmpty(str)) {
                    bagw.a.m("msg Mms because has subject.");
                    return eijx.e(1);
                }
                if (((bakt) bagwVar.b.b()).ab(conversationIdType2)) {
                    bagw.a.m("msg Mms because receiver is email.");
                    return eijx.e(1);
                }
                final int i2 = i;
                if (iE == 1) {
                    if (((cmuq) bagwVar.e.b()).d(i2)) {
                        bagw.a.m("msg Mms because in Mms group.");
                        return eijx.e(1);
                    }
                    bagw.a.m("msg Sms because group Mms is disabled.");
                    return eijx.e(0);
                }
                final List list2 = list;
                final String str3 = str2;
                if (iD == 1) {
                    return eijx.e(Integer.valueOf(bagwVar.a(str3, i2, list2, "conversation forced to xMS")));
                }
                if (iD == 2) {
                    return eijx.e(Integer.valueOf(bagwVar.a(str3, i2, list2, "conversation latched to xMS")));
                }
                alqm alqmVar = (alqm) ekgbVar.get(0);
                if (i2 > 0) {
                    ((ains) bagwVar.g.b()).e("Bugle.Dsdr.DraftMessageUtilsSubId", 4);
                } else if (i2 == 0) {
                    ((ains) bagwVar.g.b()).e("Bugle.Dsdr.DraftMessageUtilsSubId", 3);
                } else if (i2 == -1) {
                    ((ains) bagwVar.g.b()).e("Bugle.Dsdr.DraftMessageUtilsSubId", 2);
                } else {
                    ((ains) bagwVar.g.b()).e("Bugle.Dsdr.DraftMessageUtilsSubId", 1);
                }
                boolean z3 = ((chza) ((cqbm) bagwVar.d.b()).a()).f(i2) == enwr.AVAILABLE;
                fcsu fcsuVar = bagwVar.f;
                if (z3 != ((dggw) fcsuVar.b()).w(i2)) {
                    ((ains) bagwVar.g.b()).e("Bugle.Dsdr.ProvisioningApiDiff", ((dggw) fcsuVar.b()).c(i2).a.N);
                }
                return !((dggw) fcsuVar.b()).w(i2) ? eijx.e(Integer.valueOf(bagwVar.a(str3, i2, list2, "Sender not RCS available"))) : bagwVar.h.c(alqmVar).h(new ejvr() { // from class: bagu
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        if (((awhp) obj).g()) {
                            bagw.a.m("msg Rcs: both sender/receiver ready for rcs.");
                            return 3;
                        }
                        List list3 = list2;
                        int i3 = i2;
                        return Integer.valueOf(bagwVar.a(str3, i3, list3, "Receiver not RCS capable"));
                    }
                }, bagwVar.i);
            }
        }, this.i);
    }
}
