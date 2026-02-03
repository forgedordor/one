package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cggt extends cgkm {
    private final cgkn a;
    private final Intent b;
    private final boolean c;
    private final int d;

    public cggt(cgkn cgknVar, Intent intent, boolean z, int i) {
        this.a = cgknVar;
        if (intent == null) {
            throw new NullPointerException("Null activityIntent");
        }
        this.b = intent;
        this.c = z;
        this.d = i;
    }

    @Override // defpackage.cgkm
    public final int a() {
        return this.d;
    }

    @Override // defpackage.cgkm
    public final Intent b() {
        return this.b;
    }

    @Override // defpackage.cgkm
    public final cgkn c() {
        return this.a;
    }

    @Override // defpackage.cgkm
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgkm) {
            cgkm cgkmVar = (cgkm) obj;
            if (this.a.equals(cgkmVar.c()) && this.b.equals(cgkmVar.b()) && this.c == cgkmVar.d() && this.d == cgkmVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d;
    }

    public final String toString() {
        Intent intent = this.b;
        return "NotificationInteractionActivityInfo{notificationInteractionInfo=" + this.a.toString() + ", activityIntent=" + intent.toString() + ", shouldAddParentStack=" + this.c + ", requestCode=" + this.d + "}";
    }
}
