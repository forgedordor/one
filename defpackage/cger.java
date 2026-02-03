package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cger extends cgan {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final cgbn d;
    public final fcsu e;
    public ConversationIdType f;
    public ConversationId g;
    public int h;
    public int i;
    public String j;
    public long k;
    public long l;
    public long m;
    public boolean n;
    private final Context o;
    private final cgcz r;
    private final clgq s;
    private final cqzr t;
    private final fcsu u;

    public cger(Context context, cgaz cgazVar, fcsu fcsuVar, fcsu fcsuVar2, cgcz cgczVar, fcsu fcsuVar3, clgq clgqVar, cqzr cqzrVar, cgbn cgbnVar, fcsu fcsuVar4, fcsu fcsuVar5) {
        super(cgazVar.a(cgbe.STUCK_MESSAGES));
        this.f = barn.a;
        this.g = InvalidConversationId.a;
        this.j = "";
        this.o = context;
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.r = cgczVar;
        this.c = fcsuVar3;
        this.s = clgqVar;
        this.t = cqzrVar;
        this.d = cgbnVar;
        this.e = fcsuVar4;
        this.u = fcsuVar5;
    }

    private static String e(long j) {
        return j <= 0 ? "zero" : j == 1 ? "one" : "multiple";
    }

    @Override // defpackage.cgan, defpackage.cgbf
    public final Notification b() throws Resources.NotFoundException {
        String string;
        Context context = this.o;
        Resources resources = context.getResources();
        int i = this.h;
        int i2 = this.i;
        fcsu fcsuVar = this.u;
        String str = this.j;
        boolean zA = ((cgfb) fcsuVar.b()).a().a();
        String quantityString = resources.getQuantityString(R.plurals.stuck_in_sending_notification_title, i);
        if (zA) {
            string = resources.getString(R.string.stuck_in_sending_notification_text_satellite);
        } else if (i2 == 1) {
            str.getClass();
            string = resources.getQuantityString(R.plurals.stuck_in_sending_notification_text_beta, i, Integer.valueOf(i), str);
        } else {
            string = resources.getString(R.string.stuck_in_sending_notification_text_multiple_conversations_beta, String.valueOf(i));
        }
        cgaw cgawVar = new cgaw(quantityString, string);
        kvq kvqVar = new kvq(context, this.t.d().getId());
        String str2 = cgawVar.a;
        kvqVar.i(str2);
        String str3 = cgawVar.b;
        kvqVar.h(str3);
        kvj kvjVar = new kvj();
        kvjVar.e(str3);
        kvqVar.u(kvjVar);
        kvqVar.w(str2);
        kvqVar.r(R.drawable.notification_icon);
        cgcz cgczVar = this.r;
        kvqVar.e(cgczVar.b(this.h, this.f, this.g));
        emgm emgmVar = emgm.MESSAGE_STUCK_IN_SENDING;
        kvqVar.e(cgczVar.a(emgmVar));
        kvqVar.l = 2;
        clgq clgqVar = this.s;
        kvqVar.k(clgqVar.a(emgmVar));
        kvqVar.p(true);
        kvqVar.C = context.getColor(R.color.primary_brand_non_icon_color);
        kvqVar.g = clgqVar.c(emgmVar, ekgp.n("stuckSms", e(this.k), "stuckMms", e(this.l), "stuckRcs", e(this.m)));
        return kvqVar.a();
    }

    @Override // defpackage.cgan, defpackage.cgbf
    public final String d() {
        return "stuck_messages_notification_tag";
    }
}
