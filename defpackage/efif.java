package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_TraceId;
import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efif extends efla {
    private String a;

    @Override // defpackage.efla
    public final TraceId a() {
        String str = this.a;
        if (str != null) {
            return new AutoValue_TraceId(str);
        }
        throw new IllegalStateException("Missing required properties: id");
    }

    @Override // defpackage.efla
    public final String b() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"id\" has not been set");
    }

    @Override // defpackage.efla
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
    }
}
