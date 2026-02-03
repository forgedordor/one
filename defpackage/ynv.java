package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ynv implements ykl {
    private final Context a;
    private final aqkb b;

    public ynv(Context context, aqkb aqkbVar) {
        context.getClass();
        this.a = context;
        this.b = aqkbVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ dkgq a(ykp ykpVar) {
        dilm dikzVar;
        ynu ynuVar = (ynu) ykpVar;
        String strB = ynuVar.b.b();
        strB.getClass();
        ynn.a(strB);
        if (le.z(strB)) {
            String string = this.a.getString(R.string.message_bubble_failure_video);
            string.getClass();
            dikzVar = new dili(string, null, ynuVar.d, 6);
        } else if (le.m(strB)) {
            String string2 = this.a.getString(R.string.message_bubble_failure_image);
            string2.getClass();
            dikzVar = new dile(string2, null, ynuVar.d, 6);
        } else {
            String string3 = this.a.getString(R.string.message_bubble_permanent_failure_media);
            string3.getClass();
            dikzVar = new dikz(string3, ynuVar.d);
        }
        return new diot(dikzVar, new dios(ynuVar.a, this.b.a()), ynuVar.d, ynuVar.c, (fdae) null, 48);
    }
}
