package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpju extends cpki {
    public Boolean a;
    public Boolean b;
    public csdl c;
    public ConversationId d;
    public String e;
    public boolean f;
    public elka g;
    public byte h;
    public int i;
    public int j;
    public int k;

    @Override // defpackage.cpki
    public final cpkj a() {
        int i;
        int i2;
        int i3;
        if (this.h == 1 && (i = this.i) != 0 && (i2 = this.j) != 0 && (i3 = this.k) != 0) {
            return new cpjv(this.a, this.b, this.c, this.d, this.e, this.f, this.g, i, i2, i3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == 0) {
            sb.append(" allowExternalReporting");
        }
        if (this.i == 0) {
            sb.append(" scope");
        }
        if (this.j == 0) {
            sb.append(" entryPoint");
        }
        if (this.k == 0) {
            sb.append(" dialog");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
