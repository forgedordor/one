package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckwr implements baya {
    private final cknx a;

    public ckwr(cknx cknxVar) {
        cknxVar.getClass();
        this.a = cknxVar;
    }

    @Override // defpackage.baya
    public final void c(MessageCoreData messageCoreData) {
        if (crbf.c()) {
            ckot ckotVarA = this.a.a(messageCoreData);
            if (ckotVarA.f) {
                ckotVarA.a();
            }
        }
    }
}
