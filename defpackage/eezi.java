package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.inappreview.protocol.IInAppReviewService;
import java.util.Map;
import org.whispersystems.curve25519.Curve25519;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eezi extends eezo {
    final /* synthetic */ defr a;
    final /* synthetic */ eezl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eezi(eezl eezlVar, defr defrVar, defr defrVar2) {
        super(defrVar);
        this.a = defrVar2;
        this.b = eezlVar;
    }

    @Override // defpackage.eezo
    protected final void a() {
        try {
            eezl eezlVar = this.b;
            IInAppReviewService iInAppReviewService = (IInAppReviewService) eezlVar.b.n;
            String str = eezlVar.c;
            int i = eezm.a;
            Bundle bundle = new Bundle();
            Map mapA = eezm.a();
            bundle.putInt("playcore_version_code", ((Integer) mapA.get(Curve25519.JAVA)).intValue());
            if (mapA.containsKey(Curve25519.NATIVE)) {
                bundle.putInt("playcore_native_version", ((Integer) mapA.get(Curve25519.NATIVE)).intValue());
            }
            if (mapA.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) mapA.get("unity")).intValue());
            }
            iInAppReviewService.getLaunchReviewFlowInfo(str, bundle, new eezk(eezlVar, this.a));
        } catch (RemoteException e) {
            eezl.a.c(e, "error requesting in-app review for %s", this.b.c);
            this.a.c(new RuntimeException(e));
        }
    }
}
