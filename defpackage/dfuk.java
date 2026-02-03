package defpackage;

import com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent;
import com.google.android.rcs.client.messaging.data.ContentType;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfuk implements dfpw {
    private efij a = new efhg();
    private String b;
    private final ekfw c;

    public dfuk(ekfw ekfwVar) {
        this.c = ekfwVar;
    }

    @Override // defpackage.dfpw
    public final void a() {
        this.a = new efhg();
    }

    @Override // defpackage.dfpw
    public final void b(byte[] bArr) throws IOException {
        try {
            efij efijVar = this.a;
            efijVar.c(ContentType.e(this.b));
            efijVar.b(evqs.x(bArr));
        } catch (NullPointerException e) {
            throw new IOException("Error parsing content type in multi part CPIM message", e);
        }
    }

    @Override // defpackage.dfpw
    public final void c() {
        this.c.h(AutoOneOf_Message_MessageContent.a(this.a.a()));
        this.a = new efhg();
        this.b = "";
    }

    @Override // defpackage.dfpw
    public final void d(dfpx dfpxVar) {
        if (ejuf.e(dfpxVar.a, ffho.a)) {
            this.b = dfpxVar.b;
        }
    }
}
