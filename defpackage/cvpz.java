package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvpz implements fdae {
    final /* synthetic */ cvqd a;
    final /* synthetic */ cvqi b;

    public cvpz(cvqd cvqdVar, cvqi cvqiVar) {
        this.a = cvqdVar;
        this.b = cvqiVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        ResolvedRecipient resolvedRecipient = this.b.b;
        cvqd cvqdVar = this.a;
        auvw.k(cvqdVar.d, null, null, new cvqc(resolvedRecipient, cvqdVar, null), 3);
        return fctx.a;
    }
}
