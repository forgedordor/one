package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.dittosatellite.impl.DittoWebActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abrv implements abru {
    private final cgbg a;
    private final abrk b;
    private final abrm c;
    private final abrx d;
    private final Object e = new Object();
    private final Map f = new HashMap();
    private final Map g = new HashMap();
    private final kxa h;
    private final Context i;

    public abrv(Context context, cgbg cgbgVar, abrk abrkVar, abrm abrmVar, abrx abrxVar) {
        this.a = cgbgVar;
        this.i = context;
        this.b = abrkVar;
        this.c = abrmVar;
        this.d = abrxVar;
        kwz kwzVar = new kwz();
        kwzVar.d = "bugle_dittosatellite_self_person";
        kwzVar.a = context.getResources().getString(R.string.self_person_name);
        kwzVar.e = false;
        this.h = new kxa(kwzVar);
    }

    @Override // defpackage.abru
    public final kxa a() {
        return this.h;
    }

    @Override // defpackage.abru
    public final void b() {
        synchronized (this.e) {
            Map map = this.f;
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((abrj) it.next()).b();
            }
            map.clear();
            Map map2 = this.g;
            Iterator it2 = map2.values().iterator();
            while (it2.hasNext()) {
                ((abrw) it2.next()).e();
            }
            map2.clear();
        }
    }

    @Override // defpackage.abru
    public final void c(String str) {
        synchronized (this.e) {
            abrj abrjVar = (abrj) this.f.remove(str);
            if (abrjVar != null) {
                abrjVar.b();
            }
        }
    }

    @Override // defpackage.abru
    public final void d(String str, String str2, epqj epqjVar, kwe kweVar) {
        synchronized (this.e) {
            Map map = this.f;
            if (!map.containsKey(str)) {
                abrk abrkVar = this.b;
                abgl abglVar = new abgl(str);
                kxa kxaVar = this.h;
                cgbg cgbgVar = (cgbg) abrkVar.a.b();
                cgbgVar.getClass();
                Context context = (Context) abrkVar.b.b();
                context.getClass();
                cqzr cqzrVar = (cqzr) abrkVar.c.b();
                cqzrVar.getClass();
                str2.getClass();
                epqjVar.getClass();
                map.put(str, new abrj(cgbgVar, context, cqzrVar, abglVar, str2, epqjVar, kxaVar));
            }
            abrj abrjVar = (abrj) map.get(str);
            csu csuVar = abrjVar.e;
            if (csuVar.a() == 7) {
                int i = csuVar.b;
                if (i == csuVar.c) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                Object[] objArr = csuVar.a;
                Object obj = objArr[i];
                objArr[i] = null;
                csuVar.b = (i + 1) & csuVar.d;
            }
            Object[] objArr2 = csuVar.a;
            int i2 = csuVar.c;
            objArr2[i2] = kweVar;
            int i3 = csuVar.d & (i2 + 1);
            csuVar.c = i3;
            int i4 = csuVar.b;
            if (i3 == i4) {
                int length = objArr2.length;
                int i5 = length - i4;
                int i6 = length + length;
                if (i6 < 0) {
                    throw new RuntimeException("Max array capacity exceeded");
                }
                Object[] objArr3 = new Object[i6];
                fcur.n(objArr2, objArr3, 0, i4, length);
                fcur.n(csuVar.a, objArr3, i5, 0, csuVar.b);
                csuVar.a = objArr3;
                csuVar.b = 0;
                csuVar.c = length;
                csuVar.d = i6 - 1;
            }
            abrjVar.f.incrementAndGet();
            if (abrjVar.g) {
                abrjVar.c.f(abrjVar.a());
            } else {
                abrjVar.g = true;
                abrjVar.c.d(abrjVar.a());
            }
        }
    }

    @Override // defpackage.abru
    public final void e(final abrh abrhVar) {
        final abrm abrmVar = this.c;
        this.a.d(abrmVar.b.a(new cgeg() { // from class: abrl
            @Override // defpackage.cgeg
            public final Notification a(String str) throws Resources.NotFoundException {
                Context context = abrmVar.a;
                Resources resources = context.getResources();
                abrf abrfVar = (abrf) abrhVar;
                String str2 = abrfVar.d;
                cgcs cgcsVarC = cgcs.c(resources, null, str2, 1, 1, 1);
                Intent intentA = aiiw.c(context, DittoWebActivity.class, "android.intent.action.VIEW").a();
                intentA.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                abgl abglVar = abrfVar.c;
                intentA.putExtra("conversation_id_for_launch", abglVar.toString());
                PendingIntent pendingIntentA = ebsn.a(context, 0, intentA, crag.a(1073741824));
                Intent intentA2 = aiiw.c(context, abrt.class, "com.google.android.apps.messaging.SATELLITE_RETRY_MESSAGE_REPLY").a();
                intentA2.putExtra("bugle_dittosatellite_conversation_proto", abrfVar.e.I());
                intentA2.putExtra("bugle_dittosatellite_reply_conversation_id", abglVar.toString());
                intentA2.putExtra("bugle_dittosatellite_reply_conversation_name", str2);
                intentA2.putExtra("bugle_dittosatellite_reply_text", abrfVar.b);
                intentA2.putExtra("bugle_dittosatellite_reply_retry_count", abrfVar.a + 1);
                PendingIntent pendingIntentD = ebsn.d(context, 0, intentA2, VCardConfig.FLAG_APPEND_TYPE_PARAM);
                kvq kvqVar = new kvq(context, "");
                kvqVar.g = pendingIntentA;
                kvqVar.F = str;
                kvqVar.e(new kve(R.drawable.notification_icon, context.getString(R.string.retry_button_label), pendingIntentD).a());
                kvqVar.r(R.drawable.notification_icon);
                cgas cgasVar = (cgas) cgcsVarC;
                String str3 = cgasVar.a;
                kvqVar.i(str3);
                kvqVar.w(str3);
                kvqVar.h(cgasVar.b);
                return kvqVar.a();
            }
        }, cgbe.SATELLITE_MESSAGE_SEND_FAILURE));
    }

    @Override // defpackage.abru
    public final void f(String str, String str2, String str3) {
        abrx abrxVar = this.d;
        cgbg cgbgVar = (cgbg) abrxVar.a.b();
        cgbgVar.getClass();
        Context context = (Context) abrxVar.b.b();
        context.getClass();
        cqzr cqzrVar = (cqzr) abrxVar.c.b();
        cqzrVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        abrw abrwVar = new abrw(cgbgVar, context, cqzrVar, str, str2, str3);
        synchronized (this.e) {
            Map map = this.g;
            abrw abrwVar2 = (abrw) map.remove(str);
            if (abrwVar2 != null) {
                abrwVar2.e();
            }
            map.put(str, abrwVar);
        }
        abrwVar.a.d(abrwVar);
    }

    @Override // defpackage.abru
    public final boolean g() {
        return craf.f && this.i.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0;
    }
}
