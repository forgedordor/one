package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssb implements baxz, baya, bayk {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/audio/amplitude/AmplitudeTriggerListener");
    public final fcyh b;
    public final ssn c;
    private final fdjx d;
    private final fcsu e;

    public ssb(fdjx fdjxVar, fcyh fcyhVar, ssn ssnVar, @aoox fcsu fcsuVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        fcsuVar.getClass();
        this.d = fdjxVar;
        this.b = fcyhVar;
        this.c = ssnVar;
        this.e = fcsuVar;
    }

    private final void k(MessageCoreData messageCoreData) {
        if (j()) {
            auvw.k(this.d, null, null, new ssa(messageCoreData, this, null), 3);
        }
    }

    @Override // defpackage.baya
    public final void c(MessageCoreData messageCoreData) {
        k(messageCoreData);
    }

    @Override // defpackage.bayk
    public final void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        messageCoreData.getClass();
        messageIdType.getClass();
        k(messageCoreData);
    }

    @Override // defpackage.baxz
    public final void gb(MessageCoreData messageCoreData) {
        k(messageCoreData);
    }

    @Override // defpackage.bayk
    public final boolean j() {
        Object objB = this.e.b();
        objB.getClass();
        return ((Boolean) objB).booleanValue();
    }

    @Override // defpackage.baxz
    public final /* synthetic */ void e(String str) {
    }

    @Override // defpackage.baxz
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void h(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ Object a(MessageCoreData messageCoreData, fcxy fcxyVar) {
        return messageCoreData;
    }

    @Override // defpackage.bayk
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, fcxy fcxyVar) {
        return messageCoreData;
    }
}
