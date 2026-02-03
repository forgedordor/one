package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctdi extends ctdn {
    public final MessageCoreData a;
    public final Uri b;
    public final int c;
    private final ekgb d;

    public ctdi(MessageCoreData messageCoreData, Uri uri, int i, ekgb ekgbVar) {
        this.a = messageCoreData;
        this.b = uri;
        this.c = i;
        this.d = ekgbVar;
    }

    @Override // defpackage.ctdn
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ctdn
    public final Uri b() {
        return this.b;
    }

    @Override // defpackage.ctdn
    public final MessageCoreData c() {
        return this.a;
    }

    @Override // defpackage.ctdn
    public final ekgb d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctdn) {
            ctdn ctdnVar = (ctdn) obj;
            if (this.a.equals(ctdnVar.c()) && this.b.equals(ctdnVar.b()) && this.c == ctdnVar.a() && ekjz.h(this.d, ctdnVar.d())) {
                ctdnVar.e();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        ekgb ekgbVar = this.d;
        Uri uri = this.b;
        return "SendMmsMessageRequest{messageCoreData=" + this.a.toString() + ", messageUri=" + uri.toString() + ", subId=" + this.c + ", recipients=" + ekgbVar.toString() + ", isRetry=false}";
    }

    @Override // defpackage.ctdn
    public final void e() {
    }
}
