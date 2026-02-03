package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coue extends coxf {
    public final MessageCoreData a;
    public final cous b;

    public coue(MessageCoreData messageCoreData, cous cousVar) {
        this.a = messageCoreData;
        this.b = cousVar;
    }

    @Override // defpackage.coxf
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.coxf
    public final cous b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof coxf) {
            coxf coxfVar = (coxf) obj;
            if (this.a.equals(coxfVar.a()) && this.b.equals(coxfVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        cous cousVar = this.b;
        return "SendFileTransferRequest{messageCoreData=" + this.a.toString() + ", fileUploadInfo=" + cousVar.toString() + "}";
    }
}
