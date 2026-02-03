package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvta implements tdg {
    public final Context a;
    public final fcyh b;
    public final fdjx c;
    public final ConversationId d;
    public final aaft e;
    public final cvtf f;
    private final cqce g;

    public cvta(Context context, fcyh fcyhVar, fdjx fdjxVar, ConversationId conversationId, cvtf cvtfVar, aaft aaftVar) {
        context.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        conversationId.getClass();
        aaftVar.getClass();
        this.a = context;
        this.b = fcyhVar;
        this.c = fdjxVar;
        this.d = conversationId;
        this.f = cvtfVar;
        this.e = aaftVar;
        this.g = cqce.g("Bugle", "UnblockUnspamBanner2");
    }

    @Override // defpackage.tdg
    public final fdvc a() {
        cvtf cvtfVar = this.f;
        return egwx.a(fdqc.b(new fdua(cvtfVar.a, cvtfVar.b, new cvtc(cvtfVar, null)), this.b), this.c, new cvsr(this));
    }

    @Override // defpackage.tdg
    public final boolean b() {
        return true;
    }

    public final tdo c(boolean z, final ResolvedRecipient resolvedRecipient) {
        String string;
        String string2;
        if (z) {
            Context context = this.a;
            string = context.getString(R.string.unspam_banner_title_v2);
            string.getClass();
            string2 = context.getString(R.string.unspam_banner_body_v3);
            string2.getClass();
        } else {
            Context context2 = this.a;
            string = context2.getString(R.string.unspam_detected_title_v2);
            string.getClass();
            string2 = context2.getString(R.string.unspam_detected_body_v2);
            string2.getClass();
        }
        String str = string2;
        tdr tdrVar = new tdr();
        String string3 = this.a.getString(R.string.unspam_banner_end_button);
        string3.getClass();
        return new tdo("unblock_unspam_banner", string, str, tdrVar, new tdk(string3, new fdae() { // from class: cvso
            @Override // defpackage.fdae
            public final Object invoke() {
                cvta cvtaVar = this.a;
                auvw.k(cvtaVar.c, cvtaVar.b, null, new cvss(cvtaVar, resolvedRecipient, null), 2);
                return fctx.a;
            }
        }), null, false, null, null, 1568);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvta.d(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, fcxy):java.lang.Object");
    }
}
