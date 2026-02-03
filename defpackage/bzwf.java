package defpackage;

import android.app.Notification;
import com.google.android.apps.messaging.R;
import defpackage.bzwa;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzwf {
    public static final caao a(caai caaiVar, bzwa bzwaVar, int i, boolean z) {
        evuo parserForType = byjb.a.getParserForType();
        parserForType.getClass();
        int iIntValue = ((Number) cpyl.e.e()).intValue() + 1;
        pzh pzhVar = new pzh();
        pzhVar.c(i);
        pzhVar.c = z;
        pzj pzjVarA = pzhVar.a();
        pza pzaVar = pza.a;
        long jLongValue = ((Number) caao.b.e()).longValue();
        caze cazeVar = caze.WORKMANAGER_ONLY;
        Optional optionalEmpty = Optional.empty();
        caat caatVar = new caat();
        cden cdenVar = caaiVar.e;
        apqc apqcVar = caaiVar.g;
        axlf axlfVar = caaiVar.f;
        return new caao(caaiVar.b, pzjVarA, caaiVar.a, caatVar, bzzy.class, axlfVar, bzwaVar, bzwa.a.class, parserForType, pzaVar, apqcVar, iIntValue, jLongValue, cazeVar, optionalEmpty, null, cdenVar);
    }

    public static final caao b(caai caaiVar, bzwa bzwaVar, int i, boolean z, byry byryVar) {
        evuo parserForType = byjb.a.getParserForType();
        parserForType.getClass();
        int iIntValue = ((Number) cpyl.e.e()).intValue() + 1;
        pzh pzhVar = new pzh();
        pzhVar.c(i);
        pzhVar.c = z;
        pzj pzjVarA = pzhVar.a();
        caze cazeVar = caze.FOREGROUND_SERVICE;
        Optional optionalOf = Optional.of(1);
        String string = byryVar.b.getString(R.string.cms_media_backup_foreground_notification_text);
        string.getClass();
        Notification notificationA = ((cgbn) byryVar.c.b()).a(string);
        if (notificationA == null) {
            ekrw ekrwVarJ = byry.a.j();
            ekrwVarJ.X(eksq.a, "BugleCms");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMediaBackupForegroundNotification", "getCmsMediaBackupNotification", 61, "CmsMediaBackupForegroundNotification.kt")).t("%s Cms media backup notification is null!", "CmsMediaBackupForegroundNotification:");
        }
        pza pzaVar = pza.a;
        long jLongValue = ((Number) caao.b.e()).longValue();
        return new caao(caaiVar.b, pzjVarA, caaiVar.a, new caat(), bzzy.class, caaiVar.f, bzwaVar, bzwa.a.class, parserForType, pzaVar, caaiVar.g, iIntValue, jLongValue, cazeVar, optionalOf, notificationA, caaiVar.e);
    }
}
