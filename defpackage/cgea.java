package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgea {
    public final Context a;
    public final cqzr b;
    public final clgq c;
    private final cgei d;

    public cgea(Context context, cqzr cqzrVar, clgq clgqVar, cgei cgeiVar) {
        this.a = context;
        this.b = cqzrVar;
        this.c = clgqVar;
        this.d = cgeiVar;
    }

    final cgeh a(final cgdx cgdxVar) {
        return this.d.b(new cgeg() { // from class: cgdy
            @Override // defpackage.cgeg
            public final Notification a(String str) throws Resources.NotFoundException {
                cgea cgeaVar = this.a;
                Context context = cgeaVar.a;
                Resources resources = context.getResources();
                kvq kvqVar = new kvq(context, str);
                String string = resources.getString(R.string.report_issue_notification_text);
                cgdx cgdxVar2 = cgdxVar;
                cgav cgavVar = (cgav) cgdxVar2;
                String str2 = (String) cgavVar.b.orElse(string);
                kvqVar.h(str2);
                kvqVar.w(str2);
                kvj kvjVar = new kvj(kvqVar);
                kvjVar.e(str2);
                kvqVar.u(kvjVar);
                kvqVar.l = 3;
                kvqVar.r(R.drawable.notification_icon);
                clgq clgqVar = cgeaVar.c;
                emgm emgmVar = cgavVar.a;
                kvqVar.k(clgqVar.a(emgmVar));
                Bundle bundle = new Bundle();
                bundle.putInt("issue_type_extra", emgmVar.o);
                kvqVar.B = bundle;
                kvqVar.g = clgqVar.b(cgdxVar2);
                return kvqVar.a();
            }
        }, cgbe.REPORT_ISSUE, new cgda() { // from class: cgdz
            @Override // defpackage.cgda
            public final NotificationChannel a() {
                return this.a.b.d();
            }
        });
    }
}
