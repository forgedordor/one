package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import com.google.android.apps.messaging.R;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csca {
    static final cczi a = cdag.e(cdag.b, "spam_auto_reply_time_seconds", 600);
    static final cczi b = cdag.h(cdag.b, "disable_logging_spam_auto_reply_conversation_observer", false);
    public final fcsu c;
    public final Context d;
    public final aypg e;
    public final cogw f;
    public final ains g;
    public final bveg h;
    public final Object i = new Object();
    public ContentObserver j = null;
    public long k;
    public final Pattern l;

    public csca(fcsu fcsuVar, Context context, aypg aypgVar, cogw cogwVar, ains ainsVar, bveg bvegVar) throws Resources.NotFoundException {
        this.c = fcsuVar;
        this.d = context;
        this.e = aypgVar;
        this.f = cogwVar;
        this.g = ainsVar;
        this.h = bvegVar;
        Resources resources = context.getResources();
        this.l = Pattern.compile("(?=.*" + resources.getString(R.string.spam_auto_reply_heuristic_reply) + ")((?=.*" + resources.getString(R.string.spam_auto_reply_heuristic_number) + ")|(?=.*#)).+", 2);
    }

    public final void a(ContentObserver contentObserver) {
        this.d.getContentResolver().unregisterContentObserver(contentObserver);
    }
}
