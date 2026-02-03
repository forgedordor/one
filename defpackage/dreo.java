package defpackage;

import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.android.libraries.geller.portable.callbacks.GellerStorageOperationsCallback;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dreo implements GellerStorageOperationsCallback {
    public static final ekrg a = ekrg.c("com/google/android/libraries/geller/portable/GellerStorageOperationsCallbackImpl");
    public final Geller b;
    private final eosc c;

    public dreo(Geller geller, eosc eoscVar) {
        this.b = geller;
        this.c = eoscVar;
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerStorageOperationsCallback
    public final void onDeletion(final String str, final byte[] bArr) {
        ((ekrd) ((ekrd) a.h()).h("com/google/android/libraries/geller/portable/GellerStorageOperationsCallbackImpl", "onDeletion", 34, "GellerStorageOperationsCallbackImpl.java")).q("Scheduling deletion propagation for Geller data.");
        try {
            this.c.submit(eiid.k(new Runnable() { // from class: dren
                @Override // java.lang.Runnable
                public final void run() {
                    ((ekrd) ((ekrd) dreo.a.h()).h("com/google/android/libraries/geller/portable/GellerStorageOperationsCallbackImpl", "performDeletionPropagation", 49, "GellerStorageOperationsCallbackImpl.java")).q("Performing deletion propagation for Geller data.");
                    String str2 = str;
                    byte[] bArr2 = bArr;
                    Geller geller = this.a.b;
                    try {
                        geller.nativePropagateDeletion(geller.a(), geller.c.a(str2), bArr2);
                    } catch (GellerException e) {
                        ((ekrd) ((ekrd) ((ekrd) Geller.a.j()).g(e)).h("com/google/android/libraries/geller/portable/Geller", "propagateDeletion", (char) 1786, "Geller.java")).q("propagateDeletion call failed.");
                    }
                    GellerDatabase gellerDatabaseB = geller.c.b(str2);
                    if (gellerDatabaseB == null) {
                        ((ekrd) ((ekrd) Geller.a.j()).h("com/google/android/libraries/geller/portable/Geller", "propagateDeletion", 1791, "Geller.java")).q("The GellerDatabase is null, skipping setting DELETION_PROCESSED status.");
                    } else {
                        gellerDatabaseB.setDeletionProcessed(bArr2);
                    }
                }
            }));
        } catch (RejectedExecutionException e) {
            ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/android/libraries/geller/portable/GellerStorageOperationsCallbackImpl", "onDeletion", '*', "GellerStorageOperationsCallbackImpl.java")).q("Failed to schedule deletion propagation task.");
        }
    }
}
