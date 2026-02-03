package defpackage;

import com.google.android.gms.droidguard.DroidGuardResultsRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class dcpq extends dcqe {
    private final dcqy a;

    public dcpq(String str, DroidGuardResultsRequest droidGuardResultsRequest) {
        super(str, droidGuardResultsRequest);
        this.a = new dcqy();
    }

    public abstract Object a(String str, Throwable th);

    public final Object b(dcqg dcqgVar) {
        dclh.g("This method must not be called on the main thread.");
        dcqgVar.b(this);
        try {
            dcqy dcqyVar = this.a;
            DroidGuardResultsRequest droidGuardResultsRequest = this.e;
            Object objA = dcqyVar.a(droidGuardResultsRequest.a());
            if (objA != null) {
                return objA;
            }
            return a("timeout: " + droidGuardResultsRequest.a() + " ms", null);
        } catch (InterruptedException e) {
            return a("takeWithTimeout(" + this.e.a() + ") got interrupted", e);
        }
    }

    public abstract Object c(dcpo dcpoVar);

    @Override // defpackage.dcqe
    protected final void d(dcpo dcpoVar) {
        try {
            this.a.b(c(dcpoVar));
        } catch (RuntimeException e) {
            this.a.b(a("deliverHandle", e));
        }
    }
}
