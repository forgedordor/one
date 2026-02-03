package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctdj extends ctdo {
    public final MessageCoreData a;
    public final Uri b;
    public final int c;
    public final alqm d;
    public final String e;

    public ctdj(MessageCoreData messageCoreData, Uri uri, int i, alqm alqmVar, String str) {
        this.a = messageCoreData;
        this.b = uri;
        this.c = i;
        this.d = alqmVar;
        this.e = str;
    }

    @Override // defpackage.ctdo
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ctdo
    public final Uri b() {
        return this.b;
    }

    @Override // defpackage.ctdo
    public final alqm c() {
        return this.d;
    }

    @Override // defpackage.ctdo
    public final MessageCoreData d() {
        return this.a;
    }

    @Override // defpackage.ctdo
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctdo) {
            ctdo ctdoVar = (ctdo) obj;
            if (this.a.equals(ctdoVar.d()) && this.b.equals(ctdoVar.b()) && this.c == ctdoVar.a() && this.d.equals(ctdoVar.c()) && ((str = this.e) != null ? str.equals(ctdoVar.e()) : ctdoVar.e() == null)) {
                ctdoVar.f();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
        String str = this.e;
        return (((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "SendSmsMessageRequest{messageCoreData=" + this.a.toString() + ", messageUri=" + this.b.toString() + ", subId=" + this.c + ", recipient=" + ((alqk) this.d).o() + ", smsServiceCenter=" + this.e + ", isRetry=false}";
    }

    @Override // defpackage.ctdo
    public final void f() {
    }
}
