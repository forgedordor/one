package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackActivity;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ackz extends acld {
    public final AdvancedFeedbackActivity a;
    public File b;
    public abs c;
    public int d = 1;

    public ackz(AdvancedFeedbackActivity advancedFeedbackActivity) {
        this.a = advancedFeedbackActivity;
    }

    public final void a() {
        aclj acljVarA = aclj.a();
        cg cgVar = new cg(this.a.a());
        cgVar.E(R.anim.enter, R.anim.exit);
        cgVar.D(R.id.advanced_feedback_fragment_container, acljVarA);
        cgVar.c();
        this.d = 1;
        acljVarA.H().d();
    }
}
