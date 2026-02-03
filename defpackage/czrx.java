package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.rcs.setup.RcsWelcomeMessageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czrx {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/rcs/setup/RcsWelcomeMessageViewPeer");
    public czrt b;
    public final TextView c;
    public final TextView d;
    public final RcsWelcomeMessageView e;
    public final fcsu f;
    public final fcsu g;

    public czrx(RcsWelcomeMessageView rcsWelcomeMessageView, fcsu fcsuVar, fcsu fcsuVar2) {
        this.e = rcsWelcomeMessageView;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        LayoutInflater.from(rcsWelcomeMessageView.getContext()).inflate(R.layout.rcs_welcome_message_view_m2, (ViewGroup) rcsWelcomeMessageView, true);
        this.c = (TextView) rcsWelcomeMessageView.findViewById(R.id.rcs_welcome_message_title);
        TextView textView = (TextView) rcsWelcomeMessageView.findViewById(R.id.rcs_welcome_message_message);
        this.d = textView;
        eebt.b(textView);
        eebt.c(textView);
    }
}
