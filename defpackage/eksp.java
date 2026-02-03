package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eksp extends eksn {
    public eksp(ekta ektaVar) {
        super(ektaVar);
    }

    public static eksp c(String str) {
        return new eksp(ekty.d(str));
    }

    public static eksp p() {
        return new eksp(ekty.d(ekty.g().b(eksp.class)));
    }

    @Override // defpackage.ekqs
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final eksl a(Level level) {
        boolean zM = m(level);
        ekty.n(k(), level, zM);
        return !zM ? c : new ekso(this, level);
    }
}
