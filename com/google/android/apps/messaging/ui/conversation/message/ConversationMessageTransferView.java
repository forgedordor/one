package com.google.android.apps.messaging.ui.conversation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import defpackage.baea;
import defpackage.baeb;
import defpackage.cvjl;
import defpackage.cwlc;
import defpackage.cwlx;
import defpackage.dalo;
import defpackage.eigp;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationMessageTransferView extends cwlx {
    public baea a;
    public cwlc b;
    public baeb c;
    public dalo d;
    public cvjl e;
    public eigp f;
    public fcsu g;
    public fcsu h;
    private ViewGroup i;
    private ImageView j;
    private final int k;

    public ConversationMessageTransferView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.conversation_message_transfer_view, this);
        this.k = getResources().getDimensionPixelSize(R.dimen.message_transfer_attachment_padding);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int d() {
        /*
            r4 = this;
            baea r0 = r4.a
            int r0 = r0.e()
            r1 = 24
            r2 = 0
            if (r0 == r1) goto L66
            r1 = 210(0xd2, float:2.94E-43)
            if (r0 == r1) goto L66
            r1 = 243(0xf3, float:3.4E-43)
            if (r0 == r1) goto L66
            switch(r0) {
                case 1: goto L66;
                case 2: goto L66;
                case 3: goto L39;
                case 4: goto L39;
                case 5: goto L39;
                case 6: goto L39;
                case 7: goto L39;
                case 8: goto L35;
                case 9: goto L35;
                case 10: goto L39;
                case 11: goto L66;
                case 12: goto L35;
                case 13: goto L35;
                case 14: goto L66;
                case 15: goto L66;
                case 16: goto L66;
                case 17: goto L66;
                case 18: goto L66;
                case 19: goto L66;
                case 20: goto L39;
                case 21: goto L66;
                case 22: goto L66;
                default: goto L16;
            }
        L16:
            switch(r0) {
                case 100: goto L66;
                case 101: goto L31;
                case 102: goto L39;
                case 103: goto L39;
                case 104: goto L39;
                case 105: goto L39;
                case 106: goto L31;
                case 107: goto L35;
                case 108: goto L66;
                case 109: goto L66;
                case 110: goto L31;
                case 111: goto L35;
                case 112: goto L35;
                case 113: goto L30;
                case 114: goto L30;
                case 115: goto L31;
                case 116: goto L30;
                default: goto L19;
            }
        L19:
            baea r0 = r4.a
            int r0 = r0.e()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "unknown status "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.cqaz.c(r0)
        L30:
            return r2
        L31:
            r0 = 2131232252(0x7f0805fc, float:1.8080608E38)
            return r0
        L35:
            r0 = 2131232208(0x7f0805d0, float:1.8080519E38)
            return r0
        L39:
            baea r0 = r4.a
            boolean r0 = r0.ag()
            if (r0 == 0) goto L56
            baea r0 = r4.a
            boolean r0 = r0.ah()
            if (r0 != 0) goto L52
            baea r0 = r4.a
            boolean r0 = r0.ap()
            if (r0 != 0) goto L52
            goto L56
        L52:
            r0 = 2131231766(0x7f080416, float:1.8079622E38)
            return r0
        L56:
            baea r0 = r4.a
            boolean r0 = r0.ao()
            if (r0 == 0) goto L62
            r0 = 2131232320(0x7f080640, float:1.8080746E38)
            return r0
        L62:
            r0 = 2131232270(0x7f08060e, float:1.8080645E38)
            return r0
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversation.message.ConversationMessageTransferView.d():int");
    }

    private final int e() {
        return (this.a.ag() && this.a.ah()) ? R.string.stop_send_description : this.b != null ? this.d.c(this.a.b(), this.a.p()) ? this.a.R() ? R.string.waiting_to_connect_tap_for_options : R.string.message_status_waiting_for_connection : this.a.Q() ? R.string.message_status_rcs_stuck_in_sending_hint : R.string.message_status_sending : R.string.message_status_sending;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.baea r9) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversation.message.ConversationMessageTransferView.a(baea):void");
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = this.c.a();
        this.i = (ViewGroup) findViewById(R.id.icon_container);
        this.j = (ImageView) findViewById(R.id.icon);
    }
}
