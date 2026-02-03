package defpackage;

import android.accounts.Account;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duzv implements drev {
    public final ejxr a;
    private final ejxr b;
    private final ejxr c;

    public duzv(duzu duzuVar) {
        this.b = duzuVar.a;
        this.c = duzuVar.b;
        this.a = duzuVar.c;
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.drev
    public final long a(ejwi ejwiVar, final String str, ewae ewaeVar) {
        if (!((Boolean) ((ejxw) this.c).a).booleanValue()) {
            return 0L;
        }
        if ((ewaeVar.b & 1) == 0) {
            throw new IllegalStateException("DataType is a required field in GellerDeleteParams.");
        }
        String str2 = ewaeVar.e;
        final dtpc dtpcVar = (dtpc) dvah.a.getOrDefault(str2, dtpc.GDD_UNKNOWN);
        ejwl.p(!dtpcVar.equals(r1), "GellerGddStorage does not support deletion for corpus: %s", str2);
        try {
            return ((dtvp) ((eooi) eika.k(this.b.get(), new eooz() { // from class: duzs
                /* JADX WARN: Type inference failed for: r0v3, types: [dtsl, java.lang.Object] */
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final String str3 = str;
                    Account account = (Account) ekis.g((List) obj, new ejwm() { // from class: duzt
                        @Override // defpackage.ejwm
                        public final boolean a(Object obj2) {
                            return ((Account) obj2).name.equals(str3);
                        }
                    });
                    return this.a.a.get().i(new dtmu(ejwi.j(dtpcVar), ejwi.j(account)));
                }
            }, eoqg.a)).r(3000L, TimeUnit.MILLISECONDS)).a();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Unable to remove account file groups", e.getCause());
        } catch (ExecutionException e2) {
            e = e2;
            throw new IllegalStateException("Unable to remove account file groups", e.getCause());
        } catch (TimeoutException e3) {
            e = e3;
            throw new IllegalStateException("Unable to remove account file groups", e.getCause());
        }
    }

    @Override // defpackage.drev
    public final /* synthetic */ evzw b(ejwi ejwiVar, Set set) {
        return evzw.a;
    }

    @Override // defpackage.drev
    public final ewuu c() {
        return ewuu.CUSTOM_STORAGE_TYPE_GDD;
    }

    @Override // defpackage.drev
    public final byte[][] d(ejwi ejwiVar, ewbk ewbkVar) {
        return new byte[0][];
    }

    @Override // defpackage.drev
    public final String[] e(ejwi ejwiVar, String str) {
        return new String[0];
    }

    @Override // defpackage.drev
    public final long f(ejwi ejwiVar, String str, ewav ewavVar, ejwi ejwiVar2, ejwi ejwiVar3, ejwi ejwiVar4) {
        return 0L;
    }

    @Override // defpackage.drev
    public final boolean g(ejwi ejwiVar, String str, String[] strArr, long j, boolean z, byte[] bArr) {
        return true;
    }

    @Override // defpackage.drev
    public final ewcb h(ejwi ejwiVar, String str, String[] strArr, long j, boolean z, byte[] bArr) {
        return ewcb.a;
    }

    @Override // defpackage.drev
    public final /* synthetic */ boolean i(ejwi ejwiVar, ewbx ewbxVar) {
        return dreu.a(this, ejwiVar, ewbxVar);
    }

    @Override // defpackage.drev
    public final /* synthetic */ byte[][] j(ejwi ejwiVar, ewbk ewbkVar) {
        return dreu.b(this, ejwiVar, ewbkVar);
    }
}
