package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctev extends cteo {
    public cgbn ag;
    public cmqa ah;
    public cavd ai;
    public cmpz aj;
    public axpe ak;
    private String al;

    public final void aX() {
        G().finish();
    }

    @Override // defpackage.dn
    public final Dialog gK(Bundle bundle) {
        this.aj = this.ah.a();
        this.al = this.ah.b(z(), this.aj);
        AlertDialog.Builder builder = new AlertDialog.Builder(G());
        final int i = this.m.getInt("action_index");
        if (i < 0 || i > 1) {
            return builder.create();
        }
        builder.setTitle(R.string.low_storage_space_notification_and_dialog_title).setMessage(i != 0 ? Z(R.string.delete_oldest_messages_confirmation, this.al) : Z(R.string.delete_all_media_confirmation, this.al)).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: ctet
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ctev ctevVar = this.a;
                ctevVar.hh();
                ctevVar.aX();
            }
        }).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: cteu
            /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.content.DialogInterface r8, int r9) {
                /*
                    r7 = this;
                    ctev r8 = r7.a
                    r8.hh()
                    cmpz r9 = r8.aj
                    long r0 = defpackage.cmqa.a
                    int r0 = r9.b
                    r1 = 109(0x6d, float:1.53E-43)
                    if (r0 == r1) goto L26
                    r1 = 119(0x77, float:1.67E-43)
                    if (r0 == r1) goto L20
                    r1 = 121(0x79, float:1.7E-43)
                    if (r0 == r1) goto L1a
                    r0 = -1
                    goto L2c
                L1a:
                    int r9 = r9.a
                    long r0 = (long) r9
                    long r2 = defpackage.cmqa.c
                    goto L2b
                L20:
                    int r9 = r9.a
                    long r0 = (long) r9
                    long r2 = defpackage.cmqa.a
                    goto L2b
                L26:
                    int r9 = r9.a
                    long r0 = (long) r9
                    long r2 = defpackage.cmqa.b
                L2b:
                    long r0 = r0 * r2
                L2c:
                    int r9 = r2
                    r2 = 2
                    r3 = 1
                    if (r9 == 0) goto L7a
                    cczv r9 = defpackage.ctew.a
                    java.lang.Object r9 = r9.e()
                    java.lang.Boolean r9 = (java.lang.Boolean) r9
                    boolean r9 = r9.booleanValue()
                    if (r9 == 0) goto L70
                    cavd r9 = r8.ai
                    cavc r4 = defpackage.cavc.a
                    evsf r4 = r4.createBuilder()
                    cavb r4 = (defpackage.cavb) r4
                    r4.copyOnWrite()
                    MessageType extends evsn<MessageType, BuilderType> r5 = r4.instance
                    cavc r5 = (defpackage.cavc) r5
                    r5.c = r3
                    int r6 = r5.b
                    r3 = r3 | r6
                    r5.b = r3
                    r4.copyOnWrite()
                    MessageType extends evsn<MessageType, BuilderType> r3 = r4.instance
                    cavc r3 = (defpackage.cavc) r3
                    int r5 = r3.b
                    r2 = r2 | r5
                    r3.b = r2
                    r3.d = r0
                    evsn r0 = r4.build()
                    cavc r0 = (defpackage.cavc) r0
                    r9.a(r0)
                    goto Lc2
                L70:
                    axpe r9 = r8.ak
                    com.google.android.apps.messaging.shared.datamodel.action.HandleLowStorageAction r9 = r9.b(r2, r0)
                    r9.s()
                    goto Lc2
                L7a:
                    cczv r9 = defpackage.ctew.a
                    java.lang.Object r9 = r9.e()
                    java.lang.Boolean r9 = (java.lang.Boolean) r9
                    boolean r9 = r9.booleanValue()
                    if (r9 == 0) goto Lb9
                    cavd r9 = r8.ai
                    cavc r4 = defpackage.cavc.a
                    evsf r4 = r4.createBuilder()
                    cavb r4 = (defpackage.cavb) r4
                    r4.copyOnWrite()
                    MessageType extends evsn<MessageType, BuilderType> r5 = r4.instance
                    cavc r5 = (defpackage.cavc) r5
                    r6 = 0
                    r5.c = r6
                    int r6 = r5.b
                    r3 = r3 | r6
                    r5.b = r3
                    r4.copyOnWrite()
                    MessageType extends evsn<MessageType, BuilderType> r3 = r4.instance
                    cavc r3 = (defpackage.cavc) r3
                    int r5 = r3.b
                    r2 = r2 | r5
                    r3.b = r2
                    r3.d = r0
                    evsn r0 = r4.build()
                    cavc r0 = (defpackage.cavc) r0
                    r9.a(r0)
                    goto Lc2
                Lb9:
                    axpe r9 = r8.ak
                    com.google.android.apps.messaging.shared.datamodel.action.HandleLowStorageAction r9 = r9.b(r3, r0)
                    r9.s()
                Lc2:
                    r8.aX()
                    cgbn r8 = r8.ag
                    r8.i()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cteu.onClick(android.content.DialogInterface, int):void");
            }
        });
        return builder.create();
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        aX();
    }
}
