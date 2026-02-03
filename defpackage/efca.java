package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_GroupMember;
import com.google.android.rcs.client.messaging.GroupMember;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efca extends efeg {
    public effi a;
    public Optional b = Optional.empty();
    private String c;
    private boolean d;
    private byte e;

    @Override // defpackage.efeg
    public final GroupMember a() {
        String str;
        effi effiVar;
        if (this.e == 1 && (str = this.c) != null && (effiVar = this.a) != null) {
            return new AutoValue_GroupMember(str, effiVar, this.b, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" displayName");
        }
        if (this.a == null) {
            sb.append(" id");
        }
        if (this.e == 0) {
            sb.append(" isOwnUser");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.efeg
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null displayName");
        }
        this.c = str;
    }

    @Override // defpackage.efeg
    public final void c(boolean z) {
        this.d = z;
        this.e = (byte) 1;
    }
}
