package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekrb extends ekqs {
    static final ekra a = new ekra();

    public ekrb(ekta ektaVar) {
        super(ektaVar);
    }

    public static ekrb c() {
        return new ekrb(ekty.d(ekty.g().b(ekrb.class)));
    }

    @Override // defpackage.ekqs
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ekqy a(Level level) {
        boolean zM = m(level);
        ekty.n(k(), level, zM);
        return !zM ? a : new ekqz(this, level);
    }
}
