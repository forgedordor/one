package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zrb implements zqz {
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/suggestion/CalendarSuggestionClickHandlerImpl");
    public final ajlu a;
    public final fcsu b;
    public final Context c;
    private final fdjx e;

    public zrb(fdjx fdjxVar, ajlu ajluVar, fcsu fcsuVar, Context context) {
        fdjxVar.getClass();
        ajluVar.getClass();
        context.getClass();
        this.e = fdjxVar;
        this.a = ajluVar;
        this.b = fcsuVar;
        this.c = context;
    }

    @Override // defpackage.zqz
    public final boolean a(Long l, Long l2, String str, String str2, String str3, alff alffVar) {
        Intent intentA = cwsu.a("android.intent.action.INSERT", l, l2);
        if (!TextUtils.isEmpty(str)) {
            intentA.putExtra("eventLocation", str);
        }
        if (str2 != null) {
            intentA.putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE, str2);
        }
        if (str3 != null) {
            intentA.putExtra("description", str3);
        }
        diel dielVar = (diel) dieo.a.createBuilder();
        dielVar.copyOnWrite();
        dieo.a((dieo) dielVar.instance);
        diem diemVar = (diem) dien.a.createBuilder();
        String string = this.c.getString(R.string.calendar_suggestion_event_chat_title);
        diemVar.copyOnWrite();
        dien dienVar = (dien) diemVar.instance;
        string.getClass();
        dienVar.b |= 16;
        dienVar.c = string;
        dielVar.copyOnWrite();
        dieo dieoVar = (dieo) dielVar.instance;
        dien dienVar2 = (dien) diemVar.build();
        dienVar2.getClass();
        dieoVar.h = dienVar2;
        dieoVar.b |= 16384;
        if (intentA.hasExtra(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE)) {
            String stringExtra = intentA.getStringExtra(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE);
            stringExtra.getClass();
            dielVar.copyOnWrite();
            dieo dieoVar2 = (dieo) dielVar.instance;
            dieoVar2.b |= 4;
            dieoVar2.c = stringExtra;
        }
        if (intentA.hasExtra("eventLocation")) {
            String stringExtra2 = intentA.getStringExtra("eventLocation");
            stringExtra2.getClass();
            dielVar.copyOnWrite();
            dieo dieoVar3 = (dieo) dielVar.instance;
            dieoVar3.b |= 128;
            dieoVar3.f = stringExtra2;
        }
        if (intentA.hasExtra("description")) {
            String stringExtra3 = intentA.getStringExtra("description");
            stringExtra3.getClass();
            dielVar.copyOnWrite();
            dieo dieoVar4 = (dieo) dielVar.instance;
            dieoVar4.b |= 256;
            dieoVar4.g = stringExtra3;
        }
        if (intentA.hasExtra("beginTime")) {
            long longExtra = intentA.getLongExtra("beginTime", 0L);
            dielVar.copyOnWrite();
            dieo dieoVar5 = (dieo) dielVar.instance;
            dieoVar5.b |= 16;
            dieoVar5.d = longExtra;
        }
        if (intentA.hasExtra("endTime")) {
            long longExtra2 = intentA.getLongExtra("endTime", 0L);
            dielVar.copyOnWrite();
            dieo dieoVar6 = (dieo) dielVar.instance;
            dieoVar6.b |= 32;
            dieoVar6.e = longExtra2;
        }
        evsn evsnVarBuild = dielVar.build();
        evsnVarBuild.getClass();
        intentA.putExtra("proto", ((dieo) evsnVarBuild).toByteArray());
        agau agauVar = new agau("CalendarSuggestion", new aeo(), intentA);
        if (((afzc) this.b.b()).i(agauVar)) {
            auvw.m(this.e, null, new zra(this, agauVar, alffVar, null), 3);
            return true;
        }
        ((ekrd) d.j().h("com/google/android/apps/messaging/conversation2/messagelist/suggestion/CalendarSuggestionClickHandlerImpl", "startActivityAndHandleCalendarResultV2", 86, "CalendarSuggestionClickHandlerImpl.kt")).q("Unable to navigate to calendar");
        return false;
    }
}
