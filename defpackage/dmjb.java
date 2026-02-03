package defpackage;

import android.view.ViewGroup;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmjb implements dmix {
    private final dmjc a;
    private final Optional b;
    private final dmtt c;

    public dmjb(dmjc dmjcVar, Optional optional, dmtt dmttVar) {
        this.a = dmjcVar;
        this.b = optional;
        this.c = dmttVar;
    }

    @Override // defpackage.dmix
    public final dmiz a(ViewGroup viewGroup, dmiv dmivVar, fdap fdapVar) throws X {
        dmix dmixVar;
        dmiu dmiuVar = dmivVar.a;
        if ((dmiuVar instanceof dmir) || (dmiuVar instanceof dmis)) {
            Object objOrElseThrow = this.b.orElseThrow(new Supplier() { // from class: dmja
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new UnsupportedOperationException("Include :module_with_in_app_camera to use mini camera.");
                }
            });
            objOrElseThrow.getClass();
            dmixVar = (dmix) objOrElseThrow;
        } else {
            dmixVar = dmiuVar instanceof dmit ? this.c : this.a;
        }
        return dmixVar.a(viewGroup, dmivVar, fdapVar);
    }
}
