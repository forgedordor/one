package defpackage;

import android.database.Cursor;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnfn extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dnfr c;
    final /* synthetic */ dnfr d;
    final /* synthetic */ fdos e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnfn(fdos fdosVar, dnfr dnfrVar, fcxy fcxyVar, dnfr dnfrVar2) {
        super(3, fcxyVar);
        this.c = dnfrVar;
        this.d = dnfrVar2;
        this.e = fdosVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dnfr dnfrVar = this.d;
        dnfn dnfnVar = new dnfn(this.e, this.c, (fcxy) obj3, dnfrVar);
        dnfnVar.b = (Cursor) obj2;
        return dnfnVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003b -> B:10:0x0014). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        final ?? r1;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            r1 = this.b;
            try {
                fctl.b(obj);
                r1 = r1;
            } catch (Exception e) {
                ((ekrd) ((ekrd) dnfr.a.i()).g(e).h("com/google/android/libraries/compose/core/data/usage/SQLiteUsageService$queryAndMapLazily$2$1$1", "invokeSuspend$$forInline", 140, "SQLiteUsageService.kt")).t("Unable to map '%s' entity usage, skipping", this.c.f);
                r1 = r1;
            }
        } else {
            fctl.b(obj);
            r1 = this.b;
        }
        while (r1 != 0 && r1.moveToNext()) {
            fdos fdosVar = this.e;
            dnfw dnfwVar = (dnfw) this.d.d.d("SQLiteUsageService#metadataFromCursor", new fdae() { // from class: dnfd
                @Override // defpackage.fdae
                public final Object invoke() {
                    Cursor cursor = r1;
                    dnce dnceVar = new dnce(cursor.getLong(0));
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(cursor.getLong(1));
                    instantOfEpochMilli.getClass();
                    return new dnfw(dnceVar, instantOfEpochMilli, !cursor.isNull(2) ? cursor.getString(2) : null);
                }
            });
            this.b = r1;
            this.a = 1;
            if (fdosVar.a(dnfwVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
