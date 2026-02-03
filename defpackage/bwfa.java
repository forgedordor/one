package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwfa implements cbqv {
    @Override // defpackage.cbqv
    public final cbqz a(String str) {
        return c(str) ? cbqz.b : cbqz.a;
    }

    @Override // defpackage.cbqv
    public final void b(MessageCoreData messageCoreData, String str) {
        if (str == null || !c(str)) {
            return;
        }
        messageCoreData.by();
        messageCoreData.bu(cbqz.b);
    }

    @Override // defpackage.cbqv
    public final boolean c(String str) {
        return dfqb.b(str) || dfqb.f(str);
    }
}
