package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dske implements dxml {
    public static final boolean a;
    private static final eksp b = eksp.c("GnpSdk");
    private static final Map c;
    private final drzl d;
    private final dsah e;
    private final Context f;
    private final dxgy g;
    private final String h;
    private final long i;
    private final long j;

    static {
        boolean z = false;
        Map mapG = fcwa.g(new fcti(33, fcva.b(etgd.ANDROID_POST_NOTIFICATIONS)), new fcti(23, fcva.g(etgd.ANDROID_CAMERA, etgd.ANDROID_ACCESS_FINE_LOCATION)));
        c = mapG;
        Set setKeySet = mapG.keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            Iterator it = setKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (dxuh.b(((Number) it.next()).intValue())) {
                    z = true;
                    break;
                }
            }
        }
        a = z;
    }

    public dske(drzl drzlVar, dsah dsahVar, Context context, dxgy dxgyVar) {
        drzlVar.getClass();
        dsahVar.getClass();
        context.getClass();
        this.d = drzlVar;
        this.e = dsahVar;
        this.f = context;
        this.g = dxgyVar;
        this.h = "GK_PERMISSIONS_STATE_LOGGING";
        this.i = TimeUnit.DAYS.toMillis(1L);
        this.j = TimeUnit.HOURS.toMillis(1L);
    }

    @Override // defpackage.dxml
    public final int a() {
        return 14;
    }

    @Override // defpackage.dxml
    public final long b() {
        return this.i;
    }

    @Override // defpackage.dxml
    public final Long c() {
        return Long.valueOf(this.j);
    }

    @Override // defpackage.dxml
    public final Object d(Bundle bundle, fcxy fcxyVar) {
        b.o().q("Executing PermissionsStateLoggingJob");
        Map map = c;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            fcva.y(arrayList, !dxuh.b(((Number) entry.getKey()).intValue()) ? fcvo.a : (List) entry.getValue());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            linkedHashMap.put(obj, dxuh.a(this.f, dsbf.a((etgd) obj)) ? etgb.ANDROID_PERMISSION_STATE_AUTHORIZED : etgb.ANDROID_PERMISSION_STATE_DENIED);
        }
        ekgp ekgpVarE = ekfv.e(linkedHashMap);
        if (!ekgpVarE.isEmpty()) {
            dsah dsahVar = this.e;
            List listA = this.d.a();
            listA.getClass();
            dsahVar.b(ekgpVarE, ekfv.a(listA), ((dxgw) this.g).a);
        }
        return new dxfx(fctx.a);
    }

    @Override // defpackage.dxml
    public final String e() {
        return this.h;
    }

    @Override // defpackage.dxml
    public final boolean f() {
        return true;
    }

    @Override // defpackage.dxml
    public final boolean g() {
        return false;
    }

    @Override // defpackage.dxml
    public final int h() {
        return 1;
    }
}
