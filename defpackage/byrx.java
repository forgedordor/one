package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byrx implements bzaf {
    private static final cqce a = cqce.g("BugleCms", "CmsKeyTriggers");
    private final bzad c;
    private final apod d;

    public byrx(bzad bzadVar, apod apodVar) {
        this.c = bzadVar;
        this.d = apodVar;
    }

    public static int c(int i) {
        if (i == 1) {
            return 20;
        }
        if (i == 2) {
            return 48;
        }
        if (i == 3) {
            return 24;
        }
        throw new IllegalArgumentException(a.g(i, "Invalid CMS key type: "));
    }

    public static int d(int i) {
        if ((i & 4) == 4) {
            return 1;
        }
        if ((i & 8) == 8) {
            return 3;
        }
        return (i & 32) == 32 ? 2 : 0;
    }

    public static final bmqz e(int i) {
        if (bzae.a(i, 16)) {
            return bmqz.BACKUP_CREATE;
        }
        if (bzae.a(i, 2)) {
            return bmqz.BACKUP_DELETE;
        }
        cqbd cqbdVarE = a.e();
        cqbdVarE.I("Failed to parse key operation from flags, returning unknown AbandonedAction");
        cqbdVarE.y("flags", i);
        cqbdVarE.r();
        return bmqz.BACKUP_UNKNOWN_OPERATION;
    }

    private static String f(bbml bbmlVar, int i, int i2, boolean z) {
        a.q("Creating trigger SQL for operation " + bbmlVar.name() + " and type " + i);
        bbmm bbmmVar = new bbmm();
        bbmmVar.c = bbmlVar;
        bbmmVar.e = 32;
        bbmmVar.b = 7;
        bbmmVar.i = "key_index";
        bbmmVar.c();
        bbmmVar.a = a.g(i, "key_type_");
        bbml bbmlVar2 = bbml.INSERT;
        StringBuilder sb = new StringBuilder();
        sb.append(bbmlVar == bbmlVar2 ? "NEW" : "OLD");
        sb.append(".key_type = ");
        sb.append(i);
        bbmmVar.b(sb.toString());
        bbmmVar.g = i2;
        bbmmVar.h = z;
        if (((Boolean) ((cczi) bzad.a.get()).e()).booleanValue()) {
            bbmmVar.b("NEW.cms_id IS NULL");
        }
        return bbmmVar.a();
    }

    private static String g(String str, int i) {
        String str2 = "DROP TRIGGER IF EXISTS on_cms_" + str.toLowerCase(Locale.US) + "_bkkey_type_" + i;
        a.q("Dropping trigger: ".concat(str2));
        return str2;
    }

    @Override // defpackage.bzaf
    public final List a() {
        ArrayList arrayList = new ArrayList();
        bbml bbmlVar = bbml.INSERT;
        apod apodVar = this.d;
        arrayList.add(f(bbmlVar, 1, c(1), apodVar.a()));
        arrayList.add(f(bbmlVar, 3, c(3), apodVar.a()));
        arrayList.add(f(bbmlVar, 2, c(2), apodVar.a()));
        boolean zA = apodVar.a();
        a.q("Creating trigger SQL for delete object");
        bbmm bbmmVar = new bbmm();
        bbmmVar.c = bbml.DELETE;
        bbmmVar.e = 32;
        bbmmVar.b = 7;
        bbmmVar.i = "cms_id";
        bbmmVar.c();
        bbmmVar.g = 2;
        bbmmVar.b("OLD.cms_id IS NOT NULL");
        bbmmVar.h = zA;
        arrayList.add(bbmmVar.a());
        return arrayList;
    }

    @Override // defpackage.bzaf
    public final List b() {
        ArrayList arrayList = new ArrayList();
        bbml bbmlVar = bbml.INSERT;
        arrayList.add(g(bbmlVar.name(), 1));
        arrayList.add(g(bbmlVar.name(), 3));
        arrayList.add(g(bbmlVar.name(), 2));
        arrayList.add(this.c.c(7, bbml.DELETE));
        return arrayList;
    }
}
