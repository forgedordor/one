package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.apps.messaging.ui.conversation.LaunchConversationShimActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cvmz extends Activity implements eyhy {
    private volatile eyhb a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.eyhy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eyhb ba() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new eyhb(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!this.c) {
            this.c = true;
            LaunchConversationShimActivity launchConversationShimActivity = (LaunchConversationShimActivity) this;
            ahhk ahhkVar = (ahhk) bb();
            launchConversationShimActivity.a = (avmp) ahhkVar.b.a.Jm.b();
            launchConversationShimActivity.b = ahhkVar.c.aF;
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        return ba().b.bb();
    }
}
