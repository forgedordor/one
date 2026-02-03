package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcnb extends eksn {
    public static final ekrz a = dcnc.a;
    private final int d;

    public dcnb(ekta ektaVar, int i) {
        super(ektaVar);
        this.d = i;
    }

    public static dcnb c(String str, int i) {
        return new dcnb(ekty.d(str), i);
    }

    @Override // defpackage.ekqs
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final eksl a(Level level) {
        if (!m(level)) {
            return c;
        }
        Integer numValueOf = Integer.valueOf(this.d - 2);
        dcna dcnaVar = new dcna(this, level);
        dcnaVar.X(a, numValueOf);
        return dcnaVar;
    }
}
