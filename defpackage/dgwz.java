package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgwz implements Runnable {
    final /* synthetic */ dgxb a;
    private final String b;
    private final long c;

    public dgwz(dgxb dgxbVar, String str, long j) {
        this.a = dgxbVar;
        this.b = str;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dgxb dgxbVar = this.a;
        if (Objects.isNull(dgxbVar.b)) {
            dhja.q("Capability service not registered.", new Object[0]);
            return;
        }
        String str = this.b;
        dhja.o("Requesting capabilities for %s", dhiz.USER_ID.c(str));
        try {
            dgxbVar.b.s("", this.c, str);
        } catch (ebmn e) {
            dhja.q("Unable to send capabilities request to %s: %s", dhiz.USER_ID.c(this.b), e.getMessage());
        }
    }
}
