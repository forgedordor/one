package defpackage;

import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fgnm extends fgnj implements Serializable, fgni {
    private static final long serialVersionUID = -6728882245981L;
    public volatile long a;
    public volatile fgmq b;

    public fgnm() {
        this(fgmw.a(), fgoi.N());
    }

    @Override // defpackage.fgni
    public final fgmq a() {
        return this.b;
    }

    @Override // defpackage.fgni
    public final long getMillis() {
        return this.a;
    }

    public fgnm(long j, fgmq fgmqVar) {
        Map map = fgmw.a;
        this.b = fgmqVar;
        this.a = j;
        if (this.a == Long.MIN_VALUE || this.a == Long.MAX_VALUE) {
            this.b = this.b.a();
        }
    }
}
