package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.AudioButtonView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvkb implements crmf {
    final /* synthetic */ AudioButtonView a;

    public cvkb(AudioButtonView audioButtonView) {
        this.a = audioButtonView;
    }

    @Override // defpackage.crmf
    public final void a() {
        this.a.r.i(R.string.microphone_permission_denied_text);
    }

    @Override // defpackage.crmf
    public final void b() {
        this.a.c();
    }

    @Override // defpackage.crmf
    public final /* synthetic */ boolean c() {
        return true;
    }
}
