package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class coug extends coxh {
    public final basd a;
    public final Optional b;
    public final Optional c;
    public final aucl d;

    public coug(basd basdVar, Optional optional, Optional optional2, aucl auclVar) {
        this.a = basdVar;
        this.b = optional;
        this.c = optional2;
        this.d = auclVar;
    }

    @Override // defpackage.coxh
    public final aucl a() {
        return this.d;
    }

    @Override // defpackage.coxh
    public final basd b() {
        return this.a;
    }

    @Override // defpackage.coxh
    public final Optional c() {
        return this.c;
    }

    @Override // defpackage.coxh
    public final Optional d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof coxh) {
            coxh coxhVar = (coxh) obj;
            if (this.a.equals(coxhVar.b()) && this.b.equals(coxhVar.d()) && this.c.equals(coxhVar.c()) && this.d.equals(coxhVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        aucl auclVar = this.d;
        Optional optional = this.c;
        Optional optional2 = this.b;
        return "SendFileTransferResponse{rcsMessageId=" + this.a.toString() + ", fallbackUriString=" + String.valueOf(optional2) + ", expiry=" + String.valueOf(optional) + ", fileUploadResponse=" + auclVar.toString() + "}";
    }
}
