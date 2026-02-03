package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmuq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/sms/config/MmsSmsPreferenceUtils");
    public static final ejxr b = cdag.w(211796674, "dont_allow_too_many_sms_parts_to_mms_upgrade");
    public final Context c;
    public final cmum d;
    public final crny e;
    public final crqu f;
    private final cuur g;
    private final Object h = new Object();
    private final HashMap i = new HashMap();

    public cmuq(Context context, cmum cmumVar, crqu crquVar, crny crnyVar, cuur cuurVar) {
        this.c = context;
        this.d = cmumVar;
        this.f = crquVar;
        this.e = crnyVar;
        this.g = cuurVar;
    }

    public final int a(int i) {
        cmuh cmuhVarA = this.d.a(i);
        if (((Boolean) ((cczi) b.get()).e()).booleanValue() && !cmuhVarA.p()) {
            return -1;
        }
        Bundle bundle = cmuhVarA.b;
        if (bundle.getBoolean("enableMultipartSMS", true) || cmuhVarA.r()) {
            return bundle.getInt("smsToMmsTextThreshold", -1);
        }
        return 1;
    }

    public final cuuq b(int i) {
        cuuq cuuqVarA;
        synchronized (this.h) {
            HashMap map = this.i;
            Integer numValueOf = Integer.valueOf(i);
            cuuqVarA = (cuuq) map.get(numValueOf);
            if (cuuqVarA == null) {
                cuuqVarA = this.g.a(i);
                map.put(numValueOf, cuuqVarA);
            }
        }
        return cuuqVarA;
    }

    public final boolean c(int i) {
        cmuh cmuhVarA = this.d.a(i);
        cuuq cuuqVarB = b(i);
        if (((Boolean) cuuqVarB.c().orElse(Boolean.valueOf(cmuhVarA.n()))).booleanValue()) {
            return !this.e.h(i).B() || ((Boolean) cuuqVarB.d().orElse(Boolean.valueOf(cmuhVarA.o()))).booleanValue();
        }
        return false;
    }

    public final boolean d(int i) {
        cmuh cmuhVarA = this.d.a(i);
        if (cmuhVarA.m()) {
            return ((Boolean) b(i).e().orElse(Boolean.valueOf(cmuhVarA.l()))).booleanValue();
        }
        return false;
    }

    public final boolean e(int i) {
        return ((Boolean) b(i).i().orElse(Boolean.valueOf(this.d.a(i).u()))).booleanValue();
    }
}
