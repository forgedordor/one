package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agic implements vdy {
    public final agiu a;
    public final fdpl b;
    private final Set c;

    public agic(agiv agivVar) {
        agiu agiuVarA = agivVar.a(3);
        this.a = agiuVarA;
        this.b = agiuVarA.g;
        this.c = agiuVarA.h;
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.c;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.b;
    }
}
