package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgds extends cgan {
    public static final eksp a = eksp.c("BugleNotifications");
    public final cgbn b;
    public final fcsu c;
    public final ains d;
    public final cgdh e;
    public final fcsu f;
    public Optional g;
    public ConversationIdType h;
    ConversationId i;
    public int j;
    public int k;
    public boolean l;
    private final Context m;
    private final avmp n;
    private final fcsu o;

    public cgds(Context context, cgaz cgazVar, avmp avmpVar, fcsu fcsuVar, ains ainsVar, cgdh cgdhVar, cgbn cgbnVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        super(cgazVar.a(cgbe.RCS_STILL_SENDING));
        this.h = barn.a;
        this.i = InvalidConversationId.a;
        this.m = context;
        this.b = cgbnVar;
        this.n = avmpVar;
        this.c = fcsuVar;
        this.d = ainsVar;
        this.e = cgdhVar;
        this.f = fcsuVar2;
        this.o = fcsuVar3;
    }

    private final boolean e() {
        return ((cgfb) this.o.b()).a().b();
    }

    @Override // defpackage.cgan, defpackage.cgbf
    public final Notification b() throws Resources.NotFoundException {
        String quantityString;
        String strB = e() ? qxq.b(this.m, R.string.rcs_still_sending_notification_title_satellite, "count", Integer.valueOf(this.k)) : qxq.b(this.m, R.string.rcs_still_sending_notification_title_v2, "count", Integer.valueOf(this.k));
        if (e()) {
            quantityString = this.m.getString(R.string.stuck_in_sending_notification_text_satellite);
        } else if (this.j == 1) {
            quantityString = this.m.getResources().getString(R.string.rcs_still_sending_notification_text_singular, this.g.get());
        } else {
            Resources resources = this.m.getResources();
            int i = this.j;
            quantityString = resources.getQuantityString(R.plurals.rcs_still_sending_notification_text_plural, i, Integer.valueOf(i));
        }
        Context context = this.m;
        kvq kvqVar = new kvq(context, o());
        PendingIntent pendingIntentR = this.j == 1 ? this.n.r(context, this.i) : this.n.c(context);
        pendingIntentR.getClass();
        kvqVar.g = pendingIntentR;
        kvqVar.i(strB);
        kvqVar.h(quantityString);
        kvqVar.w(strB);
        kvj kvjVar = new kvj();
        kvjVar.e(quantityString);
        kvqVar.u(kvjVar);
        kvqVar.r(R.drawable.notification_icon);
        kvqVar.C = context.getColor(R.color.primary_brand_non_icon_color);
        kvqVar.g(true);
        kvqVar.p(true);
        return kvqVar.a();
    }

    @Override // defpackage.cgan, defpackage.cgbf
    public final String d() {
        return "rcs_still_sending_notification_tag";
    }
}
