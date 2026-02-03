package defpackage;

import j$.time.Instant;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avhd implements avhc {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/contacts/sync/importer/ContactsImportResultTrackerImpl");
    private final fcsu b;
    private final AtomicReference c;
    private final AtomicReference d;
    private final Set e;

    public avhd(fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.b = fcsuVar2;
        this.c = new AtomicReference(Instant.MIN);
        this.d = new AtomicReference(Instant.MIN);
        Set setSynchronizedSet = DesugarCollections.synchronizedSet(new HashSet());
        setSynchronizedSet.getClass();
        this.e = setSynchronizedSet;
    }

    @Override // defpackage.avhc
    public final void a() {
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleContacts");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/contacts/sync/importer/ContactsImportResultTrackerImpl", "onContactsImportCompleted", 94, "ContactsImportResultTrackerImpl.kt")).q("Contacts import completed. Notifying pending future completers.");
        this.c.set(((cogw) this.b.b()).f());
        Set set = this.e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((kog) it.next()).b(true);
        }
        set.clear();
    }

    @Override // defpackage.avhc
    public final void b() {
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleContacts");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/contacts/sync/importer/ContactsImportResultTrackerImpl", "onContactsImportFailed", 104, "ContactsImportResultTrackerImpl.kt")).q("Contacts import failed. Notifying pending future completers.");
        this.d.set(((cogw) this.b.b()).f());
        Set set = this.e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((kog) it.next()).b(false);
        }
        set.clear();
    }
}
