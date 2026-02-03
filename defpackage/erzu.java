package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erzu {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    private final String e;
    private final String f;
    private final String g;

    public erzu(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        dclh.i(!dcnl.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.e = str3;
        this.f = str4;
        this.c = str5;
        this.g = str6;
        this.d = str7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof erzu)) {
            return false;
        }
        erzu erzuVar = (erzu) obj;
        return dclc.a(this.b, erzuVar.b) && dclc.a(this.a, erzuVar.a) && dclc.a(this.e, erzuVar.e) && dclc.a(this.f, erzuVar.f) && dclc.a(this.c, erzuVar.c) && dclc.a(this.g, erzuVar.g) && dclc.a(this.d, erzuVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.e, this.f, this.c, this.g, this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        dclb.b("applicationId", this.b, arrayList);
        dclb.b("apiKey", this.a, arrayList);
        dclb.b("databaseUrl", this.e, arrayList);
        dclb.b("gcmSenderId", this.c, arrayList);
        dclb.b("storageBucket", this.g, arrayList);
        dclb.b("projectId", this.d, arrayList);
        return dclb.a(arrayList, this);
    }
}
