package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfr implements rfi {
    public final rpg a;

    public rfr(InputStream inputStream, rig rigVar) {
        rpg rpgVar = new rpg(inputStream, rigVar);
        this.a = rpgVar;
        rpgVar.mark(5242880);
    }

    @Override // defpackage.rfi
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.rfi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InputStream a() {
        rpg rpgVar = this.a;
        rpgVar.reset();
        return rpgVar;
    }
}
