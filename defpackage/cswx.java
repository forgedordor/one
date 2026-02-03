package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.widget.Toast;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.gms.duokit.DuoId;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cswx implements csyj {
    public final dcsx b;
    private final Context d;
    private final fcsu e;
    private final csyl f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final aisp k;
    private final fcyh l;
    private final fcyh m;
    private final csze n;
    private final fcsu o;
    private static final crnc c = new crnc(52);
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/video/BugleVideoCalling2");

    public cswx(Context context, fcsu fcsuVar, csyl csylVar, fcsu fcsuVar2, dcsx dcsxVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, aisp aispVar, fcyh fcyhVar, fcyh fcyhVar2, csze cszeVar, fcsu fcsuVar6) {
        context.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        dcsxVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        aispVar.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        fcsuVar6.getClass();
        this.d = context;
        this.e = fcsuVar;
        this.f = csylVar;
        this.g = fcsuVar2;
        this.b = dcsxVar;
        this.h = fcsuVar3;
        this.i = fcsuVar4;
        this.j = fcsuVar5;
        this.k = aispVar;
        this.l = fcyhVar;
        this.m = fcyhVar2;
        this.n = cszeVar;
        this.o = fcsuVar6;
    }

    public static final DuoId i(ResolvedRecipient resolvedRecipient) {
        DuoId duoId = new DuoId();
        duoId.b = resolvedRecipient.g().o();
        return duoId;
    }

    private final void j(int i, ConversationId conversationId, boolean z) {
        ((ains) this.i.b()).e("Bugle.UI.VideoCallButton.Clicked", i);
        elvc elvcVar = (elvc) elve.a.createBuilder();
        elvcVar.getClass();
        elvcVar.copyOnWrite();
        elve elveVar = (elve) elvcVar.instance;
        int i2 = 2;
        elveVar.b |= 2;
        elveVar.d = true;
        if (!z) {
            i2 = 5;
        } else if (((Boolean) csym.f.e()).booleanValue()) {
            i2 = 3;
        } else if (!((Boolean) csym.e.e()).booleanValue()) {
            i2 = ((Boolean) csym.d.e()).booleanValue() ? 4 : 1;
        }
        elvcVar.copyOnWrite();
        elve elveVar2 = (elve) elvcVar.instance;
        elveVar2.e = i2 - 1;
        elveVar2.b |= 128;
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_VIDEO_CALL_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        int iA = csyi.a(i);
        elvcVar.copyOnWrite();
        elve elveVar3 = (elve) elvcVar.instance;
        elveVar3.c = iA - 1;
        elveVar3.b |= 1;
        elve elveVar4 = (elve) elvcVar.build();
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elveVar4.getClass();
        ellhVar2.Z = elveVar4;
        ellhVar2.c |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        elkh elkhVar = (elkh) elki.a.createBuilder();
        long jC = ((aika) this.o.b()).c(conversationId.b());
        elkhVar.copyOnWrite();
        elki elkiVar = (elki) elkhVar.instance;
        elkiVar.b |= 65536;
        elkiVar.r = jC;
        ellgVar.copyOnWrite();
        ellh ellhVar3 = (ellh) ellgVar.instance;
        elki elkiVar2 = (elki) elkhVar.build();
        elkiVar2.getClass();
        ellhVar3.m = elkiVar2;
        ellhVar3.b |= 8;
        ((aill) this.j.b()).j(ellgVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.csyj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ekgb r8, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.cswr
            if (r0 == 0) goto L13
            r0 = r10
            cswr r0 = (defpackage.cswr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cswr r0 = new cswr
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L33
            if (r2 != r5) goto L2b
            aisq r8 = r0.d
            defpackage.fctl.b(r10)
            goto L75
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.fctl.b(r10)
            fcsu r10 = r7.h
            java.lang.Object r10 = r10.b()
            acgu r10 = (defpackage.acgu) r10
            r2 = 32
            r10.a(r2)
            aisp r10 = r7.k
            r2 = 176581(0x2b1c5, float:2.47443E-40)
            aisq r10 = defpackage.aiso.b(r10, r2)
            java.lang.Object r2 = defpackage.fcva.N(r8)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r2 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r2
            aobr r2 = r2.m()
            aobo r2 = (defpackage.aobo) r2
            int r2 = r2.d
            r7.j(r2, r9, r4)
            fcyh r9 = r7.m
            fcyh r9 = defpackage.eicg.a(r9)
            cswq r2 = new cswq
            r2.<init>(r3, r7, r8)
            r0.d = r10
            r0.c = r5
            java.lang.Object r8 = defpackage.fdin.a(r9, r2, r0)
            if (r8 == r1) goto L94
            r6 = r10
            r10 = r8
            r8 = r6
        L75:
            r10.getClass()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 == 0) goto L84
            r8.b()
            return r10
        L84:
            r9 = 3
            defpackage.aisz.a(r8, r3, r9)
            android.content.Context r8 = r7.d
            java.lang.String r9 = "Error making video call."
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r9, r4)
            r8.show()
            return r10
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cswx.a(ekgb, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, fcxy):java.lang.Object");
    }

    @Override // defpackage.csyj
    public final Object b(ekgb ekgbVar, ajlk ajlkVar, fcxy fcxyVar) {
        if (!ekgbVar.isEmpty() && !ajlkVar.i().g()) {
            csyl csylVar = this.f;
            if (!csylVar.b.isPresent() && Settings.Global.getInt(csylVar.a.getContentResolver(), "vt_ims_enabled", 1) == 1) {
                return fdin.a(eicg.a(this.l), new cswp(null, ekgbVar), fcxyVar);
            }
        }
        return false;
    }

    @Override // defpackage.csyj
    public final Object c(ResolvedRecipient resolvedRecipient, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.l), new csws(null, this, resolvedRecipient), fcxyVar);
    }

    @Override // defpackage.csyj
    public final Object d(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.l), new cswt(null, this), fcxyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.List r5, defpackage.fcxy r6) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cswx.e(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.csyj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ekgb r7, defpackage.ekgb r8, defpackage.ajlk r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cswx.f(ekgb, ekgb, ajlk, fcxy):java.lang.Object");
    }

    @Override // defpackage.csyj
    public final Object g(ResolvedRecipient resolvedRecipient, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.l), new csww(null, this, resolvedRecipient), fcxyVar);
    }

    @Override // defpackage.csyj
    public final void h(ResolvedRecipient resolvedRecipient, ConversationId conversationId) throws IOException {
        aisq aisqVarB = this.k.b(176581, null);
        Uri uriFromParts = Uri.fromParts("tel", resolvedRecipient.g().p(true), null);
        Intent intentA = aiiw.d("android.intent.action.CALL").a();
        intentA.getClass();
        intentA.setData(uriFromParts);
        intentA.putExtra("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", 3);
        intentA.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        j(((aobo) resolvedRecipient.m()).d, conversationId, true);
        try {
            aisqVarB.b();
            eiid.o(this.d, intentA);
        } catch (ActivityNotFoundException unused) {
            aisz.a(aisqVarB, null, 3);
            Toast.makeText(this.d, "Error making LTE video call.", 0).show();
        }
    }
}
