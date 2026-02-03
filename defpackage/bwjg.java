package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.etouffee.impl.TachyonKeyWorker;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwjg {
    private final Context a;

    public bwjg(Context context) {
        this.a = context;
    }

    public final void a(String str) {
        pzn pznVar = new pzn();
        pznVar.e("canonical_number", str);
        qau qauVar = new qau(TachyonKeyWorker.class);
        qauVar.d("bugle_tk_worker");
        qauVar.j(pznVar.a());
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        qauVar.g(pzhVar.a());
        qbq.a(this.a).g("PrekeysManager-".concat(String.valueOf(str)), pzz.b, (qav) qauVar.b());
    }
}
