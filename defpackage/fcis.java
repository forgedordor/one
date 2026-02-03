package defpackage;

import io.grpc.Status;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcis extends fbqj {
    static final boolean a = fcdy.i("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST", false);
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.fbpy
    public final fbqi a(fbqa fbqaVar) {
        return a ? new fcil(fbqaVar) : new fcir(fbqaVar);
    }

    @Override // defpackage.fbqj
    public final fbro b(Map map) {
        try {
            Boolean boolA = fcff.a(map, "shuffleAddressList");
            return new fbro(a ? new fcig(boolA) : new fcin(boolA));
        } catch (RuntimeException e) {
            return new fbro(Status.p.d(e).withDescription("Failed parsing configuration for pick_first"));
        }
    }

    @Override // defpackage.fbqj
    public final String c() {
        return "pick_first";
    }

    @Override // defpackage.fbqj
    public final void d() {
    }

    @Override // defpackage.fbqj
    public final void e() {
    }
}
