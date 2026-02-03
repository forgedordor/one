package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class admw extends afcy {
    public ConversationIdType a;
    private long b;
    private boolean c;
    private boolean d;
    private int e;
    private crku f;
    private byte g;

    public admw() {
    }

    @Override // defpackage.afcy
    public final afcz a() {
        ConversationIdType conversationIdType;
        crku crkuVar;
        if (this.g == 15 && (conversationIdType = this.a) != null && (crkuVar = this.f) != null) {
            return new admx(this.b, conversationIdType, this.c, this.d, this.e, crkuVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" sortTimestamp");
        }
        if (this.a == null) {
            sb.append(" conversationId");
        }
        if ((this.g & 2) == 0) {
            sb.append(" conversationIsPinned");
        }
        if ((this.g & 4) == 0) {
            sb.append(" isWear");
        }
        if ((this.g & 8) == 0) {
            sb.append(" limit");
        }
        if (this.f == null) {
            sb.append(" nudgeSettingsData");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.afcy
    public final void b(boolean z) {
        this.c = z;
        this.g = (byte) (this.g | 2);
    }

    @Override // defpackage.afcy
    public final void c(boolean z) {
        this.d = z;
        this.g = (byte) (this.g | 4);
    }

    @Override // defpackage.afcy
    public final void d(int i) {
        this.e = i;
        this.g = (byte) (this.g | 8);
    }

    @Override // defpackage.afcy
    public final void e(crku crkuVar) {
        if (crkuVar == null) {
            throw new NullPointerException("Null nudgeSettingsData");
        }
        this.f = crkuVar;
    }

    @Override // defpackage.afcy
    public final void f(long j) {
        this.b = j;
        this.g = (byte) (this.g | 1);
    }

    public admw(afcz afczVar) {
        admx admxVar = (admx) afczVar;
        this.b = admxVar.a;
        this.a = admxVar.b;
        this.c = admxVar.c;
        this.d = admxVar.d;
        this.e = admxVar.e;
        this.f = admxVar.f;
        this.g = (byte) 15;
    }
}
