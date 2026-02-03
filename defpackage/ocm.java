package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Handler;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ocm implements mtn {
    private final oes a = new oes();
    private final boolean b;
    private final oau c;
    private final int d;
    private final oak e;
    private final LogSessionId f;

    public ocm(boolean z, oau oauVar, int i, oak oakVar, LogSessionId logSessionId) {
        this.b = z;
        this.c = oauVar;
        this.d = i;
        this.e = oakVar;
        this.f = logSessionId;
    }

    @Override // defpackage.mtn
    public final mth[] b(Handler handler, mrk mrkVar, mrk mrkVar2, mrk mrkVar3, mrk mrkVar4) {
        ArrayList arrayList = new ArrayList();
        if (!this.b) {
            arrayList.add(new ocg(this.c, this.a, this.e, this.f));
        }
        arrayList.add(new oci(this.c, this.d, this.a, this.e, this.f));
        return (mth[]) arrayList.toArray(new mth[arrayList.size()]);
    }

    @Override // defpackage.mtn
    public final /* synthetic */ void a(mth mthVar) {
    }
}
