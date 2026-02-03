package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aimm extends aimh {
    private final ejxr a;

    public aimm(ejxr ejxrVar) {
        this.a = ejxrVar;
    }

    @Override // defpackage.aimh
    public final boolean a(aiol aiolVar) {
        double dNextDouble = ((Random) this.a.get()).nextDouble();
        aiov aiovVar = aiolVar.c;
        if (aiovVar == null) {
            aiovVar = aiov.a;
        }
        return dNextDouble < aiovVar.c;
    }
}
