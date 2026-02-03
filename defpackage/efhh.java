package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_ContentType;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efhh extends efil {
    private String a;
    private String b;
    private ekgi c;
    private ekgp d;

    public efhh() {
    }

    @Override // defpackage.efil
    public final ContentType a() {
        ekgi ekgiVar = this.c;
        if (ekgiVar != null) {
            this.d = ekgiVar.c();
        } else if (this.d == null) {
            this.d = ekoj.a;
        }
        if (this.a != null && this.b != null) {
            return new AutoValue_ContentType(this.a, this.b, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" type");
        }
        if (this.b == null) {
            sb.append(" subType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.efil
    public final ekgi b() {
        if (this.c == null) {
            if (this.d == null) {
                this.c = new ekgi();
            } else {
                ekgi ekgiVar = new ekgi();
                this.c = ekgiVar;
                ekgiVar.g(this.d);
                this.d = null;
            }
        }
        return this.c;
    }

    @Override // defpackage.efil
    public final String c() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"subType\" has not been set");
    }

    @Override // defpackage.efil
    public final String d() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"type\" has not been set");
    }

    @Override // defpackage.efil
    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null subType");
        }
        this.b = str;
    }

    @Override // defpackage.efil
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.a = str;
    }

    public efhh(ContentType contentType) {
        AutoValue_ContentType autoValue_ContentType = (AutoValue_ContentType) contentType;
        this.a = autoValue_ContentType.a;
        this.b = autoValue_ContentType.b;
        this.d = autoValue_ContentType.c;
    }
}
