package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.ui.conversationlist.ShareIntentActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwvx implements cwwj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/conversationlist/ShareIntentActivityPeer");
    public final ShareIntentActivity b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final eygg f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private ComposeRowState n;

    public cwvx(ShareIntentActivity shareIntentActivity, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, eygg eyggVar, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10) {
        this.b = shareIntentActivity;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.j = fcsuVar4;
        this.k = fcsuVar5;
        this.l = fcsuVar6;
        this.f = eyggVar;
        this.g = fcsuVar7;
        this.h = fcsuVar8;
        this.m = fcsuVar9;
        this.i = fcsuVar10;
    }

    @Override // defpackage.cwwj
    public final int a() {
        return R.string.share_intent_activity_label;
    }

    @Override // defpackage.cwwj
    public final void b(badt badtVar) {
        e(0, new BugleConversationId(badtVar.J()), null, badtVar.g());
        this.b.finish();
    }

    @Override // defpackage.cwwj
    public final void c() {
        e(1, InvalidConversationId.a, 2, null);
        this.b.finish();
    }

    public final void d(Intent intent) {
        try {
            this.n = avnr.a(((batn) this.j.b()).b(intent), null);
        } catch (batm unused) {
            this.n = null;
            ((dain) this.l.b()).c(R.string.attachment_load_failed_dialog_message, false);
            ShareIntentActivity shareIntentActivity = this.b;
            shareIntentActivity.setResult(0);
            shareIntentActivity.finish();
        }
    }

    public final void e(int i, ConversationId conversationId, Integer num, bajg bajgVar) {
        ((ajfx) this.m.b()).a(ajfs.a, 0);
        avmp avmpVar = (avmp) this.e.b();
        ShareIntentActivity shareIntentActivity = this.b;
        if (avmpVar.B(shareIntentActivity, i, conversationId, this.n, num, bajgVar)) {
            return;
        }
        ((dakl) this.k.b()).i(R.string.attachment_load_failed_dialog_message);
        shareIntentActivity.setResult(0);
        shareIntentActivity.finish();
    }
}
