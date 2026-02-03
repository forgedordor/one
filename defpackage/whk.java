package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.navigation.targets.EditedMedia;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class whk {
    private final afzc a;
    private final ekrg b;

    public whk(afzc afzcVar, vuc vucVar) {
        afzcVar.getClass();
        vucVar.getClass();
        this.a = afzcVar;
        this.b = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DirectSendViewer");
    }

    private static final vvp b(dltn dltnVar, EditedMedia editedMedia) {
        if (editedMedia != null) {
            Uri uri = editedMedia.b;
            if (!fdbq.f(uri.toString(), dltnVar.f())) {
                doig doigVarA = dohx.a(editedMedia.a);
                if (doigVarA != null) {
                    return new vvo(vuc.a(), doigVarA, uri, null, dltnVar.fo());
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return new vvn(vuc.a(), dltnVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dltn r11, java.lang.String r12, boolean r13, boolean r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.whj
            if (r0 == 0) goto L13
            r0 = r15
            whj r0 = (defpackage.whj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            whj r0 = new whj
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r11 = r0.a
            defpackage.fctl.b(r15)
            goto L60
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            defpackage.fctl.b(r15)
            agcn r4 = new agcn
            java.lang.String r15 = r11.f()
            android.net.Uri r5 = android.net.Uri.parse(r15)
            r5.getClass()
            doig r15 = r11.b()
            java.lang.String r6 = r15.a()
            if (r3 == r13) goto L4e
            r13 = 2
            r7 = r13
            goto L4f
        L4e:
            r7 = r3
        L4f:
            r8 = r12
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            afzc r12 = r10.a
            r0.a = r11
            r0.d = r3
            java.lang.Object r15 = r12.f(r4, r0)
            if (r15 == r1) goto Lc0
        L60:
            com.google.android.apps.messaging.navigation.targets.DirectSendResult r15 = (com.google.android.apps.messaging.navigation.targets.DirectSendResult) r15
            if (r15 != 0) goto L84
            ekrg r11 = r10.b
            ekrw r11 = r11.h()
            r12 = 58
            java.lang.String r13 = "DirectSendViewer.kt"
            java.lang.String r14 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DirectSendViewer"
            java.lang.String r15 = "openDirectSendViewer"
            ekrw r11 = r11.h(r14, r15, r12, r13)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r12 = "Null Direct Send Viewer result."
            r11.q(r12)
            whg r11 = new whg
            r12 = 0
            r11.<init>(r12)
            return r11
        L84:
            boolean r12 = r15 instanceof com.google.android.apps.messaging.navigation.targets.DirectSendResult.Send
            if (r12 == 0) goto L98
            whh r12 = new whh
            com.google.android.apps.messaging.navigation.targets.DirectSendResult$Send r15 = (com.google.android.apps.messaging.navigation.targets.DirectSendResult.Send) r15
            com.google.android.apps.messaging.navigation.targets.EditedMedia r13 = r15.a
            vvp r11 = b(r11, r13)
            java.lang.String r13 = r15.b
            r12.<init>(r11, r13)
            return r12
        L98:
            boolean r12 = r15 instanceof com.google.android.apps.messaging.navigation.targets.DirectSendResult.Add
            if (r12 == 0) goto Lac
            whf r12 = new whf
            com.google.android.apps.messaging.navigation.targets.DirectSendResult$Add r15 = (com.google.android.apps.messaging.navigation.targets.DirectSendResult.Add) r15
            com.google.android.apps.messaging.navigation.targets.EditedMedia r13 = r15.a
            vvp r11 = b(r11, r13)
            java.lang.String r13 = r15.b
            r12.<init>(r11, r13)
            return r12
        Lac:
            boolean r11 = r15 instanceof com.google.android.apps.messaging.navigation.targets.DirectSendResult.Discard
            if (r11 == 0) goto Lba
            whg r11 = new whg
            com.google.android.apps.messaging.navigation.targets.DirectSendResult$Discard r15 = (com.google.android.apps.messaging.navigation.targets.DirectSendResult.Discard) r15
            java.lang.String r12 = r15.a
            r11.<init>(r12)
            return r11
        Lba:
            fctg r11 = new fctg
            r11.<init>()
            throw r11
        Lc0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whk.a(dltn, java.lang.String, boolean, boolean, fcxy):java.lang.Object");
    }
}
