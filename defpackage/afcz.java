package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class afcz {
    public static afcy g() {
        admw admwVar = new admw();
        admwVar.f(-1L);
        admwVar.a = barn.a;
        admwVar.b(false);
        admwVar.d(-1);
        crkt crktVar = (crkt) crku.a.createBuilder();
        crktVar.copyOnWrite();
        crku crkuVar = (crku) crktVar.instance;
        crkuVar.b |= 1;
        crkuVar.c = false;
        crktVar.copyOnWrite();
        crku.a((crku) crktVar.instance);
        admwVar.e(crktVar.build());
        admwVar.c(false);
        return admwVar;
    }

    public abstract int a();

    public abstract long b();

    public abstract ConversationIdType c();

    public abstract crku d();

    public abstract boolean e();

    public abstract boolean f();
}
