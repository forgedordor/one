package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnfj extends fcyz implements fdau {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ dnfr d;
    final /* synthetic */ dnfr e;
    final /* synthetic */ fdos f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnfj(fdos fdosVar, dnfr dnfrVar, fcxy fcxyVar, dnfr dnfrVar2) {
        super(3, fcxyVar);
        this.d = dnfrVar;
        this.e = dnfrVar2;
        this.f = fdosVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dnfr dnfrVar = this.e;
        dnfj dnfjVar = new dnfj(this.f, this.d, (fcxy) obj3, dnfrVar);
        dnfjVar.c = (Cursor) obj2;
        return dnfjVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0057 -> B:16:0x0026). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ?? r1;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        if (i == 0) {
            fctl.b(obj);
            r1 = this.c;
        } else {
            if (i == 1) {
                Object obj3 = this.a;
                Object obj4 = this.c;
                try {
                    fctl.b(obj);
                    obj2 = obj3;
                    r1 = obj4;
                } catch (Exception e) {
                    r1 = obj4;
                    ((ekrd) ((ekrd) dnfr.a.i()).g(e).h("com/google/android/libraries/compose/core/data/usage/SQLiteUsageService$queryAndMapLazily$2$1$1", "invokeSuspend$$forInline", 140, "SQLiteUsageService.kt")).t("Unable to map '%s' entity usage, skipping", this.d.f);
                }
                this.c = r1;
                this.a = null;
                this.b = 2;
                if (((fdob) obj2).a(obj, this) != fcylVar) {
                }
                return fcylVar;
            }
            r1 = this.c;
            try {
                fctl.b(obj);
            } catch (Exception e2) {
                ((ekrd) ((ekrd) dnfr.a.i()).g(e2).h("com/google/android/libraries/compose/core/data/usage/SQLiteUsageService$queryAndMapLazily$2$1$1", "invokeSuspend$$forInline", 140, "SQLiteUsageService.kt")).t("Unable to map '%s' entity usage, skipping", this.d.f);
            }
        }
        if (r1 != 0 || !r1.moveToNext()) {
            return fctx.a;
        }
        Object obj5 = this.f;
        dnfr dnfrVar = this.e;
        this.c = r1;
        this.a = obj5;
        this.b = 1;
        Object objC = dnfrVar.d.c("SQLiteUsageService#entityFromCursor", new dnfi(r1, dnfrVar, null), this);
        if (objC != fcylVar) {
            obj2 = obj5;
            obj = objC;
            r1 = r1;
            this.c = r1;
            this.a = null;
            this.b = 2;
            if (((fdob) obj2).a(obj, this) != fcylVar) {
                if (r1 != 0) {
                }
                return fctx.a;
            }
        }
        return fcylVar;
    }
}
