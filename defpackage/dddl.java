package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dddl {
    public static String a(Activity activity) {
        ViewGroup viewGroup;
        String string = activity.getTitle().toString();
        int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
        if (identifier != 0 && (viewGroup = (ViewGroup) activity.findViewById(identifier)) != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof TextView) {
                    return ((TextView) childAt).getText().toString();
                }
            }
        }
        return string;
    }
}
