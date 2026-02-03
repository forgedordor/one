package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.car.app.hardware.info.EnergyProfile;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmvy {
    public static final cqce a = cqce.g("BugleDataModel", "MmsSmsUtils");
    public static final ejxr b = cdag.w(206791863, "enable_cdma_delivery_report_status");
    public final Context c;
    private String[] d;
    private final eygg e;
    private final eygg f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;

    public cmvy(Context context, eygg eyggVar, eygg eyggVar2, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.c = context;
        this.e = eyggVar;
        this.f = eyggVar2;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
    }

    public static int a(boolean z, boolean z2, int i) {
        if (z) {
            return (i == 4 || i == 5) ? 8 : 1;
        }
        if (z2) {
            return EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        }
        return 100;
    }

    public static int b(boolean z, int i, int i2) {
        if (!z) {
            return 100;
        }
        if (i == 4 || i == 6) {
            return 5;
        }
        if (i == 5) {
            return 8;
        }
        if (i == 2 && i2 == 64) {
            return 8;
        }
        return i2 != 0 ? 1 : 2;
    }

    public final String c(Resources resources, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.d == null) {
            this.d = resources.getStringArray(R.array.empty_subject_strings);
        }
        for (String str2 : this.d) {
            if (ejuf.e(str, str2)) {
                return null;
            }
        }
        return str;
    }

    public final String d(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? a.D(i, " (check MmsSmsUtils)") : "NO_RETRY" : "MANUAL_RETRY" : "AUTO_RETRY" : "SUCCEEDED";
    }

    public final String e(String str) {
        return ((alwh) this.f.b()).e(str);
    }

    public final void f(Intent intent) {
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
    }

    public final boolean g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strC = ((crnf) this.e.b()).c();
        try {
            fcsu fcsuVar = this.g;
            return ((ephj) fcsuVar.b()).j(((ephj) fcsuVar.b()).n(str, strC));
        } catch (ephe unused) {
            return false;
        }
    }

    public final boolean h(String str) {
        return (TextUtils.isEmpty(str) || alwh.i(str) || !alwh.h(str)) ? false : true;
    }

    public final boolean i(String str) {
        return alwh.k(str) && !alwh.i(str);
    }

    public final boolean j(String str) {
        return ((alwh) this.f.b()).l(str);
    }

    public final boolean k(String str) {
        return (((Boolean) this.i.b()).booleanValue() && ((Optional) ((eyig) this.h).a).filter(new Predicate() { // from class: cmvx
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                cqce cqceVar = cmvy.a;
                return ((bxeu) obj).a();
            }
        }).isPresent()) || ((alwh) this.f.b()).l(str) || alwh.i(str);
    }
}
