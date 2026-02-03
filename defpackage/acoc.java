package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acoc {
    public static void a(eg egVar, efzk efzkVar, String str, cdpg cdpgVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("conversation_list_mode", cdpgVar.d);
        acom acomVarA = acom.a(efzkVar.a());
        acomVarA.at(bundle);
        cg cgVar = new cg(egVar.a());
        cgVar.x(R.id.home_fragment_container, acomVarA, str);
        cgVar.c();
    }

    public static void b(Activity activity, Toolbar toolbar, im imVar, int i) {
        View viewFindViewById = toolbar.findViewById(R.id.lockup);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        cukg.c(activity, imVar, i);
        imVar.setHomeActionContentDescription(activity.getResources().getString(R.string.navigate_up_button_content_description));
        imVar.setDisplayShowTitleEnabled(true);
        imVar.setDisplayHomeAsUpEnabled(true);
        imVar.setHomeAsUpIndicator((Drawable) null);
        imVar.show();
    }
}
