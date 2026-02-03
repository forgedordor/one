package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffce extends fezu {
    final /* synthetic */ ffcl d;
    final /* synthetic */ int e;
    final /* synthetic */ ffez f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffce(String str, ffcl ffclVar, int i, ffez ffezVar, int i2) {
        super(str);
        this.d = ffclVar;
        this.e = i;
        this.f = ffezVar;
        this.g = i2;
    }

    @Override // defpackage.fezu
    public final long a() {
        try {
            ffcl ffclVar = this.d;
            int i = this.e;
            this.f.D(this.g);
            ffclVar.u.j(i, 9);
            synchronized (ffclVar) {
                ffclVar.w.remove(Integer.valueOf(i));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
