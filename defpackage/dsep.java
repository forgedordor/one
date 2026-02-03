package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsep implements dsea {
    private static final eksp a = eksp.c("GnpSdk");
    private final dsbr b;
    private final Context c;
    private final ListenableFuture d;

    public dsep(Context context, ListenableFuture listenableFuture, dsbr dsbrVar) {
        this.c = context;
        this.d = listenableFuture;
        this.b = dsbrVar;
    }

    @Override // defpackage.dsea
    public final dsdz a() {
        return dsdz.LANGUAGE;
    }

    @Override // defpackage.ejug
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        dsec dsecVar = (dsec) obj2;
        if (((etom) obj) == null) {
            this.b.c(dsecVar.a(), "TriggeringConditions is null in LanguagePredicate", new Object[0]);
            return false;
        }
        try {
            return Objects.equals(dsbe.a(this.c), ((SharedPreferences) this.d.get()).getString("SYNC_LANGUAGE", null));
        } catch (InterruptedException | ExecutionException e) {
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/predicates/impl/LanguagePredicate", "apply", 'C', "LanguagePredicate.java")).q("Failed to retrieve SYNC_LANGUAGE_SHARED_PREFS_KEY from shared preferences.");
            return false;
        }
    }
}
