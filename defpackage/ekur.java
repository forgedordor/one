package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekur implements ekue {
    public final String a;
    public final Level b;
    public final boolean c;
    public final Set d;
    public final ektl e;
    public final int f;
    private volatile ekus g;

    public ekur(int i, Level level, boolean z, Set set, ektl ektlVar) {
        this.a = "";
        this.f = 2;
        this.b = level;
        this.c = z;
        this.d = set;
        this.e = ektlVar;
    }

    @Override // defpackage.ekue
    public final ekta a(String str) {
        ekus ekusVar;
        if (!this.c || !str.contains(".")) {
            return new ekut(str, 2, this.b, this.d, this.e);
        }
        ekus ekusVar2 = this.g;
        if (ekusVar2 != null) {
            return ekusVar2;
        }
        synchronized (this) {
            ekusVar = this.g;
            if (ekusVar == null) {
                ekus ekusVar3 = new ekus(null, 2, this.b, false, this.d, this.e);
                this.g = ekusVar3;
                ekusVar = ekusVar3;
            }
        }
        return ekusVar;
    }

    private ekur() {
        this(2, Level.ALL, false, ekut.a, ekut.b);
    }
}
