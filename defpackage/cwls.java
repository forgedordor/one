package defpackage;

import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwls {
    public final Optional a;

    public cwls(Optional optional) {
        this.a = optional;
    }

    public static int a(ConversationMessageView conversationMessageView, int i, int i2, int i3, int i4) {
        int[] iArr = new int[2];
        conversationMessageView.getLocationInWindow(iArr);
        int i5 = i + i4;
        int iMax = i5 + Math.max(-(iArr[1] + i5), 0);
        return iMax + i3 > i2 ? i2 - i3 : iMax;
    }
}
