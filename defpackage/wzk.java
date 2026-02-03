package defpackage;

import j$.util.Optional;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class wzk extends fdbo implements fdae {
    public wzk(Object obj) {
        super(0, obj, xac.class, "onScheduledSend", "onScheduledSend()V", 0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, vwi] */
    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() throws IOException {
        xac xacVar = (xac) this.g;
        ekrg ekrgVar = xac.a;
        Optional optional = xacVar.j;
        optional.isPresent();
        eieh eiehVarA = xacVar.g.a("ComposeRowSendButton.onScheduledSend");
        try {
            xacVar.k.a.a(190413, null);
            optional.get().a();
            fczl.a(eiehVarA, null);
            return fctx.a;
        } finally {
        }
    }
}
