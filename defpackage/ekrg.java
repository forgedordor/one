package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekrg extends ekqs {
    private static final ekrf a = new ekrf();

    public ekrg(ekta ektaVar) {
        super(ektaVar);
    }

    @Deprecated
    public static ekrg c(String str) {
        ekwr.a(!str.isEmpty(), "injected class name is empty");
        return new ekrg(ekty.d(str.replace('/', '.')));
    }

    @Override // defpackage.ekqs
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ekrd a(Level level) {
        boolean zM = m(level);
        ekty.n(k(), level, zM);
        return !zM ? a : new ekre(this, level);
    }
}
