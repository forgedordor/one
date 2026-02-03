package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajnx implements ajnw {
    private final cjzq a;

    public ajnx(cjzq cjzqVar) {
        this.a = cjzqVar;
    }

    @Override // defpackage.ajnw
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }

    @Override // defpackage.ajnw
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        ajnq ajnqVar = (ajnq) obj;
        if (Objects.equals(c(), ajnqVar)) {
            return false;
        }
        this.a.n(ajnqVar.equals(ajnq.ENABLED) ? ckbz.TOGGLE_STATE_ENABLED : ckbz.TOGGLE_STATE_USER_DISABLED);
        return true;
    }

    public final ajnq c() {
        return this.a.o() ? ajnq.ENABLED : ajnq.DISABLED;
    }
}
