package defpackage;

import j$.util.Collection;
import java.util.Locale;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzad {
    public static final Supplier a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;
    private final aurx f;
    private final apod g;

    static {
        final ejxr ejxrVarV = cdag.v("cms_create_trigger_check_for_cms_id");
        ejxrVarV.getClass();
        a = new Supplier() { // from class: bzab
            @Override // java.util.function.Supplier
            public final Object get() {
                return (cczi) ejxrVarV.get();
            }
        };
        b = String.format(Locale.US, "%s IN (%s)", "NEW.cms_life_cycle", ejwc.d(',').f((Integer[]) Collection.EL.stream(cpyi.w).map(new cpyc()).sorted().toArray(new IntFunction() { // from class: cpyg
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                cpyi cpyiVar = cpyi.UNKNOWN;
                return new Integer[i];
            }
        })));
        c = String.format(Locale.US, "%s NOT IN (%s)", "NEW.cms_life_cycle", ejwc.d(',').f((Integer[]) Collection.EL.stream(cpyi.z).map(new cpyc()).sorted().toArray(new IntFunction() { // from class: cpyh
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                cpyi cpyiVar = cpyi.UNKNOWN;
                return new Integer[i];
            }
        })));
        d = String.format(Locale.US, "%s NOT IN (%s)", "OLD.cms_life_cycle", ejwc.d(',').f((Integer[]) Collection.EL.stream(cpyi.y).map(new cpyc()).sorted().toArray(new IntFunction() { // from class: cpye
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                cpyi cpyiVar = cpyi.UNKNOWN;
                return new Integer[i];
            }
        })));
        e = String.format(Locale.US, "%s NOT IN (%d, %d) OR %s NOT IN (%d, %d, %d)", "OLD.cms_life_cycle", Integer.valueOf(cpyi.UNKNOWN.ordinal()), Integer.valueOf(cpyi.RESTORED_FROM_TELEPHONY.ordinal()), "NEW.cms_life_cycle", Integer.valueOf(cpyi.MERGED_FROM_CMS.ordinal()), Integer.valueOf(cpyi.CMS_RESTORE_FAILED.ordinal()), Integer.valueOf(cpyi.EXCLUDED.ordinal()));
        String.format(Locale.US, "%s IN (%s)", "OLD.cms_life_cycle", ejwc.d(',').f((Integer[]) Collection.EL.stream(cpyi.A).map(new cpyc()).sorted().toArray(new IntFunction() { // from class: cpyd
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                cpyi cpyiVar = cpyi.UNKNOWN;
                return new Integer[i];
            }
        })));
    }

    public bzad(aurx aurxVar, apod apodVar) {
        this.f = aurxVar;
        this.g = apodVar;
    }

    public final bbmm a(int i, bbml bbmlVar, int i2) {
        return e(i, bbmlVar, i2, false);
    }

    public final bzac b(int i, bbml bbmlVar) {
        return new bzac(i, bbmlVar, this.g.a());
    }

    public final String c(int i, bbml bbmlVar) {
        return "DROP TRIGGER IF EXISTS ".concat(bbmj.f(i, bbmlVar.name(), 32));
    }

    public final String d(int i, bbml bbmlVar, String str) {
        return c(i, bbmlVar).concat(str);
    }

    public final bbmm e(int i, bbml bbmlVar, int i2, boolean z) {
        bbmm bbmmVar = new bbmm();
        bbmmVar.c = bbmlVar;
        bbmmVar.e = 32;
        bbmmVar.b = i;
        bbmmVar.c();
        bbmmVar.h = this.g.a();
        bbmmVar.g = i2;
        if (this.f.aj()) {
            int iOrdinal = bbmlVar.ordinal();
            if (iOrdinal == 0) {
                bbmmVar.b(b);
                return bbmmVar;
            }
            if (iOrdinal == 1) {
                bbmmVar.b(c);
                bbmmVar.b(e);
                return bbmmVar;
            }
            if (iOrdinal == 2) {
                bbmmVar.b(d);
                return bbmmVar;
            }
        } else if (z || ((Boolean) ((cczi) a.get()).e()).booleanValue()) {
            int iOrdinal2 = bbmlVar.ordinal();
            if (iOrdinal2 == 0) {
                bbmmVar.b("NEW.cms_id IS NULL");
                return bbmmVar;
            }
            if (iOrdinal2 == 2) {
                bbmmVar.b("OLD.cms_id IS NOT NULL");
                return bbmmVar;
            }
        }
        return bbmmVar;
    }

    public final String f(int i) {
        return "DROP TRIGGER IF EXISTS " + bbmj.f(2, bbml.UPDATE.name(), 32) + bzas.b(i);
    }
}
