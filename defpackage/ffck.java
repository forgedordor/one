package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffck extends fezu {
    final /* synthetic */ ffcl d;
    final /* synthetic */ int e;
    final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffck(String str, ffcl ffclVar, int i, long j) {
        super(str);
        this.d = ffclVar;
        this.e = i;
        this.f = j;
    }

    @Override // defpackage.fezu
    public final long a() throws IOException {
        try {
            this.d.u.i(this.e, this.f);
            return -1L;
        } catch (IOException e) {
            this.d.c(e);
            return -1L;
        }
    }
}
