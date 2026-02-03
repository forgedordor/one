package defpackage;

import android.app.AlarmManager;
import android.content.Context;
import android.os.Build;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crmb implements crma, crlz {
    private static final cqce a = cqce.g("Bugle", "PermissionCheckerImpl");
    private final Context b;
    private final Map c = DesugarCollections.synchronizedMap(new csq());

    public crmb(Context context) {
        this.b = context;
    }

    private final boolean r() {
        return a(new String[]{"android.permission.READ_MEDIA_IMAGES"}) || t();
    }

    private final boolean s(String str) {
        Map map = this.c;
        if (!map.containsKey(str) || ((Integer) map.get(str)).intValue() == -1) {
            if (str.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                map.put(str, Integer.valueOf(true == o() ? 0 : -1));
            } else {
                map.put(str, Integer.valueOf(this.b.checkSelfPermission(str)));
            }
        }
        return ((Integer) map.get(str)).intValue() == 0;
    }

    private final boolean t() {
        if (craf.h) {
            return a(new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
        }
        return false;
    }

    private final boolean u() {
        return a(new String[]{"android.permission.READ_MEDIA_VIDEO"}) || t();
    }

    @Override // defpackage.crlz
    public final boolean a(String[] strArr) {
        for (String str : strArr) {
            if (!s(str)) {
                cqbd cqbdVarE = a.e();
                cqbdVarE.I("Missing Permission");
                cqbdVarE.I(str);
                cqbdVarE.r();
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.crlz
    public final String[] b(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!s(str)) {
                arrayList.add(str);
            }
        }
        String[] strArr2 = new String[arrayList.size()];
        arrayList.toArray(strArr2);
        return strArr2;
    }

    @Override // defpackage.crma
    public final boolean c() {
        return a(crmd.l);
    }

    @Override // defpackage.crma
    public final boolean d() {
        return !craf.h ? a(crmd.e) : a(crmd.c) && r();
    }

    @Override // defpackage.crma
    public final boolean e() {
        return a(crmd.c);
    }

    @Override // defpackage.crma
    public final boolean f() {
        return !craf.h ? a(crmd.f) : a(crmd.c) && u();
    }

    @Override // defpackage.crma
    public final boolean g() {
        return s("com.cequint.ecid.CALLER_ID_EXTERNAL_LOOKUP_SMS");
    }

    @Override // defpackage.crma
    public final boolean h() {
        return a(crmd.i);
    }

    @Override // defpackage.crma
    public final boolean i() {
        return a(crmd.g);
    }

    @Override // defpackage.crma
    public final boolean j() {
        if ("com.google.android.ims".equals(this.b.getPackageName())) {
            return true;
        }
        return a(crmd.p);
    }

    @Override // defpackage.crma
    public final boolean k() {
        return a(crmd.j);
    }

    @Override // defpackage.crma
    public final boolean l() {
        return s("com.google.android.setupwizard.READ_DEVICE_ORIGIN") || s("com.google.android.setupwizard.READ_DEVICE_ORIGIN_FIRST_PARTY");
    }

    @Override // defpackage.crma
    public final boolean m() {
        return a(crmd.o);
    }

    @Override // defpackage.crma
    public final boolean n() {
        return a(crmd.a);
    }

    @Override // defpackage.crma
    public final boolean o() {
        if (Build.VERSION.SDK_INT < 31) {
            return true;
        }
        AlarmManager alarmManager = (AlarmManager) this.b.getSystemService("alarm");
        if (alarmManager == null) {
            return false;
        }
        return alarmManager.canScheduleExactAlarms();
    }

    @Override // defpackage.crma
    public final boolean p() {
        return a(crmd.h);
    }

    @Override // defpackage.crma
    public final boolean q() {
        return !craf.h ? a(crmd.n) : a(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_MEDIA_AUDIO"}) && r() && u();
    }
}
