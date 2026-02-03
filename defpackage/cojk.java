package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cojk extends cokf {
    public final Optional a;
    public final Optional b;

    public cojk(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    @Override // defpackage.cokf
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.cokf
    public final Optional b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cokf) {
            cokf cokfVar = (cokf) obj;
            if (this.a.equals(cokfVar.b()) && this.b.equals(cokfVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "FileTransferMessageCoreData{messageCoreData=" + String.valueOf(this.a) + ", fileTransferBindData=" + String.valueOf(optional) + "}";
    }
}
