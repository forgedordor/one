package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ynz implements ykl {
    public final Context a;
    public final ahax b;
    private final aqkb c;

    public ynz(Context context, ahax ahaxVar, aqkb aqkbVar) {
        context.getClass();
        ahaxVar.getClass();
        this.a = context;
        this.b = ahaxVar;
        this.c = aqkbVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ dkgq a(ykp ykpVar) {
        Context context = this.a;
        yob yobVar = (yob) ykpVar;
        String string = context.getString(R.string.message_bubble_satellite_failure_media);
        string.getClass();
        String str = yobVar.b;
        return new diot(new dikz(string, context.getString(R.string.message_bubble_more_info_subtitle), str), new dios(yobVar.c, this.c.a()), str, yobVar.a, new fdae() { // from class: ynw
            @Override // defpackage.fdae
            public final Object invoke() {
                final ynz ynzVar = this.a;
                ynzVar.b.d(true, new fdap() { // from class: ynx
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ahat ahatVar = (ahat) obj;
                        ahatVar.getClass();
                        Context context2 = ynzVar.a;
                        String string2 = context2.getString(R.string.message_bubble_satellite_failure_media_popup_title);
                        string2.getClass();
                        String string3 = context2.getString(R.string.message_bubble_satellite_failure_media_popup_body);
                        fcvo fcvoVar = fcvo.a;
                        String string4 = context2.getString(R.string.message_bubble_satellite_failure_media_popup_dismiss);
                        string4.getClass();
                        return new djmn(string2, fcvoVar, null, string3, null, null, null, new dktq(string4, new yny(ahatVar)), null, 372);
                    }
                });
                return true;
            }
        }, 32);
    }
}
