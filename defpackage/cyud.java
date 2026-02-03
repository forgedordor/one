package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyud implements cyum {
    private final Context a;

    public cyud(Context context) {
        this.a = context;
    }

    @Override // defpackage.cyum
    public final Drawable a(Object obj) throws XmlPullParserException, Resources.NotFoundException, IOException {
        eegx eegxVarH = eegx.h(this.a, R.xml.chip);
        eegxVarH.p(obj.toString());
        eegxVarH.setBounds(0, 0, eegxVarH.getIntrinsicWidth(), eegxVarH.getIntrinsicHeight());
        return eegxVarH;
    }

    @Override // defpackage.cyum
    public final boolean d(Object obj) {
        return true;
    }

    @Override // defpackage.cyum
    public final void b() {
    }

    @Override // defpackage.cyum
    public final void c(View view) {
    }
}
