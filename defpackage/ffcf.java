package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffcf extends fezu {
    final /* synthetic */ ffcl d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffcf(String str, ffcl ffclVar, int i) {
        super(str);
        this.d = ffclVar;
        this.e = i;
    }

    @Override // defpackage.fezu
    public final long a() {
        ffcl ffclVar = this.d;
        int i = this.e;
        try {
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
