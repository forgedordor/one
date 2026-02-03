package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffca extends fezu {
    final /* synthetic */ ffcl d;
    final /* synthetic */ ffct e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffca(String str, ffcl ffclVar, ffct ffctVar) {
        super(str);
        this.d = ffclVar;
        this.e = ffctVar;
    }

    @Override // defpackage.fezu
    public final long a() {
        try {
            this.d.b.f(this.e);
            return -1L;
        } catch (IOException e) {
            ffdi.b.l("Http2Connection.Listener failure for ".concat(String.valueOf(this.d.d)), 4, e);
            try {
                this.e.k(2, e);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
