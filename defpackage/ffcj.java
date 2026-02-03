package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffcj extends fezu {
    final /* synthetic */ ffcl d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffcj(String str, ffcl ffclVar, int i, int i2) {
        super(str);
        this.d = ffclVar;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.fezu
    public final long a() throws IOException {
        try {
            this.d.m(this.e, this.f);
            return -1L;
        } catch (IOException e) {
            this.d.c(e);
            return -1L;
        }
    }
}
