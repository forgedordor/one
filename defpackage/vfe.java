package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfe implements vdy {
    public final fdpl a;
    private final vfi b;
    private final Set c;

    public vfe(vfj vfjVar) {
        vfi vfiVarA = vfjVar.a(6);
        this.b = vfiVarA;
        this.a = vfiVarA.c;
        this.c = vfiVarA.d;
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.c;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.a;
    }
}
