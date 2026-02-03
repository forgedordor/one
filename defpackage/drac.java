package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drac implements dqzx {
    private static final byte[] a;
    private final HashMap b;

    static {
        int i = elcz.a;
        a = elcx.a.c("fake_key", StandardCharsets.UTF_8).e();
    }

    public drac() {
        new HashMap();
        this.b = new HashMap();
        new HashMap();
    }

    @Override // defpackage.dqzx
    public final ListenableFuture a(String str) {
        ejwi ejwiVarJ = (ejwi) this.b.get(str);
        if (ejwiVarJ == null) {
            ejwiVarJ = ejwi.j(new dqzv(a));
        }
        return eork.i(ejwiVarJ);
    }
}
