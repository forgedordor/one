package defpackage;

import java.io.EOFException;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feyg extends fezf {
    private static final feyt a;
    private final List b;
    private final List c;

    static {
        Pattern pattern = feyt.a;
        a = feys.a("application/x-www-form-urlencoded");
    }

    public feyg(List list, List list2) {
        this.b = fezr.p(list);
        this.c = fezr.p(list2);
    }

    private final long e(fffa fffaVar, boolean z) throws EOFException {
        ffez ffezVarS;
        if (z) {
            ffezVarS = new ffez();
        } else {
            fffaVar.getClass();
            ffezVarS = fffaVar.s();
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                ffezVarS.P(38);
            }
            ffezVarS.ac((String) list.get(i));
            ffezVarS.P(61);
            ffezVarS.ac((String) this.c.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = ffezVarS.b;
        ffezVarS.B();
        return j;
    }

    @Override // defpackage.fezf
    public final long a() {
        return e(null, true);
    }

    @Override // defpackage.fezf
    public final feyt b() {
        return a;
    }

    @Override // defpackage.fezf
    public final void c(fffa fffaVar) throws EOFException {
        e(fffaVar, false);
    }
}
