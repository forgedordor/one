package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class escm {
    public static final void a(esca escaVar, List list) {
        list.add(escaVar);
    }

    public static final void b(final ComponentRegistrar componentRegistrar, List list) {
        list.add(new esgu() { // from class: escl
            @Override // defpackage.esgu
            public final Object a() {
                return componentRegistrar;
            }
        });
    }
}
