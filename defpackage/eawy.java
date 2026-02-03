package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eawy {
    public static final void a(Context context) {
        try {
            aky akyVar = new aky();
            akyVar.f(Color.parseColor("#eeeeee"));
            akyVar.a().a(context, Uri.parse("https://www.google.com/policies/privacy/"));
        } catch (ActivityNotFoundException unused) {
            throw new eawx();
        }
    }
}
