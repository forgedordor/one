package defpackage;

import android.os.Bundle;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dslr implements dxml {
    private static final eksp a = eksp.c("GnpSdk");
    private final dskk b;
    private final String c = "GK_STORAGE_CLEANUP";
    private final long d = fbct.a.get().b();

    public dslr(dskk dskkVar) {
        this.b = dskkVar;
    }

    @Override // defpackage.dxml
    public final int a() {
        return 13;
    }

    @Override // defpackage.dxml
    public final long b() {
        return this.d;
    }

    @Override // defpackage.dxml
    public final Long c() {
        return 30000L;
    }

    @Override // defpackage.dxml
    public final Object d(Bundle bundle, fcxy fcxyVar) {
        a.o().q("Executing StorageCleanupJob");
        dsmg dsmgVar = (dsmg) this.b;
        long epochMilli = dsmgVar.e.f().minusMillis(fbct.a.get().a()).toEpochMilli();
        ((eksl) dsmg.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/storage/impl/StorageUtilitiesImpl", "cleanup", 53, "StorageUtilitiesImpl.java")).t("Storage cleanup started. Deleting events before %s", Instant.ofEpochMilli(epochMilli));
        dskf dskfVar = dsmgVar.b;
        dxlc.a(dskfVar.a(epochMilli), new ejwy() { // from class: dsmb
            @Override // defpackage.ejwy
            public final void a(Object obj) {
                ((eksl) dsmg.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/storage/impl/StorageUtilitiesImpl", "cleanup", 58, "StorageUtilitiesImpl.java")).t("Deleted %d Clearcut events", (Integer) obj);
            }
        }, null);
        dskm dskmVar = dsmgVar.c;
        dxlc.a(dskmVar.a(epochMilli), new ejwy() { // from class: dsmc
            @Override // defpackage.ejwy
            public final void a(Object obj) {
                ((eksl) dsmg.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/storage/impl/StorageUtilitiesImpl", "cleanup", 62, "StorageUtilitiesImpl.java")).t("Deleted %d Visual Element events", (Integer) obj);
            }
        }, null);
        List listA = dsmgVar.d.a();
        dxlc.a(dskmVar.b(listA), new ejwy() { // from class: dsmd
            @Override // defpackage.ejwy
            public final void a(Object obj) {
                ((eksl) dsmg.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/storage/impl/StorageUtilitiesImpl", "cleanup", 71, "StorageUtilitiesImpl.java")).t("Deleted %d Visual Elements events for accounts not on device", (Integer) obj);
            }
        }, null);
        dxlc.a(dskfVar.b(listA), new ejwy() { // from class: dsme
            @Override // defpackage.ejwy
            public final void a(Object obj) {
                ((eksl) dsmg.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/storage/impl/StorageUtilitiesImpl", "cleanup", 78, "StorageUtilitiesImpl.java")).t("Deleted %d Clearcut events for accounts not on device", (Integer) obj);
            }
        }, null);
        ArrayList arrayList = new ArrayList(1);
        ekqg ekqgVarListIterator = ((ekph) dsmgVar.f).listIterator();
        while (ekqgVarListIterator.hasNext()) {
            dsth dsthVar = (dsth) ekqgVarListIterator.next();
            listA.getClass();
            arrayList.add(fdxs.b(dsthVar.b, fcyi.a, fdjz.a, new dstg(dsthVar, listA, null)));
        }
        eork.a(arrayList).a(new Callable() { // from class: dsmf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ((eksl) dsmg.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/storage/impl/StorageUtilitiesImpl", "cleanup", 91, "StorageUtilitiesImpl.java")).q("Cleaned up all plugins");
                return null;
            }
        }, eoqg.a);
        return new dxfx(fctx.a);
    }

    @Override // defpackage.dxml
    public final String e() {
        return this.c;
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
        return 2;
    }
}
