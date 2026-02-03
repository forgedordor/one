package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vff implements vdy {
    private final vfi a;
    private final fdpl b;
    private final Set c;

    public vff(vfj vfjVar) {
        vfi vfiVarA = vfjVar.a(5);
        this.a = vfiVarA;
        this.b = vfiVarA.c;
        this.c = vfiVarA.d;
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
