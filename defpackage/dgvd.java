package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgvd implements ebla {
    @Override // defpackage.ebla
    public final void a(ebqq ebqqVar) {
        if (((Boolean) dfpo.p().a.q.a()).booleanValue()) {
            String string = UUID.randomUUID().toString();
            ebot ebotVar = new ebot();
            ebotVar.a = new ebou(string);
            ebqqVar.q(ebotVar);
        }
    }
}
