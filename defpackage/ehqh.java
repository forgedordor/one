package defpackage;

import java.io.IOException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehqh extends ekuc {
    final /* synthetic */ ehqf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehqh(String str, ehqf ehqfVar) {
        super(str);
        this.a = ehqfVar;
    }

    @Override // defpackage.ekta
    public final void b(eksx eksxVar) throws IOException {
        this.a.b(eksxVar);
    }

    @Override // defpackage.ekta
    public final boolean c(Level level) {
        return this.a.c(level);
    }
}
