package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stx implements baxz, baya {
    public static final eksp a = eksp.c("BugleVmt");
    public final sub b;
    public final aoof c;
    private final fdjx d;

    public stx(fdjx fdjxVar, sub subVar, aoof aoofVar) {
        fdjxVar.getClass();
        this.d = fdjxVar;
        this.b = subVar;
        this.c = aoofVar;
    }

    private final void a(MessageCoreData messageCoreData) {
        if (((Boolean) ((cczi) stu.a.get()).e()).booleanValue() && ((Boolean) ((cczi) stu.b.get()).e()).booleanValue()) {
            auvw.k(this.d, null, null, new stw(this, messageCoreData, null), 3);
        }
    }

    @Override // defpackage.baya
    public final void c(MessageCoreData messageCoreData) {
        a(messageCoreData);
    }

    @Override // defpackage.baxz
    public final void gb(MessageCoreData messageCoreData) {
        a(messageCoreData);
    }

    @Override // defpackage.baxz
    public final /* synthetic */ void e(String str) {
    }

    @Override // defpackage.baxz
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }
}
