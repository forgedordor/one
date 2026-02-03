package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@okx(a = "navigation")
/* loaded from: classes.dex */
public class okb extends oky<oka> {
    private final ola b;

    public okb(ola olaVar) {
        olaVar.getClass();
        this.b = olaVar;
    }

    @Override // defpackage.oky
    public final /* synthetic */ ojx a() {
        return new oka(this);
    }

    @Override // defpackage.oky
    public final void d(List list, okg okgVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oip oipVar = (oip) it.next();
            ojx ojxVar = oipVar.a;
            ojxVar.getClass();
            oka okaVar = (oka) ojxVar;
            fdci fdciVar = new fdci();
            fdciVar.a = oipVar.a();
            int iJ = okaVar.j();
            if (iJ == 0) {
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(okaVar.n()));
            }
            ojx ojxVar2 = (ojx) cvy.a(okaVar.k(), iJ);
            if (ojxVar2 == null) {
                onh onhVar = okaVar.a;
                if (onhVar.d == null) {
                    onhVar.d = String.valueOf(onhVar.c);
                }
                String str = onhVar.d;
                str.getClass();
                throw new IllegalArgumentException(a.a(str, "navigation destination ", " is not a direct child of this NavGraph"));
            }
            this.b.a(ojxVar2.c).d(fcva.b(f().a(ojxVar2, ojxVar2.d((Bundle) fdciVar.a))), okgVar);
        }
    }
}
