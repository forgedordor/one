package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajfe {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/analytics/statistics/DuplicateMessageChecker");
    public static final Set b = fcwm.d(3, 0, 1);
    public final fcsu c;
    public final fcsu d;
    private final fdjx e;

    public ajfe(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.e = fdjxVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
    }

    public final eiju a(MessageCoreData messageCoreData) {
        return auvw.c(this.e, fcyi.a, fdjz.a, new ajfd(this, messageCoreData, null));
    }
}
